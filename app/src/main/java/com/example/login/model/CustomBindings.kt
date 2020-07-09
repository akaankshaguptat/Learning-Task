package com.example.login.model

import android.widget.EditText
import androidx.databinding.BindingAdapter
import com.google.android.material.textfield.TextInputEditText

@BindingAdapter("error")
fun bindingError(textInputEditText: TextInputEditText, errMsg:String){
    if(errMsg!=""){
        textInputEditText.setError(errMsg)
    }


}