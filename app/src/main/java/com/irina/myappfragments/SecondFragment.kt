package com.irina.myappfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast

class SecondFragment : Fragment() {

lateinit var showSecondToastButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_second, container, false)

        showSecondToastButton=view.findViewById(R.id.show_second_toast_button)

        showSecondToastButton.setOnClickListener {
            Toast.makeText(context, "Как дела?", Toast.LENGTH_LONG).show()
        }

        return view
    }

}