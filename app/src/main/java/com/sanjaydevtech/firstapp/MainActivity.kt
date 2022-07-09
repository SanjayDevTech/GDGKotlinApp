package com.sanjaydevtech.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e(TAG, "onCreate", )
    }

    override fun onStart() {
        super.onStart()
        Log.e(TAG, "onStart", )
    }

    override fun onRestart() {
        super.onRestart()
        Log.e(TAG, "onRestart", )
    }

    override fun onPause() {
        super.onPause()
        Log.e(TAG, "onPause", )
    }

    override fun onResume() {
        super.onResume()
        Log.e(TAG, "onResume", )
    }

    override fun onStop() {
        super.onStop()
        Log.e(TAG, "onStop", )
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG, "onDestroy", )
    }
}