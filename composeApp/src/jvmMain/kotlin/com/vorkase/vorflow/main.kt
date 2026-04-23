package com.vorkase.vorflow

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.window.application
import com.vorkase.vorflow.components.Navbar
import dev.hydraulic.conveyor.control.SoftwareUpdateController
import io.github.vinceglb.filekit.FileKit
import java.awt.Dimension
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.jewel.foundation.theme.JewelTheme
import org.jetbrains.jewel.intui.standalone.theme.IntUiTheme
import org.jetbrains.jewel.intui.standalone.theme.createDefaultTextStyle
import org.jetbrains.jewel.intui.standalone.theme.createEditorTextStyle
import org.jetbrains.jewel.intui.standalone.theme.default
import org.jetbrains.jewel.intui.standalone.theme.lightThemeDefinition
import org.jetbrains.jewel.intui.window.decoratedWindow
import org.jetbrains.jewel.intui.window.styling.lightWithLightHeader
import org.jetbrains.jewel.ui.ComponentStyling
import org.jetbrains.jewel.window.DecoratedWindow
import org.jetbrains.jewel.window.styling.TitleBarStyle
import vorflow.composeapp.generated.resources.Res
import vorflow.composeapp.generated.resources.icon

val updateController: SoftwareUpdateController? = SoftwareUpdateController.getInstance()
val canDoOnlineUpdates get() = updateController?.canTriggerUpdateCheckUI() == SoftwareUpdateController.Availability.AVAILABLE

fun main(args: Array<String>) {
    FileKit.init(appId = "VorkFlow")
    application {
        val windowIcon = painterResource(Res.drawable.icon)
        val currentVersion by remember { mutableStateOf(updateController?.currentVersion?.version ?: "Unknown") }
        val textStyle = JewelTheme.createDefaultTextStyle()
        val editorStyle = JewelTheme.createEditorTextStyle()

        val themeDefinition =
            JewelTheme.lightThemeDefinition(defaultTextStyle = textStyle, editorTextStyle = editorStyle)
        IntUiTheme(
            theme = themeDefinition,
            styling =
                ComponentStyling
                    .default()
                    .decoratedWindow(titleBarStyle = TitleBarStyle.lightWithLightHeader()),
            swingCompatMode = true,
        ) {
            DecoratedWindow(
                onCloseRequest = ::exitApplication,
                title = "VorkFlow",
                icon = windowIcon,
            ) {
                window.minimumSize = Dimension(500, 500)

                var remoteVersion by remember { mutableStateOf("Checking...") }
                var updateAvailable by remember { mutableStateOf(false) }
                val coroutineScope = rememberCoroutineScope()

                LaunchedEffect(Unit) {
                    coroutineScope.launch(Dispatchers.IO) {
                        try {
                            val remoteVersionObj: SoftwareUpdateController.Version? =
                                updateController?.currentVersionFromRepository
                            remoteVersion = remoteVersionObj?.version ?: "Unknown"
                            updateAvailable = (remoteVersionObj?.compareTo(updateController.currentVersion) ?: 0) > 0
                        } catch (e: Exception) {
                            remoteVersion = "Error: ${e.message}"
                        }
                    }
                }

                Column {
                    Navbar()
                    App(
                        currentVersion = currentVersion,
                        remoteVersion = remoteVersion,
                        updateAvailable = updateAvailable,
                    )
                }
            }
        }
    }
}
