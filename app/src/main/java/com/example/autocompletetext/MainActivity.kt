package com.example.autocompletetext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val items = arrayOf("America", "Brazil", "China", "Denmark", "India")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter =
            ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items)
        autoCountries.setAdapter(adapter)
        autoCountries.onItemClickListener
        autoCountries.threshold
        autoCountries.setOnFocusChangeListener { View, hint ->
            if (hint)
                autoCountries.showDropDown()
        }
        btn.setOnClickListener {
            Toast.makeText(this, "Complete", Toast.LENGTH_LONG).show()
        }


    }
}