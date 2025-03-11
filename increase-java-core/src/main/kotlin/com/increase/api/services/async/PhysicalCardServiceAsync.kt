// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.physicalcards.PhysicalCard
import com.increase.api.models.physicalcards.PhysicalCardCreateParams
import com.increase.api.models.physicalcards.PhysicalCardListPageAsync
import com.increase.api.models.physicalcards.PhysicalCardListParams
import com.increase.api.models.physicalcards.PhysicalCardRetrieveParams
import com.increase.api.models.physicalcards.PhysicalCardUpdateParams
import java.util.concurrent.CompletableFuture

interface PhysicalCardServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a Physical Card */
    fun create(params: PhysicalCardCreateParams): CompletableFuture<PhysicalCard> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: PhysicalCardCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhysicalCard>

    /** Retrieve a Physical Card */
    fun retrieve(params: PhysicalCardRetrieveParams): CompletableFuture<PhysicalCard> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: PhysicalCardRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhysicalCard>

    /** Update a Physical Card */
    fun update(params: PhysicalCardUpdateParams): CompletableFuture<PhysicalCard> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: PhysicalCardUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhysicalCard>

    /** List Physical Cards */
    fun list(): CompletableFuture<PhysicalCardListPageAsync> = list(PhysicalCardListParams.none())

    /** @see [list] */
    fun list(
        params: PhysicalCardListParams = PhysicalCardListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhysicalCardListPageAsync>

    /** @see [list] */
    fun list(
        params: PhysicalCardListParams = PhysicalCardListParams.none()
    ): CompletableFuture<PhysicalCardListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<PhysicalCardListPageAsync> =
        list(PhysicalCardListParams.none(), requestOptions)

    /**
     * A view of [PhysicalCardServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /physical_cards`, but is otherwise the same as
         * [PhysicalCardServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: PhysicalCardCreateParams
        ): CompletableFuture<HttpResponseFor<PhysicalCard>> = create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: PhysicalCardCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhysicalCard>>

        /**
         * Returns a raw HTTP response for `get /physical_cards/{physical_card_id}`, but is
         * otherwise the same as [PhysicalCardServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: PhysicalCardRetrieveParams
        ): CompletableFuture<HttpResponseFor<PhysicalCard>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: PhysicalCardRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhysicalCard>>

        /**
         * Returns a raw HTTP response for `patch /physical_cards/{physical_card_id}`, but is
         * otherwise the same as [PhysicalCardServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            params: PhysicalCardUpdateParams
        ): CompletableFuture<HttpResponseFor<PhysicalCard>> = update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: PhysicalCardUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhysicalCard>>

        /**
         * Returns a raw HTTP response for `get /physical_cards`, but is otherwise the same as
         * [PhysicalCardServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<PhysicalCardListPageAsync>> =
            list(PhysicalCardListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PhysicalCardListParams = PhysicalCardListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhysicalCardListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PhysicalCardListParams = PhysicalCardListParams.none()
        ): CompletableFuture<HttpResponseFor<PhysicalCardListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PhysicalCardListPageAsync>> =
            list(PhysicalCardListParams.none(), requestOptions)
    }
}
