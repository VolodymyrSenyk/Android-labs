package com.senyk.university.lab3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        red_light_button.setOnClickListener {
            traffic_light_layout.setBackgroundColor(ContextCompat.getColor(applicationContext, R.color.colorRed))
            light_output.text = getString(R.string.red)
        }
        yellow_light_button.setOnClickListener {
            traffic_light_layout.setBackgroundColor(ContextCompat.getColor(applicationContext, R.color.colorYellow))
            light_output.text = getString(R.string.yellow)
        }
        green_light_button.setOnClickListener {
            traffic_light_layout.setBackgroundColor(ContextCompat.getColor(applicationContext, R.color.colorGreen))
            light_output.text = getString(R.string.green)
        }
    }

}
