// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.physicalcards.PhysicalCard
import com.increase.api.models.physicalcards.PhysicalCardCreateParams
import com.increase.api.models.physicalcards.PhysicalCardListPageAsync
import com.increase.api.models.physicalcards.PhysicalCardListParams
import com.increase.api.models.physicalcards.PhysicalCardRetrieveParams
import com.increase.api.models.physicalcards.PhysicalCardUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PhysicalCardServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PhysicalCardServiceAsync

    /** Create a Physical Card */
    fun create(params: PhysicalCardCreateParams): CompletableFuture<PhysicalCard> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: PhysicalCardCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhysicalCard>

    /** Retrieve a Physical Card */
    fun retrieve(physicalCardId: String): CompletableFuture<PhysicalCard> =
        retrieve(physicalCardId, PhysicalCardRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        physicalCardId: String,
        params: PhysicalCardRetrieveParams = PhysicalCardRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhysicalCard> =
        retrieve(params.toBuilder().physicalCardId(physicalCardId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        physicalCardId: String,
        params: PhysicalCardRetrieveParams = PhysicalCardRetrieveParams.none(),
    ): CompletableFuture<PhysicalCard> = retrieve(physicalCardId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: PhysicalCardRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhysicalCard>

    /** @see [retrieve] */
    fun retrieve(params: PhysicalCardRetrieveParams): CompletableFuture<PhysicalCard> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        physicalCardId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhysicalCard> =
        retrieve(physicalCardId, PhysicalCardRetrieveParams.none(), requestOptions)

    /** Update a Physical Card */
    fun update(
        physicalCardId: String,
        params: PhysicalCardUpdateParams,
    ): CompletableFuture<PhysicalCard> = update(physicalCardId, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        physicalCardId: String,
        params: PhysicalCardUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhysicalCard> =
        update(params.toBuilder().physicalCardId(physicalCardId).build(), requestOptions)

    /** @see [update] */
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
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PhysicalCardServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /physical_cards`, but is otherwise the same as
         * [PhysicalCardServiceAsync.create].
         */
        fun create(
            params: PhysicalCardCreateParams
        ): CompletableFuture<HttpResponseFor<PhysicalCard>> = create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: PhysicalCardCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhysicalCard>>

        /**
         * Returns a raw HTTP response for `get /physical_cards/{physical_card_id}`, but is
         * otherwise the same as [PhysicalCardServiceAsync.retrieve].
         */
        fun retrieve(physicalCardId: String): CompletableFuture<HttpResponseFor<PhysicalCard>> =
            retrieve(physicalCardId, PhysicalCardRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            physicalCardId: String,
            params: PhysicalCardRetrieveParams = PhysicalCardRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhysicalCard>> =
            retrieve(params.toBuilder().physicalCardId(physicalCardId).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            physicalCardId: String,
            params: PhysicalCardRetrieveParams = PhysicalCardRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<PhysicalCard>> =
            retrieve(physicalCardId, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: PhysicalCardRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhysicalCard>>

        /** @see [retrieve] */
        fun retrieve(
            params: PhysicalCardRetrieveParams
        ): CompletableFuture<HttpResponseFor<PhysicalCard>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            physicalCardId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PhysicalCard>> =
            retrieve(physicalCardId, PhysicalCardRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /physical_cards/{physical_card_id}`, but is
         * otherwise the same as [PhysicalCardServiceAsync.update].
         */
        fun update(
            physicalCardId: String,
            params: PhysicalCardUpdateParams,
        ): CompletableFuture<HttpResponseFor<PhysicalCard>> =
            update(physicalCardId, params, RequestOptions.none())

        /** @see [update] */
        fun update(
            physicalCardId: String,
            params: PhysicalCardUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhysicalCard>> =
            update(params.toBuilder().physicalCardId(physicalCardId).build(), requestOptions)

        /** @see [update] */
        fun update(
            params: PhysicalCardUpdateParams
        ): CompletableFuture<HttpResponseFor<PhysicalCard>> = update(params, RequestOptions.none())

        /** @see [update] */
        fun update(
            params: PhysicalCardUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhysicalCard>>

        /**
         * Returns a raw HTTP response for `get /physical_cards`, but is otherwise the same as
         * [PhysicalCardServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<PhysicalCardListPageAsync>> =
            list(PhysicalCardListParams.none())

        /** @see [list] */
        fun list(
            params: PhysicalCardListParams = PhysicalCardListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhysicalCardListPageAsync>>

        /** @see [list] */
        fun list(
            params: PhysicalCardListParams = PhysicalCardListParams.none()
        ): CompletableFuture<HttpResponseFor<PhysicalCardListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PhysicalCardListPageAsync>> =
            list(PhysicalCardListParams.none(), requestOptions)
    }
}
