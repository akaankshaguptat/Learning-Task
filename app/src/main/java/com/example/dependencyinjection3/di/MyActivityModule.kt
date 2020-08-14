package com.example.dependencyinjection3.di

import dagger.Module
import dagger.Provides

@Module
class MyActivityModule {

    @Provides
    @MyActivityScope
    fun provideRetrofit():Int{

        return 1

    }
}