package com.example.birdpizzaapp.ioc.modules

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.birdpizzaapp.ioc.utils.ViewModelFactory
import com.example.birdpizzaapp.ioc.utils.ViewModelKey
import com.example.birdpizzaapp.presentation.MainActivityViewModel
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

//    @Binds
//    @IntoMap
//    @ViewModelKey(HeroesViewModel::class)
//    abstract fun heroesViewModel(viewModel: HeroesViewModel): ViewModel
}
