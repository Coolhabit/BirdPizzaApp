package com.example.birdpizzaapp.menu.adapter.categoryItem

import android.annotation.SuppressLint
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.birdpizzaapp.domain.entities.CategoryItem
import com.example.birdpizzaapp.menu.databinding.RvCategoryItemBinding

class CategoryItemViewHolder(
    private val binding: RvCategoryItemBinding,
    private val onClick: (Int) -> Unit,
) :
    RecyclerView.ViewHolder(binding.root) {

    init {
        binding.root.setOnClickListener {
            onClick.invoke(bindingAdapterPosition)
        }
    }

    fun bind(item: CategoryItem) {
        binding.categoryTitle.text = item.name
        isSelectedCheck(item.isSelected)
    }

    @SuppressLint("ResourceAsColor")
    fun isSelectedCheck(selected: Boolean) {
        if(selected) {
            binding.cardRoot.setBackgroundColor(ContextCompat.getColor(binding.root.context, com.example.birdpizzaapp.baseui.R.color.accent_pink))
            binding.categoryTitle.setTextColor(ContextCompat.getColor(binding.root.context, com.example.birdpizzaapp.baseui.R.color.white))
        } else {
            binding.cardRoot.setBackgroundColor(ContextCompat.getColor(binding.root.context, com.example.birdpizzaapp.baseui.R.color.white))
            binding.categoryTitle.setTextColor(ContextCompat.getColor(binding.root.context, com.example.birdpizzaapp.baseui.R.color.bottom_nav_grey))
        }
    }
}
