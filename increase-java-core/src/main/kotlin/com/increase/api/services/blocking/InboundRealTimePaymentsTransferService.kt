// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.inboundrealtimepaymentstransfers.InboundRealTimePaymentsTransfer
import com.increase.api.models.inboundrealtimepaymentstransfers.InboundRealTimePaymentsTransferListParams
import com.increase.api.models.inboundrealtimepaymentstransfers.InboundRealTimePaymentsTransferListResponse
import com.increase.api.models.inboundrealtimepaymentstransfers.InboundRealTimePaymentsTransferRetrieveParams
import java.util.function.Consumer

interface InboundRealTimePaymentsTransferService {

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
    ): InboundRealTimePaymentsTransferService

    /** Retrieve an Inbound Real-Time Payments Transfer */
    fun retrieve(inboundRealTimePaymentsTransferId: String): InboundRealTimePaymentsTransfer =
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
    ): InboundRealTimePaymentsTransfer =
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
    ): InboundRealTimePaymentsTransfer =
        retrieve(inboundRealTimePaymentsTransferId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: InboundRealTimePaymentsTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundRealTimePaymentsTransfer

    /** @see retrieve */
    fun retrieve(
        params: InboundRealTimePaymentsTransferRetrieveParams
    ): InboundRealTimePaymentsTransfer = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        inboundRealTimePaymentsTransferId: String,
        requestOptions: RequestOptions,
    ): InboundRealTimePaymentsTransfer =
        retrieve(
            inboundRealTimePaymentsTransferId,
            InboundRealTimePaymentsTransferRetrieveParams.none(),
            requestOptions,
        )

    /** List Inbound Real-Time Payments Transfers */
    fun list(): InboundRealTimePaymentsTransferListResponse =
        list(InboundRealTimePaymentsTransferListParams.none())

    /** @see list */
    fun list(
        params: InboundRealTimePaymentsTransferListParams =
            InboundRealTimePaymentsTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundRealTimePaymentsTransferListResponse

    /** @see list */
    fun list(
        params: InboundRealTimePaymentsTransferListParams =
            InboundRealTimePaymentsTransferListParams.none()
    ): InboundRealTimePaymentsTransferListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): InboundRealTimePaymentsTransferListResponse =
        list(InboundRealTimePaymentsTransferListParams.none(), requestOptions)

    /**
     * A view of [InboundRealTimePaymentsTransferService] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InboundRealTimePaymentsTransferService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /inbound_real_time_payments_transfers/{inbound_real_time_payments_transfer_id}`, but is
         * otherwise the same as [InboundRealTimePaymentsTransferService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            inboundRealTimePaymentsTransferId: String
        ): HttpResponseFor<InboundRealTimePaymentsTransfer> =
            retrieve(
                inboundRealTimePaymentsTransferId,
                InboundRealTimePaymentsTransferRetrieveParams.none(),
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            inboundRealTimePaymentsTransferId: String,
            params: InboundRealTimePaymentsTransferRetrieveParams =
                InboundRealTimePaymentsTransferRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundRealTimePaymentsTransfer> =
            retrieve(
                params
                    .toBuilder()
                    .inboundRealTimePaymentsTransferId(inboundRealTimePaymentsTransferId)
                    .build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            inboundRealTimePaymentsTransferId: String,
            params: InboundRealTimePaymentsTransferRetrieveParams =
                InboundRealTimePaymentsTransferRetrieveParams.none(),
        ): HttpResponseFor<InboundRealTimePaymentsTransfer> =
            retrieve(inboundRealTimePaymentsTransferId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: InboundRealTimePaymentsTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundRealTimePaymentsTransfer>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: InboundRealTimePaymentsTransferRetrieveParams
        ): HttpResponseFor<InboundRealTimePaymentsTransfer> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            inboundRealTimePaymentsTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundRealTimePaymentsTransfer> =
            retrieve(
                inboundRealTimePaymentsTransferId,
                InboundRealTimePaymentsTransferRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /inbound_real_time_payments_transfers`, but is
         * otherwise the same as [InboundRealTimePaymentsTransferService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<InboundRealTimePaymentsTransferListResponse> =
            list(InboundRealTimePaymentsTransferListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: InboundRealTimePaymentsTransferListParams =
                InboundRealTimePaymentsTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundRealTimePaymentsTransferListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: InboundRealTimePaymentsTransferListParams =
                InboundRealTimePaymentsTransferListParams.none()
        ): HttpResponseFor<InboundRealTimePaymentsTransferListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<InboundRealTimePaymentsTransferListResponse> =
            list(InboundRealTimePaymentsTransferListParams.none(), requestOptions)
    }
}
