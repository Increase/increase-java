// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.inboundwiredrawdownrequests.InboundWireDrawdownRequest
import com.increase.api.models.inboundwiredrawdownrequests.InboundWireDrawdownRequestListPage
import com.increase.api.models.inboundwiredrawdownrequests.InboundWireDrawdownRequestListParams
import com.increase.api.models.inboundwiredrawdownrequests.InboundWireDrawdownRequestRetrieveParams
import java.util.function.Consumer

interface InboundWireDrawdownRequestService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InboundWireDrawdownRequestService

    /** Retrieve an Inbound Wire Drawdown Request */
    fun retrieve(inboundWireDrawdownRequestId: String): InboundWireDrawdownRequest =
        retrieve(inboundWireDrawdownRequestId, InboundWireDrawdownRequestRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        inboundWireDrawdownRequestId: String,
        params: InboundWireDrawdownRequestRetrieveParams =
            InboundWireDrawdownRequestRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundWireDrawdownRequest =
        retrieve(
            params.toBuilder().inboundWireDrawdownRequestId(inboundWireDrawdownRequestId).build(),
            requestOptions,
        )

    /** @see [retrieve] */
    fun retrieve(
        inboundWireDrawdownRequestId: String,
        params: InboundWireDrawdownRequestRetrieveParams =
            InboundWireDrawdownRequestRetrieveParams.none(),
    ): InboundWireDrawdownRequest =
        retrieve(inboundWireDrawdownRequestId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: InboundWireDrawdownRequestRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundWireDrawdownRequest

    /** @see [retrieve] */
    fun retrieve(params: InboundWireDrawdownRequestRetrieveParams): InboundWireDrawdownRequest =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        inboundWireDrawdownRequestId: String,
        requestOptions: RequestOptions,
    ): InboundWireDrawdownRequest =
        retrieve(
            inboundWireDrawdownRequestId,
            InboundWireDrawdownRequestRetrieveParams.none(),
            requestOptions,
        )

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
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InboundWireDrawdownRequestService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /inbound_wire_drawdown_requests/{inbound_wire_drawdown_request_id}`, but is otherwise the
         * same as [InboundWireDrawdownRequestService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            inboundWireDrawdownRequestId: String
        ): HttpResponseFor<InboundWireDrawdownRequest> =
            retrieve(inboundWireDrawdownRequestId, InboundWireDrawdownRequestRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            inboundWireDrawdownRequestId: String,
            params: InboundWireDrawdownRequestRetrieveParams =
                InboundWireDrawdownRequestRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundWireDrawdownRequest> =
            retrieve(
                params
                    .toBuilder()
                    .inboundWireDrawdownRequestId(inboundWireDrawdownRequestId)
                    .build(),
                requestOptions,
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            inboundWireDrawdownRequestId: String,
            params: InboundWireDrawdownRequestRetrieveParams =
                InboundWireDrawdownRequestRetrieveParams.none(),
        ): HttpResponseFor<InboundWireDrawdownRequest> =
            retrieve(inboundWireDrawdownRequestId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: InboundWireDrawdownRequestRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundWireDrawdownRequest>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: InboundWireDrawdownRequestRetrieveParams
        ): HttpResponseFor<InboundWireDrawdownRequest> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            inboundWireDrawdownRequestId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundWireDrawdownRequest> =
            retrieve(
                inboundWireDrawdownRequestId,
                InboundWireDrawdownRequestRetrieveParams.none(),
                requestOptions,
            )

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
