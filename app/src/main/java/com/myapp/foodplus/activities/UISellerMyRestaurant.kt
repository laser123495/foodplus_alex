package com.myapp.foodplus.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.myapp.foodplus.R
import com.myapp.foodplus.databinding.ActivityUisellerMyRestaurantBinding
import com.myapp.foodplus.fragments.ProfileFragment

class UISellerMyRestaurant : AppCompatActivity() {
    private lateinit var binding: ActivityUisellerMyRestaurantBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUisellerMyRestaurantBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setToolbar()

        binding.tvAddProduct.setOnClickListener {
            val intent = Intent(this,UISellerAddProduct::class.java)
            startActivity(intent)
        }
        binding.btnProfit.setOnClickListener {
            val intent = Intent(this,UISellerProfit::class.java)
            startActivity(intent)
        }
        binding.btnProductList.setOnClickListener {
            val intent = Intent(this,UISellerMyProductList::class.java)
            startActivity(intent)
        }

    }
    private fun setToolbar() {
        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.arrowwhite)
        supportActionBar?.setDisplayShowTitleEnabled(false)
    }
}