package com.example.jpcmesaejercicios.entities

class Hero(
    val id: Int,
    val name: String,
    val powerStats: HeroPowerStats,
    val biography: HeroBiography,
    val images: HeroImages
)

data class HeroBiography(
    val fullName: String
)

data class HeroImages(
    val sm: String,
    val lg: String
)

data class HeroPowerStats(
    val intelligence: Int,
    val strength: Int,
    val speed: Int,
    val durability: Int,
    val power: Int,
    val combat: Int,
)
