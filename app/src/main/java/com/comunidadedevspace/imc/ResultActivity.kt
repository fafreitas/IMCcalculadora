package com.comunidadedevspace.imc

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContentView(R.layout.activity_result)
       val imc = intent.getFloatExtra("EXTRA_IMC",1f)
        var classificacao: String? = null

        if (imc <= 18.5f) {
            classificacao = "magreza"
        } else if (imc > 18.5f && imc <= 24.9f) {
            classificacao = "normal"
        } else if (imc > 25f && imc <= 29.9f) {
            classificacao = "sobrepeso"
        } else if (imc > 30f && imc <= 39.9f) {
            classificacao = "obesidade"
        } else {
            classificacao = "obesidade grave"
        }
        val tvClassificacao<TextView>=findViewById(R.id)
    }
}