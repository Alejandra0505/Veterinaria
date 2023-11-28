package com.example.veterinaria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.veterinaria.databinding.ActivityMascotasBinding
import com.example.veterinaria.databinding.ActivitySesionBinding

class mascotas : AppCompatActivity() {
    lateinit var binding: ActivityMascotasBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMascotasBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}