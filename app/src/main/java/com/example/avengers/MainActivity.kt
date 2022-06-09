package com.example.avengers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {


    lateinit var email : EditText
    lateinit var password: EditText
    lateinit var button_login : Button
    lateinit var button_forget : Button
    lateinit var button_signup : Button

    val etem = "email"
    val etpd = "password"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_relative_layout)
        supportActionBar?.hide()

        email = findViewById(R.id.email_txt)
        password = findViewById(R.id.pd_txt)
        button_login = findViewById(R.id.btn_login)
        button_forget = findViewById(R.id.btn_forget)
        button_signup = findViewById(R.id.btn_signup)

        val lol = email.text.toString()
        val lol1 = password.text.toString()

        button_login.setOnClickListener {
            //if(lol.equals(etem) && lol1.equals(etpd)) {
                //print("lol")

                Toast.makeText(this, "logged in", Toast.LENGTH_LONG).show()
                intent = Intent(this@MainActivity, MainActivity2::class.java)
                startActivity(intent)

            //}
            //else{
               // Toast.makeText(this, "Wrong input", Toast.LENGTH_SHORT).show()
            //}
        }

}
}