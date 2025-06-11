// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.core.ClientOptions
import com.increase.api.core.JsonValue
import com.increase.api.core.RequestOptions
import com.increase.api.core.checkRequired
import com.increase.api.core.handlers.errorHandler
import com.increase.api.core.handlers.jsonHandler
import com.increase.api.core.handlers.withErrorHandler
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.core.http.parseable
import com.increase.api.core.prepare
import com.increase.api.models.intrafibalances.IntrafiBalance
import com.increase.api.models.intrafibalances.IntrafiBalanceIntrafiBalanceParams
import kotlin.jvm.optionals.getOrNull

class IntrafiBalanceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    IntrafiBalanceService {

    private val withRawResponse: IntrafiBalanceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): IntrafiBalanceService.WithRawResponse = withRawResponse

    override fun intrafiBalance(
        params: IntrafiBalanceIntrafiBalanceParams,
        requestOptions: RequestOptions,
    ): IntrafiBalance =
        // get /accounts/{account_id}/intrafi_balance
        withRawResponse().intrafiBalance(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IntrafiBalanceService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val intrafiBalanceHandler: Handler<IntrafiBalance> =
            jsonHandler<IntrafiBalance>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun intrafiBalance(
            params: IntrafiBalanceIntrafiBalanceParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IntrafiBalance> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountId", params.accountId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("accounts", params._pathParam(0), "intrafi_balance")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { intrafiBalanceHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
