package com.mncs.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.mncs.feed.FeedScreen
import com.mncs.schedule.ScheduleScreen
import com.mncs.standings.StandingsScreen

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(navController, startDestination = BottomNavItem.Feed.route) {
        composable(BottomNavItem.Feed.route) {
            FeedScreen()
        }
        composable(BottomNavItem.Schedule.route) {
            ScheduleScreen()
        }
        composable(BottomNavItem.Standings.route) {
            StandingsScreen()
        }
    }
}