// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.documents.Document
import com.increase.api.models.documents.DocumentCreateParams
import com.increase.api.models.documents.DocumentListPageAsync
import com.increase.api.models.documents.DocumentListParams
import com.increase.api.models.documents.DocumentRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DocumentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DocumentServiceAsync

    /** Create a Document */
    fun create(params: DocumentCreateParams): CompletableFuture<Document> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: DocumentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Document>

    /** Retrieve a Document */
    fun retrieve(documentId: String): CompletableFuture<Document> =
        retrieve(documentId, DocumentRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        documentId: String,
        params: DocumentRetrieveParams = DocumentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Document> =
        retrieve(params.toBuilder().documentId(documentId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        documentId: String,
        params: DocumentRetrieveParams = DocumentRetrieveParams.none(),
    ): CompletableFuture<Document> = retrieve(documentId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: DocumentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Document>

    /** @see [retrieve] */
    fun retrieve(params: DocumentRetrieveParams): CompletableFuture<Document> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(documentId: String, requestOptions: RequestOptions): CompletableFuture<Document> =
        retrieve(documentId, DocumentRetrieveParams.none(), requestOptions)

    /** List Documents */
    fun list(): CompletableFuture<DocumentListPageAsync> = list(DocumentListParams.none())

    /** @see [list] */
    fun list(
        params: DocumentListParams = DocumentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentListPageAsync>

    /** @see [list] */
    fun list(
        params: DocumentListParams = DocumentListParams.none()
    ): CompletableFuture<DocumentListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<DocumentListPageAsync> =
        list(DocumentListParams.none(), requestOptions)

    /**
     * A view of [DocumentServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DocumentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /documents`, but is otherwise the same as
         * [DocumentServiceAsync.create].
         */
        fun create(params: DocumentCreateParams): CompletableFuture<HttpResponseFor<Document>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: DocumentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Document>>

        /**
         * Returns a raw HTTP response for `get /documents/{document_id}`, but is otherwise the same
         * as [DocumentServiceAsync.retrieve].
         */
        fun retrieve(documentId: String): CompletableFuture<HttpResponseFor<Document>> =
            retrieve(documentId, DocumentRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            documentId: String,
            params: DocumentRetrieveParams = DocumentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Document>> =
            retrieve(params.toBuilder().documentId(documentId).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            documentId: String,
            params: DocumentRetrieveParams = DocumentRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Document>> =
            retrieve(documentId, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: DocumentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Document>>

        /** @see [retrieve] */
        fun retrieve(params: DocumentRetrieveParams): CompletableFuture<HttpResponseFor<Document>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            documentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Document>> =
            retrieve(documentId, DocumentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /documents`, but is otherwise the same as
         * [DocumentServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<DocumentListPageAsync>> =
            list(DocumentListParams.none())

        /** @see [list] */
        fun list(
            params: DocumentListParams = DocumentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentListPageAsync>>

        /** @see [list] */
        fun list(
            params: DocumentListParams = DocumentListParams.none()
        ): CompletableFuture<HttpResponseFor<DocumentListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DocumentListPageAsync>> =
            list(DocumentListParams.none(), requestOptions)
    }
}
