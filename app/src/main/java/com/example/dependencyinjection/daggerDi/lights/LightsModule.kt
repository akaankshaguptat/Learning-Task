package com.example.dependencyinjection.daggerDi.lights

import com.example.dependencyinjection.daggerDi.customScopes.LightsScope
import dagger.Module
import dagger.Provides

@Module
class LightsModule {
    @LightsScope
    @Provides
    fun glowLigths():Lights{
        println("lights glowing")
        return Lights()
    }
}