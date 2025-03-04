// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.Document
import com.increase.api.models.SimulationDocumentCreateParams

interface DocumentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Simulates an tax document being created for an account. */
    @JvmOverloads
    fun create(
        params: SimulationDocumentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Document

    /** A view of [DocumentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /simulations/documents`, but is otherwise the same
         * as [DocumentService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: SimulationDocumentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Document>
    }
}
