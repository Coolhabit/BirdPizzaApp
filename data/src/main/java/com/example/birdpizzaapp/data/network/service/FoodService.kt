package com.example.birdpizzaapp.data.network.service

import com.example.birdpizzaapp.data.network.MenuApi
import com.example.birdpizzaapp.data.network.mappers.toDomain
import com.example.birdpizzaapp.domain.api.IMenuApiService
import com.example.birdpizzaapp.domain.entities.Food

class FoodService(private val api: MenuApi) : IMenuApiService{

    override suspend fun loadMenuList(query: String): List<Food>? {
        return api.getMenuItems(query).body()?.menuItems?.map { it.toDomain() }
    }
}
