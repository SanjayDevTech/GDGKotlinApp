package com.sanjaydevtech.firstapp

import androidx.annotation.DrawableRes

data class Movie(
    val name: String,
    val genre: String,
    @DrawableRes val imageId: Int,
)
