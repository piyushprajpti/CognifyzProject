package com.piyushprajpti.cognifyzproject

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.piyushprajpti.cognifyzproject.util.TaskButton
import com.piyushprajpti.cognifyzproject.util.Titles

@Composable
fun MainFeed(
    navController: NavController
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 20.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TaskButton(title = Titles.task1) {
            navController.navigate(Screen.Task1Screen.route)
        }
        TaskButton(title = Titles.task2) {
            navController.navigate(Screen.Task2Screen.route)
        }
        TaskButton(title = Titles.task3) {
            navController.navigate(Screen.Task3Screen.route)
        }
        TaskButton(title = Titles.task4) {
            navController.navigate(Screen.Task4Screen.route)
        }
        TaskButton(title = Titles.task5) {
            navController.navigate(Screen.Task5Screen.route)
        }
        TaskButton(title = Titles.task6) {
            navController.navigate(Screen.Task6Screen.route)
        }
        TaskButton(title = Titles.task7) {
            navController.navigate(Screen.Task7Screen.route)
        }
        TaskButton(title = Titles.task8) {
            navController.navigate(Screen.Task8Screen.route)
        }
    }
}