package com.example.login.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.example.login.R
import com.example.login.databinding.ActivityMainBinding
import com.example.login.viewmodel.LoginViewmodel

class MainActivity : AppCompatActivity() {

    val mViewmodel = LoginViewmodel()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.loginViewmodel = mViewmodel


        setObservers()

    }


    private fun setObservers() {

        mViewmodel.status.observe(this, Observer {
            if (it == true) {
                var intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            }

        })

    }


}

