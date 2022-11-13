package com.example.jpcmesaejercicios.entities

class Heroe(
    val id: Int,
    val name: String,
    val powerStats: HeroePowerStats,
    val biography: HeroeBiography,
    val images: HeroeImages
)

data class HeroeBiography(
    val fullName: String
)

data class HeroeImages(
    val sm: String,
    val lg: String
)

data class HeroePowerStats(
    val intelligence: Int,
    val strength: Int,
    val speed: Int,
    val durability: Int,
    val power: Int,
    val combat: Int,
)