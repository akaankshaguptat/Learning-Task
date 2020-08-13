package com.example.dependencyinjection.daggerDi

import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class BaseApp : Application() {

    lateinit var carComponent: CarComponent

    override fun onCreate() {
        super.onCreate()
        carComponent=DaggerCarComponent.create()
    }

    fun carComponent():CarComponent{
        return carComponent
    }
}