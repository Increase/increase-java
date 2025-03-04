// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.handlers.errorHandler
import com.increase.api.core.handlers.jsonHandler
import com.increase.api.core.handlers.withErrorHandler
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.json
import com.increase.api.core.prepare
import com.increase.api.errors.IncreaseError
import com.increase.api.models.InboundMailItem
import com.increase.api.models.SimulationInboundMailItemCreateParams

class InboundMailItemServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    InboundMailItemService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<InboundMailItem> =
        jsonHandler<InboundMailItem>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Simulates an inbound mail item to your account, as if someone had mailed a physical check to
     * one of your account's Lockboxes.
     */
    override fun create(
        params: SimulationInboundMailItemCreateParams,
        requestOptions: RequestOptions,
    ): InboundMailItem {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("simulations", "inbound_mail_items")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }
}
