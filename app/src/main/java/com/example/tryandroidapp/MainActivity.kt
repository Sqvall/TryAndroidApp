package com.example.tryandroidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe(view: View) {
        val myToast = Toast.makeText(applicationContext, "Hello, Toast!", Toast.LENGTH_SHORT)
        myToast.setMargin(0f, -0.2f)

        myToast.show()
    }

    fun countMe(view: View) {
        val textView: TextView = findViewById(R.id.textView)
        var count: Int = textView.text.toString().toInt()
        count++

        textView.text = count.toString()
    }

    fun randomMe(view: View) {
        val textView: TextView = findViewById(R.id.textView)
        val count = (0..100).random()

        textView.text = count.toString()
    }
}