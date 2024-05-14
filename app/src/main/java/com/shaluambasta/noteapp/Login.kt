package com.shaluambasta.noteapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        val introBtn: ConstraintLayout = findViewById(R.id.introBtn)
        introBtn.setOnClickListener {
            startActivity(Intent(this@Login,AddNoteActivity::class.java))
            // Finish the LoginActivity to prevent the user from navigating back to it via back button
            finish()
        }
    }
}
