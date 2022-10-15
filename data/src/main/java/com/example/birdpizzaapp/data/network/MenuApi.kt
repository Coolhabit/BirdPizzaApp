package com.example.birdpizzaapp.data.network

import com.example.birdpizzaapp.data.network.response.MenuResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MenuApi {

    @GET("menuItems/search")
    suspend fun getMenuItems(
        @Query("query") query: String?
    ): Response<MenuResponse>
}
