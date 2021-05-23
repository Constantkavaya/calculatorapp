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
        var bttimes = findViewById<Button>(R.id.bttimes)
        var btnmodulus = findViewById<Button>(R.id.btnmodulus)


                    btnsum.setOnClickListener {
                        var enter = etenter.text.toString().toInt()
                        var enters = etenters.text.toString().toInt()
                        var  addition=enter-enters
                        answer.setText(addition)
                        //Toast.makeText(baseContext,addition, Toast.LENGTH_LONG).show()

                        btnminus.setOnClickListener {
                            var enter = etenter.text.toString().toInt()
                            var enters= etenters.text.toString().toInt()
                            var subtraction=enter-enters
                            answer.setText(subtraction)
                         //Toast.makeText(baseContext,subtraction, Toast.LENGTH_LONG).show()


                   bttimes.setOnClickListener {
                       var enter = etenter.text.toString().toInt()
                       var enters = etenters.text.toString().toInt()
                       var multiplication=enter*enters
                       answer.setText(multiplication)
                       //Toast.makeText(baseContext,multiplication, Toast.LENGTH_LONG).show()

                   btnmodulus.setOnClickListener {
                       var enter = etenter.text.toString().toInt()
                       var enters = etenters.text.toString().toInt()
                       var modulus=enter%enters
                       answer.setText(addition)
                       //Toast.makeText(baseContext,modulus, Toast.LENGTH_LONG).show()
                   }
                   }
                   }
                    }
    }
}

