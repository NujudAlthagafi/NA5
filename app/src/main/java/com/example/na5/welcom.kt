package com.example.na5

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import com.example.na5.databinding.ActivityWelcomBinding

class welcom : AppCompatActivity() {
    private lateinit var binding: ActivityWelcomBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityWelcomBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        next()
    }
    private fun next(){
        binding.apply {
            btmStart.setOnClickListener(){
              startActivity(Intent(this@welcom,game::class.java))
            }
        }
    }
}