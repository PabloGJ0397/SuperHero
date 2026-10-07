package edu.iesam.superhero.feature.user.presentation

import androidx.lifecycle.ViewModel
import edu.iesam.superhero.feature.user.domain.GetUsersUseCase

class UserMainViewModel (private val getUsersUseCase: GetUsersUseCase) : ViewModel() {

    fun getUsers() = getUsersUseCase.invoke()
}