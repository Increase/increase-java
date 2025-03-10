// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.documents.Document
import com.increase.api.models.documents.DocumentListPage
import com.increase.api.models.documents.DocumentListParams
import com.increase.api.models.documents.DocumentRetrieveParams

interface DocumentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve a Document */
    fun retrieve(params: DocumentRetrieveParams): Document = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: DocumentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Document

    /** List Documents */
    fun list(): DocumentListPage = list(DocumentListParams.none())

    /** @see [list] */
    fun list(
        params: DocumentListParams = DocumentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentListPage

    /** @see [list] */
    fun list(params: DocumentListParams = DocumentListParams.none()): DocumentListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): DocumentListPage =
        list(DocumentListParams.none(), requestOptions)

    /** A view of [DocumentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /documents/{document_id}`, but is otherwise the same
         * as [DocumentService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: DocumentRetrieveParams): HttpResponseFor<Document> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: DocumentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Document>

        /**
         * Returns a raw HTTP response for `get /documents`, but is otherwise the same as
         * [DocumentService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<DocumentListPage> = list(DocumentListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: DocumentListParams = DocumentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: DocumentListParams = DocumentListParams.none()
        ): HttpResponseFor<DocumentListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<DocumentListPage> =
            list(DocumentListParams.none(), requestOptions)
    }
}
