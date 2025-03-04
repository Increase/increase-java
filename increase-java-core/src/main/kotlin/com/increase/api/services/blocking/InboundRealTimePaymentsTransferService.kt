// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.InboundRealTimePaymentsTransfer
import com.increase.api.models.InboundRealTimePaymentsTransferListPage
import com.increase.api.models.InboundRealTimePaymentsTransferListParams
import com.increase.api.models.InboundRealTimePaymentsTransferRetrieveParams

interface InboundRealTimePaymentsTransferService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve an Inbound Real-Time Payments Transfer */
    @JvmOverloads
    fun retrieve(
        params: InboundRealTimePaymentsTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundRealTimePaymentsTransfer

    /** List Inbound Real-Time Payments Transfers */
    @JvmOverloads
    fun list(
        params: InboundRealTimePaymentsTransferListParams =
            InboundRealTimePaymentsTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundRealTimePaymentsTransferListPage

    /** List Inbound Real-Time Payments Transfers */
    fun list(requestOptions: RequestOptions): InboundRealTimePaymentsTransferListPage =
        list(InboundRealTimePaymentsTransferListParams.none(), requestOptions)

    /**
     * A view of [InboundRealTimePaymentsTransferService] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get
         * /inbound_real_time_payments_transfers/{inbound_real_time_payments_transfer_id}`, but is
         * otherwise the same as [InboundRealTimePaymentsTransferService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: InboundRealTimePaymentsTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundRealTimePaymentsTransfer>

        /**
         * Returns a raw HTTP response for `get /inbound_real_time_payments_transfers`, but is
         * otherwise the same as [InboundRealTimePaymentsTransferService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: InboundRealTimePaymentsTransferListParams =
                InboundRealTimePaymentsTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundRealTimePaymentsTransferListPage>

        /**
         * Returns a raw HTTP response for `get /inbound_real_time_payments_transfers`, but is
         * otherwise the same as [InboundRealTimePaymentsTransferService.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<InboundRealTimePaymentsTransferListPage> =
            list(InboundRealTimePaymentsTransferListParams.none(), requestOptions)
    }
}
