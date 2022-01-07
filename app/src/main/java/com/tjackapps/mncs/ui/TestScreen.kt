package com.tjackapps.mncs.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TestScreen() {
    MaterialTheme {
        Surface(color = Color.White) {
            Scaffold(
                modifier = Modifier.fillMaxSize(),
                topBar = {

                },
                content = {
                    TestScreenContent()
                },
                bottomBar = {

                }
            )
        }
    }
}

@Composable
fun TestScreenContent() {

}

@Preview(showBackground = true, showSystemUi = true)
@Composable fun TestScreenPreview() {
    TestScreen()
}