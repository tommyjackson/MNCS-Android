package com.mncs.design.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.mncs.theme.MncsTheme

@Composable
private fun MncsToolbar() {
    TopAppBar(
        modifier = Modifier
            .fillMaxWidth()
    ) {

    }
}

@Preview
@Composable
private fun MncsToolbarPreview() {
    MncsTheme {
        MncsToolbar()
    }
}