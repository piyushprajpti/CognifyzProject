package com.piyushprajpti.cognifyzproject.screens

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.piyushprajpti.cognifyzproject.ui.theme.PrimaryColor
import com.piyushprajpti.cognifyzproject.util.TopBar

@Composable
fun Task6Screen(onBackClick: () -> Unit) {

    val context = LocalContext.current

    var name by remember {
        mutableStateOf("")
    }

    var email by remember {
        mutableStateOf("")
    }

    var number by remember {
        mutableStateOf("")
    }

    var query by remember {
        mutableStateOf("")
    }

    fun onSendClick() {
        Toast.makeText(context, "Query sent successfully", Toast.LENGTH_SHORT).show()
        name = ""
        email = ""
        number = ""
        query = ""
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        TopBar(onBackClick = onBackClick)

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp)
        ) {

            Text(
                text = "Have some Query? Tell us!",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                color = PrimaryColor,
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(40.dp))

            OutlinedTextField(
                value = name,
                onValueChange = { name = it },
                placeholder = { Text(text = "Your Name") },
                label = { Text(text = "Your Name") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                colors = TextFieldDefaults.colors(
                    focusedTextColor = Color.DarkGray,
                    unfocusedTextColor = Color.DarkGray,
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.White,
                    focusedIndicatorColor = PrimaryColor,
                    focusedLabelColor = PrimaryColor,
                    cursorColor = PrimaryColor
                ),
                modifier = Modifier.fillMaxWidth(),
            )

            Spacer(modifier = Modifier.height(20.dp))

            OutlinedTextField(
                value = email,
                onValueChange = { email = it },
                placeholder = { Text(text = "Email Address") },
                label = { Text(text = "Email Address") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                colors = TextFieldDefaults.colors(
                    focusedTextColor = Color.DarkGray,
                    unfocusedTextColor = Color.DarkGray,
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.White,
                    focusedIndicatorColor = PrimaryColor,
                    focusedLabelColor = PrimaryColor,
                    cursorColor = PrimaryColor
                ),
                modifier = Modifier.fillMaxWidth(),
            )

            Spacer(modifier = Modifier.height(20.dp))

            OutlinedTextField(
                value = number,
                onValueChange = { number = it },
                placeholder = { Text(text = "Phone Number") },
                label = { Text(text = "Phone Number") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                colors = TextFieldDefaults.colors(
                    focusedTextColor = Color.DarkGray,
                    unfocusedTextColor = Color.DarkGray,
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.White,
                    focusedIndicatorColor = PrimaryColor,
                    focusedLabelColor = PrimaryColor,
                    cursorColor = PrimaryColor
                ),
                modifier = Modifier.fillMaxWidth(),
            )

            Spacer(modifier = Modifier.height(20.dp))

            OutlinedTextField(
                value = query,
                onValueChange = { query = it },
                placeholder = { Text(text = "Explain your query here") },
                label = { Text(text = "Query") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
//                maxLines = 5,
                colors = TextFieldDefaults.colors(
                    focusedTextColor = Color.DarkGray,
                    unfocusedTextColor = Color.DarkGray,
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.White,
                    focusedIndicatorColor = PrimaryColor,
                    focusedLabelColor = PrimaryColor,
                    cursorColor = PrimaryColor
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp),
            )

            Spacer(modifier = Modifier.height(40.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Send Query",
                    fontSize = 20.sp,
                    modifier = Modifier
                        .background(PrimaryColor, RoundedCornerShape(12.dp))
                        .clip(RoundedCornerShape(12.dp))
                        .clickable { onSendClick() }
                        .padding(horizontal = 24.dp, vertical = 14.dp)
                )
            }
        }
    }
}