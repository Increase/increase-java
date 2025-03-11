// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.documents.Document
import com.increase.api.models.simulations.documents.DocumentCreateParams
import java.util.concurrent.CompletableFuture

interface DocumentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Simulates an tax document being created for an account. */
    fun create(params: DocumentCreateParams): CompletableFuture<Document> =
        create(
          params, RequestOptions.none()
        )

    /** @see [create] */
    fun create(params: DocumentCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Document>

    /**
     * A view of [DocumentServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /simulations/documents`, but is otherwise
         * the same as [DocumentServiceAsync.create].
         */
        @MustBeClosed
        fun create(params: DocumentCreateParams): CompletableFuture<HttpResponseFor<Document>> =
            create(
              params, RequestOptions.none()
            )

        /** @see [create] */
        @MustBeClosed
        fun create(params: DocumentCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<Document>>
    }
}
