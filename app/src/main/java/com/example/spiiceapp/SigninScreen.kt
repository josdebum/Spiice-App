package com.example.spiiceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_signin_screen.*

class SigninScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin_screen)
        sign_in_button.setOnClickListener(){
            startActivity(Intent (this, NavigationScreen::class.java))
        }
    }
}