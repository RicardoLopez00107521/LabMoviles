package com.example.laboratorio05pdm.ui.movie

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.example.laboratorio05pdm.R
import androidx.fragment.app.activityViewModels
import com.example.laboratorio05pdm.data.category2
import com.example.laboratorio05pdm.data.description2
import com.example.laboratorio05pdm.data.model.MovieModel
import com.example.laboratorio05pdm.data.name2
import com.example.laboratorio05pdm.data.qualification2

class thirdFragment : Fragment() {

    private lateinit var add_button: Button
    private lateinit var name: EditText
    private lateinit var categorie: EditText
    private lateinit var description: EditText
    private lateinit var rate: EditText

    private val ViewModel: MovieViewModel by activityViewModels{
        MovieViewModel.Factory
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bind()
        ClickListener()
    }

    private fun ClickListener(){
        add_button.setOnClickListener{
            val name = name.text.toString()
            val categorie = categorie.text.toString()
            val description = description.text.toString()
            val rate = rate.text.toString()

            val new_movie = MovieModel (name, categorie, description, rate)

            ViewModel.addMovies(new_movie)

            Log.d("Mostrando lista",ViewModel.getMovies().toString())
        }
    }

    private fun bind(){
        add_button = view?.findViewById(R.id.button)!!
        name = view?.findViewById(R.id.name_editText)!!
        categorie = view?.findViewById(R.id.categorie_editText)!!
        description = view?.findViewById(R.id.description_editText)!!
        rate = view?.findViewById(R.id.rate_editText)!!
    }
}