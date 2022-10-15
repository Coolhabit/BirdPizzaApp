package com.example.birdpizzaapp.data.network.mappers

import com.example.birdpizzaapp.data.network.response.MenuItem
import com.example.birdpizzaapp.domain.entities.Food

fun MenuItem.toDomain(): Food = Food(
    id = this.id,
    title = this.title,
    image = this.image,
)
