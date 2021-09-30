package com.example.services

import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_battery_broadcast.*

class MainBroadcast: AppCompatActivity() {

    lateinit var batterychange:  BatteryBroadcast

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_battery_broadcast)

        batterychange= BatteryBroadcast(this)
          registerReceiver(batterychange, IntentFilter(Intent.ACTION_BATTERY_CHANGED))
    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(batterychange)
    }

    fun updateUI(percentage: Int) {
     tv.setText(percentage.toString().plus(" %"))
    }

}