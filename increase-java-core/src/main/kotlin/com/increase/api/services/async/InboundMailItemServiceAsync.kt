// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.inboundmailitems.InboundMailItem
import com.increase.api.models.inboundmailitems.InboundMailItemListPageAsync
import com.increase.api.models.inboundmailitems.InboundMailItemListParams
import com.increase.api.models.inboundmailitems.InboundMailItemRetrieveParams
import java.util.concurrent.CompletableFuture

interface InboundMailItemServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve an Inbound Mail Item */
    fun retrieve(inboundMailItemId: String): CompletableFuture<InboundMailItem> =
        retrieve(inboundMailItemId, InboundMailItemRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        inboundMailItemId: String,
        params: InboundMailItemRetrieveParams = InboundMailItemRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundMailItem> =
        retrieve(params.toBuilder().inboundMailItemId(inboundMailItemId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        inboundMailItemId: String,
        params: InboundMailItemRetrieveParams = InboundMailItemRetrieveParams.none(),
    ): CompletableFuture<InboundMailItem> =
        retrieve(inboundMailItemId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: InboundMailItemRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundMailItem>

    /** @see [retrieve] */
    fun retrieve(params: InboundMailItemRetrieveParams): CompletableFuture<InboundMailItem> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        inboundMailItemId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<InboundMailItem> =
        retrieve(inboundMailItemId, InboundMailItemRetrieveParams.none(), requestOptions)

    /** List Inbound Mail Items */
    fun list(): CompletableFuture<InboundMailItemListPageAsync> =
        list(InboundMailItemListParams.none())

    /** @see [list] */
    fun list(
        params: InboundMailItemListParams = InboundMailItemListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundMailItemListPageAsync>

    /** @see [list] */
    fun list(
        params: InboundMailItemListParams = InboundMailItemListParams.none()
    ): CompletableFuture<InboundMailItemListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<InboundMailItemListPageAsync> =
        list(InboundMailItemListParams.none(), requestOptions)

    /**
     * A view of [InboundMailItemServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /inbound_mail_items/{inbound_mail_item_id}`, but is
         * otherwise the same as [InboundMailItemServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            inboundMailItemId: String
        ): CompletableFuture<HttpResponseFor<InboundMailItem>> =
            retrieve(inboundMailItemId, InboundMailItemRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            inboundMailItemId: String,
            params: InboundMailItemRetrieveParams = InboundMailItemRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundMailItem>> =
            retrieve(
                params.toBuilder().inboundMailItemId(inboundMailItemId).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            inboundMailItemId: String,
            params: InboundMailItemRetrieveParams = InboundMailItemRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<InboundMailItem>> =
            retrieve(inboundMailItemId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: InboundMailItemRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundMailItem>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: InboundMailItemRetrieveParams
        ): CompletableFuture<HttpResponseFor<InboundMailItem>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            inboundMailItemId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InboundMailItem>> =
            retrieve(inboundMailItemId, InboundMailItemRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /inbound_mail_items`, but is otherwise the same as
         * [InboundMailItemServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<InboundMailItemListPageAsync>> =
            list(InboundMailItemListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: InboundMailItemListParams = InboundMailItemListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundMailItemListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: InboundMailItemListParams = InboundMailItemListParams.none()
        ): CompletableFuture<HttpResponseFor<InboundMailItemListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<InboundMailItemListPageAsync>> =
            list(InboundMailItemListParams.none(), requestOptions)
    }
}
