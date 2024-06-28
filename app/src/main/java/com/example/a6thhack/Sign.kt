package com.example.a6thhack

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.a6thhack.databinding.ActivityLogoBinding
import com.example.a6thhack.databinding.ActivitySignBinding

class Sign : AppCompatActivity() {

    private lateinit var binding : ActivitySignBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding = ActivitySignBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.signSignbtn.setOnClickListener {
            var intent = Intent(this, LogoActivity::class.java)
            startActivity(intent)
        }
    }
}