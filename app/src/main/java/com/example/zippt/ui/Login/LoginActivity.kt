package com.example.zippt.ui.Login

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.zippt.databinding.ActivityLogoBinding
import com.example.zippt.ui.main.MainActivity

class LogoActivity : AppCompatActivity() {
    private lateinit var binding : ActivityLogoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLogoBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.loginLoginbtn.setOnClickListener {

        }

        binding.loginLoginbtn.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.loginSignbtn.setOnClickListener {
            var intent = Intent(this, Sign::class.java)
            startActivity(intent)
        }

    }
}