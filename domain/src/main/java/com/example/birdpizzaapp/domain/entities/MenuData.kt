package com.example.birdpizzaapp.domain.entities

data class MenuData(
    val foodList: List<Food>?,
    val bannerList: List<BannerItem>,
    val categoriesList: List<CategoryItem>,
)
