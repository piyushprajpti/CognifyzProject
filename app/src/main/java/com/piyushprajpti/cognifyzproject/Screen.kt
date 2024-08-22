package com.piyushprajpti.cognifyzproject

sealed class Screen(val route: String) {
    data object MainFeed: Screen("main-feed")
    data object Task1Screen: Screen("task1")
    data object Task2Screen: Screen("task2")
    data object Task3Screen: Screen("task3")
    data object Task4Screen: Screen("task4")
    data object Task5Screen: Screen("task5")
    data object Task6Screen: Screen("task6")
    data object Task7Screen: Screen("task7")
    data object Task8Screen: Screen("task8")
}
