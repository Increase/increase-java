package com.increase.api.errors

import com.increase.api.core.http.Headers

class UnexpectedStatusCodeException(
        statusCode: Int,
        headers: Headers,
        body: String,
        error: IncreaseError,
) : IncreaseServiceException(statusCode, headers, body, error)
