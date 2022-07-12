package com.example.tphistoire2

import android.os.Parcelable
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.parcelize.Parcelize

@Parcelize
class Histoire(var toString: String, var toString1: String, var toString2: String) : ViewModel(), Parcelable {

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