package com.example.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CompteurViewModel : ViewModel() {

    var compteur = MutableLiveData<Int>()

    init {
        compteur.value = 0
    }

    /**
     * Cette méthode retourne directement l'incrémentation.
     */
    fun increment() {
        compteur.value = compteur.value?.inc()
    }

}