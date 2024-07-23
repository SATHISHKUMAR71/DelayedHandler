package com.example.delayedhandler

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var handler:Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            findViewById<TextView>(R.id.tv).text = "post Delayed 5000"
        },5000)
        handler.postDelayed({
            findViewById<TextView>(R.id.tv).text = "post Delayed 8000"
        },8000)
        handler.postDelayed({
            findViewById<TextView>(R.id.tv).text = "post Delayed 10000"
        },10000)
        handler.postDelayed({
            findViewById<TextView>(R.id.tv).text = "post Delayed 12000"
        },12000)
        handler.postDelayed({
            findViewById<TextView>(R.id.tv).text = "post Delayed 14000"
        },14000)
    }
}