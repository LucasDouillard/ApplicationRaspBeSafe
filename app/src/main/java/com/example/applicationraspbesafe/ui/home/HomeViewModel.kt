package com.example.applicationraspbesafe.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Page d'acceuil de RaspBeSafe"
    }
    val text: LiveData<String> = _text
}