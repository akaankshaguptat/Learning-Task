package com.example.dependencyinjection.daggerDi

import android.app.Application
import com.example.dependencyinjection.MainActivity
import com.example.dependencyinjection.daggerDi.engine.PetrolEngineModule
import com.example.dependencyinjection.daggerDi.wheels.WheelsBuildersModule
import dagger.Component
import javax.inject.Singleton

@Singleton //singleton object is component level not pplication level
@Component(modules = [PetrolEngineModule::class, WheelsBuildersModule::class])
interface CarComponent {
    fun getCar(): Car    //creates implementation for  car instance with wheels and engine

    fun inject(mainActivity: MainActivity)
    fun inject(application:Application)



}