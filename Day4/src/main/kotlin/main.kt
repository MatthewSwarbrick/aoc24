data class Coord(val x: Int, val y: Int)

fun main() {
    val part1 = input
        .toWordGrid()
        .toXmasWords()
        .count()

    println("Part 1: $part1")

    val part2 = input
        .toWordGrid().apply { this.print() }
        .toMasXs()
        .count()

    println("Part 2: $part2")
}

private fun List<String>.toWordGrid(): Map<Coord, Char> =
    this.mapIndexed { yIndex, row ->
        row.mapIndexed { xIndex, letter ->
            Coord(xIndex, yIndex) to letter
    } }.flatten().toMap()

private fun Map<Coord, Char>.toXmasWords(): Set<List<Coord>> =
    this.entries
        .asSequence()
        .filter { it.value == 'X' }
        .map { it.key }
        .map { this.toXmasWordsFromStartingCoord(it) }
        .flatten()
        .toSet()

private fun Map<Coord, Char>.toMasXs(): Set<List<Coord>> =
    this.entries
        .asSequence()
        .filter { it.value == 'M' }
        .map { it.key }
        .map { this.toMasWordsFromStartingCoord(it) }
        .flatten()
        .toSet()
        .toMasXsFromDiagonalMas()

private fun Map<Coord, Char>.toXmasWordsFromStartingCoord(coord: Coord): Set<List<Coord>> {
    val top = listOf(coord, coord.copy(y = coord.y - 1), coord.copy(y = coord.y - 2), coord.copy(y = coord.y - 3))
    val topRight = listOf(coord, coord.copy(x = coord.x + 1, y = coord.y - 1), coord.copy(x = coord.x + 2, y = coord.y - 2), coord.copy(x = coord.x + 3, y = coord.y - 3))
    val topLeft = listOf(coord, coord.copy(x = coord.x - 1, y = coord.y - 1), coord.copy(x = coord.x - 2, y = coord.y - 2), coord.copy(x = coord.x - 3, y = coord.y - 3))

    val left = listOf(coord, coord.copy(x = coord.x - 1), coord.copy(x = coord.x - 2), coord.copy(x = coord.x - 3))
    val right = listOf(coord, coord.copy(x = coord.x + 1), coord.copy(x = coord.x + 2), coord.copy(x = coord.x + 3))

    val bottomRight = listOf(coord, coord.copy(x = coord.x + 1, y = coord.y + 1), coord.copy(x = coord.x + 2, y = coord.y + 2), coord.copy(x = coord.x + 3, y = coord.y + 3))
    val bottomLeft = listOf(coord, coord.copy(x = coord.x - 1, y = coord.y + 1), coord.copy(x = coord.x - 2, y = coord.y + 2), coord.copy(x = coord.x - 3, y = coord.y + 3))
    val bottom = listOf(coord, coord.copy(y = coord.y + 1), coord.copy(y = coord.y + 2), coord.copy(y = coord.y + 3))

    return listOf(top, topRight, topLeft, left, right, bottomRight, bottomLeft, bottom)
        .filter { this.getWordFromCoords(it) == "XMAS" }
        .toSet()
}

private fun Map<Coord, Char>.toMasWordsFromStartingCoord(coord: Coord): Set<List<Coord>> {
    val topRight = listOf(coord, coord.copy(x = coord.x + 1, y = coord.y - 1), coord.copy(x = coord.x + 2, y = coord.y - 2))
    val topLeft = listOf(coord, coord.copy(x = coord.x - 1, y = coord.y - 1), coord.copy(x = coord.x - 2, y = coord.y - 2))

    val bottomRight = listOf(coord, coord.copy(x = coord.x + 1, y = coord.y + 1), coord.copy(x = coord.x + 2, y = coord.y + 2))
    val bottomLeft = listOf(coord, coord.copy(x = coord.x - 1, y = coord.y + 1), coord.copy(x = coord.x - 2, y = coord.y + 2))

    return listOf(topRight, topLeft, bottomRight, bottomLeft)
        .filter { this.getWordFromCoords(it) == "MAS" }
        .toSet()
}

private fun Set<List<Coord>>.toMasXsFromDiagonalMas(): Set<List<Coord>> =
    this.mapNotNull { mas ->
        val crossingMas = this.firstOrNull { (crossingM, crossingA, _) ->
            val (m, a, _) = mas
            crossingM != m && crossingA == a
        }

        if(crossingMas != null) {
            listOf(mas, crossingMas)
                .flatten()
                .sortedBy { it.x }
                .sortedBy { it.y }
        } else {
            null
        }
    }.toSet()

private fun Map<Coord, Char>.getWordFromCoords(coords: List<Coord>): String =
    coords.joinToString("") {
        this[it].toString()
    }

private fun Map<Coord, Char>.print() {
    val maxX = this.keys.maxOf { it.x }
    val maxY = this.keys.maxOf { it.y }
    (0..maxY).forEach { y ->
            println()
        (0 .. maxX).forEach { x ->
            print(this[Coord(x, y)])
        }
    }
    println()
}