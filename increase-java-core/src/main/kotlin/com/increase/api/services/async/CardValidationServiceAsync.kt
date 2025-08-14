// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.cardvalidations.CardValidation
import com.increase.api.models.cardvalidations.CardValidationCreateParams
import com.increase.api.models.cardvalidations.CardValidationListPageAsync
import com.increase.api.models.cardvalidations.CardValidationListParams
import com.increase.api.models.cardvalidations.CardValidationRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CardValidationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardValidationServiceAsync

    /** Create a Card Validation */
    fun create(params: CardValidationCreateParams): CompletableFuture<CardValidation> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CardValidationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardValidation>

    /** Retrieve a Card Validation */
    fun retrieve(cardValidationId: String): CompletableFuture<CardValidation> =
        retrieve(cardValidationId, CardValidationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        cardValidationId: String,
        params: CardValidationRetrieveParams = CardValidationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardValidation> =
        retrieve(params.toBuilder().cardValidationId(cardValidationId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        cardValidationId: String,
        params: CardValidationRetrieveParams = CardValidationRetrieveParams.none(),
    ): CompletableFuture<CardValidation> = retrieve(cardValidationId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CardValidationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardValidation>

    /** @see retrieve */
    fun retrieve(params: CardValidationRetrieveParams): CompletableFuture<CardValidation> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        cardValidationId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CardValidation> =
        retrieve(cardValidationId, CardValidationRetrieveParams.none(), requestOptions)

    /** List Card Validations */
    fun list(): CompletableFuture<CardValidationListPageAsync> =
        list(CardValidationListParams.none())

    /** @see list */
    fun list(
        params: CardValidationListParams = CardValidationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardValidationListPageAsync>

    /** @see list */
    fun list(
        params: CardValidationListParams = CardValidationListParams.none()
    ): CompletableFuture<CardValidationListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<CardValidationListPageAsync> =
        list(CardValidationListParams.none(), requestOptions)

    /**
     * A view of [CardValidationServiceAsync] that provides access to raw HTTP responses for each
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
        ): CardValidationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /card_validations`, but is otherwise the same as
         * [CardValidationServiceAsync.create].
         */
        fun create(
            params: CardValidationCreateParams
        ): CompletableFuture<HttpResponseFor<CardValidation>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CardValidationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardValidation>>

        /**
         * Returns a raw HTTP response for `get /card_validations/{card_validation_id}`, but is
         * otherwise the same as [CardValidationServiceAsync.retrieve].
         */
        fun retrieve(cardValidationId: String): CompletableFuture<HttpResponseFor<CardValidation>> =
            retrieve(cardValidationId, CardValidationRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            cardValidationId: String,
            params: CardValidationRetrieveParams = CardValidationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardValidation>> =
            retrieve(params.toBuilder().cardValidationId(cardValidationId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            cardValidationId: String,
            params: CardValidationRetrieveParams = CardValidationRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<CardValidation>> =
            retrieve(cardValidationId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: CardValidationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardValidation>>

        /** @see retrieve */
        fun retrieve(
            params: CardValidationRetrieveParams
        ): CompletableFuture<HttpResponseFor<CardValidation>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            cardValidationId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CardValidation>> =
            retrieve(cardValidationId, CardValidationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /card_validations`, but is otherwise the same as
         * [CardValidationServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CardValidationListPageAsync>> =
            list(CardValidationListParams.none())

        /** @see list */
        fun list(
            params: CardValidationListParams = CardValidationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardValidationListPageAsync>>

        /** @see list */
        fun list(
            params: CardValidationListParams = CardValidationListParams.none()
        ): CompletableFuture<HttpResponseFor<CardValidationListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CardValidationListPageAsync>> =
            list(CardValidationListParams.none(), requestOptions)
    }
}
