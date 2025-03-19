// File generated from our OpenAPI spec by Stainless.

package com.increase.api.errors

import com.increase.api.core.JsonValue
import com.increase.api.core.http.Headers

abstract class IncreaseServiceException
protected constructor(message: String, cause: Throwable? = null) :
    IncreaseException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
