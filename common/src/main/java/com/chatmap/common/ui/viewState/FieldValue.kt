package com.chatmap.common.ui.viewState

data class FieldValue<T>(val value: T, val isValid: Boolean) {
    fun invalidValue(): FieldValue<T> {
        return this.copy(isValid = false)
    }
}

inline fun <reified T> fieldValue(defaultValue: T, isValid: Boolean = true) = FieldValue(defaultValue, isValid)

inline fun <reified T> fieldNullableValue() = FieldValue<T?>(null, true)
