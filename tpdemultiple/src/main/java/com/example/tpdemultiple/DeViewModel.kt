package com.example.tpdemultiple

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DeViewModel : ViewModel() {

    var valeurDe = MutableLiveData<Int>()

    init {
        valeurDe.value = 1
    }

    fun lancer(max : Int) {
        valeurDe.value = (1..max).random()
    }
}