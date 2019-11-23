package com.senyk.university.lab2.view

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.senyk.university.lab2.R
import com.senyk.university.lab2.viewmodel.MainViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProviders.of(this)[MainViewModel::class.java]

        viewModel.crowsCount.observe(this, Observer<Int> {
                showMessage(
                    getString(
                        R.string.counter_show,
                        it,
                        resources.getQuantityString(R.plurals.crows_plurals, it)
                    )
                )
        })

        viewModel.catsCount.observe(this, Observer<Int> {
                showMessage(
                    getString(
                        R.string.counter_show,
                        it,
                        resources.getQuantityString(R.plurals.cats_plurals, it)
                    )
                )
        })

        greeting_button.setOnClickListener { showMessage(getString(R.string.greeting_show)) }
        crows_button.setOnClickListener { viewModel.crowsButtonPressed() }
        cats_button.setOnClickListener { viewModel.catsButtonPressed() }
    }

    private fun showMessage(message: String) {
        Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
    }
}
