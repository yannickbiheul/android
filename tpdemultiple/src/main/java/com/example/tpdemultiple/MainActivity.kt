package com.example.tpdemultiple

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.tpdemultiple.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    lateinit var viewModel : DeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(DeViewModel::class.java)

        /**
         * Observable : valeurDe
         * Observer : textViewValueDice
         */
        viewModel.valeurDe.observe(this, Observer {
            binding.textViewValueDice.text = it?.toString()
        })

        // initialisation des champs UI
        binding.textViewValueDice.text = viewModel.valeurDe.toString()

        // Boutons lancer dés
        binding.buttonDice4.setOnClickListener {
            viewModel.lancer(4)
        }
        binding.buttonDice6.setOnClickListener {
            viewModel.lancer(6)
        }
        binding.buttonDice8.setOnClickListener {
            viewModel.lancer(8)
        }
        binding.buttonDice16.setOnClickListener {
            viewModel.lancer(16)
        }
        binding.buttonDice20.setOnClickListener {
            viewModel.lancer(20)
        }
        binding.buttonDice24.setOnClickListener {
            viewModel.lancer(24)
        }
    }
}