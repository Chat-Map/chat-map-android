package com.chatmap.common.domain.usecase

open class UseCase<T> {

    companion object {

        inline fun <T : Any> Result<T>.use(block: (T) -> Unit) {
            when (this) {
                is Result.Successful -> block(data)
                is Result.Failed -> throw FailedResultException(exception)
                else -> Unit
            }
        }

        @Suppress("NOTHING_TO_INLINE")
        inline fun <T : Any> Result<T>.extractResult(): T {
            return when (this) {
                is Result.Successful -> data
                is Result.Failed -> throw FailedResultException(exception)
                else -> throw IllegalResultException()
            }
        }

        class FailedResultException(exception: Exception) : Exception(exception)
        class IllegalResultException : Exception()

    }

    sealed class Result<out T : Any> {
        object Suspended : Result<Nothing>()
        data class Successful<T : Any>(val data: T) : Result<T>()
        data class Failed(val exception: Exception) : Result<Nothing>()
    }
}
