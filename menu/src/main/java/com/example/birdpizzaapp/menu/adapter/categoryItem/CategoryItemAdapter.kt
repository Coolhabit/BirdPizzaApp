package com.example.birdpizzaapp.menu.adapter.categoryItem

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.example.birdpizzaapp.domain.entities.CategoryItem
import com.example.birdpizzaapp.menu.databinding.RvCategoryItemBinding
import javax.inject.Inject

class CategoryItemAdapter @Inject constructor() : ListAdapter<CategoryItem, CategoryItemViewHolder>(
    CategoryItemDiffUtils()
) {

    var onClick: (String) -> Unit = {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryItemViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = RvCategoryItemBinding.inflate(inflater, parent, false)
        return CategoryItemViewHolder(binding) { position ->
            onClick(getItem(position).name)
        }
    }

    override fun onBindViewHolder(holder: CategoryItemViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class CategoryItemDiffUtils : DiffUtil.ItemCallback<CategoryItem>() {

        override fun areItemsTheSame(oldItem: CategoryItem, newItem: CategoryItem): Boolean {
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(oldItem: CategoryItem, newItem: CategoryItem): Boolean {
            return oldItem == newItem
        }
    }
}
