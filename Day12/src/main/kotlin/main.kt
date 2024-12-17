data class Coord(val x: Int, val y: Int)
data class Plot(val value: String)
data class Region(val plot: Plot, val coords: Set<Coord>)

fun main() {
    val part1 = input
        .toRegions()
        .sumOf { it.toPrice() }

    println("Part 1: $part1")
}

private fun List<String>.toRegions(): Set<Region> =
    this.foldIndexed(emptySet()) { y, acc, row ->
        val plots = row.toPlots()
        val gardenRow = plots.mapIndexed { x, plot ->
            Coord(x, y) to plot
        }.toMap()

        val regionsInRow = gardenRow.toRegionsFromRow().distinct()
        val updatedExistingRegions = acc.map { existingRegion ->
            val newRegionCoords = regionsInRow.filter { regionInRow ->
                regionInRow.plot == existingRegion.plot &&
                regionInRow.coords.any { coordFromNewRow ->
                    existingRegion.coords.any { coordFromExistingRegion ->
                        coordFromNewRow.isNextTo(coordFromExistingRegion)
                    }
                }
            }.flatMap { it.coords }

            Region(existingRegion.plot, existingRegion.coords.plus(newRegionCoords))
        }.toSet()

        val newRegions = regionsInRow.filter { regionToCheck ->
            !acc.any { existingRegion ->
                existingRegion.plot == regionToCheck.plot &&
                        existingRegion.coords.any { existingCoord ->
                            regionToCheck.coords.any { newCoord ->
                                existingCoord.isNextTo(newCoord)
                            }
                        }
            }
        }.toSet()

        updatedExistingRegions.plus(newRegions).toSet()
    }

private fun String.toPlots(): List<Plot> =
    this.map { Plot("$it") }

private fun Map<Coord, Plot>.toRegionsFromRow(): Set<Region> =
    this.entries
        .groupBy { it.value }
        .flatMap<Plot, List<Map.Entry<Coord, Plot>>, Region> { (_, coords) ->
            coords.fold(emptyList()) { acc, (coord, _) ->
                if(acc.any { region -> region.coords.contains(coord) }) {
                    acc
                } else {
                    acc.plus(coord.toRegion(coords))
                }
            }
        }.toSet()

private fun Coord.toRegion(map: List<Map.Entry<Coord, Plot>>): Region {
    val plot = map.map { (_, plot) -> plot }.first()
    val coords = map.map { (coord, _) -> coord }

    return Region(plot, this.getConnectingCoords(coords))
}

private fun Coord.getConnectingCoords(coords: List<Coord>): Set<Coord> {
    val connectingCoords = coords
        .filter { it.isNextTo(this) }

    return listOf(this).plus(connectingCoords.plus(connectingCoords.flatMap { newCoord ->
        newCoord.getConnectingCoords(coords.filter { !connectingCoords.contains(it) })
    })).toSet()
}

private fun Coord.isNextTo(coord: Coord): Boolean =
    when {
        this.x == coord.x && this.y == coord.y - 1 -> true
        this.x == coord.x + 1 && this.y == coord.y -> true
        this.x == coord.x && this.y == coord.y + 1 -> true
        this.x == coord.x - 1 && this.y == coord.y -> true
        else -> false
    }

private fun Region.toPrice(): Long {
    val area = this.coords.size
    val perimeter = this.coords.toPerimeter()

    return area * perimeter
}

private fun Set<Coord>.toPerimeter(): Long {
    var perimeter = 0L

    for (square in this) {
        var sides = 4

        if (this.contains(Coord(square.x + 1, square.y))) sides--
        if (this.contains(Coord(square.x - 1, square.y))) sides--
        if (this.contains(Coord(square.x, square.y + 1))) sides--
        if (this.contains(Coord(square.x, square.y - 1))) sides--

        perimeter += sides
    }

    return perimeter
}