package com.piyushprajpti.cognifyzproject.screens

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.piyushprajpti.cognifyzproject.util.DataCard
import com.piyushprajpti.cognifyzproject.util.Titles
import com.piyushprajpti.cognifyzproject.util.TopBar
import com.piyushprajpti.cognifyzproject.util.UserData
import com.piyushprajpti.cognifyzproject.util.getData

@Composable
fun Task3Screen(onBackClick: () -> Unit) {

    val context = LocalContext.current

    val usersList = remember {
        mutableStateOf<List<UserData>>(emptyList())
    }

    LaunchedEffect(Unit) {

        getData { userData, error ->
            if (userData != null) {
                usersList.value = userData
                Log.d("TAG", "Task3Screen: $usersList")
            } else if (error != null) {
                Toast.makeText(context, error, Toast.LENGTH_LONG).show()
            }
        }
    }

    Column(modifier = Modifier.fillMaxSize()) {
        TopBar(onBackClick = onBackClick, title = Titles.task3)

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp)
        ) {
            items(usersList.value) {
                DataCard(userData = it)
            }
        }
    }
}