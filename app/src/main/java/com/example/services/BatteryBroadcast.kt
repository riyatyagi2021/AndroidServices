package com.example.services

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class BatteryBroadcast(var mainBroadcast: MainBroadcast) : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
          var  percentage:Int= intent!!.getIntExtra("level",0)
        if(percentage!=0) {
          //  println("FFFFFFFFFFFFFFFFFF " + percentage)
            mainBroadcast.updateUI(percentage)
        }
    }
}