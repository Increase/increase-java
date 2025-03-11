// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.inboundrealtimepaymentstransfers.InboundRealTimePaymentsTransfer
import com.increase.api.models.inboundrealtimepaymentstransfers.InboundRealTimePaymentsTransferListPage
import com.increase.api.models.inboundrealtimepaymentstransfers.InboundRealTimePaymentsTransferListParams
import com.increase.api.models.inboundrealtimepaymentstransfers.InboundRealTimePaymentsTransferRetrieveParams

interface InboundRealTimePaymentsTransferService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve an Inbound Real-Time Payments Transfer */
    fun retrieve(params: InboundRealTimePaymentsTransferRetrieveParams): InboundRealTimePaymentsTransfer =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see [retrieve] */
    fun retrieve(params: InboundRealTimePaymentsTransferRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): InboundRealTimePaymentsTransfer

    /** List Inbound Real-Time Payments Transfers */
    fun list(): InboundRealTimePaymentsTransferListPage = list(InboundRealTimePaymentsTransferListParams.none())

    /** @see [list] */
    fun list(params: InboundRealTimePaymentsTransferListParams = InboundRealTimePaymentsTransferListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): InboundRealTimePaymentsTransferListPage

    /** @see [list] */
    fun list(params: InboundRealTimePaymentsTransferListParams = InboundRealTimePaymentsTransferListParams.none()): InboundRealTimePaymentsTransferListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see [list] */
    fun list(requestOptions: RequestOptions): InboundRealTimePaymentsTransferListPage = list(InboundRealTimePaymentsTransferListParams.none(), requestOptions)

    /**
     * A view of [InboundRealTimePaymentsTransferService] that provides access to raw
     * HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for
         * `get /inbound_real_time_payments_transfers/{inbound_real_time_payments_transfer_id}`,
         * but is otherwise the same as [InboundRealTimePaymentsTransferService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: InboundRealTimePaymentsTransferRetrieveParams): HttpResponseFor<InboundRealTimePaymentsTransfer> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: InboundRealTimePaymentsTransferRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<InboundRealTimePaymentsTransfer>

        /**
         * Returns a raw HTTP response for `get /inbound_real_time_payments_transfers`, but
         * is otherwise the same as [InboundRealTimePaymentsTransferService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<InboundRealTimePaymentsTransferListPage> = list(InboundRealTimePaymentsTransferListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(params: InboundRealTimePaymentsTransferListParams = InboundRealTimePaymentsTransferListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<InboundRealTimePaymentsTransferListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(params: InboundRealTimePaymentsTransferListParams = InboundRealTimePaymentsTransferListParams.none()): HttpResponseFor<InboundRealTimePaymentsTransferListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<InboundRealTimePaymentsTransferListPage> = list(InboundRealTimePaymentsTransferListParams.none(), requestOptions)
    }
}
