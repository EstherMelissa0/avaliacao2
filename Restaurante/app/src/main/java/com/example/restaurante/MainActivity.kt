package com.example.restaurante

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.restaurante.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //Elaboração da variável binding.
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        //A variável interliga a tela ao código.
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //O valor está puxando os dados do intent i do loginactivity.
        val username = intent.extras?.getString("username")
        //Se o valor for nulo, irá aparecer a condição.
        if(!username.isNullOrEmpty()){
            binding.textOla.setText("Olá $username")
        }

        binding.buttonFechar.setOnClickListener {
            finishAffinity()
        }
     
        binding.buttonPedir.setOnClickListener{
            //Elaboração da intent e a observação que acontece pelo binding assim que os nomes são inseridos.
            val i = Intent(this, SplashActivity:: class.java)
            i.putExtra("quantidadePizza", binding.editQuantidadePizza.text.toString())
            i.putExtra("quantidadeSalada", binding.editQuantidadeSalada.text.toString())
            i.putExtra("quantidadeHamburguer", binding.editQuantidadeHamburguer.text.toString())
            startActivity(i)
            finish()
        }

        //Se o usuário marcar a opção irá aparecer o número 1 e irá ser mostrado o preço da opção escolhida por ele.
        binding.checkPizza.setOnClickListener {
            if(binding.checkPizza.isChecked()){
                binding.editQuantidadePizza.setText("1")
                binding.textPrecoPizza.visibility = View.VISIBLE
            //Se o usuário não marcar nada, irá aparecer o número 0.
            }else{
                binding.editQuantidadePizza.setText("0")
                binding.textPrecoPizza.visibility = View.GONE
            }
        }
         //Se o usuário marcar a opção irá aparecer o número 1 e irá ser mostrado o preço da opção escolhida por ele.
        binding.checkSalada.setOnClickListener {
            if(binding.checkSalada.isChecked()){
                binding.editQuantidadeSalada.setText("1")
                binding.textPrecoSalada.visibility = View.VISIBLE
            //Se o usuário não marcar nada, irá aparecer o número 0.
            }else{
                binding.editQuantidadeSalada.setText("0")
                binding.textPrecoSalada.visibility = View.GONE
            }
        }
         //Se o usuário marcar a opção irá aparecer o número 1 e irá ser mostrado o preço da opção escolhida por ele.
        binding.checkHamburger.setOnClickListener {
            if(binding.checkHamburger.isChecked()){
                binding.editQuantidadeHamburguer.setText("1")
                binding.textPrecoHamburguer.visibility = View.VISIBLE
            //Se o usuário não marcar nada, irá aparecer o número 0.
            }else{
                binding.editQuantidadeHamburguer.setText("0")
                binding.textPrecoHamburguer.visibility = View.GONE
            }
        }

    }
}
