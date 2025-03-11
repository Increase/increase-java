package com.increase.api.errors

import com.increase.api.core.http.Headers

class UnauthorizedException(headers: Headers, body: String, error: IncreaseError) :
    IncreaseServiceException(401, headers, body, error)
