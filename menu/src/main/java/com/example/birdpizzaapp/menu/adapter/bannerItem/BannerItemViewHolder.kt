package com.example.birdpizzaapp.menu.adapter.bannerItem

import androidx.recyclerview.widget.RecyclerView
import com.example.birdpizzaapp.baseui.extensions.load
import com.example.birdpizzaapp.domain.entities.BannerItem
import com.example.birdpizzaapp.menu.databinding.RvBannerItemBinding

class BannerItemViewHolder(private val binding: RvBannerItemBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(item: BannerItem) {
        binding.bannerImage.load(item.image)
    }
}
