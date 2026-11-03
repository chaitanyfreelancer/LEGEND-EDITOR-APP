package com.legendeditor.app.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

val LegendBackground = Color(0xFF0E0B14)
val LegendSurface = Color(0xFF1A1523)
val LegendPurple = Color(0xFF8B5CF6)
val LegendPurpleSoft = Color(0xFFC4B5FD)
val LegendTextPrimary = Color(0xFFF5F3FF)
val LegendTextSecondary = Color(0xFFA1A1AA)

private val LegendColors = darkColorScheme(
    primary = LegendPurple,
    onPrimary = Color.White,
    background = LegendBackground,
    onBackground = LegendTextPrimary,
    surface = LegendSurface,
    onSurface = LegendTextPrimary
)

@Composable
fun LegendTheme(content: @Composable () -> Unit) {
    MaterialTheme(colorScheme = LegendColors, content = content)
}

@Composable
fun LaunchScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    listOf(LegendBackground, Color(0xFF1B1030), LegendBackground)
                )
            )
            .safeDrawingPadding(),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Box(
                modifier = Modifier
                    .size(80.dp)
                    .background(LegendPurple, RoundedCornerShape(22.dp)),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "L",
                    color = Color.White,
                    fontSize = 44.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Spacer(modifier = Modifier.height(28.dp))
            Text(
                text = "LEGEND EDITOR",
                color = LegendTextPrimary,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                letterSpacing = 4.sp,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Professional video editing",
                color = LegendPurpleSoft,
                fontSize = 15.sp,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(48.dp))
            Text(
                text = "Phase 0 build check  \u2022  v0.0.1",
                color = LegendTextSecondary,
                fontSize = 12.sp,
                textAlign = TextAlign.Center
            )
        }
    }
}
