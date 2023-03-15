package com.example.ukl_fragmentku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class LoginActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()

        val btnSign: Button =
            findViewById(R.id.buttonback)
        btnSign.setOnClickListener(this)
    }
    override fun onClick(v: View) {

        when (v.id){
            R.id.buttonback -> {
                val moveToSign = Intent(this@LoginActivity, MainActivity::class.java)
                startActivity(moveToSign)
            }
        }
    }
}