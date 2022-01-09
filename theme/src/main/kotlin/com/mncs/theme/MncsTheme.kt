package com.mncs.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    primary = MncsBlue,
    background = Color.Black,
    surface = CardBackgroundDark,
    onPrimary = Color.White,
    onBackground = Color.White,
    onSurface = Color.White,
)

private val LightColorPalette = lightColors(
    primary = MncsBlue,
    background = Color.White,
    surface = CardBackgroundLight,
    onPrimary = Color.White,
    onBackground = Color.Black,
    onSurface = Color.White,
)

@Composable
fun MncsTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    MaterialTheme(
        colors = if (darkTheme) DarkColorPalette else LightColorPalette,
        typography = MncsTypography.Typography,
        shapes = MncsShapes,
        content = content,
    )
}
