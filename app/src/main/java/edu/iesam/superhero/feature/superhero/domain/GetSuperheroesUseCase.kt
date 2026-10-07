package edu.iesam.superhero.feature.superhero.domain

import edu.iesam.superhero.feature.superhero.data.SuperheroDataRepository

class GetSuperheroesUseCase (private val superheroRepository: SuperheroRepository) {
    operator fun invoke(){
        superheroRepository.obtainSuperheroes()

    }
}