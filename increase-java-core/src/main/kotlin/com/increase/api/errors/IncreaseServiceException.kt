package com.increase.api.errors

import com.google.common.collect.ListMultimap

abstract class IncreaseServiceException
@JvmOverloads
constructor(
        private val statusCode: Int,
        private val headers: ListMultimap<String, String>,
        private val body: String,
        private val error: IncreaseError,
        message: String = "$statusCode: $error",
        cause: Throwable? = null
) : IncreaseException(message, cause) {

    fun statusCode(): Int = statusCode

    fun headers(): ListMultimap<String, String> = headers

    fun body(): String = body

    fun error(): IncreaseError = error
}
