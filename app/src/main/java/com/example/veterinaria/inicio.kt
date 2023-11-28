package com.example.veterinaria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.veterinaria.databinding.ActivityInicioBinding
import com.example.veterinaria.databinding.ActivityMainBinding

class inicio : AppCompatActivity() {
    lateinit var binding: ActivityInicioBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInicioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btniniciar.setOnClickListener(){
            val intent = Intent(this,sesion::class.java)
            startActivity(intent)
        }

    }
}