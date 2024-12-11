data class Stone(val value: Long)
data class StoneCacheKey(val stone: Stone, val iteration: Int)

fun main() {
    val part1 = input
        .toStones()
        .sumOf {  it.runBlinkSequence() }

    println("Part 1: $part1")

    val part2 = input
        .toStones()
        .sumOf { it.runBlinkSequence(iterations = 75) }

    println("Part 2: $part2")
}

private fun Stone.runBlinkSequence(iterations: Int = 25): Long {
    val cache = mutableMapOf<StoneCacheKey, Long>()
    return this.runBlinkSequence(iterations, cache)
}

private fun Stone.runBlinkSequence(iterations: Int, cache: MutableMap<StoneCacheKey, Long>): Long {
    val key = StoneCacheKey(this, iterations)
    if (key in cache) return cache[key]!!

    val result = when {
        iterations == 0 -> 1
        this.value == 0L -> Stone(1).runBlinkSequence(iterations - 1, cache)
        "${this.value}".length % 2 == 0 -> {
            val splitValue = "${this.value}".chunked("${this.value}".length / 2)
                .map { Stone(it.toLong()) }
            splitValue.sumOf { it.runBlinkSequence(iterations - 1, cache) }
        }
        else ->
            Stone(this.value * 2024).runBlinkSequence(iterations - 1, cache)
    }
    cache[key] = result
    return result
}

private fun String.toStones(): List<Stone> =
    this.split(" ").map { Stone(it.toLong()) }

