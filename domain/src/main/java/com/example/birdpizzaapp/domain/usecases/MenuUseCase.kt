package com.example.birdpizzaapp.domain.usecases

import com.example.birdpizzaapp.domain.api.IAppBarService
import com.example.birdpizzaapp.domain.api.IMenuApiService
import com.example.birdpizzaapp.domain.entities.MenuData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import javax.inject.Inject

class MenuUseCase @Inject constructor(
    private val service: IMenuApiService,
    private val mock: IAppBarService,
) {

    suspend fun loadScreenData(query: String): MenuData {
        return coroutineScope {
            val foodAsync = async(Dispatchers.IO) {
                service.loadMenuList(query)
            }
            val bannerAsync = async(Dispatchers.IO) {
                mock.loadBannerList()
            }
            val categoriesAsync = async(Dispatchers.IO) {
                mock.loadCategoriesList()
            }

            MenuData(
                foodList = foodAsync.await(),
                bannerList = bannerAsync.await(),
                categoriesList = categoriesAsync.await(),
            )
        }
    }
}
