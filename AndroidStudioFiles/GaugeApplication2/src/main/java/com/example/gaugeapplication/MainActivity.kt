package com.example.gaugeapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


public class MainActivity : AppCompatActivity() {
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun goToHomePage(view: View?) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

}