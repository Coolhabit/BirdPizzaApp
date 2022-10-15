package com.example.birdpizzaapp.ioc.modules

import com.example.birdpizzaapp.domain.api.IAppBarService
import com.example.birdpizzaapp.domain.api.IMenuApiService
import com.example.birdpizzaapp.domain.usecases.MenuUseCase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class UseCasesModule {

    @Provides
    @Singleton
    fun providePizzaUseCase(
        api: IMenuApiService,
        mock: IAppBarService,
    ) = MenuUseCase(api, mock)
}
