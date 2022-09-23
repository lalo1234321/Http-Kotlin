package com.example.httpkotlin.utils

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class MainViewModel:ViewModel() {
    //arquitectura modelo- vista vista-modelo
    private val _progressValue = MutableStateFlow(0)

    fun startProgress() {
        viewModelScope.launch {
            _progressValue.value += 1
            delay(30)
        }
    }
    fun restartProgress() {
        _progressValue.value = 0


    }
}