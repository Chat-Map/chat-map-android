package com.chatmap.chats.impl

import com.chatmap.common.domain.models.Chat
import com.chatmap.common.domain.usecase.FlowUseCase
import kotlinx.coroutines.channels.ProducerScope
import javax.inject.Inject

class GetChatsUseCase @Inject constructor() : FlowUseCase<List<Chat>>() {

    context(ProducerScope<Result<List<Chat>>>) override suspend fun factory() {
        trySend(
            Result.Successful(
                listOf(
                    Chat(1, "Tom"),
                    Chat(2, "Bob"),
                    Chat(3, "Mike"),
                    Chat(4, "Leo"),
                )
            )
        )
    }
}
