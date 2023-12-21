package com.example.myapplication

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity

class PrimerosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ListaEnteraPrimeros.PrimerosPlatosList
        setContentView(R.layout.activity_main4)
    }
}