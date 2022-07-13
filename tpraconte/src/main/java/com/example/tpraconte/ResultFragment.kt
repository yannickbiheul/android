package com.example.tpraconte

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class ResultFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_result, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val resultFragmentArgs = arguments?.let { ResultFragmentArgs.fromBundle(it) }
        val textView = view.findViewById<TextView>(R.id.textViewHistoire2)
        textView.text = "" +
                "Il était une fois un être nommé ${resultFragmentArgs?.histoire?.prenom} " +
                "qui vivait dans un(e) ${resultFragmentArgs?.histoire?.lieu}..."
    }

}