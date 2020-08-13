package com.example.dependencyinjection.daggerDi.wheels

import com.example.dependencyinjection.daggerDi.customScopes.WheelScope
import com.example.dependencyinjection.daggerDi.wheels.WheelsActivity
import com.example.dependencyinjection.daggerDi.wheels.WheelsModule
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
 abstract class WheelsBuildersModule {
    @WheelScope
    @ContributesAndroidInjector(modules = [WheelsModule::class])
    abstract fun contributeWheelsActivty(): WheelsActivity
}