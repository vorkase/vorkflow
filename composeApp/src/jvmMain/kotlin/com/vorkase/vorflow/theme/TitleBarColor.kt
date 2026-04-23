package com.vorkase.vorflow.theme

import androidx.compose.ui.graphics.Color
import org.jetbrains.jewel.window.styling.TitleBarColors

val VorFlowLightTitleBar =
    TitleBarColors(
        background = Color(0xFFFFFFFF),
        inactiveBackground = Color(0xFFFFFFFF),
        fullscreenControlButtonsBackground = Color(0xFF111827).copy(alpha = 0.1f),
        content = Color(0xFF111827),
        border = Color(0xFFFFFFFF),
        titlePaneButtonHoveredBackground = Color(0xFF111827).copy(alpha = 0.05f),
        titlePaneButtonPressedBackground = Color(0xFF111827).copy(alpha = 0.1f),
        titlePaneCloseButtonHoveredBackground = Color(0xFFF43F5E),
        titlePaneCloseButtonPressedBackground = Color(0xFFBE123C),
        iconButtonHoveredBackground = Color(0xFF111827).copy(alpha = 0.05f),
        iconButtonPressedBackground = Color(0xFF111827).copy(alpha = 0.1f),
        dropdownHoveredBackground = Color(0xFF111827).copy(alpha = 0.05f),
        dropdownPressedBackground = Color(0xFF111827).copy(alpha = 0.1f),
    )

val VorFlowDarkTitleBar =
    TitleBarColors(
        background = Color(0xFF0D1117), // Dark Slate
        inactiveBackground = Color(0xFF0D1117),
        fullscreenControlButtonsBackground = Color(0xFFFFFFFF).copy(alpha = 0.1f),
        content = Color(0xFFFFFFFF), // Pure White for dark mode legibility [cite: 85]
        border = Color(0xFF0D1117), // Subtle White border
        titlePaneButtonHoveredBackground = Color(0xFFFFFFFF).copy(alpha = 0.1f),
        titlePaneButtonPressedBackground = Color(0xFFFFFFFF).copy(alpha = 0.15f),
        titlePaneCloseButtonHoveredBackground = Color(0xFFF43F5E), // VorFlow Mid (Adobe Red)
        titlePaneCloseButtonPressedBackground = Color(0xFFBE123C), // VorFlow Shadow
        iconButtonHoveredBackground = Color(0xFFFFFFFF).copy(alpha = 0.1f),
        iconButtonPressedBackground = Color(0xFFFFFFFF).copy(alpha = 0.15f),
        dropdownHoveredBackground = Color(0xFFFFFFFF).copy(alpha = 0.1f),
        dropdownPressedBackground = Color(0xFFFFFFFF).copy(alpha = 0.15f),
    )
