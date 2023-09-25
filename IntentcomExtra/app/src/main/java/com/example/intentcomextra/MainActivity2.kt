package com.example.intentcomextra

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.intentcomextra.databinding.ActivityMain2Binding
import com.example.intentcomextra.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val i = intent
        val name = i.extras?.getString("name");

        if(name.equals("") || name == null) {
            Toast.makeText(applicationContext, "Nome não inserido", Toast.LENGTH_LONG).show()
        } else {
            binding.textOla.setText("Olá ${name}")
        }
    }
}