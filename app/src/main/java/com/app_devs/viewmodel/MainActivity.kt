package com.app_devs.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.app_devs.viewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewModel=ViewModelProvider(this).get(MainActivityViewModel::class.java)
        binding.textView.text=viewModel.number.toString()
        binding.button.setOnClickListener {
           viewModel.addOne()
            binding.textView.text=viewModel.number.toString()
        }
    }
}