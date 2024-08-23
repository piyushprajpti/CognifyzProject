package com.piyushprajpti.cognifyzproject.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.piyushprajpti.cognifyzproject.util.DataCard
import com.piyushprajpti.cognifyzproject.util.Titles
import com.piyushprajpti.cognifyzproject.util.TopBar
import com.piyushprajpti.cognifyzproject.util.UserEntity

@Composable
fun Task3Screen(onBackClick: () -> Unit, usersList: List<UserEntity>) {

    Column(modifier = Modifier.fillMaxSize()) {
        TopBar(onBackClick = onBackClick, title = Titles.task3)

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp)
        ) {
            items(usersList) {
                DataCard(userData = it)
            }
        }
    }
}