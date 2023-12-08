package com.example.quizapp.activities

// ResultActivity.kt
import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.quizapp.MainActivity
import com.example.quizapp.R
import com.example.quizapp.adapters.ResultFeedbackAdapter
import com.example.quizapp.viewmodels.ResultViewModel
import com.example.quizapp.models.UserResponse

@Suppress("DEPRECATION")
class ResultActivity : AppCompatActivity() {

    private lateinit var resultViewModel: ResultViewModel
    private lateinit var feedbackRecyclerView: RecyclerView
    private lateinit var selectedField: String // Declare selectedField at the class level


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        resultViewModel = ViewModelProvider(this).get(ResultViewModel::class.java)
        feedbackRecyclerView = findViewById(R.id.feedbackRecyclerView)
        val startNew:Button =findViewById(R.id.startNew)
        startNew.setOnClickListener {
            // Start the MainActivity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

            // Finish the current ResultActivity
            finish()
        }


        // Retrieve user responses from the intent
        val userResponses =
            intent.getParcelableArrayListExtra<UserResponse>("USER_RESPONSES") ?: emptyList()

        // Retrieve selected field from intent
        selectedField = intent.getStringExtra("FIELD") ?: ""
        title = "Result: $selectedField"


        // Set the pass/fail status
        val (passFailStatus, totalQuestions, correctAnswers, passingPercentage, resultPercentage) =
            resultViewModel.calculateResultStatus(userResponses, selectedField)

        // Set other information
        val tv_passFailStatus= findViewById<TextView>(R.id.resultStatus)
        val tv_totalQuestion = findViewById<TextView>(R.id.totalQuestion)
        val tv_correctAnswer= findViewById<TextView>(R.id.correctAnswer)
        val tv_passingPercentage= findViewById<TextView>(R.id.passingPercentage)
        val tv_resultPercentage= findViewById<TextView>(R.id.resultPercentage)

        tv_passFailStatus.text = passFailStatus.toString()
        tv_totalQuestion.text= "Total Questions: $totalQuestions"
        tv_correctAnswer.text= "Correct Answers: $correctAnswers"
        tv_passingPercentage.text= "Passing Percentage: $passingPercentage%"
        tv_resultPercentage.text= "Result Percentage: $resultPercentage%"

        val textColor = if (passFailStatus=="Pass") {
            //set colors if user passed
            Color.parseColor("#008000")
        }else{
            //set colors if user is failed
            Color.parseColor("#FF0000")
        }

        //set dynamic colors to fields
        tv_passFailStatus.setTextColor(textColor)
        tv_resultPercentage.setTextColor(textColor)

        //set green color to the correct answers
        tv_correctAnswer.setTextColor(Color.parseColor("#008000"))

        // Set up the RecyclerView with a LinearLayoutManager
        val layoutManager = LinearLayoutManager(this)
        feedbackRecyclerView.layoutManager = layoutManager

        // Set up the adapter for the RecyclerView
        val feedbackAdapter = ResultFeedbackAdapter(this, userResponses, selectedField)
        feedbackRecyclerView.adapter = feedbackAdapter

    }


}