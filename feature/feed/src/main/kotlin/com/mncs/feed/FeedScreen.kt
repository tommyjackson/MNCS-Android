package com.mncs.feed

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.mncs.data.HomeCellData
import com.tjackapps.mncs.design.R

@Composable
fun FeedScreen(
    viewModel: FeedViewModel = hiltViewModel(),
) {
//    LaunchedEffect(Unit) {
//        viewModel.getPlayers()
//    }

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            repeat(20) {
//                FeedScreenCell()
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
fun FeedScreenCell(
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
fun FeedScreenPreview() {
    FeedScreen()
}
