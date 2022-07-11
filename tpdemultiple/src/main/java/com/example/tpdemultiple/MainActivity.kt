package com.example.tpdemultiple

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.tpdemultiple.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() , View.OnClickListener {

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
            binding.valDe = it
        })

        // initialisation des champs UI
        binding.textViewValueDice.text = viewModel.valeurDe.toString()

    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.buttonDice4 -> viewModel.lancer(4)
            R.id.buttonDice6 -> viewModel.lancer(6)
            R.id.buttonDice8 -> viewModel.lancer(8)
            R.id.buttonDice16 -> viewModel.lancer(16)
            R.id.buttonDice20 -> viewModel.lancer(20)
            R.id.buttonDice24 -> viewModel.lancer(24)
        }
    }
}