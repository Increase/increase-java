package com.increase.api.errors

import com.google.common.collect.ListMultimap

class UnprocessableEntityException(
        headers: ListMultimap<String, String>,
        body: String,
        error: IncreaseError,
) : IncreaseServiceException(422, headers, body, error)
