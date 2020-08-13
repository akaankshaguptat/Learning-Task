package com.example.dependencyinjection.daggerDi

import com.example.dependencyinjection.daggerDi.driver.Driver
import com.example.dependencyinjection.daggerDi.engine.Engine
import com.example.dependencyinjection.daggerDi.wheels.Wheels
import javax.inject.Inject

class Car {
     var wheels: Wheels
     var engine: Engine
     var driver: Driver


    @Inject
    constructor(wheels: Wheels, engine: Engine, driver: Driver){
        this.wheels=wheels
        this.engine=engine
        this.driver=driver
    }

    fun start(){
        println("driver  "+driver)

        engine.startEngine()
        println("Driving")
    }
}