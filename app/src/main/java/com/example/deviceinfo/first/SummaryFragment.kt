package com.example.deviceinfo.first

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.deviceinfo.R
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder
import com.xwray.groupie.groupiex.plusAssign

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class SummaryFragment : Fragment(R.layout.fragment_list) {
    private val viewModel by viewModels<SummaryViewModel>()

    private val groupAdapter = GroupAdapter<GroupieViewHolder>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        groupAdapter += viewModel.getDataItems(requireContext())
        view.findViewById<RecyclerView>(R.id.firstRecyclerView).apply {
            adapter = groupAdapter
            layoutManager = LinearLayoutManager(requireContext())
            setHasFixedSize(true)
        }
    }
}
