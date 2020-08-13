package com.example.dependencyinjection.daggerDi.engine

import com.example.dependencyinjection.daggerDi.customScopes.EngineScope
import dagger.Binds
import dagger.Module

@Module
 abstract class PetrolEngineModule {
    //@EngineScope
    @Binds   //used tell dagger how to provide classes which ur project doesn't own
             //binds uses abstract class and abstract method else it is ame as @Provides
    abstract fun providesPetrolEngine(petrolEngine: PetrolEngine): Engine
}