package com.example.login.model.data

import android.content.Context
import android.content.SharedPreferences

class SharedPrefData {
    private val sharedPrefFile = "sharedpreferencefile"
    fun setData(email: String, pwd: String, context: Context) {
        val sharedPreferences: SharedPreferences =
            context.getSharedPreferences(sharedPrefFile, Context.MODE_PRIVATE)
        val editor: SharedPreferences.Editor = sharedPreferences.edit()
        editor.putString("email", email)
        editor.putString("pwd", pwd)
        editor.apply()
        editor.commit()


    }
}