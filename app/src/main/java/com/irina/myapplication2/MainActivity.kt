package com.irina.myapplication2

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

private const val HELLO_KEY = "Hello!!!"

class MainActivity : AppCompatActivity() {

    lateinit var nextActivityButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nextActivityButton = findViewById(R.id.next_activity_button)

        nextActivityButton.setOnClickListener {
            val link = Uri.parse("https://google.com")
            val openBrowserIntent = Intent(Intent.ACTION_VIEW, link)
            val chooser=Intent.createChooser(openBrowserIntent, "Browser")
            startActivity(chooser)
        }

    }
}




