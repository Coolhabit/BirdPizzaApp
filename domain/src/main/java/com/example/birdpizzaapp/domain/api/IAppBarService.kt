package com.example.birdpizzaapp.domain.api

import com.example.birdpizzaapp.domain.entities.BannerItem
import com.example.birdpizzaapp.domain.entities.CategoryItem

interface IAppBarService {

    suspend fun loadBannerList(): List<BannerItem>

    suspend fun loadCategoriesList(): List<CategoryItem>
}
