// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.PhysicalCard
import com.increase.api.models.PhysicalCardCreateParams
import com.increase.api.models.PhysicalCardListPage
import com.increase.api.models.PhysicalCardListParams
import com.increase.api.models.PhysicalCardRetrieveParams
import com.increase.api.models.PhysicalCardUpdateParams

interface PhysicalCardService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a Physical Card */
    @JvmOverloads
    fun create(
        params: PhysicalCardCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhysicalCard

    /** Retrieve a Physical Card */
    @JvmOverloads
    fun retrieve(
        params: PhysicalCardRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhysicalCard

    /** Update a Physical Card */
    @JvmOverloads
    fun update(
        params: PhysicalCardUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhysicalCard

    /** List Physical Cards */
    @JvmOverloads
    fun list(
        params: PhysicalCardListParams = PhysicalCardListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhysicalCardListPage

    /** List Physical Cards */
    fun list(requestOptions: RequestOptions): PhysicalCardListPage =
        list(PhysicalCardListParams.none(), requestOptions)

    /**
     * A view of [PhysicalCardService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /physical_cards`, but is otherwise the same as
         * [PhysicalCardService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: PhysicalCardCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhysicalCard>

        /**
         * Returns a raw HTTP response for `get /physical_cards/{physical_card_id}`, but is
         * otherwise the same as [PhysicalCardService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: PhysicalCardRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhysicalCard>

        /**
         * Returns a raw HTTP response for `patch /physical_cards/{physical_card_id}`, but is
         * otherwise the same as [PhysicalCardService.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: PhysicalCardUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhysicalCard>

        /**
         * Returns a raw HTTP response for `get /physical_cards`, but is otherwise the same as
         * [PhysicalCardService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: PhysicalCardListParams = PhysicalCardListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhysicalCardListPage>

        /**
         * Returns a raw HTTP response for `get /physical_cards`, but is otherwise the same as
         * [PhysicalCardService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PhysicalCardListPage> =
            list(PhysicalCardListParams.none(), requestOptions)
    }
}
