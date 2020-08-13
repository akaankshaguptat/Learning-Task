package com.example.dependencyinjection3

import android.app.Application
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class MyViewModel @Inject constructor(private val application: Application) : ViewModel() {
    // TODO: Implement the ViewModel
}