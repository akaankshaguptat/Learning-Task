package com.example.login.viewmodel

import android.text.TextUtils
import android.util.Log
import androidx.annotation.MainThread
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.login.util.ValidationUtils
import java.util.*
import java.util.logging.Handler
import kotlin.concurrent.schedule
import kotlin.concurrent.timerTask

class LoginViewmodel : ViewModel() {
    //var errorMsg:MutableLiveData<String?> = MutableLiveData<String?>(null)
    var errorMsgEmail = MutableLiveData<String>(null)
    var errorMsgPwd = MutableLiveData<String>(null)
    var status: MutableLiveData<LoginState> = MutableLiveData<LoginState>()
    var email: String = ""
    var pwd: String = ""

    fun onLoginClicked(

    ) {

        //check validations
        if (TextUtils.isEmpty(email)) {
            errorMsgEmail.value = "email cannot be left blank"
            status.value = LoginState.HIDE_PROGRESS
        } else if (!ValidationUtils.isValidEmail(email)) {
            errorMsgEmail.value = "please enter valid emial address"
            status.value = LoginState.HIDE_PROGRESS
        } else if (TextUtils.isEmpty(pwd)) {
            errorMsgPwd.value = "password cannot be left blank"
            status.value = LoginState.HIDE_PROGRESS

        } else {
            status.value = LoginState.SHOW_PROGRESS
            Timer("SettingUp", false).schedule(3000) {
                status.postValue(LoginState.GO_TO_HOME_SCREEN)
            }
            //timer.schedule(timerTask { status.value=LoginState.GO_TO_HOME_SCREEN },3000)


        }

        Log.d("email", email)
        Log.d("password", pwd)


    }

}

enum class LoginState {
    SHOW_PROGRESS,
    HIDE_PROGRESS,
    GO_TO_HOME_SCREEN
}