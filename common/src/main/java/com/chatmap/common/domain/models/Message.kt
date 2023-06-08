package com.chatmap.common.domain.models

data class Message(
    val id: Long,
    val chatId: Long,
    val senderId: Long,
    val content: String,
    val createdAt: String,
)
