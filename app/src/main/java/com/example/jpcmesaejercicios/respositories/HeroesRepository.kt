package com.example.jpcmesaejercicios.respositories

import com.example.jpcmesaejercicios.entities.Hero
import com.example.jpcmesaejercicios.entities.HeroBiography
import com.example.jpcmesaejercicios.entities.HeroImages
import com.example.jpcmesaejercicios.entities.HeroPowerStats

object HeroesRepository {
    suspend fun getHeroes() = listOf(
        Hero(
            id = 1,
            name = "A-Bomb",
            powerStats = HeroPowerStats(
                intelligence = 38,
                strength = 100,
                speed = 17,
                durability = 80,
                power = 24,
                combat = 64
            ),
            biography = HeroBiography(
                fullName = "Richard Milhouse Jones"
            ),
            images = HeroImages(
                sm = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/sm/1-a-bomb.jpg",
                lg = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/1-a-bomb.jpg"
            )
        ),
        Hero(
            id = 2,
            name = "Abe Sapien",
            powerStats = HeroPowerStats(
                intelligence = 88,
                strength = 28,
                speed = 35,
                durability = 65,
                power = 100,
                combat = 85
            ),
            biography = HeroBiography(
                fullName = "Abraham Sapien"
            ),
            images = HeroImages(
                sm = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/sm/2-abe-sapien.jpg",
                lg = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/2-abe-sapien.jpg"
            )
        ),
        Hero(
            id = 3,
            name = "Abin Sur",
            powerStats = HeroPowerStats(
                intelligence = 50,
                strength = 90,
                speed = 53,
                durability = 64,
                power = 99,
                combat = 65
            ),
            biography = HeroBiography(
                fullName = ""
            ),
            images = HeroImages(
                sm = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/sm/3-abin-sur.jpg",
                lg = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/3-abin-sur.jpg"
            )
        )
    )

    suspend fun getHero(heroId: Int): Hero? {
        return getHeroes().find { it.id == heroId }
    }
}
