package com.piyushprajpti.cognifyzproject

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.Navigator
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.piyushprajpti.MainFeed

@Composable
fun Navigator() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.MainFeed.route) {
        composable(Screen.MainFeed.route) {
            MainFeed()
        }
    }
}