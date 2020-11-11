package com.example.android.kalkulator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.math.RoundingMode
import java.text.DecimalFormat

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bagiButton: Button = findViewById(R.id.bagi_Button)
        val kaliButton: Button = findViewById(R.id.kali_Button)
        val plusButton: Button = findViewById(R.id.plus_Button)
        val minusButton: Button = findViewById(R.id.minus_Button)
        val clearButton: Button = findViewById(R.id.hapus_Button)

        bagiButton.setOnClickListener { bagi() }
        kaliButton.setOnClickListener { kali() }
        plusButton.setOnClickListener { plus() }
        minusButton.setOnClickListener { minus() }
        clearButton.setOnClickListener { hapus() }
    }

    private fun plus(){

        val numOne: EditText = findViewById(R.id.editSatu)
        val numTwo: EditText = findViewById(R.id.editDua)
        val resultText: TextView = findViewById(R.id.result)

        var numbOne = numOne.text.toString().toInt()
        var numbTwo = numTwo.text.toString().toInt()

        val hasil = numbOne + numbTwo

        resultText.text = hasil.toString()

        Toast.makeText(this, "${numbOne.toString()} + ${numbTwo.toString()} = ${hasil.toString()}",
            Toast.LENGTH_SHORT).show()
    }

    private fun minus(){

        val numOne: EditText = findViewById(R.id.editSatu)
        val numTwo: EditText = findViewById(R.id.editDua)
        val resultText: TextView = findViewById(R.id.result)

        val numbOne = numOne.text.toString().toInt()
        val numbTwo = numTwo.text.toString().toInt()

        val hasil = numbOne - numbTwo

        resultText.text = hasil.toString()

        Toast.makeText(this, "${numbOne.toString()} - ${numbTwo.toString()} = ${hasil.toString()}",
            Toast.LENGTH_SHORT).show()
    }

    private fun kali(){
        val numOne: EditText = findViewById(R.id.editSatu)
        val numTwo: EditText = findViewById(R.id.editDua)
        val resultText: TextView = findViewById(R.id.result)

        val numbOne = numOne.text.toString().toInt()
        val numbTwo = numTwo.text.toString().toInt()

        val hasil = numbOne * numbTwo

        resultText.text = hasil.toString()

        Toast.makeText(this, "${numbOne.toString()} * ${numbTwo.toString()} = ${hasil.toString()}",
            Toast.LENGTH_SHORT).show()
    }

    private fun bagi(){
        val numOne: EditText = findViewById(R.id.editSatu)
        val numTwo: EditText = findViewById(R.id.editDua)
        val resultText: TextView = findViewById(R.id.result)

        val numbOne = numOne.text.toString().toFloat()
        val numbTwo = numTwo.text.toString().toFloat()

        val hasil = numbOne / numbTwo
        val df = DecimalFormat("#.###")
        df.roundingMode = RoundingMode.CEILING

        resultText.text = df.format(hasil).toString()

        Toast.makeText(this, "${numbOne.toString()} / ${numbTwo.toString()} = ${hasil.toString()}",
            Toast.LENGTH_SHORT).show()
    }

    private fun hapus(){
        val numOne: EditText = findViewById(R.id.editSatu)
        val numTwo: EditText = findViewById(R.id.editDua)
        val resultText: TextView = findViewById(R.id.result)

        numOne.text.clear();
        numTwo.text.clear();
        resultText.text = "0"

        Toast.makeText(this, "Clear",
            Toast.LENGTH_SHORT).show()
    }
}
