// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.physicalcards.PhysicalCard
import com.increase.api.models.physicalcards.PhysicalCardCreateParams
import com.increase.api.models.physicalcards.PhysicalCardListPage
import com.increase.api.models.physicalcards.PhysicalCardListParams
import com.increase.api.models.physicalcards.PhysicalCardRetrieveParams
import com.increase.api.models.physicalcards.PhysicalCardUpdateParams

interface PhysicalCardService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a Physical Card */
    fun create(params: PhysicalCardCreateParams): PhysicalCard =
        create(
          params, RequestOptions.none()
        )

    /** @see [create] */
    fun create(params: PhysicalCardCreateParams, requestOptions: RequestOptions = RequestOptions.none()): PhysicalCard

    /** Retrieve a Physical Card */
    fun retrieve(params: PhysicalCardRetrieveParams): PhysicalCard =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see [retrieve] */
    fun retrieve(params: PhysicalCardRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): PhysicalCard

    /** Update a Physical Card */
    fun update(params: PhysicalCardUpdateParams): PhysicalCard =
        update(
          params, RequestOptions.none()
        )

    /** @see [update] */
    fun update(params: PhysicalCardUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): PhysicalCard

    /** List Physical Cards */
    fun list(): PhysicalCardListPage = list(PhysicalCardListParams.none())

    /** @see [list] */
    fun list(params: PhysicalCardListParams = PhysicalCardListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): PhysicalCardListPage

    /** @see [list] */
    fun list(params: PhysicalCardListParams = PhysicalCardListParams.none()): PhysicalCardListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see [list] */
    fun list(requestOptions: RequestOptions): PhysicalCardListPage = list(PhysicalCardListParams.none(), requestOptions)

    /**
     * A view of [PhysicalCardService] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /physical_cards`, but is otherwise the
         * same as [PhysicalCardService.create].
         */
        @MustBeClosed
        fun create(params: PhysicalCardCreateParams): HttpResponseFor<PhysicalCard> =
            create(
              params, RequestOptions.none()
            )

        /** @see [create] */
        @MustBeClosed
        fun create(params: PhysicalCardCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<PhysicalCard>

        /**
         * Returns a raw HTTP response for `get /physical_cards/{physical_card_id}`, but is
         * otherwise the same as [PhysicalCardService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: PhysicalCardRetrieveParams): HttpResponseFor<PhysicalCard> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: PhysicalCardRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<PhysicalCard>

        /**
         * Returns a raw HTTP response for `patch /physical_cards/{physical_card_id}`, but
         * is otherwise the same as [PhysicalCardService.update].
         */
        @MustBeClosed
        fun update(params: PhysicalCardUpdateParams): HttpResponseFor<PhysicalCard> =
            update(
              params, RequestOptions.none()
            )

        /** @see [update] */
        @MustBeClosed
        fun update(params: PhysicalCardUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<PhysicalCard>

        /**
         * Returns a raw HTTP response for `get /physical_cards`, but is otherwise the same
         * as [PhysicalCardService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<PhysicalCardListPage> = list(PhysicalCardListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(params: PhysicalCardListParams = PhysicalCardListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<PhysicalCardListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(params: PhysicalCardListParams = PhysicalCardListParams.none()): HttpResponseFor<PhysicalCardListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PhysicalCardListPage> = list(PhysicalCardListParams.none(), requestOptions)
    }
}
