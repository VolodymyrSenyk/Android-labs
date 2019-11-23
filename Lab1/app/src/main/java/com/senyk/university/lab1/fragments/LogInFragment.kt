package com.senyk.university.lab1.fragments

import android.os.Bundle
import android.text.Editable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.senyk.university.lab1.R
import com.senyk.university.lab1.helpers.TextChangedListener
import kotlinx.android.synthetic.main.fragment_log_in.*

class LogInFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_log_in, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        logInButton.setOnClickListener {
            findNavController().navigate(
                R.id.greetingFragment, bundleOf(
                    GreetingFragment.USER_NAME_ARGS_KEY to nameInputField.text.toString()
                )
            )
        }

        logInButton.isClickable = false

        nameInputField.addTextChangedListener(object : TextChangedListener() {
            override fun afterTextChanged(text: Editable?) {
                logInButton.isClickable = !text.isNullOrEmpty()
            }
        })
    }

}
