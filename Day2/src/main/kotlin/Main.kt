import kotlin.math.abs

data class Report(val levels: List<Level>)
data class Level(val value: Int)

fun main() {
    val part1 = input
        .toReports()
        .count { it.isSafe() }

    println("Part 1 Answer: $part1")

    val part2 = input
        .toReports()
        .count { it.isSafeWithTolerance() }

    println("Part 2 Answer: $part2")
}

private fun List<String>.toReports(): List<Report> =
    this.map { levels ->
        Report(
            levels
                .split(" ")
                .mapNotNull { it.toIntOrNull() }
                .map { Level(it) }
    )}

private fun Report.isSafe(): Boolean =
    (this.levels.isAllIncreasing() || this.levels.isAllDecreasing()) &&
            this.levels.isAdjacentLevelsDifferenceWithinRange()

private fun Report.isSafeWithTolerance(): Boolean =
    (this.levels.isAllIncreasing() || this.levels.isAllDecreasing()) &&
            this.levels.isAdjacentLevelsDifferenceWithinRange() ||
    (0..< this.levels.size).any {index ->
        val numberOfLevelsToRightOfIndex = this.levels.size - index - 1
        val reducedLevels = listOf(this.levels.take(index), this.levels.takeLast(numberOfLevelsToRightOfIndex)).flatten() //this.levels.minus(this.levels[it])

        (reducedLevels.isAllIncreasing() || reducedLevels.isAllDecreasing()) &&
                reducedLevels.isAdjacentLevelsDifferenceWithinRange()
    }

private fun List<Level>.isAllIncreasing(): Boolean =
    this.mapIndexed { index, level ->
        if(this.lastIndex == index) {
            return@mapIndexed true
        }

        (level to this[index + 1]).isDifferenceIncreasing()
    }.all { it }

private fun List<Level>.isAllDecreasing(): Boolean =
    this.mapIndexed { index, level ->
        if(this.lastIndex == index) {
            return@mapIndexed true
        }

        (level to this[index + 1]).isDifferenceDecreasing()
    }.all { it }

private fun List<Level>.isAdjacentLevelsDifferenceWithinRange(): Boolean =
    this.mapIndexed { index, level ->
        if(this.lastIndex == index) {
            return@mapIndexed true
        }

        (level to this[index + 1]).isDifferenceWithinRange(1..3)
    }.all { it }

private fun Pair<Level, Level>.isDifferenceWithinRange(range: IntRange): Boolean =
    range.contains(abs(this.first.value - this.second.value))

private fun Pair<Level, Level>.isDifferenceIncreasing(): Boolean =
    this.first.value < this.second.value

private fun Pair<Level, Level>.isDifferenceDecreasing(): Boolean =
    this.first.value > this.second.value