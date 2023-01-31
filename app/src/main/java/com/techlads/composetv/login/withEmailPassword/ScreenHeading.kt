package com.techlads.composetv.login.withEmailPassword

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun ScreenHeading() {
    Text(
        text = "LOGIN", style = TextStyle(
            fontSize = 55.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Thin
        )
    )
}