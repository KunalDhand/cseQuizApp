package com.example.quizapp.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.quizapp.R
import com.example.quizapp.adapters.QuestionAdapter
import com.example.quizapp.models.UserResponse
import com.example.quizapp.viewmodels.QuizViewModel

class QuizActivity : AppCompatActivity() {

    private lateinit var quizViewModel: QuizViewModel
    private lateinit var questionRecyclerView: RecyclerView
    private lateinit var selectedField: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        selectedField = intent.getStringExtra("FIELD") ?: ""
        title = "Quiz: $selectedField"


        quizViewModel = ViewModelProvider(this).get(QuizViewModel::class.java)

        questionRecyclerView = findViewById(R.id.questionRecyclerView)
        //val submitButton: Button = itemView.findViewById(R.id.submitButton)


        // Set up the RecyclerView with a LinearLayoutManager
        val layoutManager = LinearLayoutManager(this)
        questionRecyclerView.layoutManager = layoutManager

        // Set up the adapter for the RecyclerView
        val questionAdapter = QuestionAdapter(quizViewModel.getQuestionsForField(selectedField))
        questionRecyclerView.adapter = questionAdapter

    }

// Inside your QuizActivity class

    fun submitQuiz(userResponses: List<UserResponse>) {
        // Start ResultActivity and pass the user responses
        val resultIntent = Intent(this, ResultActivity::class.java)
        resultIntent.putParcelableArrayListExtra("USER_RESPONSES", ArrayList(userResponses))
        resultIntent.putExtra("FIELD", selectedField)
        startActivity(resultIntent)

        // Finish the current activity (optional)
        finish()
    }

}