package com.example.veterinaria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.veterinaria.databinding.ActivityVacunasBinding

class vacunas : AppCompatActivity() {
    lateinit var binding: ActivityVacunasBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVacunasBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}