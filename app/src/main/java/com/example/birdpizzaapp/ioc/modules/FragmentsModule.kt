package com.example.birdpizzaapp.ioc.modules

import com.example.birdpizzaapp.cart.CartFragment
import com.example.birdpizzaapp.menu.MenuFragment
import com.example.birdpizzaapp.profile.ProfileFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module(includes = [ViewModelModule::class, ActivityModule::class])
abstract class FragmentsModule {

    @ContributesAndroidInjector
    abstract fun provideMenuFragment(): MenuFragment

    @ContributesAndroidInjector
    abstract fun provideProfileFragment(): ProfileFragment

    @ContributesAndroidInjector
    abstract fun provideCartFragment(): CartFragment
}
