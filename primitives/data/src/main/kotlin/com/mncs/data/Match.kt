package com.mncs.data

data class Match(
    val matchType: MatchType,
    val matchStatus: MatchStatus,
    val team1: Team,
    val team2: Team,
    val team1Wins: Int = 0,
    val team2Wins: Int = 0,
) {

    fun potentialResults(): Set<Match> {
        val first = this.copy(
            team1Wins = 3,
            team2Wins = 0,
        )

        val second = this.copy(
            team1Wins = 3,
            team2Wins = 1,
        )

        val third = this.copy(
            team1Wins = 3,
            team2Wins = 2,
        )

        val fourth = this.copy(
            team1Wins = 2,
            team2Wins = 3,
        )

        val fifth = this.copy(
            team1Wins = 1,
            team2Wins = 3,
        )

        val sixth = this.copy(
            team1Wins = 0,
            team2Wins = 3,
        )

        return setOf(first, second, third, fourth, fifth, sixth)
    }
}