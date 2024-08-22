package com.piyushprajpti.cognifyzproject.screens

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.piyushprajpti.cognifyzproject.util.TopBar

@Composable
fun Task2Screen(onBackClick: () -> Unit) {

    val context = LocalContext.current

    Column(modifier = Modifier.fillMaxSize()) {
        TopBar(onBackClick = onBackClick)

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 300.dp),
            contentAlignment = Alignment.TopCenter
        ) {
            Button(
                onClick = {
                    Toast.makeText(context, "Button Clicked!!!", Toast.LENGTH_SHORT).show()
                }
            ) {
                Text(text = "Click Me", fontSize = 20.sp)
            }
        }
    }
}