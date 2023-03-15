package com.example.ukl_fragmentku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class HomeActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var text: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        supportActionBar?.hide()

        text = findViewById(R.id.emailText)

        val email = intent.getStringExtra("String")
        if (email != null) {
            text.text = email
        }

        val btnSign: Button =
            findViewById(R.id.settings)
        btnSign.setOnClickListener(this)
    }

    override fun onClick(v: View) {

        when (v.id) {
            R.id.settings -> {
                val moveToRegister = Intent(this@HomeActivity, MainActivity2::class.java)
                startActivity(moveToRegister)
            }
        }
    }
}

