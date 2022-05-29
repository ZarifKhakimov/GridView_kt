package com.example.gridview_kt.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.gridview_kt.R


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews() {
        val button = findViewById<Button>(R.id.b_push)
        button.setOnClickListener { openActivity() }
    }

    fun openActivity() {
        val intent = Intent(this, GridActivity::class.java)
        startActivity(intent)
    }
}