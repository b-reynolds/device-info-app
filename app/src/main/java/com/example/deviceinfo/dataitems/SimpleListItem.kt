package com.example.deviceinfo.dataitems

import com.example.deviceinfo.R
import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import com.xwray.groupie.kotlinandroidextensions.Item
import kotlinx.android.synthetic.main.item_key_value.firstLabel
import kotlinx.android.synthetic.main.item_key_value.firstValue

/**
 * A simple model object for displaying an item in a Groupie adapter.
 */
open class SimpleListItem(private val label: Int, private val value: String? = "") : Item() {

    override fun getLayout() = R.layout.item_key_value

    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
        viewHolder.containerView.context.apply {
            viewHolder.firstLabel.text = getString(label)
            viewHolder.firstValue.text = value
        }
    }
}
