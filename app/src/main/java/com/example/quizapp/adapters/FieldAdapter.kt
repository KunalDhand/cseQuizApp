package com.example.quizapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.quizapp.R

class FieldAdapter(
    private val fields: Array<Pair<String, Int>>,
    private val onItemClick: (String) -> Unit
) : RecyclerView.Adapter<FieldAdapter.FieldViewHolder>() {

    inner class FieldViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val fieldText: TextView = itemView.findViewById(R.id.fieldText)
        val fieldLogo: ImageView = itemView.findViewById(R.id.fieldLogo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FieldViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_field, parent, false)

        return FieldViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: FieldViewHolder, position: Int) {
        val (fieldName, fieldLogoResId) = fields[position]
        holder.fieldText.text = fieldName
        holder.fieldLogo.setImageResource(fieldLogoResId)

        // Set click listener to handle item selection
        holder.itemView.setOnClickListener {
            onItemClick(fieldName)
        }
    }

    override fun getItemCount(): Int {
        return fields.size
    }
}
