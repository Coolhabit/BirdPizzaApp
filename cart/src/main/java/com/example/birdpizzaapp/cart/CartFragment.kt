package com.example.birdpizzaapp.cart

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.birdpizzaapp.baseui.presentation.base.BaseFragment
import com.example.birdpizzaapp.cart.databinding.FragmentCartBinding

class CartFragment : BaseFragment(R.layout.fragment_cart) {

    private lateinit var binding: FragmentCartBinding
    private val viewModel by viewModels<CartViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        viewModel.initContent(null)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCartBinding.inflate(inflater, container, false)
        return binding.root
    }
}
