package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var btnAdd: Button
    lateinit var btnSubtract: Button
    lateinit var btnMultiply: Button
    lateinit var btnModulus: Button
    lateinit var etFirstnumber: EditText
    lateinit var etSecondnumber: EditText
    lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAdd = findViewById(R.id.btnAdd)
        tvResult = findViewById(R.id.tvResult)
        btnModulus = findViewById(R.id.btnModulus)
        btnMultiply = findViewById(R.id.btnMultiply)
        btnSubtract = findViewById(R.id.btnSubtract)
        etFirstnumber = findViewById(R.id.etFirstnumber)
        etSecondnumber = findViewById(R.id.etSecondnumber)


        btnAdd.setOnClickListener {
            var value1 = etFirstnumber.text.toString().toDouble()
            var value2 = etSecondnumber.text.toString().toDouble()
            add(value1,value2)
        }
        btnSubtract.setOnClickListener {
            var value1 = etFirstnumber.text.toString().toDouble()
            var value2 = etSecondnumber.text.toString().toDouble()
            subtract(value1,value2)
        }
        btnMultiply.setOnClickListener {
            var value1 = etFirstnumber.text.toString().toDouble()
            var value2 = etSecondnumber.text.toString().toDouble()
            multiply(value1,value2)
        }
        btnModulus.setOnClickListener {
            var value1 = etFirstnumber.text.toString().toDouble()
            var value2 = etSecondnumber.text.toString().toDouble()
            modulus(value1,value2)
        }
    }

    fun add(value1: Double, value2: Double) {
        var total = value1 + value2
        tvResult.text = total.toString()
    }

    fun subtract(value1: Double, value2: Double) {
        var result = value1 - value2
        tvResult.text = result.toString()
    }
    fun multiply(value1: Double,value2: Double){
        var result=value1*value2
        tvResult.text=result.toString()
    }
    fun modulus(value1: Double,value2: Double){
        var result= value1%value2
        tvResult.text=result.toString()
    }
}