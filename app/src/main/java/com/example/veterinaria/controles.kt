package com.example.veterinaria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.veterinaria.databinding.ActivityControlesBinding

class controles : AppCompatActivity() {
    lateinit var binding: ActivityControlesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityControlesBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}