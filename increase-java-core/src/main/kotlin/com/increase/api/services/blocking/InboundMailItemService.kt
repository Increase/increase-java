// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.inboundmailitems.InboundMailItem
import com.increase.api.models.inboundmailitems.InboundMailItemActionParams
import com.increase.api.models.inboundmailitems.InboundMailItemListPage
import com.increase.api.models.inboundmailitems.InboundMailItemListParams
import com.increase.api.models.inboundmailitems.InboundMailItemRetrieveParams
import java.util.function.Consumer

interface InboundMailItemService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InboundMailItemService

    /** Retrieve an Inbound Mail Item */
    fun retrieve(inboundMailItemId: String): InboundMailItem =
        retrieve(inboundMailItemId, InboundMailItemRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        inboundMailItemId: String,
        params: InboundMailItemRetrieveParams = InboundMailItemRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundMailItem =
        retrieve(params.toBuilder().inboundMailItemId(inboundMailItemId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        inboundMailItemId: String,
        params: InboundMailItemRetrieveParams = InboundMailItemRetrieveParams.none(),
    ): InboundMailItem = retrieve(inboundMailItemId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: InboundMailItemRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundMailItem

    /** @see retrieve */
    fun retrieve(params: InboundMailItemRetrieveParams): InboundMailItem =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(inboundMailItemId: String, requestOptions: RequestOptions): InboundMailItem =
        retrieve(inboundMailItemId, InboundMailItemRetrieveParams.none(), requestOptions)

    /** List Inbound Mail Items */
    fun list(): InboundMailItemListPage = list(InboundMailItemListParams.none())

    /** @see list */
    fun list(
        params: InboundMailItemListParams = InboundMailItemListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundMailItemListPage

    /** @see list */
    fun list(
        params: InboundMailItemListParams = InboundMailItemListParams.none()
    ): InboundMailItemListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): InboundMailItemListPage =
        list(InboundMailItemListParams.none(), requestOptions)

    /** Action an Inbound Mail Item */
    fun action(inboundMailItemId: String, params: InboundMailItemActionParams): InboundMailItem =
        action(inboundMailItemId, params, RequestOptions.none())

    /** @see action */
    fun action(
        inboundMailItemId: String,
        params: InboundMailItemActionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundMailItem =
        action(params.toBuilder().inboundMailItemId(inboundMailItemId).build(), requestOptions)

    /** @see action */
    fun action(params: InboundMailItemActionParams): InboundMailItem =
        action(params, RequestOptions.none())

    /** @see action */
    fun action(
        params: InboundMailItemActionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundMailItem

    /**
     * A view of [InboundMailItemService] that provides access to raw HTTP responses for each
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
        ): InboundMailItemService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /inbound_mail_items/{inbound_mail_item_id}`, but is
         * otherwise the same as [InboundMailItemService.retrieve].
         */
        @MustBeClosed
        fun retrieve(inboundMailItemId: String): HttpResponseFor<InboundMailItem> =
            retrieve(inboundMailItemId, InboundMailItemRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            inboundMailItemId: String,
            params: InboundMailItemRetrieveParams = InboundMailItemRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundMailItem> =
            retrieve(
                params.toBuilder().inboundMailItemId(inboundMailItemId).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            inboundMailItemId: String,
            params: InboundMailItemRetrieveParams = InboundMailItemRetrieveParams.none(),
        ): HttpResponseFor<InboundMailItem> =
            retrieve(inboundMailItemId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: InboundMailItemRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundMailItem>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: InboundMailItemRetrieveParams): HttpResponseFor<InboundMailItem> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            inboundMailItemId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundMailItem> =
            retrieve(inboundMailItemId, InboundMailItemRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /inbound_mail_items`, but is otherwise the same as
         * [InboundMailItemService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<InboundMailItemListPage> =
            list(InboundMailItemListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: InboundMailItemListParams = InboundMailItemListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundMailItemListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: InboundMailItemListParams = InboundMailItemListParams.none()
        ): HttpResponseFor<InboundMailItemListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<InboundMailItemListPage> =
            list(InboundMailItemListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /inbound_mail_items/{inbound_mail_item_id}/action`,
         * but is otherwise the same as [InboundMailItemService.action].
         */
        @MustBeClosed
        fun action(
            inboundMailItemId: String,
            params: InboundMailItemActionParams,
        ): HttpResponseFor<InboundMailItem> =
            action(inboundMailItemId, params, RequestOptions.none())

        /** @see action */
        @MustBeClosed
        fun action(
            inboundMailItemId: String,
            params: InboundMailItemActionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundMailItem> =
            action(params.toBuilder().inboundMailItemId(inboundMailItemId).build(), requestOptions)

        /** @see action */
        @MustBeClosed
        fun action(params: InboundMailItemActionParams): HttpResponseFor<InboundMailItem> =
            action(params, RequestOptions.none())

        /** @see action */
        @MustBeClosed
        fun action(
            params: InboundMailItemActionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundMailItem>
    }
}
