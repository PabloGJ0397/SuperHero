package edu.iesam.superhero.feature.user.data

import edu.iesam.superhero.feature.user.data.local.UserMemLocalDataSource
import edu.iesam.superhero.feature.user.domain.User
import edu.iesam.superhero.feature.user.domain.UserRepository

class UserDataRepository(private val localDataSource: UserMemLocalDataSource) : UserRepository {
    override fun obtainUsers(): List<User> {
        return localDataSource.getAll()
    }

}