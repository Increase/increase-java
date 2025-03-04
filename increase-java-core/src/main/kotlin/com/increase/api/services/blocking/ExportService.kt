// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.Export
import com.increase.api.models.ExportCreateParams
import com.increase.api.models.ExportListPage
import com.increase.api.models.ExportListParams
import com.increase.api.models.ExportRetrieveParams

interface ExportService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create an Export */
    @JvmOverloads
    fun create(
        params: ExportCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Export

    /** Retrieve an Export */
    @JvmOverloads
    fun retrieve(
        params: ExportRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Export

    /** List Exports */
    @JvmOverloads
    fun list(
        params: ExportListParams = ExportListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExportListPage

    /** List Exports */
    fun list(requestOptions: RequestOptions): ExportListPage =
        list(ExportListParams.none(), requestOptions)

    /** A view of [ExportService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /exports`, but is otherwise the same as
         * [ExportService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: ExportCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Export>

        /**
         * Returns a raw HTTP response for `get /exports/{export_id}`, but is otherwise the same as
         * [ExportService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: ExportRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Export>

        /**
         * Returns a raw HTTP response for `get /exports`, but is otherwise the same as
         * [ExportService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: ExportListParams = ExportListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExportListPage>

        /**
         * Returns a raw HTTP response for `get /exports`, but is otherwise the same as
         * [ExportService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ExportListPage> =
            list(ExportListParams.none(), requestOptions)
    }
}
