package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var etenter = findViewById<EditText>(R.id.etenter)
        var etenters = findViewById<EditText>(R.id.etenters)
        var answer = findViewById<TextView>(R.id.tvanswer)
        var btnsum = findViewById<Button>(R.id.btnsum)
        var btnminus = findViewById<Button>(R.id.btnminus)
        var btntimes = findViewById<Button>(R.id.btntimes)
        var btnmodulus = findViewById<Button>(R.id.btnmodulus)


                    btnsum.setOnClickListener {
                        var enter = etenter.text.toString().toInt()
                        var enters = etenters.text.toString().toInt()
                        var addition = enter + enters
                        answer.setText(addition.toString())
                        //Toast.makeText(baseContext,enter, Toast.LENGTH_LONG).show()
                    }

                        btnminus.setOnClickListener {
                            var enter = etenter.text.toString().toInt()
                            var enters = etenters.text.toString().toInt()
                            var subtraction = enter - enters
                            answer.setText(subtraction.toString())
                            //Toast.makeText(baseContext,enter, Toast.LENGTH_LONG).show()

                        }
                   btntimes.setOnClickListener {
                       var enter = etenter.text.toString().toInt()
                       var enters = etenters.text.toString().toInt()
                       var multiplication = enter * enters
                       answer.setText(multiplication.toString())
                       //Toast.makeText(baseContext,enters, Toast.LENGTH_LONG).show()
                   }
                   btnmodulus.setOnClickListener {
                       var enter = etenter.text.toString().toInt()
                       var enters = etenters.text.toString().toInt()
                       var modulus=enter%enters
                       answer.setText(modulus.toString())
                      // Toast.makeText(baseContext,enters, Toast.LENGTH_LONG).show()

    }
}}

