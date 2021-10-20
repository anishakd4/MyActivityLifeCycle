package com.anishakd4.myactivitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("anisham", "MainActivity onCreate")
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.button).setOnClickListener {
            Intent(this, MainActivity2::class.java).apply {
                startActivity(this)
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("anisham", "MainActivity onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("anisham", "MainActivity onResume")
    }

    override fun onStop() {
        super.onStop()
        Log.i("anisham", "MainActivity onStop")
    }

    override fun onPause() {
        super.onPause()
        Log.i("anisham", "MainActivity onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("anisham", "MainActivity onDestroy")
    }
}