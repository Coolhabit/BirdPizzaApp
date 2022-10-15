package com.example.birdpizzaapp.menu

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.birdpizzaapp.domain.entities.MenuData
import com.example.birdpizzaapp.domain.usecases.MenuUseCase
import com.example.birdpizzaapp.menu.model.toPresentation
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

class MenuViewModel @Inject constructor(private val useCase: MenuUseCase) : ViewModel() {

    companion object {
        private const val PIZZA = "Pizza"
    }

    private val _loadData = MutableSharedFlow<MenuData>()
    val loadData = _loadData.asSharedFlow()

    fun initContent() {
        viewModelScope.launch {
            _loadData.emit(useCase.loadScreenData(PIZZA).toPresentation(PIZZA))
        }
    }

    fun refreshData(categoryName: String) {
        viewModelScope.launch {
            _loadData.emit(useCase.loadScreenData(categoryName).toPresentation(categoryName))
        }
    }
}
