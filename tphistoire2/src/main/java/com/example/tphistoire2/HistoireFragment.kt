package com.example.tphistoire2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.tphistoire2.databinding.FragmentHistoireBinding

class HistoireFragment : Fragment() {

    lateinit var binding : FragmentHistoireBinding
    lateinit var vm : Histoire

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate<FragmentHistoireBinding>(inflater,R.layout.activity_main, container, false)
        vm = ViewModelProvider(this).get(Histoire::class.java)
        vm.prenom.observe(viewLifecycleOwner, Observer { binding.prenom = vm.prenom.toString()})
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        var histoireFragmentArgs = arguments?.let { HistoireFragmentArgs.fromBundle(it) }

    }

}