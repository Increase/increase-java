package com.increase.api.errors

import com.increase.api.core.http.Headers

class PermissionDeniedException(
    headers: Headers,
    body: String,
    error: IncreaseError,
) : IncreaseServiceException(403, headers, body, error)
