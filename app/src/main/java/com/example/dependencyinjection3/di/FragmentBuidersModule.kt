package com.example.dependencyinjection3.di

import com.example.dependencyinjection3.MyFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
 abstract class FragmentBuidersModule {

    @ContributesAndroidInjector
    abstract fun contributeMyFragment():MyFragment
}