// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.Export
import com.increase.api.models.ExportCreateParams
import com.increase.api.models.ExportListPageAsync
import com.increase.api.models.ExportListParams
import com.increase.api.models.ExportRetrieveParams
import java.util.concurrent.CompletableFuture

interface ExportServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create an Export */
    @JvmOverloads
    fun create(
        params: ExportCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Export>

    /** Retrieve an Export */
    @JvmOverloads
    fun retrieve(
        params: ExportRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Export>

    /** List Exports */
    @JvmOverloads
    fun list(
        params: ExportListParams = ExportListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExportListPageAsync>

    /** List Exports */
    fun list(requestOptions: RequestOptions): CompletableFuture<ExportListPageAsync> =
        list(ExportListParams.none(), requestOptions)

    /**
     * A view of [ExportServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /exports`, but is otherwise the same as
         * [ExportServiceAsync.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: ExportCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Export>>

        /**
         * Returns a raw HTTP response for `get /exports/{export_id}`, but is otherwise the same as
         * [ExportServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: ExportRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Export>>

        /**
         * Returns a raw HTTP response for `get /exports`, but is otherwise the same as
         * [ExportServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: ExportListParams = ExportListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExportListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /exports`, but is otherwise the same as
         * [ExportServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ExportListPageAsync>> =
            list(ExportListParams.none(), requestOptions)
    }
}
