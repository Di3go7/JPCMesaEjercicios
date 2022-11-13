package com.example.jpcmesaejercicios.respositories

import com.example.jpcmesaejercicios.entities.Heroe
import com.example.jpcmesaejercicios.entities.HeroeBiography
import com.example.jpcmesaejercicios.entities.HeroeImages
import com.example.jpcmesaejercicios.entities.HeroePowerStats

object HeroesRepository {
    suspend fun getHeroes() = listOf(
        Heroe(
            id = 1,
            name = "Heroe",
            powerStats = HeroePowerStats(
                intelligence = 0,
                strength = 1,
                speed = 2,
                durability = 3,
                power = 4,
                combat = 5
            ),
            biography = HeroeBiography(
                fullName = "asd asd asd"
            ),
            images = HeroeImages(
                sm = "https://cdn.rawgit.com/akabab/superhero-api/0.2.0/api/images/sm/1-a-bomb.jpg",
                lg = "https://cdn.rawgit.com/akabab/superhero-api/0.2.0/api/images/lg/1-a-bomb.jpg"
            )
        ),
        Heroe(
            id = 2,
            name = "Heroe 2",
            powerStats = HeroePowerStats(
                intelligence = 0,
                strength = 1,
                speed = 2,
                durability = 3,
                power = 4,
                combat = 5
            ),
            biography = HeroeBiography(
                fullName = "hjk hjk ghj jh"
            ),
            images = HeroeImages(
                sm = "https://cdn.rawgit.com/akabab/superhero-api/0.2.0/api/images/sm/1-a-bomb.jpg",
                lg = "https://cdn.rawgit.com/akabab/superhero-api/0.2.0/api/images/lg/1-a-bomb.jpg"
            )
        ),
        Heroe(
            id = 3,
            name = "Heroe 3",
            powerStats = HeroePowerStats(
                intelligence = 0,
                strength = 1,
                speed = 2,
                durability = 3,
                power = 4,
                combat = 5
            ),
            biography = HeroeBiography(
                fullName = "fgh yfugf vhf"
            ),
            images = HeroeImages(
                sm = "https://cdn.rawgit.com/akabab/superhero-api/0.2.0/api/images/sm/1-a-bomb.jpg",
                lg = "https://cdn.rawgit.com/akabab/superhero-api/0.2.0/api/images/lg/1-a-bomb.jpg"
            )
        )
    )
}