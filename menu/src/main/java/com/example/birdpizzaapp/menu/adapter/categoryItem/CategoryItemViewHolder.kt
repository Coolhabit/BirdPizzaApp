package com.example.birdpizzaapp.menu.adapter.categoryItem

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
    }
}
