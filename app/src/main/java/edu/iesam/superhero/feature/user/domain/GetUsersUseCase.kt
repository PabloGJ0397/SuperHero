package edu.iesam.superhero.feature.user.domain

class GetUsersUseCase(private val userRepository: UserRepository) {
    operator fun invoke(): List<User> {
        return userRepository.obtainUsers()
    }

}