package com.example.birdpizzaapp.data.network.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Servings(
    @SerialName("number")
    val number: Double,
    @SerialName("size")
    val size: Double,
    @SerialName("unit")
    val unit: String
)
