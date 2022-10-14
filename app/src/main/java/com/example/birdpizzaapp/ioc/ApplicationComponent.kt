package com.example.birdpizzaapp.ioc

import com.example.birdpizzaapp.BirdPizzaApp
import com.example.birdpizzaapp.ioc.modules.*
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        ViewModelModule::class,
        ActivityModule::class,
        ApplicationModule::class,
        FragmentsModule::class,
        UseCasesModule::class,
        NavigationRoutersModule::class,
        ApiModule::class,
//        RemoteModule::class,
        StoragesModule::class,
    ]
)
interface ApplicationComponent : AndroidInjector<BirdPizzaApp> {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance applicationContext: BirdPizzaApp): ApplicationComponent
    }
}
