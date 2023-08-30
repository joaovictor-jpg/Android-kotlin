package com.example.conversodetemperatura

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.conversodetemperatura.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonConverte.setOnClickListener {

            if(!binding.editCelsius.text.toString().isEmpty()) {

                val celsius = binding.editCelsius.text.toString().toDouble()
                val fahreanheit = celsius * 1.8 + 32

                binding.textResultado.setText("${String.format("%.2f", fahreanheit)}ºF")
            } else {
                binding.textResultado.setText("Temperatura inválida");
            }
        }
    }
}