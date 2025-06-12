// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.wiredrawdownrequests.WireDrawdownRequest
import com.increase.api.models.wiredrawdownrequests.WireDrawdownRequestCreateParams
import com.increase.api.models.wiredrawdownrequests.WireDrawdownRequestListPage
import com.increase.api.models.wiredrawdownrequests.WireDrawdownRequestListParams
import com.increase.api.models.wiredrawdownrequests.WireDrawdownRequestRetrieveParams
import java.util.function.Consumer

interface WireDrawdownRequestService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WireDrawdownRequestService

    /** Create a Wire Drawdown Request */
    fun create(params: WireDrawdownRequestCreateParams): WireDrawdownRequest =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: WireDrawdownRequestCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireDrawdownRequest

    /** Retrieve a Wire Drawdown Request */
    fun retrieve(wireDrawdownRequestId: String): WireDrawdownRequest =
        retrieve(wireDrawdownRequestId, WireDrawdownRequestRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        wireDrawdownRequestId: String,
        params: WireDrawdownRequestRetrieveParams = WireDrawdownRequestRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireDrawdownRequest =
        retrieve(
            params.toBuilder().wireDrawdownRequestId(wireDrawdownRequestId).build(),
            requestOptions,
        )

    /** @see [retrieve] */
    fun retrieve(
        wireDrawdownRequestId: String,
        params: WireDrawdownRequestRetrieveParams = WireDrawdownRequestRetrieveParams.none(),
    ): WireDrawdownRequest = retrieve(wireDrawdownRequestId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: WireDrawdownRequestRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireDrawdownRequest

    /** @see [retrieve] */
    fun retrieve(params: WireDrawdownRequestRetrieveParams): WireDrawdownRequest =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        wireDrawdownRequestId: String,
        requestOptions: RequestOptions,
    ): WireDrawdownRequest =
        retrieve(wireDrawdownRequestId, WireDrawdownRequestRetrieveParams.none(), requestOptions)

    /** List Wire Drawdown Requests */
    fun list(): WireDrawdownRequestListPage = list(WireDrawdownRequestListParams.none())

    /** @see [list] */
    fun list(
        params: WireDrawdownRequestListParams = WireDrawdownRequestListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireDrawdownRequestListPage

    /** @see [list] */
    fun list(
        params: WireDrawdownRequestListParams = WireDrawdownRequestListParams.none()
    ): WireDrawdownRequestListPage = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): WireDrawdownRequestListPage =
        list(WireDrawdownRequestListParams.none(), requestOptions)

    /**
     * A view of [WireDrawdownRequestService] that provides access to raw HTTP responses for each
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
        ): WireDrawdownRequestService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /wire_drawdown_requests`, but is otherwise the same
         * as [WireDrawdownRequestService.create].
         */
        @MustBeClosed
        fun create(params: WireDrawdownRequestCreateParams): HttpResponseFor<WireDrawdownRequest> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: WireDrawdownRequestCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WireDrawdownRequest>

        /**
         * Returns a raw HTTP response for `get /wire_drawdown_requests/{wire_drawdown_request_id}`,
         * but is otherwise the same as [WireDrawdownRequestService.retrieve].
         */
        @MustBeClosed
        fun retrieve(wireDrawdownRequestId: String): HttpResponseFor<WireDrawdownRequest> =
            retrieve(wireDrawdownRequestId, WireDrawdownRequestRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            wireDrawdownRequestId: String,
            params: WireDrawdownRequestRetrieveParams = WireDrawdownRequestRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WireDrawdownRequest> =
            retrieve(
                params.toBuilder().wireDrawdownRequestId(wireDrawdownRequestId).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            wireDrawdownRequestId: String,
            params: WireDrawdownRequestRetrieveParams = WireDrawdownRequestRetrieveParams.none(),
        ): HttpResponseFor<WireDrawdownRequest> =
            retrieve(wireDrawdownRequestId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: WireDrawdownRequestRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WireDrawdownRequest>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: WireDrawdownRequestRetrieveParams
        ): HttpResponseFor<WireDrawdownRequest> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            wireDrawdownRequestId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WireDrawdownRequest> =
            retrieve(
                wireDrawdownRequestId,
                WireDrawdownRequestRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /wire_drawdown_requests`, but is otherwise the same
         * as [WireDrawdownRequestService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<WireDrawdownRequestListPage> =
            list(WireDrawdownRequestListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: WireDrawdownRequestListParams = WireDrawdownRequestListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WireDrawdownRequestListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: WireDrawdownRequestListParams = WireDrawdownRequestListParams.none()
        ): HttpResponseFor<WireDrawdownRequestListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<WireDrawdownRequestListPage> =
            list(WireDrawdownRequestListParams.none(), requestOptions)
    }
}
