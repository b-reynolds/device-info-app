package com.example.deviceinfo.first

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.deviceinfo.R
import com.example.deviceinfo.dataitems.DataItem

/**
 * Provides a basic adapter to display data items in a simple list.
 */
class FirstAdapter : RecyclerView.Adapter<FirstAdapter.ViewHolder>() {

    private var data = listOf<DataItem>()

    /**
     * Updates the data stored within this adapter to a new set.
     */
    fun updateData(newData: List<DataItem>) {
        data = newData
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_first, parent, false)
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(data[position])

    override fun getItemCount() = data.count()

    /**
     * Inner class used for a custom view holder implementation.
     */
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        /**
         * Bind the data in [dataItem] to the current [itemView].
         */
        fun bind(dataItem: DataItem) {
            itemView.findViewById<TextView>(R.id.firstLabel).text = dataItem.label
            itemView.findViewById<TextView>(R.id.firstValue).text = dataItem.value
        }
    }
}
