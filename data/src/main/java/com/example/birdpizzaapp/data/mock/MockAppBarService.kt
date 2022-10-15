package com.example.birdpizzaapp.data.mock

import com.example.birdpizzaapp.domain.api.IAppBarService
import com.example.birdpizzaapp.domain.entities.BannerItem
import com.example.birdpizzaapp.domain.entities.CategoryItem

class MockAppBarService : IAppBarService {

    override suspend fun loadBannerList(): List<BannerItem> {
        val bannerList = mutableListOf<BannerItem>()
        bannerList.add(BannerItem("file:///android_asset/pizza_add_1.jpg"))
        bannerList.add(BannerItem("file:///android_asset/pizza_add_2.jpg"))
        bannerList.add(BannerItem("file:///android_asset/pizza_add_3.jpg"))
        return bannerList
    }

    override suspend fun loadCategoriesList(): List<CategoryItem> {
        val categoriesList = mutableListOf<CategoryItem>()
        categoriesList.add(CategoryItem("Pizza"))
        categoriesList.add(CategoryItem("Burger"))
        categoriesList.add(CategoryItem("Pasta"))
        categoriesList.add(CategoryItem("Salad"))
        categoriesList.add(CategoryItem("Drink"))
        categoriesList.add(CategoryItem("Dessert"))

        return categoriesList
    }
}
