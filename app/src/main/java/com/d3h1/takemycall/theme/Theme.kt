package com.d3h1.takemycall.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = red10,
    onPrimary = grey90,
    primaryContainer = red30,
    onPrimaryContainer = red90,

    secondary = green10,
    onSecondary = grey90,
    secondaryContainer = green30,
    onSecondaryContainer = green90,

    tertiary = blue10,
    onTertiary = grey90,
    tertiaryContainer = blue30,
    onTertiaryContainer = blue90,

    background = grey90,
    onBackground = grey10,

    surface = grey90,
    onSurface = grey20,

    error = red90,
    onError = red10
)

private val LightColorScheme = lightColorScheme(
    primary = red90,
    onPrimary = grey10,
    primaryContainer = red60,
    onPrimaryContainer = red10,

    secondary = green90,
    onSecondary = grey10,
    secondaryContainer = green60,
    onSecondaryContainer = green10,

    tertiary = blue90,
    onTertiary = grey10,
    tertiaryContainer = blue60,
    onTertiaryContainer = blue10,

    background = grey10,
    onBackground = grey90,

    surface = grey20,
    onSurface = grey90,

    error = red10,
    onError = red90
)

@Composable
fun TakeMyCallTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}