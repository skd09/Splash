package com.sharvari.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    private val splashDelay = 2000F;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        var intent = Intent(this@SplashActivity, MainActivity::class.java)
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(intent)
        }, splashDelay.toLong())
    }
}