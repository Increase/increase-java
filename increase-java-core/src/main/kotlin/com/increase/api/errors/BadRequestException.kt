package com.increase.api.errors

import com.increase.api.core.http.Headers

class BadRequestException(
        headers: Headers,
        body: String,
        error: IncreaseError,
) : IncreaseServiceException(400, headers, body, error)
