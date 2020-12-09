package com.example.spiiceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_each_search.*

class EachSearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_each_search)
        make_proposition.setOnClickListener(){
            Toast.makeText(this, "Proposition made", Toast.LENGTH_SHORT).show()
        }
    }
}