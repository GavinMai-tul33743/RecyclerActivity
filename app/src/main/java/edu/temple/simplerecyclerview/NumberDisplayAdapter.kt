package edu.temple.simplerecyclerview

import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Step 3: Complete adapter implementation

class NumberDisplayAdapter(_numbers:Array<Int>) : RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>() /* Step 3a: Provide Adapter Parent */ {

    private val numbers = _numbers
    class NumberViewHolder (val textView: TextView) : RecyclerView.ViewHolder (textView) {
        val numView = textView
    }

    //Step 3b: Complete function definitions for adapter
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        TODO("Not yet implemented")

    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        TODO("Not yet implemented")
        holder.numView.setText(numbers[position])

    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
        return numbers.size
    }

}