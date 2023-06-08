package com.chatmap.common.domain.usecase

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.ProducerScope
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.launch

abstract class FlowUseCase<R : Any> : UseCase<R>() {

    operator fun invoke(): Flow<Result<R>> = callbackFlow {
        val job = launch(Dispatchers.IO) {
            trySend(Result.Suspended)

            try {
                factory()
            } catch (e: Exception) {
                trySend(Result.Failed(e))
            }
        }

        awaitClose {
            job.cancel()
        }
    }

    context (ProducerScope<Result<R>>)
    protected abstract suspend fun factory()
}
