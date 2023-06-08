package com.chatmap.common.domain.usecase

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

abstract class ResultUseCase<R : Any> : UseCase<R>() {

    protected open suspend operator fun invoke(): Result<R> {
        return withContext(Dispatchers.IO) {
            try {
                factory()
            } catch (e: Exception) {
                Result.Failed(e)
            }
        }
    }

    protected abstract suspend fun factory(): Result<R>
}
