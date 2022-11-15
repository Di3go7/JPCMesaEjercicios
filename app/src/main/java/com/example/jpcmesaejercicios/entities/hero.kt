package com.example.jpcmesaejercicios.entities

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Hero(
    val id: Int,
    val name: String,
    val powerStats: HeroPowerStats,
    val biography: HeroBiography,
    val images: HeroImages
) : Parcelable

@Parcelize
data class HeroBiography(
    val fullName: String
) : Parcelable

@Parcelize
data class HeroImages(
    val sm: String,
    val lg: String
) : Parcelable

@Parcelize
data class HeroPowerStats(
    val intelligence: Int,
    val strength: Int,
    val speed: Int,
    val durability: Int,
    val power: Int,
    val combat: Int,
) : Parcelable
