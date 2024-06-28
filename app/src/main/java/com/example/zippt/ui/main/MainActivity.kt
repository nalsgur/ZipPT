package com.example.zippt.ui.main

import android.content.Intent
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.zippt.BaseActivity
import com.example.zippt.R
import com.example.zippt.databinding.ActivityMainBinding
import com.example.zippt.ui.pay.PayActivity

class MainActivity: BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {
    private lateinit var navHostFragment: NavHostFragment

    override fun initAfterBinding() {
        navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment_container) as NavHostFragment
        val navController: NavController = navHostFragment.findNavController()

        binding.mainBottomNavigation.setupWithNavController(navController)

        binding.charge.setOnClickListener {
            startActivity(Intent(this, PayActivity::class.java))
        }
    }
}