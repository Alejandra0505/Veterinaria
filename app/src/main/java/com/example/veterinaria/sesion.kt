package com.example.veterinaria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.veterinaria.databinding.ActivityInicioBinding
import com.example.veterinaria.databinding.ActivitySesionBinding

class sesion : AppCompatActivity() {
    lateinit var binding: ActivitySesionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySesionBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}