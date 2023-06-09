package com.onrender.bloxland.blox_ppr.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "\n" +
                "BLOX - PPR"
    }
    val text: LiveData<String> = _text
}