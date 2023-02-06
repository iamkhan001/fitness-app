package com.android.fitnessapp.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.fitnessapp.databinding.FragmentGoalAddBinding
import com.android.fitnessapp.databinding.FragmentHomeBinding
import com.android.fitnessapp.ui.base.BaseFragment

class AddGoalFragment: BaseFragment<FragmentGoalAddBinding>() {

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ) = FragmentGoalAddBinding.inflate(inflater, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.back.setOnClickListener {
            activity?.onBackPressed()
        }

    }


}