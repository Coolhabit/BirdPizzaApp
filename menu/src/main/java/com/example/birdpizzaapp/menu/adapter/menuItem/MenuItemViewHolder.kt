package com.example.birdpizzaapp.menu.adapter.menuItem

import androidx.recyclerview.widget.RecyclerView
import com.example.birdpizzaapp.baseui.extensions.load
import com.example.birdpizzaapp.domain.entities.Food
import com.example.birdpizzaapp.menu.databinding.RvMenuitemCardBinding

class MenuItemViewHolder(
    private val binding: RvMenuitemCardBinding,
    private val onCartClick: (Int) -> Unit,
) : RecyclerView.ViewHolder(binding.root) {

    init {
        binding.addToCart.setOnClickListener {
            onCartClick.invoke(bindingAdapterPosition)

        }
    }

    fun bind(item: Food) {
        binding.menuItemTitle.text = item.title
        binding.menuItemImage.load(item.image)
    }
}
