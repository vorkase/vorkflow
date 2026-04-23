package com.vorkase.vorflow.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

// Placeholder for Inter or Montserrat Font loading [cite: 20]
// val InterFontFamily = FontFamily( ... )

val VorFlowTypography = Typography(
    displayLarge = TextStyle(
        // fontFamily = InterFontFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 32.sp
        // Note: Color is inherited from the theme's 'onBackground' or 'onSurface'
    ),
    bodyLarge = TextStyle(
        // fontFamily = InterFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
)