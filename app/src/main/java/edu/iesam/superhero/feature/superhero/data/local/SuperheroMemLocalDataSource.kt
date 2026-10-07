package edu.iesam.superhero.feature.superhero.data.local

import edu.iesam.superhero.feature.superhero.domain.Superhero

class SuperheroMemLocalDataSource {
    private val localSuperheroes = mutableListOf(
        Superhero("Superman", "1A","1A-Superman", "url1"),
        Superhero("Spiderman","1B","1B-Spider-man", "url2"),
        Superhero("Green Lantern", "1C", "1C-Green-Lantern","url3")
    )

    fun getAll() = localSuperheroes
}