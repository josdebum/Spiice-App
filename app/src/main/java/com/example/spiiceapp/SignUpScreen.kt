package com.example.spiiceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sign_up_screen.*

class SignUpScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_screen)
        sign_up_button.setOnClickListener(){
            startActivity(Intent (this, NavigationScreen::class.java))
        }

        sign_in_button.setOnClickListener(){
            startActivity(Intent (this, SigninScreen::class.java))
        }
    }
}