package com.example.mytoastapplication

import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (resources.getBoolean(R.bool.portrait_only)) {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        }

        val btn_click_me = findViewById<Button>(R.id.btn_click_me)
        btn_click_me.setOnClickListener {
            Toast.makeText(this@MainActivity, "This is a Toast message.", Toast.LENGTH_SHORT).show()
        }
    }
}