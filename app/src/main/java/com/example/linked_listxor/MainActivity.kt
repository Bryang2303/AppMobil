package com.example.linked_listxor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.linked_listxor.R
import com.example.linked_listxor.InputActivity

class MainActivity : AppCompatActivity() {

    private lateinit var btn1: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1 = findViewById(R.id.comenzar)
        btn1.setOnClickListener {
            startActivity(Intent(this, InputActivity::class.java))
        }
    }
}
