package com.piyushprajpti.cognifyzproject.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.piyushprajpti.cognifyzproject.util.Titles
import com.piyushprajpti.cognifyzproject.util.TopBar

@Composable
fun Task4Screen(onBackClick: () -> Unit) {
    Column(modifier = Modifier.fillMaxSize()) {
        TopBar(onBackClick = onBackClick, title = Titles.task4)

        Text(
            text = """"I have already completed the task of building an app with multiple activities and a basic UI layout using Jetpack Compose instead of XML layout."""",
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
            modifier = Modifier.padding(start = 20.dp, top = 150.dp, end = 20.dp, bottom = 0.dp)
        )
    }
}