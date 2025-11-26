// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.supplementaldocuments.EntitySupplementalDocument
import com.increase.api.models.supplementaldocuments.SupplementalDocumentCreateParams
import com.increase.api.models.supplementaldocuments.SupplementalDocumentListParams
import com.increase.api.models.supplementaldocuments.SupplementalDocumentListResponse
import java.util.function.Consumer

interface SupplementalDocumentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SupplementalDocumentService

    /** Create a supplemental document for an Entity */
    fun create(params: SupplementalDocumentCreateParams): EntitySupplementalDocument =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SupplementalDocumentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntitySupplementalDocument

    /** List Entity Supplemental Document Submissions */
    fun list(params: SupplementalDocumentListParams): SupplementalDocumentListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: SupplementalDocumentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SupplementalDocumentListResponse

    /**
     * A view of [SupplementalDocumentService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SupplementalDocumentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /entity_supplemental_documents`, but is otherwise
         * the same as [SupplementalDocumentService.create].
         */
        @MustBeClosed
        fun create(
            params: SupplementalDocumentCreateParams
        ): HttpResponseFor<EntitySupplementalDocument> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: SupplementalDocumentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntitySupplementalDocument>

        /**
         * Returns a raw HTTP response for `get /entity_supplemental_documents`, but is otherwise
         * the same as [SupplementalDocumentService.list].
         */
        @MustBeClosed
        fun list(
            params: SupplementalDocumentListParams
        ): HttpResponseFor<SupplementalDocumentListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SupplementalDocumentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SupplementalDocumentListResponse>
    }
}
