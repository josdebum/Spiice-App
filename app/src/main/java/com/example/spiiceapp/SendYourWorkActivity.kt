package com.example.spiiceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_send_your_work.*

class SendYourWorkActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_send_your_work)
        send_work_button.setOnClickListener(){
            Toast.makeText(this, "Project Sent", Toast.LENGTH_SHORT).show()
        }
    }
}