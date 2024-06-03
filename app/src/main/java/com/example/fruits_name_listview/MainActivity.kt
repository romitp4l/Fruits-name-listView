package com.example.fruits_name_listview

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Find the ListView by ID
        val listView: ListView = findViewById(R.id.lvFruitsList)

        // Sample data for the ListView
        val fruitsName = listOf("Apple", "Mango", "Orange","Guava", "Grapes" , "WaterMelon", "kiwi" , "Pomogranate")

        // Creating the adapter for the ListView
        val adapter = ArrayAdapter(this, R.layout.list_item_fruit, R.id.tvFruitName, fruitsName)

        // Setting the adapter to the ListView
        listView.adapter = adapter
    }
}
