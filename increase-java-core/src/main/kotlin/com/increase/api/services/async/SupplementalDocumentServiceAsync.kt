// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.supplementaldocuments.EntitySupplementalDocument
import com.increase.api.models.supplementaldocuments.SupplementalDocumentCreateParams
import com.increase.api.models.supplementaldocuments.SupplementalDocumentListPageAsync
import com.increase.api.models.supplementaldocuments.SupplementalDocumentListParams
import java.util.concurrent.CompletableFuture

interface SupplementalDocumentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a supplemental document for an Entity */
    fun create(params: SupplementalDocumentCreateParams): CompletableFuture<EntitySupplementalDocument> =
        create(
          params, RequestOptions.none()
        )

    /** @see [create] */
    fun create(params: SupplementalDocumentCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<EntitySupplementalDocument>

    /** List Entity Supplemental Document Submissions */
    fun list(params: SupplementalDocumentListParams): CompletableFuture<SupplementalDocumentListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see [list] */
    fun list(params: SupplementalDocumentListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<SupplementalDocumentListPageAsync>

    /**
     * A view of [SupplementalDocumentServiceAsync] that provides access to raw HTTP
     * responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /entity_supplemental_documents`, but is
         * otherwise the same as [SupplementalDocumentServiceAsync.create].
         */
        @MustBeClosed
        fun create(params: SupplementalDocumentCreateParams): CompletableFuture<HttpResponseFor<EntitySupplementalDocument>> =
            create(
              params, RequestOptions.none()
            )

        /** @see [create] */
        @MustBeClosed
        fun create(params: SupplementalDocumentCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<EntitySupplementalDocument>>

        /**
         * Returns a raw HTTP response for `get /entity_supplemental_documents`, but is
         * otherwise the same as [SupplementalDocumentServiceAsync.list].
         */
        @MustBeClosed
        fun list(params: SupplementalDocumentListParams): CompletableFuture<HttpResponseFor<SupplementalDocumentListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see [list] */
        @MustBeClosed
        fun list(params: SupplementalDocumentListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<SupplementalDocumentListPageAsync>>
    }
}
