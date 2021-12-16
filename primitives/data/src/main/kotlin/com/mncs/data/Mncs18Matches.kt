package com.mncs.data

object Mncs18Matches {

    val BLOOMINGTON_vs_ROCHESTER = Match(
        matchType = MatchType.BO5,
        matchStatus = MatchStatus.TO_BE_PLAYED,
        team1 = MncsTeams.BLOOMINGTON_MAULERS,
        team2 = MncsTeams.ROCHESTER_RHYTHM,
    )

    val BURNSVILLE_vs_ST_PAUL = Match(
        matchType = MatchType.BO5,
        matchStatus = MatchStatus.TO_BE_PLAYED,
        team1 = MncsTeams.BURNSVILLE_INFERNO,
        team2 = MncsTeams.ST_PAUL_SENATORS,
    )

    val ST_CLOUD_vs_BEMIDJI = Match(
        matchType = MatchType.BO5,
        matchStatus = MatchStatus.TO_BE_PLAYED,
        team1 = MncsTeams.ST_CLOUD_FLYERS,
        team2 = MncsTeams.BEMIDJI_LUMBERJACKS,
    )

    val MINNEAPOLIS_vs_HIBBING = Match(
        matchType = MatchType.BO5,
        matchStatus = MatchStatus.TO_BE_PLAYED,
        team1 = MncsTeams.MINNEAPOLIS_MIRACLES,
        team2 = MncsTeams.HIBBING_RANGERS,
    )

    val DULUTH_vs_MINNETONKA = Match(
        matchType = MatchType.BO5,
        matchStatus = MatchStatus.TO_BE_PLAYED,
        team1 = MncsTeams.DULUTH_SUPERIORS,
        team2 = MncsTeams.MINNETONKA_BARONS,
    )

    val MNCS_18_MATCHES = setOf(
        BLOOMINGTON_vs_ROCHESTER,
        BURNSVILLE_vs_ST_PAUL,
        ST_CLOUD_vs_BEMIDJI,
        MINNEAPOLIS_vs_HIBBING,
        DULUTH_vs_MINNETONKA,
    )
}