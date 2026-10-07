package edu.iesam.superhero.feature.superhero.data

import edu.iesam.superhero.feature.superhero.data.local.SuperheroMemLocalDataSource
import edu.iesam.superhero.feature.superhero.domain.Superhero
import edu.iesam.superhero.feature.superhero.domain.SuperheroRepository

class SuperheroDataRepository (val localDataSource: SuperheroMemLocalDataSource): SuperheroRepository {
    override fun obtainSuperheroes(): List<Superhero> {
        return localDataSource.getAll()
    }

}