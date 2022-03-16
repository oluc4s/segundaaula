package com.cloudigniter.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var login: Button = findViewById(R.id.login)
        var editEmail: EditText = findViewById(R.id.email)
        var editSenha:EditText = findViewById(R.id.senha)



        login.setOnClickListener {
            if (loginRequest(editEmail.text.toString(),editSenha.text.toString())){
                toLoginView(editEmail.text.toString())
            }else{
                mostrarToast("Email ou senha invalido!!")
            }
        }
    }
    fun mostrarToast(text:String){
        Toast.makeText(this,text,Toast.LENGTH_SHORT)
            .show()
    }


    fun loginRequest(email:String,senha:String): Boolean{
        return email == "mateuslucas.ti@gmail.com" && senha == "123"
    }

    fun toLoginView(email: String){
        // chamar uma nova tela precisa de um itent, precisa de falar onde voce esta que no
        // caso e o this e pra onde voce vai que no caso e a HomeActivity::class.java
        var itent = Intent(this,HomeActivity::class.java)
        itent.putExtra("email",email)
        // depois eu preciso chamar para inflar uma nova  view
        startActivity(itent)
    }
}