package com.increase.api.errors

import com.google.common.collect.ListMultimap

class PermissionDeniedException(
    headers: ListMultimap<String, String>,
    body: String,
    error: IncreaseError,
) : IncreaseServiceException(403, headers, body, error)
