package com.example.dependencyinjection3.di

import com.example.dependencyinjection3.MyActivity
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

@Module
 abstract class ActivityBuildersModule {

    @MyActivityScope
    @ContributesAndroidInjector(modules = [FragmentBuidersModule::class,ViewModelModule::class])
    abstract fun contributeMyActivity(): MyActivity


}