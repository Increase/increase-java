// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

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
import com.increase.api.core.prepareAsync
import com.increase.api.models.checktransfers.CheckTransfer
import com.increase.api.models.simulations.checktransfers.CheckTransferMailParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CheckTransferServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CheckTransferServiceAsync {

    private val withRawResponse: CheckTransferServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CheckTransferServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CheckTransferServiceAsync =
        CheckTransferServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun mail(
        params: CheckTransferMailParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CheckTransfer> =
        // post /simulations/check_transfers/{check_transfer_id}/mail
        withRawResponse().mail(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CheckTransferServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CheckTransferServiceAsync.WithRawResponse =
            CheckTransferServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val mailHandler: Handler<CheckTransfer> =
            jsonHandler<CheckTransfer>(clientOptions.jsonMapper)

        override fun mail(
            params: CheckTransferMailParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CheckTransfer>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("checkTransferId", params.checkTransferId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("simulations", "check_transfers", params._pathParam(0), "mail")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
