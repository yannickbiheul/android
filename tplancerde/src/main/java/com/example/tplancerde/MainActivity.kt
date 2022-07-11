package com.example.tplancerde

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.tplancerde.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    lateinit var viewModel : DeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(DeViewModel::class.java)

        // initialisation des champs UI
        binding.textViewValueDice.text = viewModel.valeurDe.toString()
        binding.editTextMaxFaces.setText(viewModel.nbFaces.toString())

        // Changer valeur dé
        binding.buttonValiderFaces.setOnClickListener {
            val nbFacesMax = binding.editTextMaxFaces.text.toString().toIntOrNull()
            if (nbFacesMax == null) {
                Toast.makeText(this, "merci de rentrer un nombre", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            } else {
                viewModel.nbFaces = nbFacesMax
            }
        }

        // Bouton lancer dé
        binding.floatingActionButton.setOnClickListener {
            viewModel.lancer()
            binding.textViewValueDice.text = viewModel.valeurDe.toString()
        }
    }
}