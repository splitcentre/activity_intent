package com.example.activity_intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.activity_intent.databinding.ActivityMain2Binding
import com.example.activity_intent.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val name=intent.getStringExtra(MainActivity.EXTRA_NAME)
        with(binding){
            txt.text=name
        }
    }
}