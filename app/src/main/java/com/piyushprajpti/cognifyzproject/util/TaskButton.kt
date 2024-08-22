package com.piyushprajpti.cognifyzproject.util

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.piyushprajpti.cognifyzproject.ui.theme.PrimaryColor

@Composable
fun TaskButton(
    title: String,
    onClick: () -> Unit
) {
    Text(
        text = title,
        fontSize = 18.sp,
        textAlign = TextAlign.Center,
        color = Color.Black,
        modifier = Modifier
            .fillMaxWidth()
            .background(PrimaryColor, CircleShape)
            .clip(CircleShape)
            .clickable { onClick() }
            .padding(vertical = 15.dp)
    )
}