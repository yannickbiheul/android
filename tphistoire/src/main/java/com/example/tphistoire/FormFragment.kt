package com.example.tphistoire

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.tphistoire.databinding.FragmentFormBinding

class FormFragment : Fragment() {

    lateinit var binding :FragmentFormBinding
    lateinit var vm : Histoire

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFormBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button.setOnClickListener {
            val histoire = Histoire()
            histoire.prenom.value = binding.editTextPrenom.text.toString()
            histoire.genre.value = binding.editTextGenre.text.toString()
            histoire.lieu.value = binding.editTextLieu.text.toString()

            val action = FormFragmentDirections.actionToHistoire(histoire)
            Navigation.findNavController(view).navigate(action)
        }
    }

}