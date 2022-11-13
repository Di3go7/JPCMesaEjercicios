package com.example.jpcmesaejercicios.ui.heroes

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.jpcmesaejercicios.entities.Heroe
import com.example.jpcmesaejercicios.respositories.HeroesRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class HeroesViewModel : ViewModel() {

    private val _state = MutableStateFlow(UIState())
    val state = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = UIState(loader = true)
            _state.value = UIState(heroes = HeroesRepository.getHeroes())
        }
    }

    data class UIState(
        val loader: Boolean = false,
        val heroes: List<Heroe> = emptyList()
    )
}