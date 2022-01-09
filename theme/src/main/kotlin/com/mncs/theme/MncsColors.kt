package com.mncs.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val MncsBlue = Color(0xFF7BABDB) // primary
val MncsGray = Color(0xFFD0D4D8) // secondary

val CardBackgroundDark = Color(0xBF444444)
val CardBackgroundLight = Color(0xBFCCCCCC)

val TextColor: Color
    @Composable
    get() {
        return if (isSystemInDarkTheme()) Color.White else Color.Black
    }
