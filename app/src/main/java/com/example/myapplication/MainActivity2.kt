package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // Configurar clics de botones (si es necesario)
        findViewById<View>(R.id.buttonEntrantes).setOnClickListener {
            startActivity(Intent(this, EntrantesActivity::class.java))
        }

        findViewById<View>(R.id.buttonPrimeros).setOnClickListener {
            startActivity(Intent(this, PrimerosActivity::class.java))
        }

        findViewById<View>(R.id.buttonSegundos).setOnClickListener {
            startActivity(Intent(this, SegundosActivity::class.java))
        }
    }
}