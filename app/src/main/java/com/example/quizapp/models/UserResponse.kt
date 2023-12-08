package com.example.quizapp.models

import android.os.Parcel
import android.os.Parcelable
import com.example.quizapp.viewmodels.QuizViewModel

data class UserResponse(
    val questionText: String,
    val selectedAnswer: String,
    ) : Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readString() ?: "",
        parcel.readString() ?: "",
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(questionText)
        parcel.writeString(selectedAnswer)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<UserResponse> {
        override fun createFromParcel(parcel: Parcel): UserResponse {
            return UserResponse(parcel)
        }

        override fun newArray(size: Int): Array<UserResponse?> {
            return arrayOfNulls(size)
        }
    }

    // Check if the user response is correct, considering null values
    fun isCorrect(field: String): Boolean {
        val correctAnswer = QuizViewModel().getAnswersForField(field)[questionText]
        return selectedAnswer == correctAnswer
    }
}