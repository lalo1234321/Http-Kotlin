package com.example.httpkotlin.utils

import android.content.Context
import android.net.ConnectivityManager
import androidx.appcompat.app.AppCompatActivity

class Network {
    //definir una clase estatica en kotlin
    companion object {
        fun validarRed(activity:AppCompatActivity):Boolean {
            var connectivity = activity.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            var networkInfo = connectivity.activeNetworkInfo
            return ( networkInfo!=null && networkInfo.isConnected)
        }
    }
}