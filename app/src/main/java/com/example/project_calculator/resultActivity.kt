package com.example.project_calculator

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class resultActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.result)

        val result_text = findViewById<TextView>(R.id.result_text)


        val actionbar = supportActionBar
        actionbar!!.title = "result"

        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)


        result_text.text = intent.getStringExtra("result");
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}