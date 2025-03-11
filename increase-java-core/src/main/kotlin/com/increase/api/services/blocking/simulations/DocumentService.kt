// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.documents.Document
import com.increase.api.models.simulations.documents.DocumentCreateParams

interface DocumentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Simulates an tax document being created for an account. */
    fun create(params: DocumentCreateParams): Document =
        create(
          params, RequestOptions.none()
        )

    /** @see [create] */
    fun create(params: DocumentCreateParams, requestOptions: RequestOptions = RequestOptions.none()): Document

    /**
     * A view of [DocumentService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /simulations/documents`, but is otherwise
         * the same as [DocumentService.create].
         */
        @MustBeClosed
        fun create(params: DocumentCreateParams): HttpResponseFor<Document> =
            create(
              params, RequestOptions.none()
            )

        /** @see [create] */
        @MustBeClosed
        fun create(params: DocumentCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<Document>
    }
}
