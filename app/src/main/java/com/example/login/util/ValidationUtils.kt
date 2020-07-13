package com.example.login.util

import androidx.annotation.Nullable

class ValidationUtils {
    companion object{
        fun isValidEmail( email: String): Boolean {
             return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
        }
    }
}