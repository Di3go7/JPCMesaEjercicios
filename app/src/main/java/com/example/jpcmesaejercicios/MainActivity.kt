package com.example.jpcmesaejercicios

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jpcmesaejercicios.ui.heroes.HeroesScreen
import com.example.jpcmesaejercicios.ui.theme.JPCMesaEjerciciosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HeroesScreen()
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HeroesScreen()
}