data class Coord(val x: Int, val y: Int)
@JvmInline
value class Frequency(val value: Char)

fun main() {
    val grid = input
        .toGrid()

    val part1 = grid
        .toAntennaCoords()
        .toAntiNodes()
        .toAntiNodesPresentOnGrid(grid)
        .count()

    println("Part 1: $part1")
}

private fun List<String>.toGrid(): Map<Coord, Frequency?> =
    this.mapIndexed { y, row ->
        row.mapIndexed { x, frequency ->
            Coord(x, y) to if (frequency == '.') {
                null
            } else {
                Frequency(frequency)
            }
        }
    }.flatten().toMap()

private fun Map<Coord, Frequency?>.toAntennaCoords(): Map<Frequency, List<Coord>> =
    this.entries
        .groupBy {
            it.value
        }
        .mapValues { group -> group.value.map { it.key } }
        .mapNotNull { (key, coords) ->
            if(key == null) {
                null
            } else {
                key to coords
            }
        }
        .toMap()

private fun Map<Frequency, List<Coord>>.toAntiNodes(): Set<Coord> =
    this.map { (_, coords) ->
        coords.map { sourceFrequencyCoord ->
            coords
                .filter { it != sourceFrequencyCoord }
                .map { pairedFrequencyCoord ->
                    val dx = pairedFrequencyCoord.x - sourceFrequencyCoord.x
                    val dy = pairedFrequencyCoord.y - sourceFrequencyCoord.y
                    Coord(pairedFrequencyCoord.x + dx, pairedFrequencyCoord.y + dy)
                }
            }.flatten()
        }.flatten()
        .toSet()

private fun Set<Coord>.toAntiNodesPresentOnGrid(grid: Map<Coord, Frequency?>): Set<Coord> =
    this.filter { grid.containsKey(it) }.toSet()
