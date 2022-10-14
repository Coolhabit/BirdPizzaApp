package com.example.birdpizzaapp.ioc.modules

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.birdpizzaapp.cart.CartViewModel
import com.example.birdpizzaapp.ioc.utils.ViewModelFactory
import com.example.birdpizzaapp.ioc.utils.ViewModelKey
import com.example.birdpizzaapp.menu.MenuViewModel
import com.example.birdpizzaapp.presentation.MainActivityViewModel
import com.example.birdpizzaapp.profile.ProfileViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(MainActivityViewModel::class)
    abstract fun mainActivityViewModel(viewModel: MainActivityViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(MenuViewModel::class)
    abstract fun menuViewModel(viewModel: MenuViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(ProfileViewModel::class)
    abstract fun profileViewModel(viewModel: ProfileViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(CartViewModel::class)
    abstract fun cartViewModel(viewModel: CartViewModel): ViewModel
}
