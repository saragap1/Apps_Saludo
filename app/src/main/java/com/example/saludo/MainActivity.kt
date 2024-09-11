package com.example.saludo

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val boton: Button = findViewById(R.id.boton)
        val campoTextoEditable: EditText = findViewById(R.id.campoTextoEditable)
        val msjSaludo: TextView = findViewById(R.id.msjSaludo)


        boton.setOnClickListener{
            msjSaludo.text = getString(R.string.ma_tv_hola_extra_o, campoTextoEditable.text.toString())
        }
    }
}