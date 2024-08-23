package com.piyushprajpti.cognifyzproject.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.piyushprajpti.cognifyzproject.util.DataCard
import com.piyushprajpti.cognifyzproject.util.Titles
import com.piyushprajpti.cognifyzproject.util.TopBar
import com.piyushprajpti.cognifyzproject.util.UserEntity

@Composable
fun Task7Screen(onBackClick: () -> Unit, usersList: List<UserEntity>) {

    Column(modifier = Modifier.fillMaxSize()) {
        TopBar(onBackClick = onBackClick, title = Titles.task7)

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp)
        ) {
            item {
                Text(
                    text = """"Users data is fetched from local storage using room database and displayed using List."""",
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp,
                )

                Spacer(modifier = Modifier.height(30.dp))
            }
            items(usersList) {
                DataCard(userData = it)
            }
        }
    }
}