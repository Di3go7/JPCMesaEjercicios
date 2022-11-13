package com.example.jpcmesaejercicios.ui.heroes

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.rememberAsyncImagePainter

@Composable
fun HeroesScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Row(
                        Modifier.fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        Text(
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            maxLines = 1,
                            text = "Heroes"
                        )
                    }
                }
            )
        }
    ) { padding ->
        HeroesList()
    }
}

@Composable
fun HeroesList(viewModel: HeroesViewModel = viewModel()) {
    val state by viewModel.state.collectAsState()

    if (state.heroes.isNotEmpty()) {
        LazyColumn {
            items(state.heroes) { heroe ->
                Row(Modifier.fillMaxWidth()) {
                    Column {
                        Image(
                            painter = rememberAsyncImagePainter(heroe.images.sm),
                            contentDescription = null,
                            modifier = Modifier.size(80.dp)
                        )
                    }
                    Column {
                        Row {
                            Text(text = heroe.name)
                        }
                        Row {
                            Text(text = heroe.biography.fullName)
                        }
                    }
                }
            }
        }
    }

}