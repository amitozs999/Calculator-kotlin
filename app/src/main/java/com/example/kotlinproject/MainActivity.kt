package com.example.kotlinproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle


import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    val OP_ADD = 1
    val OP_SUB = 2
    val OP_MUL = 3
    val OP_DIV = 4

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mem = 0.0
        var op = 0

        clearbtn.setOnClickListener {
            tv.text = "0"
        }

        button1.setOnClickListener {
            if (tv.text == "0") tv.text = "1"
            else tv.text = tv.text.toString() + "1"
        }
        button2.setOnClickListener {
            if (tv.text == "0") tv.text = "2"
            else tv.text = tv.text.toString() + "2"
        }
        button3.setOnClickListener {
            if (tv.text == "0") tv.text = "3"
            else tv.text = tv.text.toString() + "3"
        }
        button4.setOnClickListener {
            if (tv.text == "0") tv.text = "4"
            else tv.text = tv.text.toString() + "4"
        }
        button5.setOnClickListener {
            if (tv.text == "0") tv.text = "5"
            else tv.text = tv.text.toString() + "5"
        }
        button6.setOnClickListener {
            if (tv.text == "0") tv.text = "6"
            else tv.text = tv.text.toString() + "6"
        }
        button7.setOnClickListener {
            if (tv.text == "0") tv.text = "7"
            else tv.text = tv.text.toString() + "7"
        }
        button8.setOnClickListener {
            if (tv.text == "0") tv.text = "8"
            else tv.text = tv.text.toString() + "8"
        }
        button9.setOnClickListener {
            if (tv.text == "0") tv.text = "9"
            else tv.text = tv.text.toString() + "9"
        }
        button0.setOnClickListener {
            if (tv.text == "0") tv.text = "0"
            else tv.text = tv.text.toString() + "0"
        }
        plusbtn.setOnClickListener {
            op = OP_ADD
            mem = tv.text.toString().toDouble()
            tv.text = "0"
        }
        minusbtn.setOnClickListener {
            op = OP_SUB
            mem = tv.text.toString().toDouble()
            tv.text = "0"
        }
        divbtn.setOnClickListener {
            op = OP_DIV
            mem = tv.text.toString().toDouble()
            tv.text = "0"
        }
        multibtn.setOnClickListener {
            op = OP_MUL
            mem = tv.text.toString().toDouble()
            tv.text = "0"
        }
        eqbtn.setOnClickListener {
            if (op == 0) return@setOnClickListener

            when(op) {

                OP_ADD -> tv.text = (mem + tv.text.toString().toInt()).toString()
                OP_SUB -> tv.text = (mem - tv.text.toString().toInt()).toString()
                OP_DIV ->  if(tv.text.toString()=="0")
                {
                    tv.text="ERROR"
                }
                else {
                    tv.text = (mem / tv.text.toString().toDouble()).toString()
                }
                OP_MUL -> tv.text = (mem * tv.text.toString().toDouble()).toString()

            }
        }

    }
}