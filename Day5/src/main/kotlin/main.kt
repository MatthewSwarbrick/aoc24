data class RulesAndPages(val rules: List<Rule>, val pages: List<List<Int>>)
data class Rule(val left: Int, val right: Int)

fun main() {
    val part1 = input
        .toRulesAndPages()
        .toPagesMatchingRules()
        .toMiddlePageNumbers()
        .sum()

    println("Part 1: $part1")

    val rulesAndPages = input
        .toRulesAndPages()

    val part2 = rulesAndPages
        .toPagesNotMatchingRules()
        .reorderPages(rulesAndPages.rules)
        .toMiddlePageNumbers()
        .sum()

    println("Part 2: $part2")
}

private fun List<String>.toRulesAndPages(): RulesAndPages {
    val rules = this.takeWhile { it != "" }
        .map { rule -> rule.split("|").mapNotNull { it.toIntOrNull()} }
        .map { (left, right) ->
            Rule(left, right)
        }

    val pages = this.takeLastWhile { it != "" }
        .map { pages -> pages.split(",").mapNotNull { it.toIntOrNull() } }

    return RulesAndPages(rules, pages)
}

private fun RulesAndPages.toPagesMatchingRules(): List<List<Int>> =
    this.pages
        .filter { it.isValidPage(this.rules) }

private fun RulesAndPages.toPagesNotMatchingRules(): List<List<Int>> =
    this.pages
        .filter { !it.isValidPage(this.rules) }

private fun List<List<Int>>.toMiddlePageNumbers(): List<Int> =
    this.map {
        it[(it.size / 2)]
    }

private fun List<List<Int>>.reorderPages(rules: List<Rule>): List<List<Int>> =
    this.map { unorderedPage ->
        var orderedPage = mutableListOf<Int>()
        unorderedPage.map { number ->
           orderedPage = orderedPage.insertNumberToMatchRules(number, rules)
        }
        orderedPage
    }

private fun MutableList<Int>.insertNumberToMatchRules(number: Int, rules: List<Rule>): MutableList<Int> {
    (0..this.size).forEach { indexToTry ->
        val testOrderedPage = this.toMutableList()
        testOrderedPage.add(indexToTry, number)
        if(testOrderedPage.isValidPage(rules)) {
            return testOrderedPage
        }
    }

    return this
}

private fun List<Int>.isValidPage(rules: List<Rule>): Boolean =
    rules.all { (left, right) ->
        val leftIndex = this.indexOfFirst { it == left }
        val rightIndex = this.indexOfFirst { it == right }
        when {
            leftIndex == -1 && rightIndex == -1 -> true
            leftIndex == -1 || rightIndex == -1 -> true
            leftIndex < rightIndex -> true
            else -> false
        }
    }

