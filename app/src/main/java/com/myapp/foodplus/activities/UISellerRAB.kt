package com.myapp.foodplus.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.myapp.foodplus.R
import com.myapp.foodplus.databinding.ActivityUisellerRabBinding

class UISellerRAB : AppCompatActivity() {

    private lateinit var binding: ActivityUisellerRabBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUisellerRabBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnRegisSeller.setOnClickListener {
            val intent = Intent(this,UISellerMyRestaurant::class.java)
            startActivity(intent)
        }

    }
}