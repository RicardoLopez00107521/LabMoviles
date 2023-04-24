package com.example.laboratorio05pdm.ui.movie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.cardview.widget.CardView
import androidx.navigation.fragment.findNavController
import com.example.laboratorio05pdm.R

class firstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.add_movie_button).setOnClickListener {
            findNavController().navigate(R.id.action_firstFragment_to_thirdFragment)
        }
        view.findViewById<CardView>(R.id.card_view1).setOnClickListener {
            findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
        }
    }
}