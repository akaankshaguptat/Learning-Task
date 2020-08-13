package com.example.dependencyinjection.daggerDi.engine

import com.example.dependencyinjection.daggerDi.customScopes.EngineScope
import javax.inject.Inject

//@EngineScope
class DeiselEngine: Engine {


    @Inject
    constructor(){}
    override fun startEngine() {
        println("deisel engine")
    }

}