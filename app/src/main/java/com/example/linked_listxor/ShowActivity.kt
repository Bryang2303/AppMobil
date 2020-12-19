package com.example.linked_listxor

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ShowActivity : AppCompatActivity() {
    private lateinit var saved1: TextView
    private lateinit var saved2: TextView
    private lateinit var saved3: TextView
    private lateinit var saved4: TextView
    private lateinit var saved5: TextView

    private lateinit var sig1: TextView
    private lateinit var sig2: TextView
    private lateinit var sig3: TextView
    private lateinit var sig4: TextView

    private lateinit var ant1: TextView
    private lateinit var ant2: TextView
    private lateinit var ant3: TextView
    private lateinit var ant4: TextView

    private lateinit var ante: Button
    private lateinit var sig: Button
    private lateinit var actual: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.show)
        var contador = 0
        val preferences = getSharedPreferences("database", Context.MODE_PRIVATE)
        val savedName = preferences.getString("savedProductName", "This value doesn't exist")
        //Log.d("Bryan", "Saved message is: $savedName")

        val parts = savedName?.split(",")?.toTypedArray()
        saved1 = findViewById(R.id.show1)
        saved1.text = parts!![0]
        saved2 = findViewById(R.id.show2)
        saved2.text = parts!![1]
        saved3 = findViewById(R.id.show3)
        saved3.text = parts!![2]
        saved4 = findViewById(R.id.show4)
        saved4.text = parts!![3]
        saved5 = findViewById(R.id.show5)
        saved5.text = parts!![4]

        sig1 = findViewById(R.id.tvSig)
        sig1.text = parts!![1]
        sig2 = findViewById(R.id.tvSig2)
        sig2.text = parts!![2]
        sig3 = findViewById(R.id.tvSig3)
        sig3.text = parts!![3]
        sig4 = findViewById(R.id.tvSig4)
        sig4.text = parts!![4]

        ant1 = findViewById(R.id.tvAnt)
        ant1.text = parts!![0]
        ant2 = findViewById(R.id.tvAnt2)
        ant2.text = parts!![1]
        ant3 = findViewById(R.id.tvAnt3)
        ant3.text = parts!![2]
        ant4 = findViewById(R.id.tvAnt4)
        ant4.text = parts!![3]

        actual = findViewById(R.id.mainShow)
        actual.text = parts!![contador]

        ante = findViewById(R.id.anterior)
        sig = findViewById(R.id.siguiente)
        ante.setOnClickListener {
            if (contador != 0) {
                contador -= 1
                actual.text = parts!![contador]
            }
        }
        sig.setOnClickListener {
            if (contador != 4) {
                contador += 1
                actual.text = parts!![contador]
            }
        }
    }
}
