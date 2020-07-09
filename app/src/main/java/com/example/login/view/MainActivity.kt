package com.example.login.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.login.R
import com.example.login.databinding.ActivityMainBinding
import com.example.login.util.showToast
import com.example.login.viewmodel.LoginViewmodel

class MainActivity : AppCompatActivity() {

    lateinit var mViewmodel: LoginViewmodel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        mViewmodel=ViewModelProvider(this)[LoginViewmodel::class.java]
        binding.loginViewmodel = mViewmodel
        binding.lifecycleOwner=this
        setObservers()
    }


    private fun setObservers() {

      mViewmodel.status.observe(this, Observer {
            if (it == true) {
                var intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
                finish()
            }
            else{
                showToast("some error occurred")
            }

        })

    }


}

