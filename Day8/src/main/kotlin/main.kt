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

    val part2 = grid
        .toAntennaCoords()
        .toTAntiNodes(grid.maxOf { it.key.x }, grid.maxOf { it.key.y })
        .toAntiNodesPresentOnGrid(grid)
        .count()

    println("Part 2: $part2")
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

private fun Map<Frequency, List<Coord>>.toTAntiNodes(maxX: Int, maxY: Int): Set<Coord> =
    this.map { (_, coords) ->
        coords.map { sourceFrequencyCoord ->
            coords
                .map { pairedFrequencyCoord ->
                    val originalDx = pairedFrequencyCoord.x - sourceFrequencyCoord.x
                    val originalDy = pairedFrequencyCoord.y - sourceFrequencyCoord.y

                    val antiNodeCoords = mutableListOf<Coord>()
                    var dx = originalDx
                    var dy = originalDy
                    var iterations = 0
                    while(iterations < maxX * maxY) {
                        antiNodeCoords.add(Coord(pairedFrequencyCoord.x + dx, pairedFrequencyCoord.y + dy))
                        dx += originalDx
                        dy += originalDy
                        iterations ++
                    }
                    antiNodeCoords
                }.flatten()
        }.flatten()
    }.flatten()
        .toSet()

private fun Set<Coord>.toAntiNodesPresentOnGrid(grid: Map<Coord, Frequency?>): Set<Coord> =
    this.filter { grid.containsKey(it) }.toSet()
