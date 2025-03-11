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
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve an Inbound Mail Item */
    fun retrieve(params: InboundMailItemRetrieveParams): CompletableFuture<InboundMailItem> =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see [retrieve] */
    fun retrieve(params: InboundMailItemRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<InboundMailItem>

    /** List Inbound Mail Items */
    fun list(): CompletableFuture<InboundMailItemListPageAsync> = list(InboundMailItemListParams.none())

    /** @see [list] */
    fun list(params: InboundMailItemListParams = InboundMailItemListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<InboundMailItemListPageAsync>

    /** @see [list] */
    fun list(params: InboundMailItemListParams = InboundMailItemListParams.none()): CompletableFuture<InboundMailItemListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<InboundMailItemListPageAsync> = list(InboundMailItemListParams.none(), requestOptions)

    /**
     * A view of [InboundMailItemServiceAsync] that provides access to raw HTTP
     * responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for
         * `get /inbound_mail_items/{inbound_mail_item_id}`, but is otherwise the same as
         * [InboundMailItemServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: InboundMailItemRetrieveParams): CompletableFuture<HttpResponseFor<InboundMailItem>> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: InboundMailItemRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<InboundMailItem>>

        /**
         * Returns a raw HTTP response for `get /inbound_mail_items`, but is otherwise the
         * same as [InboundMailItemServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<InboundMailItemListPageAsync>> = list(InboundMailItemListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(params: InboundMailItemListParams = InboundMailItemListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<InboundMailItemListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(params: InboundMailItemListParams = InboundMailItemListParams.none()): CompletableFuture<HttpResponseFor<InboundMailItemListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<InboundMailItemListPageAsync>> = list(InboundMailItemListParams.none(), requestOptions)
    }
}
