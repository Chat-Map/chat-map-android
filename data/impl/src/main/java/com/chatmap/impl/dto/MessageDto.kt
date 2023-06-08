package com.chatmap.impl.dto

import com.chatmap.common.domain.models.Message
import kotlinx.serialization.Serializable
import java.text.DateFormat
import java.util.Date

@Serializable
data class MessageDto(
    val id: Long,
    val chatId: Long,
    val senderId: Long,
    val content: String,
    val createdAt: Long,
) {
    fun toMessage(): Message {
        val date = Date(createdAt)
        val formattedDate = DateFormat
            .getDateInstance(DateFormat.DEFAULT)
            .format(date)
        return Message(
            id = id,
            chatId = chatId,
            senderId = senderId,
            content = content,
            createdAt = formattedDate
        )
    }
}
