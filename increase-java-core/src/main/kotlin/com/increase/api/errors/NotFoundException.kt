package com.increase.api.errors

import com.google.common.collect.ListMultimap

class NotFoundException(
    headers: ListMultimap<String, String>,
    body: String,
    error: IncreaseError,
) : IncreaseServiceException(404, headers, body, error)
