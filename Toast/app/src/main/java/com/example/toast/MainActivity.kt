package com.example.toast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.toast.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonOla.setOnClickListener {
            val nome = binding.editNome.text.toString().trim()
            val sobreNome = binding.editSobrenome.text.toString().trim()

            if (nome.isNullOrEmpty() || sobreNome.isNullOrEmpty()) {
                binding.textResultado.setText("Nome não foi inserido")
                Toast.makeText(applicationContext, "Nome não foi inserido", Toast.LENGTH_SHORT).show()
            } else {
                binding.textResultado.setText("Olá $nome $sobreNome")
                Toast.makeText(applicationContext, "Olá $nome $sobreNome", Toast.LENGTH_LONG).show()
            }
        }
    }
}