package com.example.dependencyinjection.daggerDi.wheels

import com.example.dependencyinjection.MainActivity
import com.example.dependencyinjection.daggerDi.customScopes.WheelScope
import com.example.dependencyinjection.daggerDi.wheels.WheelsModule
import dagger.Component
import dagger.Subcomponent

@WheelScope
@Component(modules = [WheelsModule::class])
interface WheelsComponent {

    fun inject(wheelsActivity: WheelsActivity)
}