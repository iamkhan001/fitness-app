package com.android.fitnessapp.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.fitnessapp.databinding.FragmentHomeBinding
import com.android.fitnessapp.databinding.FragmentSettingsBinding
import com.android.fitnessapp.ui.base.BaseFragment

class SettingsFragment: BaseFragment<FragmentSettingsBinding>() {

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ) = FragmentSettingsBinding.inflate(inflater, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }


}