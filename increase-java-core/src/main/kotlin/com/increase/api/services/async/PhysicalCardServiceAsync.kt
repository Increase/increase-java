// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.PhysicalCard
import com.increase.api.models.PhysicalCardCreateParams
import com.increase.api.models.PhysicalCardListPageAsync
import com.increase.api.models.PhysicalCardListParams
import com.increase.api.models.PhysicalCardRetrieveParams
import com.increase.api.models.PhysicalCardUpdateParams
import java.util.concurrent.CompletableFuture

interface PhysicalCardServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a Physical Card */
    @JvmOverloads
    fun create(
        params: PhysicalCardCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhysicalCard>

    /** Retrieve a Physical Card */
    @JvmOverloads
    fun retrieve(
        params: PhysicalCardRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhysicalCard>

    /** Update a Physical Card */
    @JvmOverloads
    fun update(
        params: PhysicalCardUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhysicalCard>

    /** List Physical Cards */
    @JvmOverloads
    fun list(
        params: PhysicalCardListParams = PhysicalCardListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhysicalCardListPageAsync>

    /** List Physical Cards */
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
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: PhysicalCardCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhysicalCard>>

        /**
         * Returns a raw HTTP response for `get /physical_cards/{physical_card_id}`, but is
         * otherwise the same as [PhysicalCardServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: PhysicalCardRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhysicalCard>>

        /**
         * Returns a raw HTTP response for `patch /physical_cards/{physical_card_id}`, but is
         * otherwise the same as [PhysicalCardServiceAsync.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: PhysicalCardUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhysicalCard>>

        /**
         * Returns a raw HTTP response for `get /physical_cards`, but is otherwise the same as
         * [PhysicalCardServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: PhysicalCardListParams = PhysicalCardListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhysicalCardListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /physical_cards`, but is otherwise the same as
         * [PhysicalCardServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PhysicalCardListPageAsync>> =
            list(PhysicalCardListParams.none(), requestOptions)
    }
}
