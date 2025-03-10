// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.inboundwiredrawdownrequests.InboundWireDrawdownRequest
import com.increase.api.models.inboundwiredrawdownrequests.InboundWireDrawdownRequestListPage
import com.increase.api.models.inboundwiredrawdownrequests.InboundWireDrawdownRequestListParams
import com.increase.api.models.inboundwiredrawdownrequests.InboundWireDrawdownRequestRetrieveParams

interface InboundWireDrawdownRequestService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve an Inbound Wire Drawdown Request */
    fun retrieve(params: InboundWireDrawdownRequestRetrieveParams): InboundWireDrawdownRequest =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: InboundWireDrawdownRequestRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundWireDrawdownRequest

    /** List Inbound Wire Drawdown Requests */
    fun list(): InboundWireDrawdownRequestListPage =
        list(InboundWireDrawdownRequestListParams.none())

    /** @see [list] */
    fun list(
        params: InboundWireDrawdownRequestListParams = InboundWireDrawdownRequestListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundWireDrawdownRequestListPage

    /** @see [list] */
    fun list(
        params: InboundWireDrawdownRequestListParams = InboundWireDrawdownRequestListParams.none()
    ): InboundWireDrawdownRequestListPage = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): InboundWireDrawdownRequestListPage =
        list(InboundWireDrawdownRequestListParams.none(), requestOptions)

    /**
     * A view of [InboundWireDrawdownRequestService] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get
         * /inbound_wire_drawdown_requests/{inbound_wire_drawdown_request_id}`, but is otherwise the
         * same as [InboundWireDrawdownRequestService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: InboundWireDrawdownRequestRetrieveParams
        ): HttpResponseFor<InboundWireDrawdownRequest> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: InboundWireDrawdownRequestRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundWireDrawdownRequest>

        /**
         * Returns a raw HTTP response for `get /inbound_wire_drawdown_requests`, but is otherwise
         * the same as [InboundWireDrawdownRequestService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<InboundWireDrawdownRequestListPage> =
            list(InboundWireDrawdownRequestListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: InboundWireDrawdownRequestListParams =
                InboundWireDrawdownRequestListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundWireDrawdownRequestListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: InboundWireDrawdownRequestListParams =
                InboundWireDrawdownRequestListParams.none()
        ): HttpResponseFor<InboundWireDrawdownRequestListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<InboundWireDrawdownRequestListPage> =
            list(InboundWireDrawdownRequestListParams.none(), requestOptions)
    }
}
