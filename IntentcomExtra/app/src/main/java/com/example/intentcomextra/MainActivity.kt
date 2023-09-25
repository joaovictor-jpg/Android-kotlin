package com.example.intentcomextra

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentcomextra.databinding.ActivityMain2Binding
import com.example.intentcomextra.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonEnviar.setOnClickListener {
            val name = binding.editName.text.toString();

            val i = Intent(this, MainActivity2::class.java)
            i.putExtra("name", name);
            startActivity(i)
        }
    }
}