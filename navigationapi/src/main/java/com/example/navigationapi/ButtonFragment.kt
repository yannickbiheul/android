package com.example.navigationapi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

class ButtonFragment : Fragment() {
    // Équivalent au "setContentView" dans l'activité
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Interprète le fichier XML layout et affecte la vue obtenue au fragment
        return inflater.inflate(R.layout.fragment_button, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button = view.findViewById<Button>(R.id.buttonToTarget)
        // Méthode 1 (fonctionne pour tout)
        button.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_buttonFragment_to_targetFragment)
        }
        // Méthode 2 (uniquement pour les boutons)
//        button.setOnClickListener(
//            Navigation.createNavigateOnClickListener(R.id.action_buttonFragment_to_targetFragment)
//        )
    }

}