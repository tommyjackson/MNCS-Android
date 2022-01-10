package com.mncs.data.formulas

enum class MatchType(maxGames: Int, gameWinsToWinMatch: Int) {
    BO1(maxGames = 1, gameWinsToWinMatch = 1),
    BO3(maxGames = 3, gameWinsToWinMatch = 2),
    BO5(maxGames = 5, gameWinsToWinMatch = 3),
    BO7(maxGames = 7, gameWinsToWinMatch = 4);
}
