data class Coord(val x: Int, val y: Int)

fun main() {
    val part1 = input
        .toWordGrid().apply { this.print() }
        .toXmasWords()
        .count()

    println("Part 1: $part1")
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