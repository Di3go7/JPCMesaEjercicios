package com.example.jpcmesaejercicios.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.jpcmesaejercicios.ui.heroes.HeroesScreen
import com.example.jpcmesaejercicios.ui.heroesdetail.HeroesDetailScreen

@Composable
fun Navigation(navHostController: NavHostController) {
    NavHost(
        navController = navHostController,
        startDestination = "main"
    ) {
        composable("main") {
            HeroesScreen(
                onHeroClick = {
                    navToHeroesDetailScreen(navHostController)
                }
            )
        }
        composable("detail") {
            HeroesDetailScreen()
        }
    }
}

fun navToHeroesDetailScreen(navController: NavController) {
    navController.navigate("detail")
}

/*
fun navToHeroesScreen(navController: NavController) {
    navController.navigate("main")
}*/
