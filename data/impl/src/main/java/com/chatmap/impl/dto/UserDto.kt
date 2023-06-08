package com.chatmap.impl.dto

import com.chatmap.common.domain.models.User
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UserDto(
    val id: Long,
    @SerialName("first_name")
    val firstName: String,
    @SerialName("last_name")
    val lastName: String,
    val phone: String,
    val email: String,
    val password: String
) {
    fun toUser(): User {
        return User(
            id = id,
            firstName = firstName,
            lastName = lastName,
            phone = phone,
            email = email,
            password = password
        )
    }
}
