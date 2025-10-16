package com.example.useractivity

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var buttonSalvar = findViewById<Button>(R.id.button_salvar)

        buttonSalvar.setOnClickListener{
            var nometext = findViewById<EditText>(R.id.edit_text_id).text
            if(nometext.isEmpty()){
                Toast.makeText(This,"Digite seu nome", Toast.LENGTH_LONG).show()
            }else{
                this.getSharedPreferences("motivação", MODE_PRIVATE)
                var intent = intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }




    }
}