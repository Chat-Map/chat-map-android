package com.chatmap.common.domain.models

data class User(
    val id: Long,
    val firstName: String,
    val lastName: String,
    val phone: String,
    val email: String,
    val password: String
)
