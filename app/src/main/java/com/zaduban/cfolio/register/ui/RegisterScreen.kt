package com.zaduban.cfolio.register.ui

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zaduban.cfolio.R

class RegisterScreen : Fragment() {

    companion object {
        fun newInstance() = RegisterScreen()
    }

    private lateinit var viewModel: RegisterScreenViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.register_screen, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(RegisterScreenViewModel::class.java)
        // TODO: Use the ViewModel
    }

}