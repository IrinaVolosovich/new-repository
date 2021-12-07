package com.irina.myappfragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment

class FirstFragment : Fragment() {

lateinit var showToastButton:Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_first, container, false)
        showToastButton=view.findViewById(R.id.show_first_toast_button)

        showToastButton.setOnClickListener {
            Toast.makeText(context, "Привет",Toast.LENGTH_LONG).show()
        }

        return view
    }


}