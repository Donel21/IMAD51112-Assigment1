package com.example.finalimadassement

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Declaring the views
        val ageNumber = findViewById<EditText>(R.id.ageNumber)
        val btnGenerate = findViewById<Button>(R.id.btnGenerate)
        val btnClear = findViewById<Button>(R.id.btnClear)
        val txtResult = findViewById<TextView>(R.id.txtResult)
        btnGenerate.setOnClickListener {
            val age = ageNumber.text.toString().toIntOrNull()
            if (age != null) {
                val result = when (age) {
                    in 0..19 -> "invalid input number"
                    in 20..30 -> "Cameron Boyce"
                    in 30..40 -> "Emily Bronte"
                    in 40..50 -> "Paul Walker"
                    in 50..60 -> "Nicholas The Second"
                    in 60..70 -> "Diego Maradona"
                    in 70..80 -> " Nina Simone"
                    in 80..90 -> "Johnny Nash"
                    in 90..100 -> "Nelson Mandela"
                    else -> "You are a senior"

                }
                val also = buildString {
                    append("Age: ")
                    append(age)
                    append("\n")
                    append(
                        when (result) {
                            "invalid input number" -> "Please input number range from 20 - 100"
                            "Cameron Boyce" -> "Cameron Boyce was young popular actor who died due to cancer."
                            "Emily Bronte" -> "Emily Jane was an English novelist and poet who was best known her Novel Wuthering heights."
                            "Paul Walker" -> "Paul walker was an American actor for Fast & Furious, but unfortunately he passed away in an tragic car accident"
                            "Nicholas The Second" -> "Nicholas was the last Russian Emperor but he was unfortunately murdered. "
                            "Diego Maradona"  -> "Diego Maradona was a legendary Soccer Player For Argentine who died from a Heart attack "
                            " Nina Simone" -> "Nina Simone was an American singer, song writer who died of cancer"
                            "Johnny Nash" -> "Johnny Nash was an American singer, who  died of natural causes. "
                            "Nelson Mandela" -> "Nelson Mandela was the South Africa's first Black President, he was anti-apartheid activist, politician who died of prolonged respiratory infection."




                            else ->  "Please re-enter a valid Number within the range 20-100"
                        }
                    )
                    append("    ")
                }.also { txtResult.text = it }
                btnClear.setOnClickListener() {
                    ageNumber.text.clear()
                    txtResult.text = ""
                }
            }
        }
    }
}