package com.example.spiiceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var dialog : OnBoardingDialog? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        explore_the_browser.setOnClickListener {
            val handler = Handler(Looper.getMainLooper())
            handler.postDelayed({
                var intent = Intent(this, OnboardingScreens::class.java)
                startActivity(intent)
                finish()
            }, 5000)
        }
        }
    }





