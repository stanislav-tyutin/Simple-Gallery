package com.simplemobiletools.gallery.activities

import android.content.Intent
import com.simplemobiletools.commons.activities.BaseSplashActivity

class SplashActivity : BaseSplashActivity() {
    override fun initActivity() {
        startActivity(Intent(this, MediaActivity::class.java))
        finish()
    }
}
