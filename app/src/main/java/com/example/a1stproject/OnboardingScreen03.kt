package com.example.a1stproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class OnboardingScreen03 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboarding_screen03) // your XML

        // Apply system bar padding to root layout
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.root_layout)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Start button -> go to WelcomeScreen
        val startButton = findViewById<Button>(R.id.startButton)
        startButton.setOnClickListener {
            val intent = Intent(this, WelcomeScreen::class.java)
            startActivity(intent)
            finish()
        }

        val btnBack = findViewById< ImageButton>(R.id.btnBack03) // make sure this ID exists in your layout
        btnBack.setOnClickListener {
            val intent = Intent(this, OnboardingScreen02::class.java)
            startActivity(intent)
            finish() // optional: closes current screen
        }
    }
}
