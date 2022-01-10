package com.mncs.navigation

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.tjackapps.mncs.navigation.R

sealed class BottomNavItem(
    @StringRes val title: Int,
    @DrawableRes val icon: Int,
    val route: String,
) {

    object Feed : BottomNavItem(R.string.nav_feed, R.drawable.ic_feed, "feed")
    object Schedule : BottomNavItem(R.string.nav_schedule, R.drawable.ic_schedule, "schedule")
    object Standings : BottomNavItem(R.string.nav_standings, R.drawable.ic_standings, "standings")
}
