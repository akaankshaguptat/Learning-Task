package com.example.login.viewmodel

import android.text.TextUtils
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.login.util.ValidationUtils

class LoginViewmodel : ViewModel() {
    var errorMsg: String = "test"
    var status: MutableLiveData<Boolean> = MutableLiveData<Boolean>()
    var email: String = ""
    var pwd: String = ""

    fun onLoginClicked(

    ) {

        //check validations
        if (TextUtils.isEmpty(email)) {
            //  emailEdittext.setError("email cannot be left blank")
            errorMsg = "email cannot be left blank"
            status.value = false

        } else if (!ValidationUtils.isValidEmail(email)) {
            // emailEdittext.setError("please enter valid emial address")
            errorMsg = "please enter valid emial address"
            status.value = false

        } else if (TextUtils.isEmpty(pwd)) {
            //   passwordEditText.setError("password cannot be left blank")

            errorMsg = "password cannot be left blank"
            status.value = false

        } else {
            status.value = true
        }
        Log.d("email", email)
        Log.d("password", pwd)


    }

}