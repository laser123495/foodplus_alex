package com.myapp.foodplus.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.myapp.foodplus.R
import com.myapp.foodplus.databinding.ActivityUisellerAddProductBinding
import com.myapp.foodplus.databinding.ActivityUisellerProfitBinding

class UISellerProfit : AppCompatActivity() {
    private lateinit var binding: ActivityUisellerProfitBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUisellerProfitBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setToolbar()

    }
    private fun setToolbar() {
        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.arrowhitam)
        supportActionBar?.setDisplayShowTitleEnabled(false)
    }
}