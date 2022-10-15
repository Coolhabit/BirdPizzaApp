package com.example.birdpizzaapp.menu.model

import com.example.birdpizzaapp.domain.entities.MenuData

fun MenuData.toPresentation(categoryName: String): MenuData {
    val menuData = this
    menuData.categoriesList.find {
        it.name == categoryName
    }.let {
        it?.isSelected = true
    }
    return menuData
}
