package com.example.recyclerview_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerview_3.adapter.MainAdapter
import com.example.recyclerview_3.databinding.ActivityMainBinding
import com.example.recyclerview_3.utils.SampleData

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            rvMain .adapter=MainAdapter(SampleData.collection)
        }
    }
}