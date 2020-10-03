package com.example.mvvmsampleapp.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmsampleapp.R
import com.example.mvvmsampleapp.databinding.ActivityMainBinding
import com.example.mvvmsampleapp.utils.toast

class LoginActivity : AppCompatActivity(), AuthListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val viewModel = ViewModelProvider(this).get(AuthViewModel::class.java)

        binding.viewModel = viewModel
        viewModel.authListener = this
    }

    override fun onStarted() {
        toast("Started")
    }

    override fun onSuccess() {
        toast("Success")
    }

    override fun onFailure(message: String) {
        toast(message)
    }
}
