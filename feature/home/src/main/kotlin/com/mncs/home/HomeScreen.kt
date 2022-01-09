package com.mncs.home

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.mncs.home.navigation.MncsBottomNavigation
import com.mncs.home.navigation.NavigationGraph
import com.mncs.theme.MncsTheme

@Composable
fun HomeScreen(
//    viewModel: HomeViewModel = viewModel(),
) {
    MncsTheme(darkTheme = true) {
        Surface(color = MaterialTheme.colors.background) {
            val navController = rememberNavController()

            Scaffold(
                modifier = Modifier.fillMaxSize(),
                topBar = {

                },
                content = {
                    NavigationGraph(navController = navController)
                },
                bottomBar = {
                    MncsBottomNavigation(navController = navController)
                }
            )
        }
    }
}
