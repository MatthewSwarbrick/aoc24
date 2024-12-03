data class MultiplyInstruction(val left: Int, val right: Int) {
    fun evaluate(): Int = this.left * this.right
}

fun main() {
    val part1 = input
        .toValidInstructions()
        .sumOf { it.evaluate() }

    println("Part 1 Answer: $part1")

    val part2 = input
        .toEnabledInstructions()
        .toValidInstructions()
        .sumOf { it.evaluate() }

    println("Part 2 Answer: $part2")
}

private fun String.toValidInstructions(): List<MultiplyInstruction> {
    val regex = Regex("mul\\(\\d+,\\d+\\)")
    val matches = regex.findAll(this)

    return matches.map { match ->
        val (left, right) = match.value
            .removePrefix("mul(")
            .removeSuffix(")")
            .split(",")
            .mapNotNull { it.toIntOrNull() }

        MultiplyInstruction(left, right)
    }.toList()
}

private fun String.toEnabledInstructions(): String =
    this.split("do()")
        .joinToString("|") {
            if (it.contains("don't()")) {
                it.split("don't()").first()
            } else {
                it
            }
        }