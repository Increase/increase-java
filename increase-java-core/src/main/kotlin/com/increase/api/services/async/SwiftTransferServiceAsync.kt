// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.swifttransfers.SwiftTransfer
import com.increase.api.models.swifttransfers.SwiftTransferApproveParams
import com.increase.api.models.swifttransfers.SwiftTransferCancelParams
import com.increase.api.models.swifttransfers.SwiftTransferCreateParams
import com.increase.api.models.swifttransfers.SwiftTransferListPageAsync
import com.increase.api.models.swifttransfers.SwiftTransferListParams
import com.increase.api.models.swifttransfers.SwiftTransferRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SwiftTransferServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SwiftTransferServiceAsync

    /** Create a Swift Transfer */
    fun create(params: SwiftTransferCreateParams): CompletableFuture<SwiftTransfer> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SwiftTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SwiftTransfer>

    /** Retrieve a Swift Transfer */
    fun retrieve(swiftTransferId: String): CompletableFuture<SwiftTransfer> =
        retrieve(swiftTransferId, SwiftTransferRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        swiftTransferId: String,
        params: SwiftTransferRetrieveParams = SwiftTransferRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SwiftTransfer> =
        retrieve(params.toBuilder().swiftTransferId(swiftTransferId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        swiftTransferId: String,
        params: SwiftTransferRetrieveParams = SwiftTransferRetrieveParams.none(),
    ): CompletableFuture<SwiftTransfer> = retrieve(swiftTransferId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: SwiftTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SwiftTransfer>

    /** @see retrieve */
    fun retrieve(params: SwiftTransferRetrieveParams): CompletableFuture<SwiftTransfer> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        swiftTransferId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SwiftTransfer> =
        retrieve(swiftTransferId, SwiftTransferRetrieveParams.none(), requestOptions)

    /** List Swift Transfers */
    fun list(): CompletableFuture<SwiftTransferListPageAsync> = list(SwiftTransferListParams.none())

    /** @see list */
    fun list(
        params: SwiftTransferListParams = SwiftTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SwiftTransferListPageAsync>

    /** @see list */
    fun list(
        params: SwiftTransferListParams = SwiftTransferListParams.none()
    ): CompletableFuture<SwiftTransferListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<SwiftTransferListPageAsync> =
        list(SwiftTransferListParams.none(), requestOptions)

    /** Approve a Swift Transfer */
    fun approve(swiftTransferId: String): CompletableFuture<SwiftTransfer> =
        approve(swiftTransferId, SwiftTransferApproveParams.none())

    /** @see approve */
    fun approve(
        swiftTransferId: String,
        params: SwiftTransferApproveParams = SwiftTransferApproveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SwiftTransfer> =
        approve(params.toBuilder().swiftTransferId(swiftTransferId).build(), requestOptions)

    /** @see approve */
    fun approve(
        swiftTransferId: String,
        params: SwiftTransferApproveParams = SwiftTransferApproveParams.none(),
    ): CompletableFuture<SwiftTransfer> = approve(swiftTransferId, params, RequestOptions.none())

    /** @see approve */
    fun approve(
        params: SwiftTransferApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SwiftTransfer>

    /** @see approve */
    fun approve(params: SwiftTransferApproveParams): CompletableFuture<SwiftTransfer> =
        approve(params, RequestOptions.none())

    /** @see approve */
    fun approve(
        swiftTransferId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SwiftTransfer> =
        approve(swiftTransferId, SwiftTransferApproveParams.none(), requestOptions)

    /** Cancel a pending Swift Transfer */
    fun cancel(swiftTransferId: String): CompletableFuture<SwiftTransfer> =
        cancel(swiftTransferId, SwiftTransferCancelParams.none())

    /** @see cancel */
    fun cancel(
        swiftTransferId: String,
        params: SwiftTransferCancelParams = SwiftTransferCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SwiftTransfer> =
        cancel(params.toBuilder().swiftTransferId(swiftTransferId).build(), requestOptions)

    /** @see cancel */
    fun cancel(
        swiftTransferId: String,
        params: SwiftTransferCancelParams = SwiftTransferCancelParams.none(),
    ): CompletableFuture<SwiftTransfer> = cancel(swiftTransferId, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: SwiftTransferCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SwiftTransfer>

    /** @see cancel */
    fun cancel(params: SwiftTransferCancelParams): CompletableFuture<SwiftTransfer> =
        cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        swiftTransferId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SwiftTransfer> =
        cancel(swiftTransferId, SwiftTransferCancelParams.none(), requestOptions)

    /**
     * A view of [SwiftTransferServiceAsync] that provides access to raw HTTP responses for each
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
        ): SwiftTransferServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /swift_transfers`, but is otherwise the same as
         * [SwiftTransferServiceAsync.create].
         */
        fun create(
            params: SwiftTransferCreateParams
        ): CompletableFuture<HttpResponseFor<SwiftTransfer>> = create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SwiftTransferCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SwiftTransfer>>

        /**
         * Returns a raw HTTP response for `get /swift_transfers/{swift_transfer_id}`, but is
         * otherwise the same as [SwiftTransferServiceAsync.retrieve].
         */
        fun retrieve(swiftTransferId: String): CompletableFuture<HttpResponseFor<SwiftTransfer>> =
            retrieve(swiftTransferId, SwiftTransferRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            swiftTransferId: String,
            params: SwiftTransferRetrieveParams = SwiftTransferRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SwiftTransfer>> =
            retrieve(params.toBuilder().swiftTransferId(swiftTransferId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            swiftTransferId: String,
            params: SwiftTransferRetrieveParams = SwiftTransferRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<SwiftTransfer>> =
            retrieve(swiftTransferId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: SwiftTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SwiftTransfer>>

        /** @see retrieve */
        fun retrieve(
            params: SwiftTransferRetrieveParams
        ): CompletableFuture<HttpResponseFor<SwiftTransfer>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            swiftTransferId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SwiftTransfer>> =
            retrieve(swiftTransferId, SwiftTransferRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /swift_transfers`, but is otherwise the same as
         * [SwiftTransferServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<SwiftTransferListPageAsync>> =
            list(SwiftTransferListParams.none())

        /** @see list */
        fun list(
            params: SwiftTransferListParams = SwiftTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SwiftTransferListPageAsync>>

        /** @see list */
        fun list(
            params: SwiftTransferListParams = SwiftTransferListParams.none()
        ): CompletableFuture<HttpResponseFor<SwiftTransferListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SwiftTransferListPageAsync>> =
            list(SwiftTransferListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /swift_transfers/{swift_transfer_id}/approve`, but
         * is otherwise the same as [SwiftTransferServiceAsync.approve].
         */
        fun approve(swiftTransferId: String): CompletableFuture<HttpResponseFor<SwiftTransfer>> =
            approve(swiftTransferId, SwiftTransferApproveParams.none())

        /** @see approve */
        fun approve(
            swiftTransferId: String,
            params: SwiftTransferApproveParams = SwiftTransferApproveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SwiftTransfer>> =
            approve(params.toBuilder().swiftTransferId(swiftTransferId).build(), requestOptions)

        /** @see approve */
        fun approve(
            swiftTransferId: String,
            params: SwiftTransferApproveParams = SwiftTransferApproveParams.none(),
        ): CompletableFuture<HttpResponseFor<SwiftTransfer>> =
            approve(swiftTransferId, params, RequestOptions.none())

        /** @see approve */
        fun approve(
            params: SwiftTransferApproveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SwiftTransfer>>

        /** @see approve */
        fun approve(
            params: SwiftTransferApproveParams
        ): CompletableFuture<HttpResponseFor<SwiftTransfer>> =
            approve(params, RequestOptions.none())

        /** @see approve */
        fun approve(
            swiftTransferId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SwiftTransfer>> =
            approve(swiftTransferId, SwiftTransferApproveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /swift_transfers/{swift_transfer_id}/cancel`, but
         * is otherwise the same as [SwiftTransferServiceAsync.cancel].
         */
        fun cancel(swiftTransferId: String): CompletableFuture<HttpResponseFor<SwiftTransfer>> =
            cancel(swiftTransferId, SwiftTransferCancelParams.none())

        /** @see cancel */
        fun cancel(
            swiftTransferId: String,
            params: SwiftTransferCancelParams = SwiftTransferCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SwiftTransfer>> =
            cancel(params.toBuilder().swiftTransferId(swiftTransferId).build(), requestOptions)

        /** @see cancel */
        fun cancel(
            swiftTransferId: String,
            params: SwiftTransferCancelParams = SwiftTransferCancelParams.none(),
        ): CompletableFuture<HttpResponseFor<SwiftTransfer>> =
            cancel(swiftTransferId, params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            params: SwiftTransferCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SwiftTransfer>>

        /** @see cancel */
        fun cancel(
            params: SwiftTransferCancelParams
        ): CompletableFuture<HttpResponseFor<SwiftTransfer>> = cancel(params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            swiftTransferId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SwiftTransfer>> =
            cancel(swiftTransferId, SwiftTransferCancelParams.none(), requestOptions)
    }
}
