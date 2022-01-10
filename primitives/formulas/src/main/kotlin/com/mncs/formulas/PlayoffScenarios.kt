package com.mncs.data.formulas

import com.mncs.data.formulas.Mncs18Matches.BLOOMINGTON_vs_ROCHESTER
import com.mncs.data.formulas.Mncs18Matches.BURNSVILLE_vs_ST_PAUL
import com.mncs.data.formulas.Mncs18Matches.DULUTH_vs_MINNETONKA
import com.mncs.data.formulas.Mncs18Matches.MINNEAPOLIS_vs_HIBBING
import com.mncs.data.formulas.Mncs18Matches.ST_CLOUD_vs_BEMIDJI
import com.mncs.data.formulas.MncsTeams.BEMIDJI_LUMBERJACKS
import com.mncs.data.formulas.MncsTeams.BLOOMINGTON_MAULERS
import com.mncs.data.formulas.MncsTeams.BURNSVILLE_INFERNO
import com.mncs.data.formulas.MncsTeams.DULUTH_SUPERIORS
import com.mncs.data.formulas.MncsTeams.HIBBING_RANGERS
import com.mncs.data.formulas.MncsTeams.MINNEAPOLIS_MIRACLES
import com.mncs.data.formulas.MncsTeams.MINNETONKA_BARONS
import com.mncs.data.formulas.MncsTeams.MNCS_TEAMS
import com.mncs.data.formulas.MncsTeams.ROCHESTER_RHYTHM
import com.mncs.data.formulas.MncsTeams.ST_CLOUD_FLYERS
import com.mncs.data.formulas.MncsTeams.ST_PAUL_SENATORS

fun main() {
//    printStandings(MNCS_TEAMS)

    BLOOMINGTON_vs_ROCHESTER.potentialResults().forEach { first ->
        BURNSVILLE_vs_ST_PAUL.potentialResults().forEach { second ->
            ST_CLOUD_vs_BEMIDJI.potentialResults().forEach { third ->
                MINNEAPOLIS_vs_HIBBING.potentialResults().forEach { fourth ->
                    DULUTH_vs_MINNETONKA.potentialResults().forEach { fifth ->
                        val bemidji = BEMIDJI_LUMBERJACKS.copy()
                        val hibbing = HIBBING_RANGERS.copy()
                        val burnsville = BURNSVILLE_INFERNO.copy()
                        val bloomington = BLOOMINGTON_MAULERS.copy()
                        val stPaul = ST_PAUL_SENATORS.copy()
                        val rochester = ROCHESTER_RHYTHM.copy()
                        val minnetonka = MINNETONKA_BARONS.copy()
                        val minneapolis = MINNEAPOLIS_MIRACLES.copy()
                        val duluth = DULUTH_SUPERIORS.copy()
                        val stCloud = ST_CLOUD_FLYERS.copy()

                        updateTeamsWithMatchResults(bloomington, rochester, first)
                        updateTeamsWithMatchResults(burnsville, stPaul, second)
                        updateTeamsWithMatchResults(stCloud, bemidji, third)
                        updateTeamsWithMatchResults(minneapolis, hibbing, fourth)
                        updateTeamsWithMatchResults(duluth, minnetonka, fifth)

                        val teams = setOf(
                            bemidji,
                            hibbing,
                            burnsville,
                            bloomington,
                            stPaul,
                            rochester,
                            minnetonka,
                            minneapolis,
                            duluth,
                            stCloud,
                        )

                        buildPlayoffScenarios(teams, first, second, third, fourth, fifth)
                    }
                }
            }
        }
    }

//    MNCS_TEAMS.forEach {
    val team = MINNETONKA_BARONS

    println()
    println("${team.name} PLAYOFF SCENARIOS")
    team.printScenariosForSeed(1)
    team.printScenariosForSeed(2)
    team.printScenariosForSeed(3)
    team.printScenariosForSeed(4)
    team.printScenariosForSeed(5)
    team.printScenariosForSeed(6)
    team.printScenariosForSeed(7)
//    println()
//    println("${team.name}: 1 - ${team.playoffScenarios.filter { it.seed == 1 }}")
//    println("${team.name}: 2 - ${team.playoffScenarios.filter { it.seed == 2 }}")
//    println("${team.name}: 3 - ${team.playoffScenarios.filter { it.seed == 3 }}")
//    println("${team.name}: 4 - ${team.playoffScenarios.filter { it.seed == 4 }}")
//    println("${team.name}: 5 - ${team.playoffScenarios.filter { it.seed == 5 }}")
//    println("${team.name}: 6 - ${team.playoffScenarios.filter { it.seed == 6 }}")
//    println()
//    }
}

