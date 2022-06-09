package com.example.avengers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    lateinit var button_1 : Button
    lateinit var button_2 : Button
    lateinit var button_3 : Button
    lateinit var button_4 : Button
    lateinit var button_5 : Button
    lateinit var button_6 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_scrollview)
        button_1 = findViewById(R.id.btn_T)
        button_2 = findViewById(R.id.btn_C)
        button_3 = findViewById(R.id.btn_H)
        button_4 = findViewById(R.id.btn_B)
        button_5 = findViewById(R.id.btn_TH)
        button_6 = findViewById(R.id.btn_W)

        button_1.setOnClickListener {
            Toast.makeText(this, "More info button clicked", Toast.LENGTH_LONG).show()
        }
        button_2.setOnClickListener {
            Toast.makeText(this, "More info button clicked", Toast.LENGTH_LONG).show()
        }
        button_3.setOnClickListener {
            Toast.makeText(this, "More info button clicked", Toast.LENGTH_LONG).show()
        }
        button_4.setOnClickListener {
            Toast.makeText(this, "More info button clicked", Toast.LENGTH_LONG).show()
        }
        button_5.setOnClickListener {
            Toast.makeText(this, "More info button clicked", Toast.LENGTH_LONG).show()
        }
        button_6.setOnClickListener {
            Toast.makeText(this, "More info button clicked", Toast.LENGTH_LONG).show()
        }
    }
}