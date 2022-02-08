package com.senai.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    val calcular = findViewById<Button>(R.id.calcular)


        calcular.setOnClickListener(){
            val peso = findViewById<EditText>(R.id.peso).text.toString().toInt()
            val altura = findViewById<EditText>(R.id.altura).text.toString().toDouble()
            val resultado = findViewById<TextView>(R.id.resultado)
            val imc = peso / (altura * altura)
            val imcString = String.format("%.2f",imc )

            if (imc < 18.5) { resultado.text =
                "$imcString \n Abaixo do Peso"
            } else if (imc > 18.5 && imc < 24.9) {resultado.text =
                "$imcString \n Peso Normal";
            } else if (imc > 25 && imc < 29.9) {resultado.text =
                "$imcString \n Sobrepeso"
            } else if (imc > 30 && imc < 34.9) {resultado.text =
                "$imcString \n Obesidade 1"
            } else if (imc > 35 && imc < 39.9) {resultado.text =
                "$imcString \n Obesidade 2"
            } else {
                "$imcString \n Obesidade Mórbida"
            }

        }

    }
}