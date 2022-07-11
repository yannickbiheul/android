package com.example.tplancerde

import androidx.lifecycle.ViewModel
import kotlin.random.Random


class DeViewModel : ViewModel() {
    var valeurDe = 1
    var nbFaces = 6

    fun lancer() : Int {
        valeurDe = Random.nextInt(1, 6)
        return valeurDe
    }

    fun setMaxFaces(nbFaces : Int) {
        this.nbFaces = nbFaces
    }
}




