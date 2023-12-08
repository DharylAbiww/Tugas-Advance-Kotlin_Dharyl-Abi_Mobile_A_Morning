package com.example.tugas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Notif : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notif)

        val backButton = findViewById(R.id.ivBack) as ImageView

        backButton.setOnClickListener {
            onBackPressed()
        }
    }
}