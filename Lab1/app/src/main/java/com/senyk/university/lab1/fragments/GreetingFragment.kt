package com.senyk.university.lab1.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.senyk.university.lab1.R
import kotlinx.android.synthetic.main.fragment_greeting.*

class GreetingFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_greeting, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments.let {
            greetingField.text =
                requireActivity().getString(R.string.greeting, it?.getString(USER_NAME_ARGS_KEY))
        }

        counterButton.setOnClickListener {
            COUNTER++
            Toast.makeText(
                requireContext(),
                requireActivity().getString(R.string.counter_show, COUNTER),
                Toast.LENGTH_SHORT).show()
        }
    }

    companion object {
        const val USER_NAME_ARGS_KEY = "user name"
        private var COUNTER = 0
    }

}
