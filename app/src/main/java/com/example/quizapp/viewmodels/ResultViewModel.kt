package com.example.quizapp.viewmodels

// ResultViewModel.kt

import android.graphics.Color
import androidx.lifecycle.ViewModel
import com.example.quizapp.models.UserResponse

// ResultViewModel.kt
class ResultViewModel : ViewModel() {

    fun calculateResultStatus(
        userResponses: List<UserResponse>,
        selectedField: String,
    ): List<Any> {
        //constants
        val totalQuestions=10
        val passingPercentage= 70

        // Calculate the number of correct answers
        val correctAnswers = userResponses.count { it.isCorrect(selectedField) }

        // Calculate the result in percentage
        val resultPercentage = (correctAnswers * 100) / totalQuestions

        // Determine pass/fail status
        val passFailStatus = if (resultPercentage >= passingPercentage) {
            "Pass"
        } else {
            "Fail"
        }

        // Build the result string with additional information
        return buildResultString(passFailStatus, totalQuestions, correctAnswers, passingPercentage, resultPercentage)
    }

    private fun buildResultString(
        passFailStatus: String,
        totalQuestions: Int,
        correctAnswers: Int,
        passingPercentage: Int,
        resultPercentage: Int

    ): List<Any> {
        return listOf<Any>(passFailStatus, totalQuestions, correctAnswers, passingPercentage, resultPercentage)
    }
}