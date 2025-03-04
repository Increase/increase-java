// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.EntitySupplementalDocument
import com.increase.api.models.SupplementalDocumentCreateParams
import com.increase.api.models.SupplementalDocumentListPageAsync
import com.increase.api.models.SupplementalDocumentListParams
import java.util.concurrent.CompletableFuture

interface SupplementalDocumentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a supplemental document for an Entity */
    @JvmOverloads
    fun create(
        params: SupplementalDocumentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntitySupplementalDocument>

    /** List Entity Supplemental Document Submissions */
    @JvmOverloads
    fun list(
        params: SupplementalDocumentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SupplementalDocumentListPageAsync>

    /**
     * A view of [SupplementalDocumentServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /entity_supplemental_documents`, but is otherwise
         * the same as [SupplementalDocumentServiceAsync.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: SupplementalDocumentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntitySupplementalDocument>>

        /**
         * Returns a raw HTTP response for `get /entity_supplemental_documents`, but is otherwise
         * the same as [SupplementalDocumentServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: SupplementalDocumentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SupplementalDocumentListPageAsync>>
    }
}
