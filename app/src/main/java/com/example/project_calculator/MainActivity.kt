package com.example.project_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.content.Intent
import android.widget.Toast



class MainActivity : AppCompatActivity() {

    var input_1: String = ""
    var input_2: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        val btn_plus = findViewById<TextView>(R.id.btn_plus)

        btn_plus.setOnClickListener {
            calculate(1)
        }
        val btn_minus = findViewById<TextView>(R.id.btn_minus)

        btn_minus.setOnClickListener {
            calculate(2)
        }
        val btn_multiply = findViewById<TextView>(R.id.btn_multiply)

        btn_multiply.setOnClickListener {
            calculate(3)
        }
        val btn_devide = findViewById<TextView>(R.id.btn_devide)

        btn_devide.setOnClickListener {
            calculate(4)
        }
    }

    fun calculate(type: Number){

        var editText1 = findViewById(R.id.input_1) as EditText

        this.input_1 = editText1.text.toString();


        var editText2 = findViewById(R.id.input_2) as EditText

        this.input_2 = editText2.text.toString();


        if(this.input_1 == "" || this.input_2 == ""){
            Toast.makeText(this, "საჭიროა ორივე ველი ", Toast.LENGTH_SHORT).show();
            return;
        }

        val input_1_int: Int = this.input_1.toInt();
        val input_2_int: Int = this.input_2.toInt();
        when (type) {
            1 -> {// add
                val sum : Int = input_1_int+input_2_int
                result(input_1_int, input_2_int, "+",sum )
            }
            2 -> {// minus
                val minus : Int = input_1_int - input_2_int
                result(input_1_int, input_2_int, "-",minus )

            }
            3 -> {// multiply
                val multiply : Int = input_1_int * input_2_int
                result(input_1_int, input_2_int, "*",multiply )

            }
            4 -> {// divide

                val divide : Int = input_1_int * input_2_int
                result(input_1_int, input_2_int, "/",divide )

            }
        }
    }

    fun result(_input_1 :Number, _input_2 : Number, operation : String,result : Number){

        val intent = Intent(this, resultActivity::class.java);
        intent.putExtra("result","$input_1 $operation $input_2 = $result" );
        startActivity(intent)

    }


}
