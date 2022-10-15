package com.example.birdpizzaapp.data.network.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MenuResponse(
    @SerialName("expires")
    val expires: Long,
    @SerialName("isStale")
    val isStale: Boolean,
    @SerialName("menuItems")
    val menuItems: List<MenuItem>,
    @SerialName("number")
    val number: Int,
    @SerialName("offset")
    val offset: Int,
    @SerialName("processingTimeMs")
    val processingTimeMs: Int,
    @SerialName("totalMenuItems")
    val totalMenuItems: Int,
    @SerialName("type")
    val type: String
)
