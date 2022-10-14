package com.example.birdpizzaapp.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import androidx.core.view.updatePadding
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.birdpizzaapp.R
import com.example.birdpizzaapp.databinding.ActivityMainBinding
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : AppCompatActivity(), NavController.OnDestinationChangedListener {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private lateinit var binding: ActivityMainBinding

    private val viewModel: MainActivityViewModel by lazy {
        viewModelFactory.create(
            MainActivityViewModel::class.java
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.bottomNavigationView.setupWithNavController(
            getNavController().apply {
                addOnDestinationChangedListener(this@MainActivity)
            }
        )

        binding.bottomNavigationView.setOnItemReselectedListener {
            getNavController().apply {
                popBackStack(it.itemId, true)
                navigate(it.itemId)
            }
        }
    }

    override fun onDestinationChanged(
        controller: NavController,
        destination: NavDestination,
        arguments: Bundle?,
    ) {
        binding.bottomNavigationView.updatePadding(bottom = 0)
    }

    private fun getNavController(): NavController {
        return (supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment).navController
    }

    fun handleBottomNavigationVisibility(showBottomNavigationView: Boolean) {
        binding.bottomNavigationView.isVisible = showBottomNavigationView
    }
}
