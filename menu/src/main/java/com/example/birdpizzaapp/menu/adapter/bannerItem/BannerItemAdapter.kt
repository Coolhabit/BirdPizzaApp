package com.example.birdpizzaapp.menu.adapter.bannerItem

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.example.birdpizzaapp.domain.entities.BannerItem
import com.example.birdpizzaapp.menu.databinding.RvBannerItemBinding
import javax.inject.Inject

class BannerItemAdapter @Inject constructor() : ListAdapter<BannerItem, BannerItemViewHolder>(
    BannerItemDiffUtils()
) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BannerItemViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = RvBannerItemBinding.inflate(inflater, parent, false)

        val context = binding.root.context.applicationContext
        binding.root.layoutParams.width =
            (context.resources.displayMetrics.widthPixels * 0.85).toInt()

        return BannerItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BannerItemViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class BannerItemDiffUtils : DiffUtil.ItemCallback<BannerItem>() {

        override fun areItemsTheSame(oldItem: BannerItem, newItem: BannerItem): Boolean {
            return oldItem.image == newItem.image
        }

        override fun areContentsTheSame(oldItem: BannerItem, newItem: BannerItem): Boolean {
            return oldItem == newItem
        }
    }
}
