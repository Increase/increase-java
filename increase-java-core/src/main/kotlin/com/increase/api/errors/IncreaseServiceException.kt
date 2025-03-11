package com.increase.api.errors

import com.increase.api.core.http.Headers

abstract class IncreaseServiceException
@JvmOverloads
constructor(
        private val statusCode: Int,
        private val headers: Headers,
        private val body: String,
        private val error: IncreaseError,
        message: String = "$statusCode: $error",
        cause: Throwable? = null
) : IncreaseException(message, cause) {

    fun statusCode(): Int = statusCode

    fun headers(): Headers = headers

    fun body(): String = body

    fun error(): IncreaseError = error
}
