package com.example.jpcmesaejercicios.ui.heroes

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.rememberAsyncImagePainter

@Composable
fun HeroesScreen(onHeroClick: () -> Unit) {
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
        HeroesList (
            navToDetail = onHeroClick
        )
        padding
    }
}

@Composable
fun HeroesList(viewModel: HeroesViewModel = viewModel(), navToDetail: () -> Unit) {
    val state by viewModel.state.collectAsState()

    if (state.heroes.isNotEmpty()) {
        LazyColumn {
            items(state.heroes) { heroe ->
                Row(
                    Modifier
                        .height(intrinsicSize = IntrinsicSize.Max)
                        .fillMaxWidth().clickable {
                            navToDetail()
                        }
                ) {
                    Column {
                        Image(
                            painter = rememberAsyncImagePainter(heroe.images.sm),
                            contentDescription = "*",
                            modifier = Modifier.size(80.dp),
                            contentScale = ContentScale.FillBounds
                        )
                    }
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(start = 16.dp),
                        verticalArrangement = Arrangement.spacedBy(
                            4.dp,
                            Alignment.CenterVertically
                        ),
                    ) {
                        Text(text = heroe.name, fontWeight = FontWeight.Bold, fontSize = 18.sp)
                        Text(text = heroe.biography.fullName)
                    }
                }
            }
        }
    }
}
