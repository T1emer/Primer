package com.alexux.alexux.myapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.util.AttributeSet
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import java.time.Instant


class MainActivity : AppCompatActivity() {
    val trueLogin = "GG"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val preference = PreferenceManager.getDefaultSharedPreferences(applicationContext)
        val editor = preference.edit()

 findViewById<Button>(R.id.button).setOnClickListener {



     val userLogin = findViewById<EditText>(R.id.login).text.toString()

     if (userLogin == trueLogin) {
         if (findViewById<CheckBox>(R.id.checkBox).isChecked) {
             if (preference.getString("loginSave", userLogin) ==  trueLogin ) {
                 val intent = Intent(applicationContext, MainActivity2::class.java)
                 startActivity(intent)
                 finish()
             }
         editor.putString("loginSave", userLogin)
                 .apply()
             val intent = Intent(applicationContext, MainActivity2::class.java)
             startActivity(intent)
             finish()

         }


     }
 }
    }



}