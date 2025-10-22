package com.example.useractivity

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        val fraseRepository = FraseRepository2()

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var nome = findViewById<TextView>(R.id.text_name)
        var nomeRecuperacao = this.getSharedPreferences("motivação", MODE_PRIVATE).getString("nome"."Olá PSI")
        nome.text = nomeRecuperacao


        var novafrase = findViewById<TextView>(R.id.text_frase)
        var Botaofrase = findViewById<Button>(R.id.Bottom_novaFrase)

        Botaofrase.setOnClickListener {
            var frase = fraseRepository.getfrase(0)
            novafrase.text = frase
        }


    }
}