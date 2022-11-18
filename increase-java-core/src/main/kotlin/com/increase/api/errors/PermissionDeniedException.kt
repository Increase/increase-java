package com.increase.api.errors

import com.google.common.collect.ListMultimap

class PermissionDeniedException
constructor(
    headers: ListMultimap<String, String>,
    private val error: IncreaseError,
) : IncreaseServiceException(headers, "${error}") {
    override fun statusCode(): Int = 403
    fun error(): IncreaseError = error
}
