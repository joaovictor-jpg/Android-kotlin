package com.example.ecralogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ecralogin.databinding.ActivityLoginOkBinding
import com.example.ecralogin.databinding.ActivityMainBinding

class LoginOkActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginOkBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginOkBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonLogout.setOnClickListener {
            finish()
        }
    }
}