// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.checkRequired
import com.increase.api.core.handlers.errorBodyHandler
import com.increase.api.core.handlers.errorHandler
import com.increase.api.core.handlers.jsonHandler
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.core.http.json
import com.increase.api.core.http.parseable
import com.increase.api.core.prepare
import com.increase.api.models.checkbooks.Checkbook
import com.increase.api.models.simulations.checkbooks.CheckbookMailParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CheckbookServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CheckbookService {

    private val withRawResponse: CheckbookService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CheckbookService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CheckbookService =
        CheckbookServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun mail(params: CheckbookMailParams, requestOptions: RequestOptions): Checkbook =
        // post /simulations/checkbooks/{checkbook_id}/mail
        withRawResponse().mail(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CheckbookService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CheckbookService.WithRawResponse =
            CheckbookServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val mailHandler: Handler<Checkbook> =
            jsonHandler<Checkbook>(clientOptions.jsonMapper)

        override fun mail(
            params: CheckbookMailParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Checkbook> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("checkbookId", params.checkbookId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("simulations", "checkbooks", params._pathParam(0), "mail")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { mailHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
