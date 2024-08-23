package com.piyushprajpti.cognifyzproject.util

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.piyushprajpti.cognifyzproject.ui.theme.PrimaryColor

@Composable
fun TopBar(
    onBackClick: () -> Unit,
    title: String
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
            contentDescription = "back button",
            modifier = Modifier
                .size(36.dp)
                .clip(CircleShape)
                .clickable {
                    onBackClick()
                }
        )

        Spacer(modifier = Modifier.width(20.dp))

        Text(text = title, fontSize = 20.sp, fontWeight = FontWeight.Bold, color = PrimaryColor)
    }
    HorizontalDivider(color = Color(0x1A000000))
}