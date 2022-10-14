package com.example.birdpizzaapp

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class BirdPizzaApp : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerApplicationComponent
            .factory()
            .create(this)
    }
}
