package com.example.listview_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import java.sql.Array

class MainActivity : AppCompatActivity() {

    lateinit var listview:ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       listview=findViewById<ListView>(R.id.list)
      //array declaration

         val language= arrayOf<String>("A","B","C","D")

         val arrayadapter:ArrayAdapter<String> =ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,language)
         listview.adapter=arrayadapter

         listview.onItemClickListener=AdapterView.OnItemClickListener { adapterView, view, position, id ->
            val selecteditem =adapterView.getItemAtPosition(position) as String
            val itemIdAtPos = adapterView.getItemIdAtPosition(position)
            Toast.makeText(applicationContext,"click item $selecteditem its position $itemIdAtPos",Toast.LENGTH_SHORT).show()



        }

    }
}
