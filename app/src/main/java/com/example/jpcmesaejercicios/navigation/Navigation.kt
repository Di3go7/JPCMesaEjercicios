package com.example.jpcmesaejercicios.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
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
                onHeroClick = { heroId ->
                    navToHeroesDetailScreen(
                        navHostController,
                        heroId
                    )
                }
            )
        }
        composable(route = "detail/{heroId}",
        arguments = listOf(navArgument("heroId") { type = NavType.IntType })
        ) { navBackStackEntry ->
            val heroId = navBackStackEntry.arguments?.getInt("heroId")
            heroId?.let { heroIdSafe ->
                HeroesDetailScreen(heroIdSafe)
            }
        }
    }
}

fun navToHeroesDetailScreen(navController: NavController, heroId: Int) {
    navController.navigate("detail/$heroId")
}

/*
fun navToHeroesScreen(navController: NavController) {
    navController.navigate("main")
}*/
