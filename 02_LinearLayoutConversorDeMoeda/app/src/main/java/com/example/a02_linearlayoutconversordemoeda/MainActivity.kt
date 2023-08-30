package com.example.a02_linearlayoutconversordemoeda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.a02_linearlayoutconversordemoeda.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonDolar.setOnClickListener {
            resultado(0.8)
        }

        binding.buttonReal.setOnClickListener {
            resultado(5.0)
        }

        binding.buttonPeso.setOnClickListener {
            resultado(10.2)
        }
    }

    private fun resultado(taxa: Double) {
        val euro = binding.editEuros.text.toString().trim()

        if (!euro.isEmpty()) {
            val resultado = String.format("%.2f", (euro.toDouble() * taxa))
            Toast.makeText(applicationContext, "${resultado}$", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(applicationContext, "Error", Toast.LENGTH_LONG).show()
        }
    }
}