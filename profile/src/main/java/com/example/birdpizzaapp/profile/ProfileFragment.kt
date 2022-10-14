package com.example.birdpizzaapp.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.birdpizzaapp.baseui.presentation.base.BaseFragment
import com.example.birdpizzaapp.profile.databinding.FramentProfileBinding

class ProfileFragment : BaseFragment(R.layout.frament_profile) {

    private lateinit var binding: FramentProfileBinding
    private val viewModel by viewModels<ProfileViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        viewModel.initContent(null)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FramentProfileBinding.inflate(inflater, container, false)
        return binding.root
    }
}
