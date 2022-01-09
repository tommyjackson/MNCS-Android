package com.mncs.data.formulas

data class Team(
    val id: String,
    val name: String,
    var matchWins: Int,
    var matchLosses: Int,
    var gameWins: Int,
    var gameLosses: Int,
    val playoffScenarios: MutableList<Scenario> = mutableListOf(),
) {
    fun calculateGameWinPercentage(): Double {
        val totalGames = gameWins + gameLosses
        return (gameWins.toDouble() / totalGames.toDouble()) * 100.0
    }

    fun calculateGameWinPercentageAsString(): String {
        val percent = String.format("%.2f", calculateGameWinPercentage().toFloat())
        return "$percent%"
    }

    fun printScenariosForSeed(seed: Int) {
        println()
        println("$seed:")

        playoffScenarios.filter { it.seed == seed }.forEach {
            print(it.scores)
            println()
        }
    }
}

data class Scenario(
    val seed: Int,
    val scores: String,
)

data class SimpleScenario(
    val seed: Int,
    val relevantMatches: List<Match>,
)