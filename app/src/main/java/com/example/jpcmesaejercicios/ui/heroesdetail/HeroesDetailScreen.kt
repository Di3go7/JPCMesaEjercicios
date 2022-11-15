package com.example.jpcmesaejercicios.ui.heroesdetail

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import com.example.jpcmesaejercicios.entities.Hero

@Composable
fun HeroesDetailScreen(heroId: Int, viewModel: HeroesDetailViewModel = viewModel()) {
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
                            text = "Hero Detail"
                        )
                    }
                }
            )
        }
    ) { padding ->
        val state by viewModel.state.collectAsState()
        val hero = state.hero

        hero?.let {
            HeroDetail(it)
        }
        padding
    }
}

@Composable
//@Preview
fun HeroDetail(hero: Hero){
/*    val hero = Hero(
        id = 1,
        name = "Heroe",
        powerStats = HeroPowerStats(
            intelligence = 0,
            strength = 1,
            speed = 2,
            durability = 3,
            power = 4,
            combat = 5
        ),
        biography = HeroBiography(
            fullName = "asd asd asd"
        ),
        images = HeroImages(
            sm = "https://cdn.rawgit.com/akabab/superhero-api/0.2.0/api/images/sm/1-a-bomb.jpg",
            lg = "https://cdn.rawgit.com/akabab/superhero-api/0.2.0/api/images/lg/1-a-bomb.jpg"
        )
    )*/
    Column {
        Image(
            painter = rememberAsyncImagePainter(hero.images?.lg),
            contentDescription = "*",
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp),
            contentScale = ContentScale.Crop
        )
        hero.powerStats.let { powerStats ->
            HeroDetailTitle(title = "PowerStats")
            HeroDetailElement("Intelligence", hero.powerStats.intelligence.toString())
            HeroDetailElement("Strength", hero.powerStats.strength.toString())
            HeroDetailElement("Speed", hero.powerStats.speed.toString())
            HeroDetailElement("Durability", hero.powerStats.durability.toString())
            HeroDetailElement("Power", hero.powerStats.power.toString())
            HeroDetailElement("Combat", hero.powerStats.combat.toString())
        }
    }
}

@Composable
fun HeroDetailTitle(title: String) {
    Row(Modifier.fillMaxWidth()) {
        Text(
            text = "$title:",
            Modifier.padding(16.dp),
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp
        )
    }
}

@Composable
fun HeroDetailElement(title: String, description: String) {
    Row(Modifier.height(IntrinsicSize.Min).padding(0.dp, 8.dp)) {
        Text(text = "$title:", Modifier.padding(32.dp, 0.dp, 16.dp, 0.dp))
        Text(text = description, Modifier.weight(1f))
    }
}

