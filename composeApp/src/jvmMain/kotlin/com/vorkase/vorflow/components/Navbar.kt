package com.vorkase.vorflow.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.vorkase.vorflow.theme.VorFlowDarkTitleBar
import com.vorkase.vorflow.theme.VorFlowLightTitleBar
import com.vorkase.vorflow.theme.VorFlowTheme
import org.jetbrains.jewel.foundation.theme.JewelTheme
import org.jetbrains.jewel.intui.window.styling.defaults
import org.jetbrains.jewel.window.DecoratedWindowScope
import org.jetbrains.jewel.window.TitleBar
import org.jetbrains.jewel.window.defaultTitleBarStyle
import org.jetbrains.jewel.window.newFullscreenControls
import org.jetbrains.jewel.window.styling.TitleBarMetrics
import org.jetbrains.jewel.window.styling.TitleBarStyle

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun DecoratedWindowScope.Navbar() {
    val style = JewelTheme.defaultTitleBarStyle

    TitleBar(
        Modifier.newFullscreenControls(),
        style =
            TitleBarStyle(
                colors = if (isSystemInDarkTheme()) VorFlowDarkTitleBar else VorFlowLightTitleBar,
                metrics = TitleBarMetrics.defaults(height = 36.dp),
                icons = style.icons,
                dropdownStyle = style.dropdownStyle,
                iconButtonStyle = style.iconButtonStyle,
                paneButtonStyle = style.paneButtonStyle,
                paneCloseButtonStyle = style.paneCloseButtonStyle,
            ),
    ) {
        VorFlowTheme {
            Row(
                Modifier.align(Alignment.Start).padding(horizontal = 16.dp, vertical = 4.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(2.dp),
            ) {
                FilledTonalButton(
                    onClick = {},
                    shape = MaterialTheme.shapes.medium,
                    contentPadding = PaddingValues(horizontal = 16.dp, vertical = 0.dp),

                    content = {
                        Text("Open", modifier = Modifier.background(Color.Gray))
                    },
                )
            }
        }
    }
}
