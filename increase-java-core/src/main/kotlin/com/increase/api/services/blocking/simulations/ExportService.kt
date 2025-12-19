// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.exports.Export
import com.increase.api.models.simulations.exports.ExportCreateParams
import java.util.function.Consumer

interface ExportService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExportService

    /**
     * Many exports are created by you via POST /exports or in the Dashboard. Some exports are
     * created automatically by Increase. For example, tax documents are published once a year. In
     * sandbox, you can trigger the arrival of an export that would normally only be created
     * automatically via this simulation.
     */
    fun create(params: ExportCreateParams): Export = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ExportCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Export

    /** A view of [ExportService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExportService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /simulations/exports`, but is otherwise the same as
         * [ExportService.create].
         */
        @MustBeClosed
        fun create(params: ExportCreateParams): HttpResponseFor<Export> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ExportCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Export>
    }
}
