package com.example.jpcmesaejercicios

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.jpcmesaejercicios.navigation.Navigation
import com.example.jpcmesaejercicios.ui.heroes.HeroesScreen
import com.example.jpcmesaejercicios.ui.heroesdetail.HeroesDetailScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            Navigation(navHostController = navController)
            HeroesScreen(navController)
        }
    }
}


@Preview(showBackground = true, showSystemUi = true, device = Devices.NEXUS_5)
@Composable
fun DefaultPreview() {
    val navController = rememberNavController()
    Navigation(navHostController = navController)
    HeroesDetailScreen()
}