package edu.iesam.superhero.feature.user.domain

interface UserRepository {
    fun obtainUsers(): List<User>

}