package com.example.veterinaria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.veterinaria.databinding.ActivitySesionBinding
import com.example.veterinaria.databinding.ActivityTmascotaBinding

class Tmascota : AppCompatActivity() {
    lateinit var binding: ActivityTmascotaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTmascotaBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}