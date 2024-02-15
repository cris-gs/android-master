package com.badgerdev.androidmaster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.badgerdev.androidmaster.firstapp.FirstAppActivity
import com.badgerdev.androidmaster.firstapp.ResultActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnGreetApp = findViewById<Button>(R.id.btnGreetApp)
        val btnIMCApp = findViewById<Button>(R.id.btnIMCApp)
        btnGreetApp.setOnClickListener { navigateToGreetApp() }
        btnGreetApp.setOnClickListener { navigateToIMCApp() }
    }

    private fun navigateToIMCApp() {
        TODO("Not yet implemented")
    }

    private fun navigateToGreetApp(){
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }
}