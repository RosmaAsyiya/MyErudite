package com.example.erudite

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.core.os.HandlerCompat.postDelayed

class splashscreen : AppCompatActivity() {
    //Deklarasi lama timer splashscreen muncul
    private val SPLASH_TIME:Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        Handler().postDelayed({
            startActivity(Intent (this, MainActivity::class.java))
            finish()
        },SPLASH_TIME)

    }
}