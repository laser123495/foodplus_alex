package com.myapp.foodplus.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.myapp.foodplus.R
import com.myapp.foodplus.databinding.ActivityUisellerMyProductListBinding
import com.myapp.foodplus.databinding.ActivityUisellerMyRestaurantBinding

class UISellerMyProductList : AppCompatActivity() {
    private lateinit var binding: ActivityUisellerMyProductListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUisellerMyProductListBinding.inflate(layoutInflater)
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