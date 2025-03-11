package com.increase.api.errors

import com.increase.api.core.http.Headers

class NotFoundException(headers: Headers, body: String, error: IncreaseError) :
    IncreaseServiceException(404, headers, body, error)
