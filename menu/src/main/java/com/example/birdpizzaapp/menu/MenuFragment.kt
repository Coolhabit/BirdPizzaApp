package com.example.birdpizzaapp.menu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.birdpizzaapp.baseui.presentation.base.BaseFragment
import com.example.birdpizzaapp.baseui.presentation.base.ItemDecoration
import com.example.birdpizzaapp.menu.adapter.bannerItem.BannerItemAdapter
import com.example.birdpizzaapp.menu.adapter.categoryItem.CategoryItemAdapter
import com.example.birdpizzaapp.menu.adapter.menuItem.MenuItemAdapter
import com.example.birdpizzaapp.menu.databinding.FragmentMenuBinding
import kotlinx.coroutines.flow.collectLatest
import javax.inject.Inject
private const val PIZZA = "pizza"

class MenuFragment : BaseFragment(R.layout.fragment_menu) {

    private lateinit var binding: FragmentMenuBinding
    private val viewModel by viewModels<MenuViewModel>()

    @Inject
    lateinit var menuAdapter: MenuItemAdapter

    @Inject
    lateinit var bannerAdapter: BannerItemAdapter

    @Inject
    lateinit var categoriesAdapter: CategoryItemAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.initContent(PIZZA)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMenuBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvPizzaList.apply {
            adapter = menuAdapter
            itemAnimator = null
            addItemDecoration(
                ItemDecoration(
                    context,
                    top = R.dimen.spacing_8,
                    right = R.dimen.spacing_8,
                    left = R.dimen.spacing_8,
                    bottom = R.dimen.spacing_8,
                )
            )
            layoutManager =
                LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        }

        binding.rvAds.apply {
            adapter = bannerAdapter
            itemAnimator = null
            addItemDecoration(
                ItemDecoration(
                    context,
                    top = R.dimen.spacing_8,
                    right = R.dimen.spacing_8,
                    left = R.dimen.spacing_8,
                    bottom = R.dimen.spacing_8,
                )
            )
            layoutManager =
                LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        }

        binding.rvCategories.apply {
            adapter = categoriesAdapter
            itemAnimator = null
            addItemDecoration(
                ItemDecoration(
                    context,
                    top = R.dimen.spacing_8,
                    right = R.dimen.spacing_8,
                    left = R.dimen.spacing_8,
                    bottom = R.dimen.spacing_8,
                )
            )
            layoutManager =
                LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        }

        categoriesAdapter.onClick = { categoryName ->
            viewModel.initContent(categoryName)
        }

        lifecycleScope.launchWhenStarted {
            viewModel.loadData.collectLatest {
                menuAdapter.submitList(it.foodList)
                bannerAdapter.submitList(it.bannerList)
                categoriesAdapter.submitList(it.categoriesList)
            }
        }
    }
}
