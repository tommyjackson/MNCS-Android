package com.mncs.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.mncs.data.HomeCellData
import com.mncs.theme.MncsTheme
import com.tjackapps.mncs.design.R

@Composable
fun HomeScreen(
    viewModel: HomeViewModel = viewModel(),
) {
    MncsTheme(darkTheme = true) {
        Surface(color = MaterialTheme.colors.background) {
            Scaffold(
                modifier = Modifier.fillMaxSize(),
                topBar = {

                },
                content = {
                    HomeScreenContent(it)
                },
                bottomBar = {

                }
            )
        }
    }
}

@Composable
fun HomeScreenContent(
    paddingValues: PaddingValues,
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(top = 16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            repeat(20) {
//                HomeScreenCell()
            }
        }
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.mncs_logo),
            contentDescription = null,
            alpha = .05f,
        )
    }
}

@Composable
fun HomeScreenCell(
    data: HomeCellData,
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp)
            .clip(MaterialTheme.shapes.large)
            .background(MaterialTheme.colors.surface),
    ) {
        Text(
            modifier = Modifier
                .padding(16.dp),
            text = "This is some test content",
            fontSize = 24.sp,
            color = MaterialTheme.colors.onSurface,
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}