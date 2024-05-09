package com.example.restaurante

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.restaurante.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    //Elaboração da variável binding.
    private lateinit var binding:ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //A variável interliga a tela ao código.
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Cria dois valores que irão receber os dados escritos quando os usuários clicam nos botões.
        binding.buttonEntrar.setOnClickListener {
            val username = binding.editUsername.text.toString().trim()
            val password = binding.editPassword.text.toString().trim()
            //Coloca uma condição aos valores anteriores, fazendo com que elas só funcionem sobre essas condições.
            if (username.equals("Esther") && password.equals("07")) {
                //Cria um valor que recebe a funcionalidade de outro componente.
                val i = Intent(this, MainActivity::class.java)
                //Ela será chamada em outra atividade.
                i.putExtra("username", username)
                //Começa a principal atividade e finaliza a atividade de login.
                startActivity(i)
                finish()
            } else {
                Toast.makeText(applicationContext, "Errou", Toast.LENGTH_LONG).show()
            }
        }

    }
}
