package com.example.assignment3

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import com.example.assignment1.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSend: Button = findViewById(R.id.btnSend)

        btnSend.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("string1", getString(R.string.label_one))
            intent.putExtra("string2", getString(R.string.label_two))
            intent.putExtra("string3", getString(R.string.label_three))
            intent.putExtra("string4", getString(R.string.label_four))
            intent.putExtra("string5", getString(R.string.label_five))
            intent.putExtra("isBoolean", true)
            intent.putExtra("intValue", 100)
            intent.putExtra("floatValue", 12.34f)
            startActivity(intent)
        }
    }
}