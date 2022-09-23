package com.example.httpkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.viewModels
import com.example.httpkotlin.utils.MainViewModel
import com.example.httpkotlin.utils.Network

class MainActivity : AppCompatActivity() {
    private  val viewModel:MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var bValidar = findViewById<Button>(R.id.bValidar)
        bValidar.setOnClickListener {
            //Código aqui
            if( Network.validarRed(this) ) {
                Toast.makeText(this, "Hay red", Toast.LENGTH_LONG).show()
            }else {
                Toast.makeText(this, "no hay red",Toast.LENGTH_LONG).show()
            }
        }


    }
}