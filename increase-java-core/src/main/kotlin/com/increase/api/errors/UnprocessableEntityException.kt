package com.increase.api.errors

import com.increase.api.core.http.Headers

class UnprocessableEntityException(
        headers: Headers,
        body: String,
        error: IncreaseError,
) : IncreaseServiceException(422, headers, body, error)
