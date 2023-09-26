package com.example.intentcomextra

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import com.example.intentcomextra.databinding.ActivityMain2Binding
import com.example.intentcomextra.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var result: ActivityResultLauncher<Intent>
    private var name = "";
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonEnviar.setOnClickListener {
            name = binding.editName.text.toString();
            val i = Intent(this, MainActivity2::class.java)
            i.putExtra("name", name);
            //startActivity(i)
            result.launch(i);
        }

        result = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
            if (it.data != null && it.resultCode == 1) {
                name = it.data?.getStringExtra("name").toString()
                binding.editName.setText("Olá ${name}")
            } else if (it.data != null && it.resultCode == 2) {
                Toast.makeText(applicationContext, "Operação cancelada", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "Error ao Atualizar o nome", Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }
}