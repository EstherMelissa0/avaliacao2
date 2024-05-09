package com.example.restaurante

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import kotlinx.coroutines.delay

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //Ele atrasa em 2000 segundos a exibição da tarefa que irá ser realizada , depois do intent j.
        Handler(Looper.getMainLooper()).postDelayed({
            val i = intent
            val j = Intent(this, PedidoActivity:: class.java)
            j.putExtras(i)
            startActivity(j)
        }, 2000)



    }
}
