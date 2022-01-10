package com.mncs.networking.api.models.playergame

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Hit(
    @Json(name = "amount_collected")
    val amountCollected: Int?,
    @Json(name = "amount_collected_big")
    val amountCollectedBig: Int?,
    @Json(name = "amount_collected_small")
    val amountCollectedSmall: Int?,
    @Json(name = "amount_overfill")
    val amountOverfill: Int?,
    @Json(name = "amount_overfill_stolen")
    val amountOverfillStolen: Int?,
    @Json(name = "amount_stolen")
    val amountStolen: Int?,
    @Json(name = "amount_stolen_big")
    val amountStolenBig: Int?,
    @Json(name = "amount_stolen_small")
    val amountStolenSmall: Int?,
    @Json(name = "amount_used_while_supersonic")
    val amountUsedWhileSupersonic: Int?,
    @Json(name = "assists")
    val assists: Int?,
    @Json(name = "avg_distance_to_ball")
    val avgDistanceToBall: Int?,
    @Json(name = "avg_distance_to_ball_no_possession")
    val avgDistanceToBallNoPossession: Int?,
    @Json(name = "avg_distance_to_ball_possession")
    val avgDistanceToBallPossession: Int?,
    @Json(name = "avg_distance_to_mates")
    val avgDistanceToMates: Int?,
    @Json(name = "avg_powerslide_duration")
    val avgPowerslideDuration: Double?,
    @Json(name = "count_collected_big")
    val countCollectedBig: Int?,
    @Json(name = "count_collected_small")
    val countCollectedSmall: Int?,
    @Json(name = "count_powerslide")
    val countPowerslide: Int?,
    @Json(name = "count_stolen_big")
    val countStolenBig: Int?,
    @Json(name = "count_stolen_small")
    val countStolenSmall: Int?,
    @Json(name = "demos_inflicted")
    val demosInflicted: Int?,
    @Json(name = "demos_taken")
    val demosTaken: Int?,
    @Json(name = "epoch_processed")
    val epochProcessed: Long?,
    @Json(name = "game_date")
    val gameDate: String?,
    @Json(name = "game_id")
    val gameId: String?,
    @Json(name = "game_id_overtime_game")
    val gameIdOvertimeGame: String?,
    @Json(name = "game_id_total")
    val gameIdTotal: String?,
    @Json(name = "game_id_win")
    val gameIdWin: String?,
    @Json(name = "game_id_win_total")
    val gameIdWinTotal: String?,
    @Json(name = "game_number")
    val gameNumber: String?,
    @Json(name = "games_played")
    val gamesPlayed: Int?,
    @Json(name = "goals")
    val goals: Int?,
    @Json(name = "goals_against")
    val goalsAgainst: Int?,
    @Json(name = "league_id")
    val leagueId: String?,
    @Json(name = "league_name")
    val leagueName: String?,
    @Json(name = "map_name")
    val mapName: String?,
    @Json(name = "match_id")
    val matchId: String?,
    @Json(name = "match_id_win")
    val matchIdWin: String?,
    @Json(name = "match_type")
    val matchType: String?,
    @Json(name = "ms_behind_ball")
    val msBehindBall: Int?,
    @Json(name = "ms_boost_0_25")
    val msBoost025: Int?,
    @Json(name = "ms_boost_25_50")
    val msBoost2550: Int?,
    @Json(name = "ms_boost_50_75")
    val msBoost5075: Int?,
    @Json(name = "ms_boost_75_100")
    val msBoost75100: Int?,
    @Json(name = "ms_boost_speed")
    val msBoostSpeed: Int?,
    @Json(name = "ms_closest_to_ball")
    val msClosestToBall: Int?,
    @Json(name = "ms_defensive_half")
    val msDefensiveHalf: Int?,
    @Json(name = "ms_defensive_third")
    val msDefensiveThird: Int?,
    @Json(name = "ms_farthest_from_ball")
    val msFarthestFromBall: Int?,
    @Json(name = "ms_full_boost")
    val msFullBoost: Int?,
    @Json(name = "ms_ground")
    val msGround: Int?,
    @Json(name = "ms_high_air")
    val msHighAir: Int?,
    @Json(name = "ms_infront_ball")
    val msInfrontBall: Int?,
    @Json(name = "ms_low_air")
    val msLowAir: Int?,
    @Json(name = "ms_most_back")
    val msMostBack: Int?,
    @Json(name = "ms_most_forward")
    val msMostForward: Int?,
    @Json(name = "ms_neutral_third")
    val msNeutralThird: Int?,
    @Json(name = "ms_offensive_half")
    val msOffensiveHalf: Int?,
    @Json(name = "ms_offensive_third")
    val msOffensiveThird: Int?,
    @Json(name = "ms_played")
    val msPlayed: Int?,
    @Json(name = "ms_powerslide")
    val msPowerslide: Int?,
    @Json(name = "ms_slow_speed")
    val msSlowSpeed: Int?,
    @Json(name = "ms_supersonic_speed")
    val msSupersonicSpeed: Int?,
    @Json(name = "ms_zero_boost")
    val msZeroBoost: Int?,
    @Json(name = "mvps")
    val mvps: Int?,
    @Json(name = "opponent_team_id")
    val opponentTeamId: String?,
    @Json(name = "opponent_team_name")
    val opponentTeamName: String?,
    @Json(name = "overtime_seconds_played")
    val overtimeSecondsPlayed: Int?,
    @Json(name = "player_id")
    val playerId: String?,
    @Json(name = "player_name")
    val playerName: String?,
    @Json(name = "player_platform")
    val playerPlatform: String?,
    @Json(name = "player_platform_id")
    val playerPlatformId: String?,
    @Json(name = "saves")
    val saves: Int?,
    @Json(name = "score")
    val score: Int?,
    @Json(name = "season_id")
    val seasonId: String?,
    @Json(name = "season_name")
    val seasonName: String?,
    @Json(name = "shots")
    val shots: Int?,
    @Json(name = "shots_against")
    val shotsAgainst: Int?,
    @Json(name = "team_color")
    val teamColor: String?,
    @Json(name = "team_id")
    val teamId: String?,
    @Json(name = "team_name")
    val teamName: String?,
    @Json(name = "total_distance")
    val totalDistance: Int?,
    @Json(name = "week")
    val week: Int?,
    @Json(name = "wins")
    val wins: Int?,
)