package com.gra_dus.authorization.presentation

import android.app.Activity
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment

import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.gra_dus.authorization.R
import com.gra_dus.authorization.databinding.ActivityMainBinding
import com.gra_dus.authorization.databinding.WelcomeFragmentBinding
import com.gra_dus.authorization.model.LoginViewModel
import com.gra_dus.authorization.model.WelcomeViewModel
import kotlinx.android.synthetic.main.welcome_fragment.*

class WelcomeFragment : Fragment() {

    companion object {
        fun newInstance() = WelcomeFragment()
    }
    private lateinit var viewModel: WelcomeViewModel
    lateinit var binding: WelcomeFragmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this.requireActivity(), R.layout.welcome_fragment)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.executePendingBindings()
        btn_signOut.setOnClickListener{
            val action = WelcomeFragmentDirections.actionWelcomeFragmentToLoginFragment()
            view.findNavController().navigate(action)
        }
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(WelcomeViewModel::class.java)
        // TODO: Use the ViewModel
    }

}