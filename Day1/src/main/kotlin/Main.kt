import kotlin.math.abs

fun main() {
    val part1Answer = input
        .toOrderedListsAsc()
        .toPairs()
        .toDifferences()
        .sum()

    println("Part 1 Answer: $part1Answer")

    val part2Answer = input
        .toOrderedListsAsc()
        .toSimilarityScores()
        .sum()

    println("Part 2 Answer: $part2Answer")
}

private fun List<String>.toOrderedListsAsc(): List<List<Int>> =
    this
        .map { line -> line.split(" ").mapNotNull { it.toIntOrNull() } }
        .let { locationIds ->
            val leftList = locationIds.map { (left, _) -> left }
            val rightList = locationIds.map { (_, right) -> right }
            listOf(leftList, rightList)
        }
        .map { it.sorted() }

private fun List<List<Int>>.toPairs(): List<Pair<Int, Int>> {
    val (left, right) = this
    return left.mapIndexed { index, leftId ->
        leftId to right[index]
    }
}

private fun List<Pair<Int, Int>>.toDifferences() =
    this.map { (left, right) ->
        abs(left - right)
    }

private fun List<List<Int>>.toSimilarityScores(): List<Int> {
    val (left, right) = this
    return left.map { score ->
        score * right.count { it == score}
    }
}