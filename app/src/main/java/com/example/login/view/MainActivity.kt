package com.example.login.view

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.login.R
import com.example.login.databinding.ActivityMainBinding
import com.example.login.util.showToast
import com.example.login.viewmodel.LoginState
import com.example.login.viewmodel.LoginViewmodel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mViewmodel: LoginViewmodel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        mViewmodel=ViewModelProvider(this)[LoginViewmodel::class.java]
        binding.loginViewmodel = mViewmodel
        binding.lifecycleOwner=this
//        loginProgressBar.visibility=View.VISIBLE
        setObservers()

    }


    private fun setObservers() {

      mViewmodel.status.observe(this, Observer {
          when(it){
              LoginState.HIDE_PROGRESS->{
                  loginProgressBar.visibility=View.INVISIBLE
              }
              LoginState.SHOW_PROGRESS->{
                  loginProgressBar.visibility=View.VISIBLE

              }
              LoginState.GO_TO_HOME_SCREEN->{
                loginProgressBar.visibility=View.GONE
                  var intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
                finish()
              }
          }
//            if (it == true) {
//                var intent = Intent(this, HomeActivity::class.java)
//                startActivity(intent)
//                finish()
//            }
//            else{
//                showToast("some error occurred")
//            }

        })

    }


}

