package com.mncs.data.formulas

object MncsTeams {

    val BEMIDJI_LUMBERJACKS = Team(
        id = "bemidji-lumberjacks",
        name = "Bemidji Lumberjacks",
        matchWins = 11,
        matchLosses = 6,
        gameWins = 39,
        gameLosses = 23,
    )

    val HIBBING_RANGERS = Team(
        id = "hibbing-rangers",
        name = "Hibbing Rangers",
        matchWins = 10,
        matchLosses = 7,
        gameWins = 36,
        gameLosses = 30,
    )

    val BURNSVILLE_INFERNO = Team(
        id = "burnsville-inferno",
        name = "Burnsville Inferno",
        matchWins = 10,
        matchLosses = 7,
        gameWins = 37,
        gameLosses = 34,
    )

    val BLOOMINGTON_MAULERS = Team(
        id = "bloomington-maulers",
        name = "Bloomington Maulers",
        matchWins = 9,
        matchLosses = 8,
        gameWins = 38,
        gameLosses = 31,
    )

    val ST_PAUL_SENATORS = Team(
        id = "st-paul-senators",
        name = "St. Paul Senators",
        matchWins = 9,
        matchLosses = 8,
        gameWins = 35,
        gameLosses = 31,
    )

    val ROCHESTER_RHYTHM = Team(
        id = "rochester-rhythm",
        name = "Rochester Rhythm",
        matchWins = 9,
        matchLosses = 8,
        gameWins = 34,
        gameLosses = 34,
    )

    val MINNETONKA_BARONS = Team(
        id = "minnetonka-barons",
        name = "Minnetonka Barons",
        matchWins = 9,
        matchLosses = 8,
        gameWins = 32,
        gameLosses = 34,
    )

    val MINNEAPOLIS_MIRACLES = Team(
        id = "minneapolis-miracles",
        name = "Minneapolis Miracles",
        matchWins = 7,
        matchLosses = 10,
        gameWins = 31,
        gameLosses = 37,
    )

    val DULUTH_SUPERIORS = Team(
        id = "duluth-superiors",
        name = "Duluth Superiors",
        matchWins = 6,
        matchLosses = 11,
        gameWins = 27,
        gameLosses = 35,
    )

    val ST_CLOUD_FLYERS = Team(
        id = "st-cloud-flyers",
        name = "St. Cloud Flyers",
        matchWins = 5,
        matchLosses = 12,
        gameWins = 24,
        gameLosses = 44,
    )

    val MNCS_TEAMS = setOf(
        BEMIDJI_LUMBERJACKS,
        HIBBING_RANGERS,
        BURNSVILLE_INFERNO,
        BLOOMINGTON_MAULERS,
        ST_PAUL_SENATORS,
        ROCHESTER_RHYTHM,
        MINNETONKA_BARONS,
        MINNEAPOLIS_MIRACLES,
        DULUTH_SUPERIORS,
        ST_CLOUD_FLYERS,
    )
}
