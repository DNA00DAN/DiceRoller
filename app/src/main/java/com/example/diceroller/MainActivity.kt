package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.text = getString(R.string.letsroll)

        rollButton.setOnClickListener {
            val resultText: TextView = findViewById(R.id.result_text)
            Toast.makeText(this, "LET IT ROLL", Toast.LENGTH_SHORT).show()
            val randomInt = Random().nextInt(7)
            resultText.text = randomInt.toString()
        }
    }
}
