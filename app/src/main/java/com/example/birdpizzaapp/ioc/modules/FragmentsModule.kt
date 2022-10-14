package com.example.birdpizzaapp.ioc.modules

import dagger.Module

@Module(includes = [ViewModelModule::class, ActivityModule::class])
abstract class FragmentsModule {

//    @ContributesAndroidInjector
//    abstract fun provideHeroesFragment(): HeroesFragment
}
