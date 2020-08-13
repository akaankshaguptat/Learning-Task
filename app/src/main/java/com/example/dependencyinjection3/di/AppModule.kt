package com.example.dependencyinjection3.di

import android.app.Application
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {
    // it is in the companion object because we want a static method here
    companion object{

        @Singleton
        @Provides
        fun someString():String{
            return "Hello world"
        }
    }
    //example showing how to ref other dependencies
//    @Provides
//    fun someBool(application: Application): Boolean {
//        return application == null
//    }
}