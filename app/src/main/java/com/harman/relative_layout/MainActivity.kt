package com.harman.relative_layout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.harman.relative_layout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvtraveller.setOnClickListener {
            var intent = Intent(this, Constraint_Layout::class.java)
            intent.putExtra("value",1)
            startActivity(intent)
        }
    }
}