package com.example.birdpizzaapp.domain.api

import com.example.birdpizzaapp.domain.entities.Food

interface IMenuApiService {

    suspend fun loadMenuList(query: String): List<Food>?
}
