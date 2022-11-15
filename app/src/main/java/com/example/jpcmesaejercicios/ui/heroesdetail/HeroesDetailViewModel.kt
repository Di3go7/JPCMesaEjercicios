package com.example.jpcmesaejercicios.ui.heroesdetail

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.jpcmesaejercicios.entities.Hero
import com.example.jpcmesaejercicios.respositories.HeroesRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class HeroesDetailViewModel(
    savedStateHandle: SavedStateHandle,
) : ViewModel() {

    private val heroId: Int = checkNotNull(savedStateHandle["heroId"])

    private val _state = MutableStateFlow(UIState())
    val state = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = UIState(loader = true)
            _state.value = UIState(hero = HeroesRepository.getHero(heroId))
        }
    }

    data class UIState(
        val loader: Boolean = false,
        val hero: Hero? = null
    )
}
