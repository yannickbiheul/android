package com.example.tphistoire

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.tphistoire.databinding.FragmentHistoireBinding

class HistoireFragment : Fragment() {

    lateinit var vm : Histoire
    lateinit var binding : FragmentHistoireBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_histoire, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        vm = ViewModelProvider(this).get(Histoire::class.java)

        val resultFragmentArgs = arguments?.let { HistoireFragmentArgs.fromBundle(it) }
        val prenom = view.findViewById<TextView>(R.id.textViewPrenom)
        val genre = view.findViewById<TextView>(R.id.textViewGenre)
        val lieu = view.findViewById<TextView>(R.id.textViewLieu)

        prenom.text = "Le prénom du héros est ${resultFragmentArgs?.histoire?.prenom}"
        genre.text = "Le genre du héros est ${resultFragmentArgs?.histoire?.genre}"
        lieu.text = "Le lieu où se déroule l'histoire est ${resultFragmentArgs?.histoire?.lieu}"
    }

}