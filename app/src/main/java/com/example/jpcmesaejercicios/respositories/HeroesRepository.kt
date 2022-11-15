package com.example.jpcmesaejercicios.respositories

import com.example.jpcmesaejercicios.entities.Hero
import com.example.jpcmesaejercicios.entities.HeroBiography
import com.example.jpcmesaejercicios.entities.HeroImages
import com.example.jpcmesaejercicios.entities.HeroPowerStats

object HeroesRepository {
    suspend fun getHeroes() = listOf(
        Hero(
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
        ),
        Hero(
            id = 2,
            name = "Heroe 2",
            powerStats = HeroPowerStats(
                intelligence = 0,
                strength = 1,
                speed = 2,
                durability = 3,
                power = 4,
                combat = 5
            ),
            biography = HeroBiography(
                fullName = "hjk hjk ghj jh"
            ),
            images = HeroImages(
                sm = "https://cdn.rawgit.com/akabab/superhero-api/0.2.0/api/images/sm/1-a-bomb.jpg",
                lg = "https://cdn.rawgit.com/akabab/superhero-api/0.2.0/api/images/lg/1-a-bomb.jpg"
            )
        ),
        Hero(
            id = 3,
            name = "Heroe 3",
            powerStats = HeroPowerStats(
                intelligence = 0,
                strength = 1,
                speed = 2,
                durability = 3,
                power = 4,
                combat = 5
            ),
            biography = HeroBiography(
                fullName = "fgh yfugf vhf"
            ),
            images = HeroImages(
                sm = "https://cdn.rawgit.com/akabab/superhero-api/0.2.0/api/images/sm/1-a-bomb.jpg",
                lg = "https://cdn.rawgit.com/akabab/superhero-api/0.2.0/api/images/lg/1-a-bomb.jpg"
            )
        )
    )
}
