package com.myapp.foodplus.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.myapp.foodplus.R
import com.myapp.foodplus.databinding.ActivityUisellerAddProductBinding


class UISellerAddProduct : AppCompatActivity() {
    private lateinit var binding: ActivityUisellerAddProductBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUisellerAddProductBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setToolbar()

        binding.btnsave.setOnClickListener {
            val intent = Intent(this,UISellerMyRestaurant::class.java)
            startActivity(intent)
        }

    }
    private fun setToolbar() {
        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.arrowhitam)
        supportActionBar?.setDisplayShowTitleEnabled(false)
    }


}