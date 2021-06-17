package com.gra_dus.authorization.presentation

import android.app.Activity
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment

import androidx.databinding.DataBindingUtil
import com.gra_dus.authorization.R
import com.gra_dus.authorization.databinding.ActivityMainBinding
import com.gra_dus.authorization.databinding.WelcomeFragmentBinding
import com.gra_dus.authorization.model.LoginViewModel
import com.gra_dus.authorization.model.WelcomeViewModel

class WelcomeFragment : Fragment() {

    companion object {
        fun newInstance() = WelcomeFragment()
    }
    private lateinit var viewModel: WelcomeViewModel
    lateinit var binding: WelcomeFragmentBinding
    var mainViewModel = WelcomeViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this.requireActivity(), R.layout.welcome_fragment)
        binding.executePendingBindings()
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(WelcomeViewModel::class.java)
        // TODO: Use the ViewModel
    }

}