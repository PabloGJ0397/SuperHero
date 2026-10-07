package edu.iesam.superhero.feature.superhero.domain

interface SuperheroRepository {
    fun obtainSuperheroes(): List<Superhero>
}