package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
           rollDice()
        }
    }

    private fun rollDice() {
        var dice=RollDice(6)
        var diceRoll =dice.toll()
        var resultTextView: TextView=findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }
}
class RollDice(private val sides: Int)
{
     fun toll(): Int
     {
         return (1..sides).random()
     }
}