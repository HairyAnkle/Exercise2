package com.example.exercise2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun login(view: View) {
        val uname = findViewById<TextView>(R.id.username)
        val pass = findViewById<TextView>(R.id.password)

        val defUser = "__ishan.zxcvb"
        val defPass = "admin123"

        if (uname.text.toString() == defUser && pass.text.toString() == defPass) {
            val intent = Intent(this, HomePage::class.java)
            intent.putExtra("username", uname.text.toString())
            startActivity(intent)
        }
        else {
            Toast.makeText(this, "Invalid Credentials", Toast.LENGTH_SHORT).show()
        }

    }



}