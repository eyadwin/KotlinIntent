package com.example.kotlin_intent

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_drinks.*

class drinks : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drinks)

        drinks_list.setOnItemClickListener( {_, _, index, _ ->
            val intent = Intent(this, drink_details::class.java)
            when (index) {
                0 -> {// if first item is clicked
                    intent.putExtra("drink_index",index)
                    startActivity(intent)
                }
                1 -> {// if first item is clicked
                    intent.putExtra("drink_index",index)
                    startActivity(intent)
                }
                2 -> {// if first item is clicked
                    intent.putExtra("drink_index",index)
                    startActivity(intent)
                }
            }// end when
        }
        )
    }// end onCreate
}
