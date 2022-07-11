package com.example.tplancerdede

import androidx.lifecycle.ViewModel
import kotlin.random.Random

class DeViewModel : ViewModel() {

    var valeurDe = 0

    fun lancer() : Int {
        valeurDe = Random.nextInt(1, 6)
        return valeurDe
    }
}