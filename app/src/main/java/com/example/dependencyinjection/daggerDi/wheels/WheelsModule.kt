package com.example.dependencyinjection.daggerDi.wheels

import com.example.dependencyinjection.daggerDi.customScopes.WheelScope
import com.example.dependencyinjection.daggerDi.wheels.Wheels
import dagger.Module
import dagger.Provides


//third party class
@Module
class WheelsModule {

    @WheelScope
    @Provides
    fun provideWheels(): Wheels { //no args
        println("wheels module")
        return Wheels()   //returning object as wheels does not have @Inject constructor as it is third party class
    }
}