private fun buildPlayoffScenarios(
    teams: Set<Team>,
    first: Match, // bloomington vs rochester
    second: Match, // burnsville vs st paul
    third: Match, // st cloud vs bemidji
    fourth: Match, // minneapolis vs hibbing
    fifth: Match, // duluth vs minnetonka
) {
    val sortedTeams = Standings.sortTeamsForStandings(teams)

    sortedTeams.forEachIndexed { index, team ->
        if (index in 0..6) {
            val seed = index + 1

            val firstRelevant = isMatchRelevantForScenario(team, 1, seed, first, second, third, fourth, fifth)
            val secondRelevant = isMatchRelevantForScenario(team, 2, seed, first, second, third, fourth, fifth)
            val thirdRelevant = isMatchRelevantForScenario(team, 3, seed, first, second, third, fourth, fifth)
            val fourthRelevant = isMatchRelevantForScenario(team, 4, seed, first, second, third, fourth, fifth)
            val fifthRelevant = isMatchRelevantForScenario(team, 5, seed, first, second, third, fourth, fifth)

            val one = generateShortScenarioForMatchResult(first)
            val two = generateShortScenarioForMatchResult(second)
            val three = generateShortScenarioForMatchResult(third)
            val four = generateShortScenarioForMatchResult(fourth)
            val five = generateShortScenarioForMatchResult(fifth)

            var scenario = ""

            if (firstRelevant) {
                scenario += "$one, "
            }
            if (secondRelevant) {
                scenario += "$two, "
            }
            if (thirdRelevant) {
                scenario += "$three, "
            }
            if (fourthRelevant) {
                scenario += "$four, "
            }
            if (fifthRelevant) {
                scenario += "$five, "
            }

            if (scenario.isNotBlank()) {
                scenario = "Scenario: $scenario"
            }

            MNCS_TEAMS.find { it.id == team.id }.apply {
                val scenarios = this?.playoffScenarios!!

                val newScenario = Scenario(
                    seed = seed,
                    scores = scenario,
                )

                if (scenario.isNotBlank() && !scenarios.contains(newScenario)) {
                    scenarios.add(newScenario)
                }
            }
        }
    }
}

private fun isMatchRelevantForScenario(
    teamForScenario: Team,
    matchNumber: Int,
    seed: Int,
    first: Match, // bloomington vs rochester
    second: Match, // burnsville vs st paul
    third: Match, // st cloud vs bemidji
    fourth: Match, // minneapolis vs hibbing
    fifth: Match, // duluth vs minnetonka
): Boolean {

    val matchToCheck = when (matchNumber) {
        1 -> first
        2 -> second
        3 -> third
        4 -> fourth
        5 -> fifth
        else -> null
    }

    matchToCheck?.potentialResults()?.forEach { match ->
        val bemidji = BEMIDJI_LUMBERJACKS.copy()
        val hibbing = HIBBING_RANGERS.copy()
        val burnsville = BURNSVILLE_INFERNO.copy()
        val bloomington = BLOOMINGTON_MAULERS.copy()
        val stPaul = ST_PAUL_SENATORS.copy()
        val rochester = ROCHESTER_RHYTHM.copy()
        val minnetonka = MINNETONKA_BARONS.copy()
        val minneapolis = MINNEAPOLIS_MIRACLES.copy()
        val duluth = DULUTH_SUPERIORS.copy()
        val stCloud = ST_CLOUD_FLYERS.copy()

        updateTeamsWithMatchResults(bloomington, rochester, if (matchNumber == 1) match else first)
        updateTeamsWithMatchResults(burnsville, stPaul, if (matchNumber == 2) match else second)
        updateTeamsWithMatchResults(stCloud, bemidji, if (matchNumber == 3) match else third)
        updateTeamsWithMatchResults(minneapolis, hibbing, if (matchNumber == 4) match else fourth)
        updateTeamsWithMatchResults(duluth, minnetonka, if (matchNumber == 5) match else fifth)

        val copiedTeams = setOf(
            bemidji,
            hibbing,
            burnsville,
            bloomington,
            stPaul,
            rochester,
            minnetonka,
            minneapolis,
            duluth,
            stCloud,
        )

        val sortedTeams = Standings.sortTeamsForStandings(copiedTeams)
        val foundTeam = sortedTeams.find { it.id == teamForScenario.id }
        if ((sortedTeams.indexOf(foundTeam) + 1) != seed) {
            return true
        }
    }

    return false
}

