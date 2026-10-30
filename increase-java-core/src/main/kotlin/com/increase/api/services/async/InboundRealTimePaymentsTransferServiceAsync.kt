// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.inboundrealtimepaymentstransfers.InboundRealTimePaymentsTransfer
import com.increase.api.models.inboundrealtimepaymentstransfers.InboundRealTimePaymentsTransferListPageAsync
import com.increase.api.models.inboundrealtimepaymentstransfers.InboundRealTimePaymentsTransferListParams
import com.increase.api.models.inboundrealtimepaymentstransfers.InboundRealTimePaymentsTransferRetrieveParams
import com.increase.api.models.inboundrealtimepaymentstransfers.InboundRealTimePaymentsTransferReturnParams
import com.increase.api.models.inboundrealtimepaymentstransfers.RealTimePaymentsTransfer
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface InboundRealTimePaymentsTransferServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): InboundRealTimePaymentsTransferServiceAsync

    /** Retrieve an Inbound Real-Time Payments Transfer */
    fun retrieve(
        inboundRealTimePaymentsTransferId: String
    ): CompletableFuture<InboundRealTimePaymentsTransfer> =
        retrieve(
            inboundRealTimePaymentsTransferId,
            InboundRealTimePaymentsTransferRetrieveParams.none(),
        )

    /** @see retrieve */
    fun retrieve(
        inboundRealTimePaymentsTransferId: String,
        params: InboundRealTimePaymentsTransferRetrieveParams =
            InboundRealTimePaymentsTransferRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundRealTimePaymentsTransfer> =
        retrieve(
            params
                .toBuilder()
                .inboundRealTimePaymentsTransferId(inboundRealTimePaymentsTransferId)
                .build(),
            requestOptions,
        )

    /** @see retrieve */
    fun retrieve(
        inboundRealTimePaymentsTransferId: String,
        params: InboundRealTimePaymentsTransferRetrieveParams =
            InboundRealTimePaymentsTransferRetrieveParams.none(),
    ): CompletableFuture<InboundRealTimePaymentsTransfer> =
        retrieve(inboundRealTimePaymentsTransferId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: InboundRealTimePaymentsTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundRealTimePaymentsTransfer>

    /** @see retrieve */
    fun retrieve(
        params: InboundRealTimePaymentsTransferRetrieveParams
    ): CompletableFuture<InboundRealTimePaymentsTransfer> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        inboundRealTimePaymentsTransferId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<InboundRealTimePaymentsTransfer> =
        retrieve(
            inboundRealTimePaymentsTransferId,
            InboundRealTimePaymentsTransferRetrieveParams.none(),
            requestOptions,
        )

    /** List Inbound Real-Time Payments Transfers */
    fun list(): CompletableFuture<InboundRealTimePaymentsTransferListPageAsync> =
        list(InboundRealTimePaymentsTransferListParams.none())

    /** @see list */
    fun list(
        params: InboundRealTimePaymentsTransferListParams =
            InboundRealTimePaymentsTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundRealTimePaymentsTransferListPageAsync>

    /** @see list */
    fun list(
        params: InboundRealTimePaymentsTransferListParams =
            InboundRealTimePaymentsTransferListParams.none()
    ): CompletableFuture<InboundRealTimePaymentsTransferListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<InboundRealTimePaymentsTransferListPageAsync> =
        list(InboundRealTimePaymentsTransferListParams.none(), requestOptions)

    /** Return an Inbound Real-Time Payments Transfer */
    fun return_(
        inboundRealTimePaymentsTransferId: String
    ): CompletableFuture<RealTimePaymentsTransfer> =
        return_(
            inboundRealTimePaymentsTransferId,
            InboundRealTimePaymentsTransferReturnParams.none(),
        )

    /** @see return_ */
    fun return_(
        inboundRealTimePaymentsTransferId: String,
        params: InboundRealTimePaymentsTransferReturnParams =
            InboundRealTimePaymentsTransferReturnParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RealTimePaymentsTransfer> =
        return_(
            params
                .toBuilder()
                .inboundRealTimePaymentsTransferId(inboundRealTimePaymentsTransferId)
                .build(),
            requestOptions,
        )

    /** @see return_ */
    fun return_(
        inboundRealTimePaymentsTransferId: String,
        params: InboundRealTimePaymentsTransferReturnParams =
            InboundRealTimePaymentsTransferReturnParams.none(),
    ): CompletableFuture<RealTimePaymentsTransfer> =
        return_(inboundRealTimePaymentsTransferId, params, RequestOptions.none())

    /** @see return_ */
    fun return_(
        params: InboundRealTimePaymentsTransferReturnParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RealTimePaymentsTransfer>

    /** @see return_ */
    fun return_(
        params: InboundRealTimePaymentsTransferReturnParams
    ): CompletableFuture<RealTimePaymentsTransfer> = return_(params, RequestOptions.none())

    /** @see return_ */
    fun return_(
        inboundRealTimePaymentsTransferId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RealTimePaymentsTransfer> =
        return_(
            inboundRealTimePaymentsTransferId,
            InboundRealTimePaymentsTransferReturnParams.none(),
            requestOptions,
        )

    /**
     * A view of [InboundRealTimePaymentsTransferServiceAsync] that provides access to raw HTTP
     * responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InboundRealTimePaymentsTransferServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /inbound_real_time_payments_transfers/{inbound_real_time_payments_transfer_id}`, but is
         * otherwise the same as [InboundRealTimePaymentsTransferServiceAsync.retrieve].
         */
        fun retrieve(
            inboundRealTimePaymentsTransferId: String
        ): CompletableFuture<HttpResponseFor<InboundRealTimePaymentsTransfer>> =
            retrieve(
                inboundRealTimePaymentsTransferId,
                InboundRealTimePaymentsTransferRetrieveParams.none(),
            )

        /** @see retrieve */
        fun retrieve(
            inboundRealTimePaymentsTransferId: String,
            params: InboundRealTimePaymentsTransferRetrieveParams =
                InboundRealTimePaymentsTransferRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundRealTimePaymentsTransfer>> =
            retrieve(
                params
                    .toBuilder()
                    .inboundRealTimePaymentsTransferId(inboundRealTimePaymentsTransferId)
                    .build(),
                requestOptions,
            )

        /** @see retrieve */
        fun retrieve(
            inboundRealTimePaymentsTransferId: String,
            params: InboundRealTimePaymentsTransferRetrieveParams =
                InboundRealTimePaymentsTransferRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<InboundRealTimePaymentsTransfer>> =
            retrieve(inboundRealTimePaymentsTransferId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: InboundRealTimePaymentsTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundRealTimePaymentsTransfer>>

        /** @see retrieve */
        fun retrieve(
            params: InboundRealTimePaymentsTransferRetrieveParams
        ): CompletableFuture<HttpResponseFor<InboundRealTimePaymentsTransfer>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            inboundRealTimePaymentsTransferId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InboundRealTimePaymentsTransfer>> =
            retrieve(
                inboundRealTimePaymentsTransferId,
                InboundRealTimePaymentsTransferRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /inbound_real_time_payments_transfers`, but is
         * otherwise the same as [InboundRealTimePaymentsTransferServiceAsync.list].
         */
        fun list():
            CompletableFuture<HttpResponseFor<InboundRealTimePaymentsTransferListPageAsync>> =
            list(InboundRealTimePaymentsTransferListParams.none())

        /** @see list */
        fun list(
            params: InboundRealTimePaymentsTransferListParams =
                InboundRealTimePaymentsTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundRealTimePaymentsTransferListPageAsync>>

        /** @see list */
        fun list(
            params: InboundRealTimePaymentsTransferListParams =
                InboundRealTimePaymentsTransferListParams.none()
        ): CompletableFuture<HttpResponseFor<InboundRealTimePaymentsTransferListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<InboundRealTimePaymentsTransferListPageAsync>> =
            list(InboundRealTimePaymentsTransferListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /inbound_real_time_payments_transfers/{inbound_real_time_payments_transfer_id}/return`,
         * but is otherwise the same as [InboundRealTimePaymentsTransferServiceAsync.return_].
         */
        fun return_(
            inboundRealTimePaymentsTransferId: String
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsTransfer>> =
            return_(
                inboundRealTimePaymentsTransferId,
                InboundRealTimePaymentsTransferReturnParams.none(),
            )

        /** @see return_ */
        fun return_(
            inboundRealTimePaymentsTransferId: String,
            params: InboundRealTimePaymentsTransferReturnParams =
                InboundRealTimePaymentsTransferReturnParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsTransfer>> =
            return_(
                params
                    .toBuilder()
                    .inboundRealTimePaymentsTransferId(inboundRealTimePaymentsTransferId)
                    .build(),
                requestOptions,
            )

        /** @see return_ */
        fun return_(
            inboundRealTimePaymentsTransferId: String,
            params: InboundRealTimePaymentsTransferReturnParams =
                InboundRealTimePaymentsTransferReturnParams.none(),
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsTransfer>> =
            return_(inboundRealTimePaymentsTransferId, params, RequestOptions.none())

        /** @see return_ */
        fun return_(
            params: InboundRealTimePaymentsTransferReturnParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsTransfer>>

        /** @see return_ */
        fun return_(
            params: InboundRealTimePaymentsTransferReturnParams
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsTransfer>> =
            return_(params, RequestOptions.none())

        /** @see return_ */
        fun return_(
            inboundRealTimePaymentsTransferId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsTransfer>> =
            return_(
                inboundRealTimePaymentsTransferId,
                InboundRealTimePaymentsTransferReturnParams.none(),
                requestOptions,
            )
    }
}
