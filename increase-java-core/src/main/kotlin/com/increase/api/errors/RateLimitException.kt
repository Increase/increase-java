package com.increase.api.errors

import com.google.common.collect.ListMultimap

class RateLimitException(
    headers: ListMultimap<String, String>,
    body: String,
    error: IncreaseError,
) : IncreaseServiceException(429, headers, body, error)
