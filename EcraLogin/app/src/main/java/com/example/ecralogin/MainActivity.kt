package com.example.ecralogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.ecralogin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonEntrar.setOnClickListener {
            val userName = binding.editUsername.text.toString().trim()
            val password = binding.editPassword.text.toString().trim()
            if (!userName.isEmpty() || !password.isEmpty()) {
                if(userName.equals("teste") && password.equals("teste")) {
                    Toast.makeText(applicationContext, "Login ok", Toast.LENGTH_LONG).show()
                } else {
                    Toast.makeText(applicationContext, "Login ou senha incorreto", Toast.LENGTH_LONG).show()
                }
            } else{
                Toast.makeText(applicationContext, "Os campos são obrigatorios", Toast.LENGTH_LONG).show()
            }
        }
    }
}