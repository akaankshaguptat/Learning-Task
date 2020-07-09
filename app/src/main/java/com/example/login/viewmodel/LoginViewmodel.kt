package com.example.login.viewmodel

import android.text.TextUtils
import android.util.Log
import androidx.databinding.BindingAdapter
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.login.model.data.Repository
import com.example.login.model.data.SharedPrefData
import com.example.login.util.ValidationUtils
import com.google.android.material.textfield.TextInputEditText

class LoginViewmodel : ViewModel() {
    var errMsg: String=""
    var status: MutableLiveData<Boolean> = MutableLiveData<Boolean>()
    var email: String = ""
    var pwd: String = ""
    var data = SharedPrefData()
    var repo = Repository(data)


//       @BindingAdapter("android:error")
//   fun setError(emailEdittext: TextInputEditText, passwordEditText: TextInputEditText, errMsg:String){
//       if(email.isEmpty()|| !ValidationUtils.isValidEmail(email)){
//           emailEdittext.setError(errMsg)
//           status.value=false
//       }
//       else if(pwd.isEmpty()){
//           passwordEditText.setError(errMsg)
//           status.value=false
//       }
//       else{
//           status.value=true
//
//       }
//
//   }
    fun onLoginClicked(
        emailEdittext: TextInputEditText,passwordEditText: TextInputEditText

    ) {

        //check validations
        if (TextUtils.isEmpty(email)) {
            emailEdittext.setError("email cannot be left blank")
            errMsg= "email cannot be left blank"
            status.value = false

        } else if (!ValidationUtils.isValidEmail(email)) {
            emailEdittext.setError("please enter valid emial address")
            errMsg= "please enter valid emial address"
            status.value = false

        } else if (TextUtils.isEmpty(pwd)) {
              passwordEditText.setError("password cannot be left blank")
            errMsg= "password cannot be left blank"
            status.value = false

        } else {
            status.value = true
        }
        Log.d("email", email)
        Log.d("password", pwd)


    }

}