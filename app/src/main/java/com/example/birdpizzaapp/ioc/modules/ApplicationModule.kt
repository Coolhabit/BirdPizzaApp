package com.example.birdpizzaapp.ioc.modules

import android.content.Context
import com.example.birdpizzaapp.BirdPizzaApp
import dagger.Module
import dagger.Provides

@Module
class ApplicationModule {

    @Provides
    fun provideContext(app: BirdPizzaApp): Context = app.applicationContext
}
