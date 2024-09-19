package com.increase.api.errors

import com.google.common.collect.ListMultimap

class UnauthorizedException(
        headers: ListMultimap<String, String>,
        body: String,
        error: IncreaseError,
) : IncreaseServiceException(401, headers, body, error)
