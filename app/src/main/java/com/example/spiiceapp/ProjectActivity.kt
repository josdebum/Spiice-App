package com.example.spiiceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_project.*

class ProjectActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_project)

        send_your_work_button.setOnClickListener(){
            startActivity(Intent (this, SendYourWorkActivity:: class.java))
        }
    }
}