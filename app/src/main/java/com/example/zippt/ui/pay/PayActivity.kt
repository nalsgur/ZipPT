package com.example.zippt.ui.pay

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.zippt.BaseActivity
import com.example.zippt.R
import com.example.zippt.databinding.ActivityMainBinding
import com.example.zippt.databinding.ActivityPayBinding

class PayActivity: BaseActivity<ActivityPayBinding>(ActivityPayBinding::inflate) {
    override fun initAfterBinding() {
        binding.arrowBack.setOnClickListener {
            finish()
        }
    }
}