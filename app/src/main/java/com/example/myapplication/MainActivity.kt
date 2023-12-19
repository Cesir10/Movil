package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextEmail: TextInputEditText = findViewById(R.id.editTextEmail)
        val editTextPassword: TextInputEditText = findViewById(R.id.editTextPassword)
        val buttonLogin: Button = findViewById(R.id.buttonLogin)


        buttonLogin.setOnClickListener {
            val email: String = editTextEmail.text.toString().trim()
            val password: String = editTextPassword.text.toString().trim()

            if (isValidInput(email, password)) {

                val intent = Intent(this, MainACtivity2::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, getString(R.string.error_empty_fields), Toast.LENGTH_SHORT).show()
            }
        }


    }

    private fun isValidInput(email: String, password: String): Boolean {
        return email.isNotEmpty() && password.isNotEmpty()
    }
}

