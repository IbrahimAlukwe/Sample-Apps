

package com.example.jetcaster.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import com.example.jetcaster.ui.rememberJetcasterAppState

@Composable
fun JetcasterTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colors = JetcasterColors,
        typography = JetcasterTypography,
        shapes = JetcasterShapes,
        content = content,
        /*content = rememberJetcasterAppState()*/
    )
}
