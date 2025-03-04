// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.InboundWireTransfer
import com.increase.api.models.InboundWireTransferListPage
import com.increase.api.models.InboundWireTransferListParams
import com.increase.api.models.InboundWireTransferRetrieveParams

interface InboundWireTransferService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve an Inbound Wire Transfer */
    @JvmOverloads
    fun retrieve(
        params: InboundWireTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundWireTransfer

    /** List Inbound Wire Transfers */
    @JvmOverloads
    fun list(
        params: InboundWireTransferListParams = InboundWireTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundWireTransferListPage

    /** List Inbound Wire Transfers */
    fun list(requestOptions: RequestOptions): InboundWireTransferListPage =
        list(InboundWireTransferListParams.none(), requestOptions)

    /**
     * A view of [InboundWireTransferService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /inbound_wire_transfers/{inbound_wire_transfer_id}`,
         * but is otherwise the same as [InboundWireTransferService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: InboundWireTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundWireTransfer>

        /**
         * Returns a raw HTTP response for `get /inbound_wire_transfers`, but is otherwise the same
         * as [InboundWireTransferService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: InboundWireTransferListParams = InboundWireTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundWireTransferListPage>

        /**
         * Returns a raw HTTP response for `get /inbound_wire_transfers`, but is otherwise the same
         * as [InboundWireTransferService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<InboundWireTransferListPage> =
            list(InboundWireTransferListParams.none(), requestOptions)
    }
}
