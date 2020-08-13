package com.example.dependencyinjection.daggerDi.engine

import com.example.dependencyinjection.MainActivity
import com.example.dependencyinjection.daggerDi.customScopes.EngineScope
import dagger.Subcomponent

//@EngineScope
@Subcomponent(modules = [PetrolEngineModule::class])
interface EngineComponent {
    fun inject(mainActivity: MainActivity)
}