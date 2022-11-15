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
                onHeroClick = { heroeId ->
                    navToHeroesDetailScreen(
                        navHostController,
                        heroeId
                    )
                }
            )
        }
        composable(route = "detail/{heroeId}",
        arguments = listOf(navArgument("heroeId") { type = NavType.IntType })
        ) { navBackStackEntry ->
            val heroeId = navBackStackEntry.arguments?.getInt("heroeId")
            heroeId?.let { heroeIdSafe ->
                HeroesDetailScreen(heroeIdSafe)
            }
        }
    }
}

fun navToHeroesDetailScreen(navController: NavController, heroeId: Int) {
    navController.navigate("detail/$heroeId")
}

/*
fun navToHeroesScreen(navController: NavController) {
    navController.navigate("main")
}*/
