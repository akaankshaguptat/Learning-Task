package com.example.dependencyinjection

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.dependencyinjection.daggerDi.BaseApp
import com.example.dependencyinjection.daggerDi.Car
import com.example.dependencyinjection.daggerDi.DaggerCarComponent
import com.example.dependencyinjection.daggerDi.MainActivityViewModel
import com.example.dependencyinjection.daggerDi.wheels.WheelsActivity
import com.example.dependencyinjection.manualDi.Bricks
import com.example.dependencyinjection.manualDi.Cement
import com.example.dependencyinjection.manualDi.House
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

   @Inject
    lateinit var car: Car

    lateinit var car1:Car
    @Inject
    lateinit var car2:Car
    lateinit var house: House

   // lateinit var mViewModel: MainActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var cement=Cement()
        var bricks=Bricks()

        house= House(cement, bricks)      //manual di
        house.buid()

        /* Dagger di*/
        car1= DaggerCarComponent.create().getCar()     //dagger instantiate constructor of car
        car1.start()                                   //constructor di

       // var carComponent=DaggerCarComponent.create()
        //var carComponent1=DaggerCarComponent.create()    //if object is created using new component thell singlton won't work
       // carComponent.inject(this)   //tell to dagger instantiate feilds with @Inject
                                               //if activity is disturbed then new component obect is created then also singlton won't work
       // car=carComponent.getCar()
       // car.start()                            //field di
       // car2=carComponent1.getCar()
       // car2.start()


        //application level
        var carComponent2=(application as BaseApp).carComponent()
        carComponent2.inject(this)

        car.start()
        car2.start()


        //viewmodel injection

       var  mViewModel:MainActivityViewModel =ViewModelProvider(this)[MainActivityViewModel::class.java]

        btnGoToWheels.setOnClickListener {
            Toast.makeText(this,"wheels activity",Toast.LENGTH_SHORT).show()
            var intent= Intent(this,WheelsActivity::class.java)
            startActivity(intent)

        }






    }
}