package com.mncs.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.mncs.design.components.MncsToolbar
import com.mncs.navigation.MncsBottomNavigation
import com.mncs.navigation.NavigationGraph
import com.mncs.theme.ErrorRed
import com.mncs.theme.MncsTheme
import com.tjackapps.mncs.home.R

@Composable
fun HomeScreen() {
    MncsTheme(darkTheme = true) {
        Surface(color = MaterialTheme.colors.background) {
            val navController = rememberNavController()
            val viewModel: HomeViewModel = viewModel()
            val viewState by viewModel.viewState.collectAsState()

            HomeScreenHandler(
                viewState = viewState,
                navController = navController,
                actionHandler = viewModel::setAction,
            )
        }
    }
}

@Composable
private fun HomeScreenHandler(
    viewState: HomeViewModel.ViewState,
    navController: NavHostController,
    actionHandler: (HomeViewModel.Action) -> Unit,
) {
    when (viewState) {
        is HomeViewModel.ViewState.Loading -> LoadingState(actionHandler)
        is HomeViewModel.ViewState.Content -> ContentState(navController, viewState)
        is HomeViewModel.ViewState.Error -> ErrorState()
    }
}

@Composable
private fun LoadingState(
    actionHandler: (HomeViewModel.Action) -> Unit,
) {
    actionHandler(HomeViewModel.Action.Initialize)

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
        content = {
            CircularProgressIndicator()
        })
}

@Composable
private fun ContentState(
    navController: NavHostController,
    viewState: HomeViewModel.ViewState.Content, // any initialization data?
) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            MncsToolbar()
        },
        content = {
            NavigationGraph(navController = navController)
        },
        bottomBar = {
            MncsBottomNavigation(navController = navController)
        }
    )
}

@Composable
private fun ErrorState() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 16.dp, end = 16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_error),
            contentDescription = null,
            colorFilter = ColorFilter.tint(ErrorRed)
        )
        Text(
            modifier = Modifier.padding(top = 8.dp),
            text = stringResource(id = R.string.generic_error_message),
            style = MaterialTheme.typography.h3,
            textAlign = TextAlign.Center,
        )
    }
}