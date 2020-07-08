package com.example.login.viewmodel

import android.text.TextUtils
import android.widget.EditText
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.login.model.data.Repository
import com.example.login.model.data.SharedPrefData
import com.example.login.util.ValidationUtils
import com.google.android.material.textfield.TextInputEditText

class LoginViewmodel : ViewModel() {
    var status: MutableLiveData<Boolean> = MutableLiveData<Boolean>()
    var email: String = ""
    var pwd: String = ""
    var data = SharedPrefData()
    var repo = Repository(data)
    fun onLoginClicked(
        email: TextInputEditText, pwd: TextInputEditText
    ): MutableLiveData<Boolean> {

        //check validations
        if (TextUtils.isEmpty(email.text)) {
            email.setError("email cannot be left blank")
            status.value = false

        } else if (!ValidationUtils.isValidEmail(email.text.toString())) {
            email.setError("pleasse enter valid emial address")
            status.value = false

        } else if (TextUtils.isEmpty(pwd.text)) {
            pwd.setError("password cannot be left blank")
            status.value = false

        } else {
            status.value = true
        }


        return status

    }

}