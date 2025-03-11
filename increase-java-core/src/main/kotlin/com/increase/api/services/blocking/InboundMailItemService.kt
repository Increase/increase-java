// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.inboundmailitems.InboundMailItem
import com.increase.api.models.inboundmailitems.InboundMailItemListPage
import com.increase.api.models.inboundmailitems.InboundMailItemListParams
import com.increase.api.models.inboundmailitems.InboundMailItemRetrieveParams

interface InboundMailItemService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve an Inbound Mail Item */
    fun retrieve(params: InboundMailItemRetrieveParams): InboundMailItem =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see [retrieve] */
    fun retrieve(params: InboundMailItemRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): InboundMailItem

    /** List Inbound Mail Items */
    fun list(): InboundMailItemListPage = list(InboundMailItemListParams.none())

    /** @see [list] */
    fun list(params: InboundMailItemListParams = InboundMailItemListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): InboundMailItemListPage

    /** @see [list] */
    fun list(params: InboundMailItemListParams = InboundMailItemListParams.none()): InboundMailItemListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see [list] */
    fun list(requestOptions: RequestOptions): InboundMailItemListPage = list(InboundMailItemListParams.none(), requestOptions)

    /**
     * A view of [InboundMailItemService] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for
         * `get /inbound_mail_items/{inbound_mail_item_id}`, but is otherwise the same as
         * [InboundMailItemService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: InboundMailItemRetrieveParams): HttpResponseFor<InboundMailItem> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: InboundMailItemRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<InboundMailItem>

        /**
         * Returns a raw HTTP response for `get /inbound_mail_items`, but is otherwise the
         * same as [InboundMailItemService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<InboundMailItemListPage> = list(InboundMailItemListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(params: InboundMailItemListParams = InboundMailItemListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<InboundMailItemListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(params: InboundMailItemListParams = InboundMailItemListParams.none()): HttpResponseFor<InboundMailItemListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<InboundMailItemListPage> = list(InboundMailItemListParams.none(), requestOptions)
    }
}
