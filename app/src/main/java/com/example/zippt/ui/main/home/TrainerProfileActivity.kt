package com.example.zippt.ui.main.home

import android.content.Intent
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.zippt.BaseActivity
import com.example.zippt.R
import com.example.zippt.databinding.ActivityMainBinding
import com.example.zippt.databinding.ActivityTrainerprofileBinding
import com.example.zippt.ui.pay.PayActivity


class TrainerProfileActivity: BaseActivity<ActivityTrainerprofileBinding>(ActivityTrainerprofileBinding::inflate) {

    override fun initAfterBinding() {
        binding.profileArrowBackImg.setOnClickListener {
            finish()
        }
    }
}