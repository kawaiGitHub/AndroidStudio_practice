package com.test.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val et1: EditText = findViewById(R.id.et1)
        val et2: EditText = findViewById(R.id.et2)
        val btnClick: Button = findViewById(R.id.btnClick)
        val tvAns: TextView  = findViewById(R.id.tvAns)
        val btnClear: Button = findViewById(R.id.btnClear)

        btnClick.setOnClickListener {

            if (et1.text.toString() == ("") || et2.text.toString() == ("")) {
                Toast.makeText(this, "入力してください", Toast.LENGTH_LONG).show()

            } else {
                val sum = et1.text.toString().toInt() + et2.text.toString().toInt()
                tvAns.text = "合計 $sum"
            }
        }

        btnClear.setOnClickListener {
            et1.text.clear()
            et2.text.clear()
            tvAns.text = "答え"
        }
    }
}