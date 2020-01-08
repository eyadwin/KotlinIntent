package com.example.kotlin_intent

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        categories_list.setOnItemClickListener( {_, _, index, _ ->
            if (index == 0) {// if first item is clicked
                val intent = Intent(this, drinks::class.java)
                startActivity(intent)
            }
        }
        )
    }// end onCreate
}
