package com.badgerdev.androidmaster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.badgerdev.androidmaster.firstapp.FirstAppActivity
import com.badgerdev.androidmaster.firstapp.ResultActivity
import com.badgerdev.androidmaster.imccalculator.ImcCalculatorActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnGreetApp = findViewById<Button>(R.id.btnGreetApp)
        val btnIMCApp = findViewById<Button>(R.id.btnIMCApp)
        btnGreetApp.setOnClickListener { navigateToGreetApp() }
        btnIMCApp.setOnClickListener { navigateToIMCApp() }
    }

    private fun navigateToIMCApp() {
        val intent = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToGreetApp(){
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }
}