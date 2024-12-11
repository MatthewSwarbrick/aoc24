data class Stone(val value: Long)

fun main() {
    val part1 = input
        .toStones()
        .runBlinkSequence()
        .count()

    println("Part 1: $part1")
}

private fun List<Stone>.runBlinkSequence(iterations: Int = 25): List<Stone> =
    (1..iterations).fold(this) { acc, _ -> acc.blink() }

private fun String.toStones(): List<Stone> =
    this.split(" ").map { Stone(it.toLong()) }

private fun List<Stone>.blink(): List<Stone> =
    this.flatMap { it.blink() }

private fun Stone.blink(): List<Stone> =
    when {
        this.value == 0L -> listOf(Stone(1))
        "${this.value}".count() % 2 == 0 -> this.split()
        else -> listOf(Stone(this.value * 2024))
    }

private fun Stone.split(): List<Stone> {
    val originalStone = "${this.value}"
    return originalStone
        .chunked(originalStone.count() / 2)
        .map { Stone(it.toLong()) }
}