package com.example.quizapp

import android.os.Bundle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.quizapp.adapters.FieldAdapter


class MainActivity : AppCompatActivity() {

    private lateinit var fieldRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fieldRecyclerView = findViewById(R.id.fieldRecyclerView)

        val fields = arrayOf(
            Pair("Python", R.drawable.python96),
            Pair("C++", R.drawable.cpp96),
            Pair("C", R.drawable.c96),
            Pair("Data Structures", R.drawable.datastructures100),
            Pair("Computer Networks", R.drawable.computernetworks100),
            Pair("Software Engineering", R.drawable.software96)
        )


        // Set up the RecyclerView with a LinearLayoutManager
        val layoutManager = LinearLayoutManager(this)
        fieldRecyclerView.layoutManager = layoutManager

        // Set up the adapters for the RecyclerView
        val fieldAdapter = FieldAdapter(fields) { field ->
            // Start the QuizActivity for the selected field
            val intent = Intent(this@MainActivity, com.example.quizapp.activities.QuizActivity::class.java)
            intent.putExtra("FIELD", field)
            startActivity(intent)
        }
        fieldRecyclerView.adapter = fieldAdapter
    }
}


