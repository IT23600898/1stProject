package com.example.a1stproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class WelcomeScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_screen) // your welcome screen layout

        // Navigate to LoginScreen
        val loginBtn = findViewById<Button>(R.id.loginBtn)
        loginBtn.setOnClickListener {
            val intent = Intent(this, LoginScreen::class.java)
            startActivity(intent)
            finish()
        }

        // Navigate to SignupScreen
        val signupBtn = findViewById<Button>(R.id.signupBtn)
        signupBtn.setOnClickListener {
            val intent = Intent(this, SignupScreen::class.java)
            startActivity(intent)
            finish()
        }
    }
}
