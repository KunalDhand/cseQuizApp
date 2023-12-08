// QuestionAdapter.kt
package com.example.quizapp.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import androidx.core.view.marginBottom
import androidx.recyclerview.widget.RecyclerView
import com.example.quizapp.R
import com.example.quizapp.activities.QuizActivity
import com.example.quizapp.activities.ResultActivity
import com.example.quizapp.models.UserResponse
import com.example.quizapp.models.Question

class QuestionAdapter(private val questions: List<Question>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val userResponses = mutableMapOf<Int, String>()

    companion object {
        private const val VIEW_TYPE_QUESTION = 0
        private const val VIEW_TYPE_SUBMIT_BUTTON = 1
    }

    inner class QuestionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val questionText: TextView = itemView.findViewById(R.id.questionText)
        val radioGroup: RadioGroup = itemView.findViewById(R.id.radioGroup)
        val radioButtonA: RadioButton = itemView.findViewById(R.id.radioButtonA)
        val radioButtonB: RadioButton = itemView.findViewById(R.id.radioButtonB)
        val radioButtonC: RadioButton = itemView.findViewById(R.id.radioButtonC)
        val radioButtonD: RadioButton = itemView.findViewById(R.id.radioButtonD)

        fun setCheckedChangeListener(position: Int) {
            radioGroup.setOnCheckedChangeListener { _, checkedId ->
                val selectedAnswer: String = when (checkedId) {
                    R.id.radioButtonA -> questions[position].optionA
                    R.id.radioButtonB -> questions[position].optionB
                    R.id.radioButtonC -> questions[position].optionC
                    R.id.radioButtonD -> questions[position].optionD
                    else -> ""
                }
                // Save the selected answer
                userResponses[position] = selectedAnswer
            }
        }
    }

    inner class SubmitButtonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val submitButton: Button = itemView.findViewById(R.id.submitButton)

        init {
            submitButton.setTextColor(ContextCompat.getColor(itemView.context, R.color.white))
            submitButton.setBackgroundColor(ContextCompat.getColor(itemView.context, R.color.buttonColor))
            // Handle the submit button click here
            submitButton.setOnClickListener {
                // Get user responses from the adapter
                val userResponsesList = getUserResponses()

                // Call the submitQuiz function in QuizActivity
                (itemView.context as QuizActivity).submitQuiz(userResponsesList)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            VIEW_TYPE_QUESTION -> {
                val itemView = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_question, parent, false)
                QuestionViewHolder(itemView)
            }
            VIEW_TYPE_SUBMIT_BUTTON -> {
                val itemView = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_submit_button, parent, false)
                SubmitButtonViewHolder(itemView)
            }
            else -> throw IllegalArgumentException("Invalid viewType")
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is QuestionViewHolder -> {
                val question = questions[position]

                // Set the question text
                holder.questionText.text = question.text

                // Set the answer choices
                holder.radioButtonA.text = question.optionA
                holder.radioButtonB.text = question.optionB
                holder.radioButtonC.text = question.optionC
                holder.radioButtonD.text = question.optionD

                //Set a listener to capture the selected answer
                holder.setCheckedChangeListener(position)
            }
            is SubmitButtonViewHolder -> {

            }
        }
    }

    override fun getItemCount(): Int {
        // Add 1 to include the submit button as the last item
        return questions.size + 1
    }

    override fun getItemViewType(position: Int): Int {
        return if (position == questions.size) {
            VIEW_TYPE_SUBMIT_BUTTON
        } else {
            VIEW_TYPE_QUESTION
        }
    }

    fun getUserResponses(): List<UserResponse> {
        val responses = mutableListOf<UserResponse>()
        for ((position, answer) in userResponses) {
            val question = questions[position]
            responses.add(UserResponse(question.text, answer))
        }
        return responses
    }
}