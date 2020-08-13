package com.example.dependencyinjection.manualDi

class House {
    var cement: Cement
    var bricks: Bricks

    constructor(cement: Cement,bricks: Bricks){
       this.cement=cement
        this.bricks=bricks
    }

    fun buid(){
        println("house building")
    }
}