package com.example.ktproject.ui.theme

sealed class Screen(val route: String){
    object MainsScreen : Screen("main_screen")
    object DetailScreen : Screen("detail_screen")
}
