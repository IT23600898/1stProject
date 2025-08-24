package com.example.a1stproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class OnboardingScreen02 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_screen02) // use correct layout

        val btnNext = findViewById<Button>(R.id.btnNext)
        btnNext.setOnClickListener {
            val intent = Intent(this, OnboardingScreen03::class.java)
            startActivity(intent)
        }

        val btnSkip = findViewById<Button>(R.id.btnSkip)
        btnSkip.setOnClickListener {
            val intent = Intent(this, OnboardingScreen03::class.java)
            startActivity(intent)
        }

        val btnBack = findViewById< ImageButton>(R.id.btnBack) // make sure this ID exists in your layout
        btnBack.setOnClickListener {
            val intent = Intent(this, OnboardingScreen01::class.java)
            startActivity(intent)
            finish() // optional: closes current screen
        }
    }


}
