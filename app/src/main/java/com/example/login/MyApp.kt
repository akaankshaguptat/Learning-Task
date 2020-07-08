package com.example.login

import android.app.Application

class MyApp : Application() {
    val instance=this.applicationContext

    override fun onCreate() {
        super.onCreate()
        mInstance = this
    }

    companion object{
         var mInstance: MyApp=this.getInstance()
        fun getInstance(): MyApp {
            return mInstance
        }
    }
}