package com.piyushprajpti.cognifyzproject

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.piyushprajpti.cognifyzproject.screens.Task1Screen
import com.piyushprajpti.cognifyzproject.screens.Task2Screen
import com.piyushprajpti.cognifyzproject.screens.Task3Screen
import com.piyushprajpti.cognifyzproject.screens.Task4Screen
import com.piyushprajpti.cognifyzproject.screens.Task5Screen
import com.piyushprajpti.cognifyzproject.screens.Task6Screen
import com.piyushprajpti.cognifyzproject.screens.Task7Screen
import com.piyushprajpti.cognifyzproject.screens.Task8Screen

@Composable
fun Navigator() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.MainFeed.route,
        enterTransition = { slideIntoContainer(AnimatedContentTransitionScope.SlideDirection.Left) },
        exitTransition = { slideOutOfContainer(AnimatedContentTransitionScope.SlideDirection.Right) },
        popEnterTransition = { slideIntoContainer(AnimatedContentTransitionScope.SlideDirection.Left) },
        popExitTransition = { slideOutOfContainer(AnimatedContentTransitionScope.SlideDirection.Right) }
    ) {
        composable(Screen.MainFeed.route) {
            MainFeed(navController = navController)
        }
        composable(Screen.Task1Screen.route) {
            Task1Screen(onBackClick = { navController.navigateUp() })
        }
        composable(Screen.Task2Screen.route) {
            Task2Screen(onBackClick = { navController.navigateUp() })
        }
        composable(Screen.Task3Screen.route) {
            Task3Screen(onBackClick = { navController.navigateUp() })
        }
        composable(Screen.Task4Screen.route) {
            Task4Screen(onBackClick = { navController.navigateUp() })
        }
        composable(Screen.Task5Screen.route) {
            Task5Screen(onBackClick = { navController.navigateUp() })
        }
        composable(Screen.Task6Screen.route) {
            Task6Screen(onBackClick = { navController.navigateUp() })
        }
        composable(Screen.Task7Screen.route) {
            Task7Screen(onBackClick = { navController.navigateUp() })
        }
        composable(Screen.Task8Screen.route) {
            Task8Screen(onBackClick = { navController.navigateUp() })
        }

    }
}