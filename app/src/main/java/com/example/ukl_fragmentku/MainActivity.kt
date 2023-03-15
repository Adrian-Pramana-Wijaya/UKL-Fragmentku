package com.example.ukl_fragmentku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var edtUsername: EditText
    private lateinit var edtEmail: EditText
    private lateinit var edtPassword: EditText
    private lateinit var btnLogin: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtUsername = findViewById(R.id.username)
        edtEmail = findViewById(R.id.email)
        edtPassword = findViewById(R.id.password)
        btnLogin = findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener(this)

        val btnReg: Button =
            findViewById(R.id.btnRegister)
        btnReg.setOnClickListener(this)

        val btnSign: Button =
            findViewById(R.id.btnSign)
        btnSign.setOnClickListener(this)

    }


    override fun onClick(v: View) {
        var emptyEmail: Boolean = false
        var emptyUsername: Boolean = false
        var emptyPassword: Boolean = false


        if(edtUsername.text.toString().trim().length == 0){
            edtUsername.error = "Cuma username gamau ngisi"
            emptyUsername = true
        }

        if(edtEmail.text.toString().trim().length == 0){
            edtEmail.error = "Cuma username gamau ngisi"
            emptyEmail = true
        }

        if(edtPassword.text.toString().trim().length == 0){
            edtPassword.error = "Kenapa si ga diisi?!"
            emptyPassword = true
        }

        if(!emptyEmail && !emptyPassword && !emptyUsername){
            val dataReceived = Intent(this@MainActivity, HomeActivity::class.java)
            val email = edtUsername.text.toString()
            dataReceived.putExtra("String", email)
            startActivity(dataReceived)
        }
        when (v.id){
            R.id.btnRegister -> {
                val moveToRegister = Intent(this@MainActivity, LoginActivity::class.java)
                startActivity(moveToRegister)
            }
            R.id.btnSign -> {
                val moveToSign = Intent(this@MainActivity, MainActivity2::class.java)
                startActivity(moveToSign)
            }
        }
    }
}