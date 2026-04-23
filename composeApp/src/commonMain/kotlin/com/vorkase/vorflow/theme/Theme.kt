package com.vorkase.vorflow.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

val VorFlowShapes = Shapes(
    extraSmall = RoundedCornerShape(2.dp),
    small = RoundedCornerShape(4.dp),
    medium = RoundedCornerShape(8.dp),
    large = RoundedCornerShape(12.dp),
    extraLarge = RoundedCornerShape(16.dp)
)

val LightColorScheme = lightColorScheme(
    primary = Color(0xFFF43F5E),
    onPrimary = Color(0xFFFFFFFF),
    primaryContainer = Color(0xFFFB7185),
    onPrimaryContainer = Color(0xFF111827),
    inversePrimary = Color(0xFFFB7185),

    secondary = Color(0xFFFB7185),
    onSecondary = Color(0xFF111827),
    secondaryContainer = Color(0xFFFEE2E2),
    onSecondaryContainer = Color(0xFFBE123C),

    tertiary = Color(0xFFBE123C),
    onTertiary = Color(0xFFFFFFFF),
    tertiaryContainer = Color(0xFFFFF1F2),
    onTertiaryContainer = Color(0xFFBE123C),

    background = Color(0xFFFFFFFF),
    onBackground = Color(0xFF111827),

    surface = Color(0xFFFFFFFF),
    onSurface = Color(0xFF111827),
    surfaceVariant = Color(0xFFF3F4F6),
    onSurfaceVariant = Color(0xFF111827),
    surfaceTint = Color(0xFFF43F5E),
    inverseSurface = Color(0xFF0D1117),
    inverseOnSurface = Color(0xFFFFFFFF),

    error = Color(0xFFBA1A1A),
    onError = Color(0xFFFFFFFF),
    errorContainer = Color(0xFFFFDAD6),
    onErrorContainer = Color(0xFF410002),

    outline = Color(0xFF9CA3AF),
    outlineVariant = Color(0xFFD1D5DB),
    scrim = Color(0xFF000000),


    surfaceBright = Color(0xFFFFFFFF),
    surfaceContainer = Color(0xFFF3F4F6),
    surfaceContainerHigh = Color(0xFFE5E7EB),
    surfaceContainerHighest = Color(0xFFD1D5DB),
    surfaceContainerLow = Color(0xFFF9FAFB),
    surfaceContainerLowest = Color(0xFFFFFFFF),
    surfaceDim = Color(0xFFD1D5DB),


    primaryFixed = Color(0xFFFB7185),
    primaryFixedDim = Color(0xFFF43F5E),
    onPrimaryFixed = Color(0xFF111827),
    onPrimaryFixedVariant = Color(0xFFBE123C),

    secondaryFixed = Color(0xFFFB7185),
    secondaryFixedDim = Color(0xFFF43F5E),
    onSecondaryFixed = Color(0xFF111827),
    onSecondaryFixedVariant = Color(0xFFBE123C),

    tertiaryFixed = Color(0xFFBE123C),
    tertiaryFixedDim = Color(0xFF9F1239),
    onTertiaryFixed = Color(0xFFFFFFFF),
    onTertiaryFixedVariant = Color(0xFFFFFFFF)
)

val DarkColorScheme = darkColorScheme(
    primary = Color(0xFFF43F5E),
    onPrimary = Color(0xFFFFFFFF),
    primaryContainer = Color(0xFFBE123C),
    onPrimaryContainer = Color(0xFFFFFFFF),
    inversePrimary = Color(0xFFF43F5E),

    secondary = Color(0xFFFB7185),
    onSecondary = Color(0xFF0D1117),
    secondaryContainer = Color(0xFF881337),
    onSecondaryContainer = Color(0xFFFB7185),

    tertiary = Color(0xFFBE123C),
    onTertiary = Color(0xFFFFFFFF),
    tertiaryContainer = Color(0xFF4C0519),
    onTertiaryContainer = Color(0xFFFB7185),

    background = Color(0xFF0D1117),
    onBackground = Color(0xFFFFFFFF),

    surface = Color(0xFF0D1117),
    onSurface = Color(0xFFFFFFFF),
    surfaceVariant = Color(0xFF1F2937),
    onSurfaceVariant = Color(0xFFFFFFFF),
    surfaceTint = Color(0xFFF43F5E),
    inverseSurface = Color(0xFFFFFFFF),
    inverseOnSurface = Color(0xFF111827),

    error = Color(0xFFFFB4AB),
    onError = Color(0xFF690005),
    errorContainer = Color(0xFF93000A),
    onErrorContainer = Color(0xFFFFDAD6),

    outline = Color(0xFF4B5563),
    outlineVariant = Color(0xFF374151),
    scrim = Color(0xFF000000),


    surfaceBright = Color(0xFF1F2937),
    surfaceContainer = Color(0xFF111827),
    surfaceContainerHigh = Color(0xFF1F2937),
    surfaceContainerHighest = Color(0xFF374151),
    surfaceContainerLow = Color(0xFF0D1117),
    surfaceContainerLowest = Color(0xFF000000),
    surfaceDim = Color(0xFF0D1117),


    primaryFixed = Color(0xFFFB7185),
    primaryFixedDim = Color(0xFFF43F5E),
    onPrimaryFixed = Color(0xFF111827),
    onPrimaryFixedVariant = Color(0xFFBE123C),

    secondaryFixed = Color(0xFFFB7185),
    secondaryFixedDim = Color(0xFFF43F5E),
    onSecondaryFixed = Color(0xFF111827),
    onSecondaryFixedVariant = Color(0xFFBE123C),

    tertiaryFixed = Color(0xFFBE123C),
    tertiaryFixedDim = Color(0xFF9F1239),
    onTertiaryFixed = Color(0xFFFFFFFF),
    onTertiaryFixedVariant = Color(0xFFFFFFFF)
)

@Composable
fun VorFlowTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) {
        DarkColorScheme
    } else {
        LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = VorFlowTypography,
        shapes = VorFlowShapes,
        content = content
    )
}