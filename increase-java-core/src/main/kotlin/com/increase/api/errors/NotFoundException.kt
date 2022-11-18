package com.increase.api.errors

import com.google.common.collect.ListMultimap

class NotFoundException
constructor(
    headers: ListMultimap<String, String>,
    private val error: IncreaseError,
) : IncreaseServiceException(headers, "${error}") {
    override fun statusCode(): Int = 404
    fun error(): IncreaseError = error
}
