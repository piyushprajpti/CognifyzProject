package com.piyushprajpti.cognifyzproject

import android.widget.Toast
import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.util.fastJoinToString
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.room.Room
import com.piyushprajpti.cognifyzproject.screens.Task1Screen
import com.piyushprajpti.cognifyzproject.screens.Task2Screen
import com.piyushprajpti.cognifyzproject.screens.Task3Screen
import com.piyushprajpti.cognifyzproject.screens.Task4Screen
import com.piyushprajpti.cognifyzproject.screens.Task5Screen
import com.piyushprajpti.cognifyzproject.screens.Task6Screen
import com.piyushprajpti.cognifyzproject.screens.Task7Screen
import com.piyushprajpti.cognifyzproject.screens.Task8Screen
import com.piyushprajpti.cognifyzproject.util.AddressEntity
import com.piyushprajpti.cognifyzproject.util.UserDatabase
import com.piyushprajpti.cognifyzproject.util.UserEntity
import com.piyushprajpti.cognifyzproject.util.getData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

@Composable
fun Navigator() {
    val navController = rememberNavController()

    val context = LocalContext.current

    val db = Room.databaseBuilder(context, UserDatabase::class.java, "users").build()


    val usersList = remember {
        mutableStateOf<List<UserEntity>>(emptyList())
    }

    LaunchedEffect(Unit) {
        withContext(Dispatchers.IO) {

            val userDao = db.userDao()

            if (userDao.getAllUsersList().isEmpty()) {
                getData { userData, error ->
                    if (userData != null) {
                        usersList.value = userData.map {
                            UserEntity(
                                id = it.id,
                                name = it.name,
                                age = it.age,
                                username = it.username,
                                email = it.email,
                                address = AddressEntity(
                                    street = it.address.street,
                                    city = it.address.city,
                                    zip = it.address.zip
                                ),
                                phone = it.phone,
                                website = it.website,
                                occupation = it.occupation,
                                hobbies = it.hobbies.fastJoinToString()
                            )
                        }
                        userDao.insertUsers(usersList.value)
                    } else if (error != null) {
                        Toast.makeText(context, error, Toast.LENGTH_LONG).show()
                    }
                }
            } else {
                usersList.value = userDao.getAllUsersList()
            }
        }
    }


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
            Task3Screen(
                onBackClick = { navController.navigateUp() },
                usersList = usersList.value
            )
        }
        composable(Screen.Task4Screen.route) {
            Task4Screen(onBackClick = { navController.navigateUp() })
        }
        composable(Screen.Task5Screen.route) {
            Task5Screen(
                onBackClick = { navController.navigateUp() },
                usersList = usersList.value
            )
        }
        composable(Screen.Task6Screen.route) {
            Task6Screen(onBackClick = { navController.navigateUp() })
        }
        composable(Screen.Task7Screen.route) {
            Task7Screen(
                onBackClick = { navController.navigateUp() },
                usersList = usersList.value
            )
        }
        composable(Screen.Task8Screen.route) {
            Task8Screen(onBackClick = { navController.navigateUp() })
        }

    }
}