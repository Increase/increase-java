// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.cardtokens.CardToken
import com.increase.api.models.cardtokens.CardTokenCapabilities
import com.increase.api.models.cardtokens.CardTokenCapabilitiesParams
import com.increase.api.models.cardtokens.CardTokenListParams
import com.increase.api.models.cardtokens.CardTokenListResponse
import com.increase.api.models.cardtokens.CardTokenRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CardTokenServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardTokenServiceAsync

    /** Retrieve a Card Token */
    fun retrieve(cardTokenId: String): CompletableFuture<CardToken> =
        retrieve(cardTokenId, CardTokenRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        cardTokenId: String,
        params: CardTokenRetrieveParams = CardTokenRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardToken> =
        retrieve(params.toBuilder().cardTokenId(cardTokenId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        cardTokenId: String,
        params: CardTokenRetrieveParams = CardTokenRetrieveParams.none(),
    ): CompletableFuture<CardToken> = retrieve(cardTokenId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CardTokenRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardToken>

    /** @see retrieve */
    fun retrieve(params: CardTokenRetrieveParams): CompletableFuture<CardToken> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        cardTokenId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CardToken> =
        retrieve(cardTokenId, CardTokenRetrieveParams.none(), requestOptions)

    /** List Card Tokens */
    fun list(): CompletableFuture<CardTokenListResponse> = list(CardTokenListParams.none())

    /** @see list */
    fun list(
        params: CardTokenListParams = CardTokenListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardTokenListResponse>

    /** @see list */
    fun list(
        params: CardTokenListParams = CardTokenListParams.none()
    ): CompletableFuture<CardTokenListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<CardTokenListResponse> =
        list(CardTokenListParams.none(), requestOptions)

    /**
     * The capabilities of a Card Token describe whether the card can be used for specific
     * operations, such as Card Push Transfers. The capabilities can change over time based on the
     * issuing bank's configuration of the card range.
     */
    fun capabilities(cardTokenId: String): CompletableFuture<CardTokenCapabilities> =
        capabilities(cardTokenId, CardTokenCapabilitiesParams.none())

    /** @see capabilities */
    fun capabilities(
        cardTokenId: String,
        params: CardTokenCapabilitiesParams = CardTokenCapabilitiesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardTokenCapabilities> =
        capabilities(params.toBuilder().cardTokenId(cardTokenId).build(), requestOptions)

    /** @see capabilities */
    fun capabilities(
        cardTokenId: String,
        params: CardTokenCapabilitiesParams = CardTokenCapabilitiesParams.none(),
    ): CompletableFuture<CardTokenCapabilities> =
        capabilities(cardTokenId, params, RequestOptions.none())

    /** @see capabilities */
    fun capabilities(
        params: CardTokenCapabilitiesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardTokenCapabilities>

    /** @see capabilities */
    fun capabilities(
        params: CardTokenCapabilitiesParams
    ): CompletableFuture<CardTokenCapabilities> = capabilities(params, RequestOptions.none())

    /** @see capabilities */
    fun capabilities(
        cardTokenId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CardTokenCapabilities> =
        capabilities(cardTokenId, CardTokenCapabilitiesParams.none(), requestOptions)

    /**
     * A view of [CardTokenServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CardTokenServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /card_tokens/{card_token_id}`, but is otherwise the
         * same as [CardTokenServiceAsync.retrieve].
         */
        fun retrieve(cardTokenId: String): CompletableFuture<HttpResponseFor<CardToken>> =
            retrieve(cardTokenId, CardTokenRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            cardTokenId: String,
            params: CardTokenRetrieveParams = CardTokenRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardToken>> =
            retrieve(params.toBuilder().cardTokenId(cardTokenId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            cardTokenId: String,
            params: CardTokenRetrieveParams = CardTokenRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<CardToken>> =
            retrieve(cardTokenId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: CardTokenRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardToken>>

        /** @see retrieve */
        fun retrieve(
            params: CardTokenRetrieveParams
        ): CompletableFuture<HttpResponseFor<CardToken>> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            cardTokenId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CardToken>> =
            retrieve(cardTokenId, CardTokenRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /card_tokens`, but is otherwise the same as
         * [CardTokenServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CardTokenListResponse>> =
            list(CardTokenListParams.none())

        /** @see list */
        fun list(
            params: CardTokenListParams = CardTokenListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardTokenListResponse>>

        /** @see list */
        fun list(
            params: CardTokenListParams = CardTokenListParams.none()
        ): CompletableFuture<HttpResponseFor<CardTokenListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CardTokenListResponse>> =
            list(CardTokenListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /card_tokens/{card_token_id}/capabilities`, but is
         * otherwise the same as [CardTokenServiceAsync.capabilities].
         */
        fun capabilities(
            cardTokenId: String
        ): CompletableFuture<HttpResponseFor<CardTokenCapabilities>> =
            capabilities(cardTokenId, CardTokenCapabilitiesParams.none())

        /** @see capabilities */
        fun capabilities(
            cardTokenId: String,
            params: CardTokenCapabilitiesParams = CardTokenCapabilitiesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardTokenCapabilities>> =
            capabilities(params.toBuilder().cardTokenId(cardTokenId).build(), requestOptions)

        /** @see capabilities */
        fun capabilities(
            cardTokenId: String,
            params: CardTokenCapabilitiesParams = CardTokenCapabilitiesParams.none(),
        ): CompletableFuture<HttpResponseFor<CardTokenCapabilities>> =
            capabilities(cardTokenId, params, RequestOptions.none())

        /** @see capabilities */
        fun capabilities(
            params: CardTokenCapabilitiesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardTokenCapabilities>>

        /** @see capabilities */
        fun capabilities(
            params: CardTokenCapabilitiesParams
        ): CompletableFuture<HttpResponseFor<CardTokenCapabilities>> =
            capabilities(params, RequestOptions.none())

        /** @see capabilities */
        fun capabilities(
            cardTokenId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CardTokenCapabilities>> =
            capabilities(cardTokenId, CardTokenCapabilitiesParams.none(), requestOptions)
    }
}
