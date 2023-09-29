package com.example.bundleextras

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bundleextras.databinding.ActivityMain3Binding
import com.example.bundleextras.databinding.ActivityMainBinding

class MainActivity3 : AppCompatActivity() {
    private lateinit var binding: ActivityMain3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val i = intent

        val number1 = i.extras?.getInt("number")
        val number2 = i.extras?.getInt("number2")

        if(number1 != null && number2 != null) {
            val sum = number1 + number2
            binding.textResult.setText("Result: $sum")
        }
    }
}