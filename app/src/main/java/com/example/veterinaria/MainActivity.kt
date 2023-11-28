package com.example.veterinaria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import com.example.veterinaria.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var tiempo = 0
        var time = object : CountDownTimer(2000, 1000) {
            override fun onTick(p0: Long) {
                binding.txtnum.text = tiempo.toString()
            }

            override fun onFinish() {
                startActivity(Intent(this@MainActivity, inicio::class.java))
            }
        }
        time.start()
    }
}