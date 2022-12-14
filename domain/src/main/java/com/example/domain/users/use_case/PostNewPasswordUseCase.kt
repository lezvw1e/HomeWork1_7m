package com.example.domain.users.use_case

import com.example.domain.users.model.SetNewPassword
import com.example.domain.users.repository.UserRepository
import javax.inject.Inject

class PostNewPasswordUseCase @Inject constructor(
    private val repo: UserRepository
) {

    suspend operator fun invoke(setNewPassword: SetNewPassword) =
        repo.postNewPassword(setNewPassword)
}