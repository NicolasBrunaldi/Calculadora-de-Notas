package com.example.calculadoradenotas

import android.graphics.Color.GREEN
import android.graphics.Color.RED
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoCalcular = calcular
        val resultado = resultados

        botaoCalcular.setOnClickListener(){
            val nota1 = Integer.parseInt(nota1.text.toString())
            val nota2 = Integer.parseInt(nota2.text.toString())
            val faltas = Integer.parseInt(faltas.text.toString())
            var notaFinal = (nota1 + nota2)/2
            if (notaFinal >= 7 && faltas in 0..10){
                resultado.setText("Aluno Aprovado!\nNota Final: $notaFinal Faltas: $faltas")
                resultado.setTextColor(GREEN)

            }
            else{
                resultado.setText("Aluno Reprovado!")
                resultado.setTextColor(RED)
            }
        }
    }
}