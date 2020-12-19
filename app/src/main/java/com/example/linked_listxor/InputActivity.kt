package com.example.linked_listxor

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class InputActivity : AppCompatActivity() {
    private lateinit var cabeza: EditText
    private lateinit var segundo: EditText
    private lateinit var tercero: EditText
    private lateinit var cuarto: EditText
    private lateinit var cola: EditText

    private lateinit var btn2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.input)

        btn2 = findViewById(R.id.listo)
        btn2.setOnClickListener {
            cabeza = findViewById(R.id.editText1)
            segundo = findViewById(R.id.editText2)
            tercero = findViewById(R.id.editText3)
            cuarto = findViewById(R.id.editText4)
            cola = findViewById(R.id.editText5)
            val database = getSharedPreferences("database", Context.MODE_PRIVATE)
            database.edit().apply {
                putString("savedProductName", cabeza.text.toString()+","+segundo.text.toString()+","+tercero.text.toString()+","+cuarto.text.toString()+","+cola.text.toString()+",")//Put String lo guarda en memoria
            }.apply()
            startActivity(Intent(this, ShowActivity::class.java))
        }
    }
}
