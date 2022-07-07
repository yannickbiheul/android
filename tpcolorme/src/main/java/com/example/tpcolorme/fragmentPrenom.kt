package com.example.tpcolorme

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlin.random.Random

class fragmentPrenom : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_prenom, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button = view.findViewById<Button>(R.id.buttonPrenom)
        // Méthode 1 (fonctionne pour tout)
        button.setOnClickListener {
            var random = Random.nextInt(1, 100)
            if (random > 50) {
                Navigation.findNavController(view).navigate(
                    R.id.action_fragmentPrenom_to_fragmentRouge)
            } else {
                Navigation.findNavController(view).navigate(
                    R.id.action_fragmentPrenom_to_fragmentRose)
            }
        }
    }

}