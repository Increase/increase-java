package com.increase.api.errors

import com.increase.api.core.http.Headers

class InternalServerException(
        statusCode: Int,
        headers: Headers,
        body: String,
        error: IncreaseError,
) : IncreaseServiceException(statusCode, headers, body, error)
