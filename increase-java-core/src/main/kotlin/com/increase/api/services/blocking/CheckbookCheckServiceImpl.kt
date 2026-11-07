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
import com.increase.api.models.checkbookchecks.CheckbookCheck
import com.increase.api.models.checkbookchecks.CheckbookCheckListPage
import com.increase.api.models.checkbookchecks.CheckbookCheckListPageResponse
import com.increase.api.models.checkbookchecks.CheckbookCheckListParams
import com.increase.api.models.checkbookchecks.CheckbookCheckRetrieveParams
import com.increase.api.models.checkbookchecks.CheckbookCheckStopParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CheckbookCheckServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CheckbookCheckService {

    private val withRawResponse: CheckbookCheckService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CheckbookCheckService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CheckbookCheckService =
        CheckbookCheckServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: CheckbookCheckRetrieveParams,
        requestOptions: RequestOptions,
    ): CheckbookCheck =
        // get /checkbook_checks/{checkbook_check_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: CheckbookCheckListParams,
        requestOptions: RequestOptions,
    ): CheckbookCheckListPage =
        // get /checkbook_checks
        withRawResponse().list(params, requestOptions).parse()

    override fun stop(
        params: CheckbookCheckStopParams,
        requestOptions: RequestOptions,
    ): CheckbookCheck =
        // post /checkbook_checks/{checkbook_check_id}/stop
        withRawResponse().stop(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CheckbookCheckService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CheckbookCheckService.WithRawResponse =
            CheckbookCheckServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<CheckbookCheck> =
            jsonHandler<CheckbookCheck>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CheckbookCheckRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CheckbookCheck> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("checkbookCheckId", params.checkbookCheckId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("checkbook_checks", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<CheckbookCheckListPageResponse> =
            jsonHandler<CheckbookCheckListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CheckbookCheckListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CheckbookCheckListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("checkbook_checks")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        CheckbookCheckListPage.builder()
                            .service(CheckbookCheckServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val stopHandler: Handler<CheckbookCheck> =
            jsonHandler<CheckbookCheck>(clientOptions.jsonMapper)

        override fun stop(
            params: CheckbookCheckStopParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CheckbookCheck> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("checkbookCheckId", params.checkbookCheckId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("checkbook_checks", params._pathParam(0), "stop")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { stopHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
