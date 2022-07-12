package com.example.tphistoire

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Histoire : ViewModel() {

    var prenom = MutableLiveData<String>()
    var genre = MutableLiveData<String>()
    var lieu = MutableLiveData<String>()

    init {
        prenom.value = ""
        genre.value = ""
        lieu.value = ""
    }

    fun changerPrenom(prenom :String) {
        this.prenom.value = prenom
    }
}
