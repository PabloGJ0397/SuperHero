package edu.iesam.superhero.feature.superhero.presentation

import androidx.lifecycle.ViewModel
import edu.iesam.superhero.feature.superhero.domain.GetSuperheroesUseCase

class SuperHeroListViewModel (val getSuperheroesUseCase: GetSuperheroesUseCase) : ViewModel() {
    fun getSuperheroes() = getSuperheroesUseCase.invoke()

}