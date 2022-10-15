package com.example.birdpizzaapp.data.network.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MenuItem(
    @SerialName("id")
    val id: Int,
    @SerialName("image")
    val image: String,
    @SerialName("imageType")
    val imageType: String,
    @SerialName("readableServingSize")
    val readableServingSize: String,
    @SerialName("restaurantChain")
    val restaurantChain: String,
    @SerialName("servingSize")
    val servingSize: String,
    @SerialName("servings")
    val servings: Servings,
    @SerialName("title")
    val title: String
)
