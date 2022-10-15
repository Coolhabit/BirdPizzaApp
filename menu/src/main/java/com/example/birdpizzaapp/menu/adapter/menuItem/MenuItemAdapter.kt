package com.example.birdpizzaapp.menu.adapter.menuItem

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.example.birdpizzaapp.domain.entities.Food
import com.example.birdpizzaapp.menu.databinding.RvMenuitemCardBinding
import javax.inject.Inject

class MenuItemAdapter @Inject constructor() : ListAdapter<Food, MenuItemViewHolder>(
    MenuItemDiffUtils()
) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuItemViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = RvMenuitemCardBinding.inflate(inflater, parent, false)
        return MenuItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MenuItemViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class MenuItemDiffUtils : DiffUtil.ItemCallback<Food>() {

        override fun areItemsTheSame(oldItem: Food, newItem: Food): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Food, newItem: Food): Boolean {
            return oldItem == newItem
        }
    }
}
