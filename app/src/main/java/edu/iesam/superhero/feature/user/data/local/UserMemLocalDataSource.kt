package edu.iesam.superhero.feature.user.data.local

import edu.iesam.superhero.feature.user.domain.User

class UserMemLocalDataSource {
    private val localUsers = mutableListOf(
        User("John", "Doe", "12345678A"),
        User("Jane", "Austin", "12345678B"),
        User("Paul", "Johnson", "1234567C")
    )

    fun getAll() = localUsers


}