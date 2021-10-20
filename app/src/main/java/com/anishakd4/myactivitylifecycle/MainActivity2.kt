package com.anishakd4.myactivitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("anisham", "MainActivity2 onCreate")
        setContentView(R.layout.activity_main2)
    }

    override fun onStart() {
        super.onStart()
        Log.i("anisham", "MainActivity2 onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("anisham", "MainActivity2 onResume")
    }

    override fun onStop() {
        super.onStop()
        Log.i("anisham", "MainActivity2 onStop")
    }

    override fun onPause() {
        super.onPause()
        Log.i("anisham", "MainActivity2 onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("anisham", "MainActivity2 onDestroy")
    }
}