// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

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
import com.increase.api.models.physicalcheckbatches.PhysicalCheckBatch
import com.increase.api.models.physicalcheckbatches.PhysicalCheckBatchCancelParams
import com.increase.api.models.physicalcheckbatches.PhysicalCheckBatchCompleteParams
import com.increase.api.models.physicalcheckbatches.PhysicalCheckBatchCreateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PhysicalCheckBatchServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PhysicalCheckBatchService {

    private val withRawResponse: PhysicalCheckBatchService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PhysicalCheckBatchService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PhysicalCheckBatchService =
        PhysicalCheckBatchServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: PhysicalCheckBatchCreateParams,
        requestOptions: RequestOptions,
    ): PhysicalCheckBatch =
        // post /physical_check_batches
        withRawResponse().create(params, requestOptions).parse()

    override fun cancel(
        params: PhysicalCheckBatchCancelParams,
        requestOptions: RequestOptions,
    ): PhysicalCheckBatch =
        // post /physical_check_batches/{physical_check_batch_id}/cancel
        withRawResponse().cancel(params, requestOptions).parse()

    override fun complete(
        params: PhysicalCheckBatchCompleteParams,
        requestOptions: RequestOptions,
    ): PhysicalCheckBatch =
        // post /physical_check_batches/{physical_check_batch_id}/complete
        withRawResponse().complete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PhysicalCheckBatchService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PhysicalCheckBatchService.WithRawResponse =
            PhysicalCheckBatchServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<PhysicalCheckBatch> =
            jsonHandler<PhysicalCheckBatch>(clientOptions.jsonMapper)

        override fun create(
            params: PhysicalCheckBatchCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhysicalCheckBatch> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("physical_check_batches")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val cancelHandler: Handler<PhysicalCheckBatch> =
            jsonHandler<PhysicalCheckBatch>(clientOptions.jsonMapper)

        override fun cancel(
            params: PhysicalCheckBatchCancelParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhysicalCheckBatch> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("physicalCheckBatchId", params.physicalCheckBatchId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("physical_check_batches", params._pathParam(0), "cancel")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { cancelHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val completeHandler: Handler<PhysicalCheckBatch> =
            jsonHandler<PhysicalCheckBatch>(clientOptions.jsonMapper)

        override fun complete(
            params: PhysicalCheckBatchCompleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhysicalCheckBatch> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("physicalCheckBatchId", params.physicalCheckBatchId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("physical_check_batches", params._pathParam(0), "complete")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { completeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
