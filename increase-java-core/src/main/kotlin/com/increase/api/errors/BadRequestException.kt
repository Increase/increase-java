package com.increase.api.errors

import com.google.common.collect.ListMultimap

class BadRequestException(
        headers: ListMultimap<String, String>,
        body: String,
        error: IncreaseError,
) : IncreaseServiceException(400, headers, body, error)
