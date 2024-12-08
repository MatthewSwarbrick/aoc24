import kotlin.math.pow

data class Equation(val testValue: Double, val numbers: List<Double>)
enum class Operator { ADD, MULTIPLY }

fun main() {
    val part1 = input
        .toEquations()
        .toSolvableEquations()
        .sumOf { it.testValue }

    println("Part 1: ${part1.toLong()}")
}

private fun List<String>.toEquations(): List<Equation> =
    this.map { row ->
        val (testValueString, numbersString) = row.split(":")
        val testValue = testValueString.toDouble()
        val numbers = numbersString.trim().split(" ").map { it.toDouble() }
        Equation(testValue, numbers)
    }

private fun List<Equation>.toSolvableEquations(): List<Equation> =
    this.filter { equation ->
        val possibleOperatorVariations = equation.toPossibleOperatorVariations()
        possibleOperatorVariations.any {
            val value = it.evaluate(equation.numbers)
            equation.testValue == value
        }
    }

private fun Equation.toPossibleOperatorVariations(): List<List<Operator>> {
    val numberOfOperators = this.numbers.size - 1
    val bitSize = 2.0.pow(numberOfOperators.toDouble()).toInt() - 1
    return (0..bitSize)
        .map { it.toString(2).padStart(numberOfOperators, '0') }
        .map { operators -> operators.map {
            when(it) {
                '0' -> Operator.ADD
                '1' -> Operator.MULTIPLY
                else -> Operator.ADD
            }
        } }
}

private fun List<Operator>.evaluate(numbers: List<Double>): Double =
    numbers.foldIndexed(0.0) { index, aggregate, value ->
        if(index == 0) {
            return@foldIndexed value
        }

        val operatorToApply = this[index - 1]
        when(operatorToApply) {
            Operator.ADD -> aggregate + value
            Operator.MULTIPLY -> aggregate * value
        }
    }
