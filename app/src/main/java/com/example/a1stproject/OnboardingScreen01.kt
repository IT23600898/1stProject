package com.example.a1stproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class OnboardingScreen01 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboarding_screen01)

        // Root layout reference
        val mainLayout = findViewById<ConstraintLayout>(R.id.onboard01)

        // Apply system bar padding to root layout
        ViewCompat.setOnApplyWindowInsetsListener(mainLayout) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Next button
        val buttonNext = findViewById<Button>(R.id.onboardBtnNext)
        buttonNext.setOnClickListener {
            val intent = Intent(this, OnboardingScreen02::class.java)
            startActivity(intent)
        }




    }
}
