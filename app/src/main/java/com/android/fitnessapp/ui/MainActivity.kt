package com.android.fitnessapp.ui

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.setupWithNavController
import com.android.fitnessapp.R
import com.android.fitnessapp.databinding.ActivityMainBinding
import com.android.fitnessapp.ui.base.BaseActivity

class MainActivity : BaseActivity<MainViewModel, ActivityMainBinding>() {

    override val mViewModel: MainViewModel by viewModels()

    private var navController: NavController? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        navController = Navigation.findNavController(this, R.id.nav_host_fragment)
        navController?.addOnDestinationChangedListener { _, destination, _ ->
            Log.e(TAG,"destination >> ${destination.id} / ${destination.displayName}")
        }

        navController?.let {
            binding.bottomNavigationView.setupWithNavController(it)
        }

    }

    override fun getViewBinding() = ActivityMainBinding.inflate(layoutInflater)

    companion object {
        private const val TAG = "MainActivity"
    }
}