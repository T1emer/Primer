package com.alexux.alexux.myapplication

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity2 : AppCompatActivity() {
    lateinit var userAnswer: EditText
    lateinit var examplText: TextView
    var c = 0.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        userAnswer = findViewById(R.id.editTextTextPersonName)
        examplText = findViewById(R.id.textView)
        test()

        findViewById<Button>(R.id.button2).setOnClickListener {
            val preference = PreferenceManager.getDefaultSharedPreferences(applicationContext)
            val editor = preference.edit()

            editor.putString("loginSave", "")
                    .apply()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()


        }
    }

    private fun test() {
        var n = Random.nextInt(100) - 50
        var m = Random.nextInt(100) - 50

        if (userAnswer.text.isNotEmpty())
            Log.d("RESULT_USER", userAnswer.text.toString().toDouble().toString()
                    Log.d("RESULT_REAL",c.toString())
        if (userAnswer.text.toString().toDouble() == c) {
            findViewById<TextView>(R.id.textView2).text = "horosh"
            findViewById<TextView>(R.id.textView2).setTextColor(Color.GREEN)

        }else{
                    findViewById<TextView>(R.id.textView2).text = "loh"
            findViewById<TextView>(R.id.textView2).setTextColor(Color.RED)



        when ((0..3).random())



        }


        {



            0 -> {
                c = (n * m).toDouble()
                examplText.setText("$n*$m=")
            }
            1 -> {
                c = (n * m).toDouble()
                examplText.setText("$n/$m=")

            }

            2 -> {
                c = (n * m).toDouble()
                examplText.setText("$n+$m=")
            }
            3 -> {
                c = (n * m).toDouble()
                examplText.setText("$n-$m=")
            }
        }
        if (userAnswer.text.isNotEmpty())
            if (userAnswer.text.toString().toDouble() == c) {



            } else {


            }
    }
}