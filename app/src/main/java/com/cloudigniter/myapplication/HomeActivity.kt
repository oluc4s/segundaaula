package com.cloudigniter.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // pegar valor da tela anterior
        var email = intent.getStringExtra("email")

        //pegar o elemento da view
        var emailText:TextView = findViewById(R.id.textView3)

        //exibir na tela um email
        emailText.text = email
        emailText.textSize = 20F
    }
}