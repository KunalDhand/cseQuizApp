package com.example.quizapp.adapters

// ResultFeedbackAdapter.kt
import android.content.Context
import android.graphics.Color
import android.graphics.Color.parseColor
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.graphics.toColor
//import androidx.compose.ui.graphics.Color
import androidx.recyclerview.widget.RecyclerView
import com.example.quizapp.R
import com.example.quizapp.activities.ResultActivity
import com.example.quizapp.models.UserResponse
import com.example.quizapp.viewmodels.QuizViewModel
//import kotlinx.coroutines.flow.internal.NoOpContinuation.context
//import kotlin.coroutines.jvm.internal.CompletedContinuation.context

class ResultFeedbackAdapter(private val context: Context, private val userResponses: List<UserResponse>, private val field: String) :
    RecyclerView.Adapter<ResultFeedbackAdapter.FeedbackViewHolder>() {

    inner class FeedbackViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val questionText: TextView = itemView.findViewById(R.id.questionText)
        val userAnswer: TextView = itemView.findViewById(R.id.userAnswer)
        val correctAnswer: TextView = itemView.findViewById(R.id.correctAnswer)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeedbackViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_result_feedback, parent, false)

        return FeedbackViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: FeedbackViewHolder, position: Int) {
        val response = userResponses[position]

        // Set the question text
        holder.questionText.text = response.questionText

        // Set the user's answer
        holder.userAnswer.text = "Your Answer: ${response.selectedAnswer}"

        // Set the correct answer
        holder.correctAnswer.text = "Correct Answer: ${QuizViewModel().getAnswersForField(field)[response.questionText]}"

        var textColor= Color.BLACK
        var textSize = context.resources.getDimension(R.dimen.normal_text_size)
        //var textSize = context.resources.getDimension(R.dimen.custom_text_size)
        // Set text colors based on conditions
        if (response.selectedAnswer == QuizViewModel().getAnswersForField(field)[response.questionText]) {
            // User's answer matches the correct answer
            textColor=parseColor("#008000")
        } else {
            // User's answer does not match the correct answer
            textColor=parseColor("#FF0000")
            textSize= context.resources.getDimension(R.dimen.large_text_size)
            holder.userAnswer.setTextSize(textSize)
        }

        holder.userAnswer.setTextColor(textColor)
    }


    override fun getItemCount(): Int {
        return userResponses.size
    }
}
