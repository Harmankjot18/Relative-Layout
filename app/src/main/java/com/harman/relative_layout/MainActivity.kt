package com.harman.relative_layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.harman.relative_layout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}