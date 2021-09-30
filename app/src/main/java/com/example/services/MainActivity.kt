package com.example.services

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startButton!!.setOnClickListener(this)
        stopButton!!.setOnClickListener(this)

    }

    override fun onClick(view: View?) {
               if(view==startButton){
                   startService(Intent(this, NewService::class.java))
               }
               else if (view == stopButton) {
                   stopService(Intent(this, NewService::class.java))
               }
    }
}