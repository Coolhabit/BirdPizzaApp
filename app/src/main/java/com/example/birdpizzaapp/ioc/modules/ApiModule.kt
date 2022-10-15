package com.example.birdpizzaapp.ioc.modules

import com.example.birdpizzaapp.data.mock.MockAppBarService
import com.example.birdpizzaapp.data.network.MenuApi
import com.example.birdpizzaapp.data.network.service.FoodService
import com.example.birdpizzaapp.domain.api.IAppBarService
import com.example.birdpizzaapp.domain.api.IMenuApiService
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApiModule {

    @Provides
    @Singleton
    fun provideMenuApi(api: MenuApi): IMenuApiService = FoodService(api)

    @Provides
    @Singleton
    fun provideAppBarApi(): IAppBarService = MockAppBarService()
}
