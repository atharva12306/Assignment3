package com.example.assignment3

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.assignment1.R

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView (R.layout.activity_third)
        val finalTextView: TextView = findViewById(R.id.finalTextView)

        val finalData = intent.getStringExtra("finalData")
        finalTextView . text = finalData
    }
}
