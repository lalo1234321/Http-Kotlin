package com.example.httpkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var bValidar = findViewById<Button>(R.id.bValidar)
        bValidar.setOnClickListener {
            //Código aqui
        }
    }
}