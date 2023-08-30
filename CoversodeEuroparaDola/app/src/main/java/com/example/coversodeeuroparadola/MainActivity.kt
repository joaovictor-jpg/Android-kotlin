package com.example.coversodeeuroparadola

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.coversodeeuroparadola.databinding.ActivityMainBinding
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonConverte.setOnClickListener {
            val euros = binding.editEuros.text.toString().toDouble()
            //val dollar = String.format("%.2f", euros * 0.8)
            val dollar = (euros * 0.8 * 100).roundToInt().toDouble() / 100

            binding.textResultado.setText("${dollar}$")
        }
    }
}