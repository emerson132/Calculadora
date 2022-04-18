package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.mariuszgromada.math.mxparser.Expression

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textoPrincipal : TextView = findViewById(R.id.textoPrincipal);

        val buttonC : Button = findViewById(R.id.buttonC);
        val buttonSigno : Button = findViewById(R.id.buttonSigno);
        val buttonPorcentaje : Button = findViewById(R.id.buttonPorcentaje);
        val buttonDivide : Button = findViewById(R.id.buttonDivide);

        val button7 : Button = findViewById(R.id.button7);
        val button8 : Button = findViewById(R.id.button8);
        val button9 : Button = findViewById(R.id.button9);
        val buttonX : Button = findViewById(R.id.buttonX);

        val button4 : Button = findViewById(R.id.button4);
        val button5 : Button = findViewById(R.id.button5);
        val button6 : Button = findViewById(R.id.button6);
        val buttonPlus : Button = findViewById(R.id.buttonPlus);

        val button1 : Button = findViewById(R.id.button1);
        val button2 : Button = findViewById(R.id.button2);
        val button3 : Button = findViewById(R.id.button3);
        val buttonMinus : Button = findViewById(R.id.buttonMinus);

        val button0: Button = findViewById(R.id.button0);
        val buttonP : Button = findViewById(R.id.buttonP);
        val buttonIgual : Button = findViewById(R.id.buttonIgual);

        buttonC.setOnClickListener{ buttonClear(textoPrincipal) }
        buttonPorcentaje.setOnClickListener{ buttonPorce(textoPrincipal) }
        buttonDivide.setOnClickListener{ buttonDiv(textoPrincipal) }

        button7.setOnClickListener{ boton7(textoPrincipal) }
        button8.setOnClickListener{ boton8(textoPrincipal) }
        button9.setOnClickListener{ boton9(textoPrincipal) }
        buttonX.setOnClickListener{ buttonMul(textoPrincipal) }

        button4.setOnClickListener{ boton4(textoPrincipal) }
        button5.setOnClickListener{ boton5(textoPrincipal) }
        button6.setOnClickListener{ boton6(textoPrincipal) }
        buttonMinus.setOnClickListener{ buttonMin(textoPrincipal) }

        button1.setOnClickListener{ boton1(textoPrincipal) }
        button2.setOnClickListener{ boton2(textoPrincipal) }
        button3.setOnClickListener{ boton3(textoPrincipal) }
        buttonPlus.setOnClickListener{ buttonSum(textoPrincipal) }

        button0.setOnClickListener{ boton0(textoPrincipal) }
        buttonP.setOnClickListener{ botonP(textoPrincipal) }
        buttonIgual.setOnClickListener{ buttonIgu(textoPrincipal) }

        //val expresion = Expression("2+2")
       // println("*******************"+expresion.calculate())
    }

    private fun concatenar(datos: String, textoPrincipal: TextView) {
        val resultAnterior : String = textoPrincipal.getText().toString()

        textoPrincipal.setText(String.format("%s%s",resultAnterior,datos))
    }
    private fun buttonIgu(textoPrincipal: TextView) {
        val datos : String = textoPrincipal.getText().toString()

        val expression = Expression(datos)

        val result : String = expression.calculate().toString()

        textoPrincipal.setText(result)
    }

    private fun botonP(textoPrincipal: TextView) {
        concatenar(".",textoPrincipal)
    }

    private fun boton0(textoPrincipal: TextView) {
        concatenar("0", textoPrincipal)
    }

    private fun buttonSum(textoPrincipal: TextView) {
        concatenar("+",textoPrincipal)
    }

    private fun boton3(textoPrincipal: TextView) {
        concatenar("3",textoPrincipal)
    }

    private fun boton2(textoPrincipal: TextView) {
        concatenar("2",textoPrincipal)
    }

    private fun boton1(textoPrincipal: TextView) {
        concatenar("1",textoPrincipal)
    }

    private fun buttonMin(textoPrincipal: TextView) {
        concatenar("-",textoPrincipal)
    }

    private fun boton6(textoPrincipal: TextView) {
        concatenar("6",textoPrincipal)
    }

    private fun boton5(textoPrincipal: TextView) {
        concatenar("5",textoPrincipal)
    }

    private fun boton4(textoPrincipal: TextView) {
        concatenar("4",textoPrincipal)
    }

    private fun buttonMul(textoPrincipal: TextView) {
        concatenar("*",textoPrincipal)
    }

    private fun boton9(textoPrincipal: TextView) {
        concatenar("9",textoPrincipal)
    }

    private fun boton8(textoPrincipal: TextView) {
        concatenar("8",textoPrincipal)
    }

    private fun boton7(textoPrincipal: TextView) {
        concatenar("7",textoPrincipal)
    }

    private fun buttonDiv(textoPrincipal: TextView) {
        concatenar("/",textoPrincipal)
    }

    private fun buttonPorce(textoPrincipal: TextView) {
        concatenar("%",textoPrincipal)
    }

    private fun buttonClear(textoPrincipal: TextView) {
        textoPrincipal.text = ""
    }
}