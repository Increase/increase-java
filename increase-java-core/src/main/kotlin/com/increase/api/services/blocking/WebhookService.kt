// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.core.JsonValue
import com.increase.api.core.http.Headers

interface WebhookService {

    fun unwrap(payload: String, headers: Headers, secret: String?): JsonValue

    fun verifySignature(payload: String, headers: Headers, secret: String?)
}
