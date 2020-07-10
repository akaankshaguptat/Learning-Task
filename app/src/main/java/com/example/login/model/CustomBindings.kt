package com.example.login.model

import android.text.TextUtils
import android.widget.EditText
import androidx.databinding.BindingAdapter
import androidx.lifecycle.MutableLiveData
import com.google.android.material.textfield.TextInputEditText

@BindingAdapter("errorEmail")
fun bindingErrorEmail(textInputEditText: TextInputEditText, errMsg:String?) {
    textInputEditText.error = errMsg
}
@BindingAdapter("errorPwd")
fun bindingErrorPwd(textInputEditText: TextInputEditText, errMsg:String?){
    textInputEditText.error = errMsg




}