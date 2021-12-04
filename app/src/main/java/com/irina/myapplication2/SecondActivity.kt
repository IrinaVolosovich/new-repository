package com.irina.myapplication2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

private const val HELLO_KEY = "Hello!!!"

class SecondActivity : AppCompatActivity() {

    lateinit var helloTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        helloTextView = findViewById(R.id.hello_text_view)

        val helloValue: String? = intent.extras?.getString(HELLO_KEY)
        helloTextView.text = helloValue
    }
}