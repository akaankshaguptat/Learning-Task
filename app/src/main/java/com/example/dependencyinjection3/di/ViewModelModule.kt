package com.example.dependencyinjection3.di

import androidx.lifecycle.ViewModel
import com.example.dependencyinjection3.MyViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
 abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(MyViewModel::class)
    internal abstract fun bindMyViewModel(viewModel: MyViewModel): ViewModel
}