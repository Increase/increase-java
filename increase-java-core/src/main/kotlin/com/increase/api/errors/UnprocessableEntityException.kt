package com.increase.api.errors

import com.google.common.collect.ListMultimap

class UnprocessableEntityException
constructor(
        headers: ListMultimap<String, String>,
        private val error: IncreaseError,
) : IncreaseServiceException(headers, "${error}") {
    override fun statusCode(): Int = 422
    fun error(): IncreaseError = error
}
