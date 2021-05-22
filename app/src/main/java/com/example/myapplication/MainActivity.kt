package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Num1 = findViewById<EditText>(R.id.ac_main_edt_num1)
        val Num2 = findViewById<EditText>(R.id.ac_main_edt_num2)
        var btn_plus = findViewById<Button>(R.id.ac_main_btn_plus)
        var btn_min = findViewById<Button>(R.id.ac_main_btn_min)
        var btn_Div = findViewById<Button>(R.id.ac_main_btn_Div)
        var btn_multi = findViewById<Button>(R.id.ac_main_btn_Mullti)
        var tv_Result = findViewById<TextView>(R.id.ac_main_tv_Result)

        btn_plus.setOnClickListener {

            var n10: String = Num1.text.toString()
            var n11: Int = n10.toInt()
            var n2: Int = Num2.text.toString().toInt()

            var Result = n11 + n2

            tv_Result.text = Result.toString()

            tv_Result.setTextColor(Color.parseColor("#FD991E"))

        }


        btn_min . setOnClickListener {

            var n10: String = Num1.text.toString()
            var n11: Int = n10.toInt()
            var n2: Int = Num2.text.toString().toInt()

            var Result = n11 - n2

            tv_Result.text = Result.toString()
            tv_Result . setTextColor(Color.parseColor("#2196F3"))

            }

        btn_Div . setOnClickListener {

            var n10: String = Num1.text.toString()
            var n11: Int = n10.toInt()
            var n2: Int = Num2.text.toString().toInt()

            var Result = n11 / n2

            tv_Result.text = Result.toString()
            tv_Result . setTextColor(Color.parseColor("#17B61E"))

        }


        btn_multi . setOnClickListener {

            var n10: String = Num1.text.toString()
            var n11: Int = n10.toInt()
            var n2: Int = Num2.text.toString().toInt()

            var Result = n11 * n2

            tv_Result.text = Result.toString()
            tv_Result . setTextColor(Color.parseColor("#F4C024"))

        }


    }
}