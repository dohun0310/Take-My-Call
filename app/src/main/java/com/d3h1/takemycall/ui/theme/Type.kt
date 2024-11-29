package com.d3h1.takemycall.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.d3h1.takemycall.R

val notosanskr = FontFamily(
    Font(R.font.notosanskr_bold, FontWeight.Bold, FontStyle.Normal),
    Font(R.font.notosanskr_medium, FontWeight.Medium, FontStyle.Normal),
    Font(R.font.notosanskr_regular, FontWeight.Normal, FontStyle.Normal),
    Font(R.font.notosanskr_light, FontWeight.Light, FontStyle.Normal),
    Font(R.font.notosanskr_thin, FontWeight.Thin, FontStyle.Normal)
)

val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = notosanskr,
        fontSize = 34.sp,
        lineHeight = 41.sp,
        fontWeight = FontWeight.W400,
        letterSpacing = (-0.4).sp
    ),
    displayMedium = TextStyle(
        fontFamily = notosanskr,
        fontSize = 28.sp,
        lineHeight = 34.sp,
        fontWeight = FontWeight.W400,
        letterSpacing = (-0.4).sp
    ),
    displaySmall = TextStyle(
        fontFamily = notosanskr,
        fontSize = 24.sp,
        lineHeight = 30.sp,
        fontWeight = FontWeight.W400,
        letterSpacing = (-0.4).sp
    ),
    headlineLarge = TextStyle(
        fontFamily = notosanskr,
        fontSize = 22.sp,
        lineHeight = 27.sp,
        fontWeight = FontWeight.W400,
        letterSpacing = (-0.4).sp
    ),
    headlineMedium = TextStyle(
        fontFamily = notosanskr,
        fontSize = 18.sp,
        lineHeight = 23.sp,
        fontWeight = FontWeight.W600,
        letterSpacing = (-0.4).sp
    ),
    headlineSmall = TextStyle(
        fontFamily = notosanskr,
        fontSize = 17.sp,
        lineHeight = 22.sp,
        fontWeight = FontWeight.W400,
        letterSpacing = (-0.4).sp
    ),
    titleLarge = TextStyle(
        fontFamily = notosanskr,
        fontSize = 16.sp,
        lineHeight = 21.sp,
        fontWeight = FontWeight.W400,
        letterSpacing = (-0.4).sp
    ),
    titleMedium = TextStyle(
        fontFamily = notosanskr,
        fontSize = 14.sp,
        lineHeight = 19.sp,
        fontWeight = FontWeight.W400,
        letterSpacing = (-0.4).sp
    ),
    titleSmall = TextStyle(
        fontFamily = notosanskr,
        fontSize = 13.sp,
        lineHeight = 18.sp,
        fontWeight = FontWeight.W400,
        letterSpacing = (-0.4).sp
    ),
    bodyLarge = TextStyle(
        fontFamily = notosanskr,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        fontWeight = FontWeight.W400,
        letterSpacing = (-0.4).sp
    ),
    bodyMedium = TextStyle(
        fontFamily = notosanskr,
        fontSize = 11.sp,
        lineHeight = 13.sp,
        fontWeight = FontWeight.W400,
        letterSpacing = (-0.4).sp
    ),
    bodySmall = TextStyle(
        fontFamily = notosanskr,
        fontSize = 10.sp,
        lineHeight = 12.sp,
        fontWeight = FontWeight.W400,
        letterSpacing = (-0.4).sp
    ),
    labelLarge = TextStyle(
        fontFamily = notosanskr,
        fontSize = 9.sp,
        lineHeight = 11.sp,
        fontWeight = FontWeight.W400,
        letterSpacing = (-0.4).sp
    ),
    labelMedium = TextStyle(
        fontFamily = notosanskr,
        fontSize = 8.sp,
        lineHeight = 10.sp,
        fontWeight = FontWeight.W400,
        letterSpacing = (-0.4).sp
    ),
    labelSmall = TextStyle(
        fontFamily = notosanskr,
        fontSize = 7.sp,
        lineHeight = 9.sp,
        fontWeight = FontWeight.W400,
        letterSpacing = (-0.4).sp
    )
)