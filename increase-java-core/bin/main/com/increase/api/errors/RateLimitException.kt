package com.increase.api.errors

import com.increase.api.core.http.Headers

class RateLimitException(
    headers: Headers,
    body: String,
    error: IncreaseError,
) : IncreaseServiceException(429, headers, body, error)
