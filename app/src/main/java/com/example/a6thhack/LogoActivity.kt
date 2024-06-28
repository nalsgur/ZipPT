package com.example.a6thhack

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.a6thhack.R
import com.example.a6thhack.databinding.ActivityLogoBinding

class LogoActivity : AppCompatActivity() {
    private lateinit var binding : ActivityLogoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_logo)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding = ActivityLogoBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

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