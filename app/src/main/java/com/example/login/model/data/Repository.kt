package com.example.login.model.data

import android.content.Context

class Repository(val data:SharedPrefData) {
    fun login(email: String, pwd: String, context: Context)=data.setData(email,pwd,context)
}