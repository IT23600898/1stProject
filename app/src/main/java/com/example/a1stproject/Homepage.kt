package com.example.a1stproject

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class Homepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)


        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        // Set default selected item (example: home)
        bottomNavigationView.selectedItemId = R.id.home

        // Handle item clicks
        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    // Already in home page, do nothing
                    true
                }
                R.id.plants -> {
                    // Navigate to Plants activity
                    val intent = Intent(this, MyPlantsScreen::class.java)
                    startActivity(intent)
                    overridePendingTransition(0, 0) // no animation
                    true
                }
                R.id.profile -> {
                    // Navigate to Profile activity
                    val intent = Intent(this, UserProfile::class.java)
                    startActivity(intent)
                    overridePendingTransition(0, 0)
                    true
                }
                R.id.settings -> {
                    // Navigate to Profile activity
                    val intent = Intent(this, SettingScreen::class.java)
                    startActivity(intent)
                    overridePendingTransition(0, 0)
                    true
                }
                else -> false
            }
        }
    }
}
