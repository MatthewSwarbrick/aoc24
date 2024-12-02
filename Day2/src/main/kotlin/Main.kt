import kotlin.math.abs

data class Report(val levels: List<Level>)
data class Level(val value: Int)

fun main() {
    val part1Answer = input
        .toReports()
        .count { it.isSafe() }

    println("Part 1 Answer: $part1Answer")
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