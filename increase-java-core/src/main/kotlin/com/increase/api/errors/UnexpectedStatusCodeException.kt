package com.increase.api.errors

import com.google.common.collect.ListMultimap

class UnexpectedStatusCodeException(
        statusCode: Int,
        headers: ListMultimap<String, String>,
        body: String,
        error: IncreaseError,
) : IncreaseServiceException(statusCode, headers, body, error)
