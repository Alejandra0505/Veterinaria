package com.example.veterinaria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.veterinaria.databinding.ActivityRazaBinding
import com.example.veterinaria.databinding.ActivitySesionBinding

class raza : AppCompatActivity() {
    lateinit var binding: ActivityRazaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRazaBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}