// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.inboundmailitems.InboundMailItem
import com.increase.api.models.inboundmailitems.InboundMailItemActionParams
import com.increase.api.models.inboundmailitems.InboundMailItemListPageAsync
import com.increase.api.models.inboundmailitems.InboundMailItemListParams
import com.increase.api.models.inboundmailitems.InboundMailItemRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface InboundMailItemServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InboundMailItemServiceAsync

    /** Retrieve an Inbound Mail Item */
    fun retrieve(inboundMailItemId: String): CompletableFuture<InboundMailItem> =
        retrieve(inboundMailItemId, InboundMailItemRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        inboundMailItemId: String,
        params: InboundMailItemRetrieveParams = InboundMailItemRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundMailItem> =
        retrieve(params.toBuilder().inboundMailItemId(inboundMailItemId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        inboundMailItemId: String,
        params: InboundMailItemRetrieveParams = InboundMailItemRetrieveParams.none(),
    ): CompletableFuture<InboundMailItem> =
        retrieve(inboundMailItemId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: InboundMailItemRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundMailItem>

    /** @see retrieve */
    fun retrieve(params: InboundMailItemRetrieveParams): CompletableFuture<InboundMailItem> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        inboundMailItemId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<InboundMailItem> =
        retrieve(inboundMailItemId, InboundMailItemRetrieveParams.none(), requestOptions)

    /** List Inbound Mail Items */
    fun list(): CompletableFuture<InboundMailItemListPageAsync> =
        list(InboundMailItemListParams.none())

    /** @see list */
    fun list(
        params: InboundMailItemListParams = InboundMailItemListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundMailItemListPageAsync>

    /** @see list */
    fun list(
        params: InboundMailItemListParams = InboundMailItemListParams.none()
    ): CompletableFuture<InboundMailItemListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<InboundMailItemListPageAsync> =
        list(InboundMailItemListParams.none(), requestOptions)

    /** Action an Inbound Mail Item */
    fun action(
        inboundMailItemId: String,
        params: InboundMailItemActionParams,
    ): CompletableFuture<InboundMailItem> = action(inboundMailItemId, params, RequestOptions.none())

    /** @see action */
    fun action(
        inboundMailItemId: String,
        params: InboundMailItemActionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundMailItem> =
        action(params.toBuilder().inboundMailItemId(inboundMailItemId).build(), requestOptions)

    /** @see action */
    fun action(params: InboundMailItemActionParams): CompletableFuture<InboundMailItem> =
        action(params, RequestOptions.none())

    /** @see action */
    fun action(
        params: InboundMailItemActionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundMailItem>

    /**
     * A view of [InboundMailItemServiceAsync] that provides access to raw HTTP responses for each
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
        ): InboundMailItemServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /inbound_mail_items/{inbound_mail_item_id}`, but is
         * otherwise the same as [InboundMailItemServiceAsync.retrieve].
         */
        fun retrieve(
            inboundMailItemId: String
        ): CompletableFuture<HttpResponseFor<InboundMailItem>> =
            retrieve(inboundMailItemId, InboundMailItemRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            inboundMailItemId: String,
            params: InboundMailItemRetrieveParams = InboundMailItemRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundMailItem>> =
            retrieve(
                params.toBuilder().inboundMailItemId(inboundMailItemId).build(),
                requestOptions,
            )

        /** @see retrieve */
        fun retrieve(
            inboundMailItemId: String,
            params: InboundMailItemRetrieveParams = InboundMailItemRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<InboundMailItem>> =
            retrieve(inboundMailItemId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: InboundMailItemRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundMailItem>>

        /** @see retrieve */
        fun retrieve(
            params: InboundMailItemRetrieveParams
        ): CompletableFuture<HttpResponseFor<InboundMailItem>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            inboundMailItemId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InboundMailItem>> =
            retrieve(inboundMailItemId, InboundMailItemRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /inbound_mail_items`, but is otherwise the same as
         * [InboundMailItemServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<InboundMailItemListPageAsync>> =
            list(InboundMailItemListParams.none())

        /** @see list */
        fun list(
            params: InboundMailItemListParams = InboundMailItemListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundMailItemListPageAsync>>

        /** @see list */
        fun list(
            params: InboundMailItemListParams = InboundMailItemListParams.none()
        ): CompletableFuture<HttpResponseFor<InboundMailItemListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<InboundMailItemListPageAsync>> =
            list(InboundMailItemListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /inbound_mail_items/{inbound_mail_item_id}/action`,
         * but is otherwise the same as [InboundMailItemServiceAsync.action].
         */
        fun action(
            inboundMailItemId: String,
            params: InboundMailItemActionParams,
        ): CompletableFuture<HttpResponseFor<InboundMailItem>> =
            action(inboundMailItemId, params, RequestOptions.none())

        /** @see action */
        fun action(
            inboundMailItemId: String,
            params: InboundMailItemActionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundMailItem>> =
            action(params.toBuilder().inboundMailItemId(inboundMailItemId).build(), requestOptions)

        /** @see action */
        fun action(
            params: InboundMailItemActionParams
        ): CompletableFuture<HttpResponseFor<InboundMailItem>> =
            action(params, RequestOptions.none())

        /** @see action */
        fun action(
            params: InboundMailItemActionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundMailItem>>
    }
}
