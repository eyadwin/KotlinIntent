package com.example.kotlin_intent

import android.content.Intent
import android.content.res.Resources
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_drink_details.*
//import com.example.kotlin_intent.R

class drink_details : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drink_details)

        val index: Int =intent.getIntExtra("drink_index",0)
        val drinksArray: Array<String> = resources.getStringArray(R.array.drinks)

        val drink_description_array=ArrayList<String>()

        drink_description_array.add("Espresso, hot milk, and a steamed milk foam")
        drink_description_array.add("A couple of espresso shots with steamed milk")
        drink_description_array.add("Highest quality beans roasted and brewed fresh")

        when (index) {
            0 -> {// if first item is clicked
                drinkImage.setImageResource(R.drawable.capp)
                drinkName.setText(drinksArray[index].toString())
                drinkDescription.setText(drink_description_array.get(index))
            }
            1 -> {// if second item is clicked
                drinkImage.setImageResource(R.drawable.latte)
                drinkName.setText(drinksArray[index].toString())
                drinkDescription.setText(drink_description_array.get(index))
            }
            2 -> {// if third item is clicked
                drinkImage.setImageResource(R.drawable.filter)
                drinkName.setText(drinksArray[index].toString())
                drinkDescription.setText(drink_description_array.get(index))
            }
        }// end when
    }// end onCreate
}
