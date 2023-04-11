package com.increase.api.errors

import com.google.common.collect.ListMultimap

class UnauthorizedException
constructor(
        headers: ListMultimap<String, String>,
        private val error: IncreaseError,
) : IncreaseServiceException(headers, "${error}") {
    override fun statusCode(): Int = 401
    fun error(): IncreaseError = error
}
