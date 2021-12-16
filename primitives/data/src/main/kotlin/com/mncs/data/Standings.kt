package com.mncs.data

import java.io.IOException

data class Standings(
    val first: Team,
    val second: Team,
    val third: Team,
    val fourth: Team,
    val fifth: Team,
    val sixth: Team,
    val seventh: Team,
    val eight: Team,
    val ninth: Team,
    val tenth: Team,
) {

    companion object {
        fun sortTeamsForStandings(teams: Set<Team>): Set<Team> {
            return teams.sortedWith(compareByDescending<Team> { it.matchWins }.thenByDescending { it.calculateGameWinPercentage() }).toSet()
        }

        fun printStandings(teams: Set<Team>) {
            val standings = sortTeamsForStandings(teams)
            println("| Seed | Team Name | Match Record | Game Record | Game Win % |")

            standings.forEachIndexed { index, team ->
                println("| ${index+1} | ${team.name} | ${team.matchWins}-${team.matchLosses} | ${team.gameWins}-${team.gameLosses} | ${team.calculateGameWinPercentageAsString()} |")
            }
        }

        fun generateStandingsFromSortedList(teams: List<Team>): Standings {
            if (teams.size != 10) {
                throw IOException("Invalid number of teams. There should be 10.")
            }

            return Standings(
                first = teams[0],
                second = teams[1],
                third = teams[2],
                fourth = teams[3],
                fifth = teams[4],
                sixth = teams[5],
                seventh = teams[6],
                eight = teams[7],
                ninth = teams[8],
                tenth = teams[9],
            )
        }
    }
}