// private fun buildPlayoffScenariosForTeam(
//    team: Team,
//    teams: Set<Team>,
//    first: Match, // bloomington vs rochester
//    second: Match, // burnsville vs st paul
//    third: Match, // st cloud vs bemidji
//    fourth: Match, // minneapolis vs hibbing
//    fifth: Match, // duluth vs minnetonka
// ) {
//    val sortedTeams = Standings.sortTeamsForStandings(teams)
//
//    val foundTeam = sortedTeams.find { it.id == team.id }
//    val teamIndex = sortedTeams.indexOf(foundTeam)
//
//    if (teamIndex in 0..5) {
//
//        val one = generateScenarioForMatchResult(first)
//        val two = generateScenarioForMatchResult(second)
//        val three = generateScenarioForMatchResult(third)
//        val four = generateScenarioForMatchResult(fourth)
//        val five = generateScenarioForMatchResult(fifth)
//
//        val scenario = "| $one | $two | $three | $four | $five |"
//
//        MNCS_TEAMS.find { it.id == team.id }.apply {
//            val seed = teamIndex + 1
//            val scenarios = this?.playoffScenarios!!
//
//            scenarios[seed]?.add(scenario) ?: run {
//                scenarios.put(seed, mutableListOf(scenario))
//            }
//        }
//    }
// }

private fun generateShortScenarioForMatchResult(match: Match): String {
    val winningTeamName: String
    val winnerGamesWon: Int
    val loserGamesWon: Int
    if (match.team1Wins > match.team2Wins) {
        winningTeamName = match.team1.name
        winnerGamesWon = match.team1Wins
        loserGamesWon = match.team2Wins
    } else {
        winningTeamName = match.team2.name
        winnerGamesWon = match.team2Wins
        loserGamesWon = match.team1Wins
    }

    return "$winningTeamName ($winnerGamesWon-$loserGamesWon)"
}

private fun generateScenarioForMatchResult(match: Match): String {
    val winningTeamName: String
    val losingTeamName: String
    val winnerGamesWon: Int
    val loserGamesWon: Int
    if (match.team1Wins > match.team2Wins) {
        winningTeamName = match.team1.name
        losingTeamName = match.team2.name
        winnerGamesWon = match.team1Wins
        loserGamesWon = match.team2Wins
    } else {
        winningTeamName = match.team2.name
        losingTeamName = match.team1.name
        winnerGamesWon = match.team2Wins
        loserGamesWon = match.team1Wins
    }

    return "$winningTeamName beats $losingTeamName ($winnerGamesWon-$loserGamesWon)"
}

private fun updateTeamsWithMatchResults(
    team1: Team,
    team2: Team,
    match: Match,
) {
    team1.gameWins += match.team1Wins
    team1.gameLosses += match.team2Wins
    team2.gameWins += match.team2Wins
    team2.gameLosses += match.team1Wins

    if (match.team1Wins > match.team2Wins) {
        team1.matchWins++
        team2.matchLosses++
    } else {
        team2.matchWins++
        team1.matchLosses++
    }
}
