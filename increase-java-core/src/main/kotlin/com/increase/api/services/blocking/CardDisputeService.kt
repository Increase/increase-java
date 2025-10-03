// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.carddisputes.CardDispute
import com.increase.api.models.carddisputes.CardDisputeCreateParams
import com.increase.api.models.carddisputes.CardDisputeListPage
import com.increase.api.models.carddisputes.CardDisputeListParams
import com.increase.api.models.carddisputes.CardDisputeRetrieveParams
import com.increase.api.models.carddisputes.CardDisputeSubmitUserSubmissionParams
import com.increase.api.models.carddisputes.CardDisputeWithdrawParams
import java.util.function.Consumer

interface CardDisputeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardDisputeService

    /** Create a Card Dispute */
    fun create(params: CardDisputeCreateParams): CardDispute = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CardDisputeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardDispute

    /** Retrieve a Card Dispute */
    fun retrieve(cardDisputeId: String): CardDispute =
        retrieve(cardDisputeId, CardDisputeRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        cardDisputeId: String,
        params: CardDisputeRetrieveParams = CardDisputeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardDispute =
        retrieve(params.toBuilder().cardDisputeId(cardDisputeId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        cardDisputeId: String,
        params: CardDisputeRetrieveParams = CardDisputeRetrieveParams.none(),
    ): CardDispute = retrieve(cardDisputeId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CardDisputeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardDispute

    /** @see retrieve */
    fun retrieve(params: CardDisputeRetrieveParams): CardDispute =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(cardDisputeId: String, requestOptions: RequestOptions): CardDispute =
        retrieve(cardDisputeId, CardDisputeRetrieveParams.none(), requestOptions)

    /** List Card Disputes */
    fun list(): CardDisputeListPage = list(CardDisputeListParams.none())

    /** @see list */
    fun list(
        params: CardDisputeListParams = CardDisputeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardDisputeListPage

    /** @see list */
    fun list(params: CardDisputeListParams = CardDisputeListParams.none()): CardDisputeListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CardDisputeListPage =
        list(CardDisputeListParams.none(), requestOptions)

    /** Submit a User Submission for a Card Dispute */
    fun submitUserSubmission(
        cardDisputeId: String,
        params: CardDisputeSubmitUserSubmissionParams,
    ): CardDispute = submitUserSubmission(cardDisputeId, params, RequestOptions.none())

    /** @see submitUserSubmission */
    fun submitUserSubmission(
        cardDisputeId: String,
        params: CardDisputeSubmitUserSubmissionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardDispute =
        submitUserSubmission(
            params.toBuilder().cardDisputeId(cardDisputeId).build(),
            requestOptions,
        )

    /** @see submitUserSubmission */
    fun submitUserSubmission(params: CardDisputeSubmitUserSubmissionParams): CardDispute =
        submitUserSubmission(params, RequestOptions.none())

    /** @see submitUserSubmission */
    fun submitUserSubmission(
        params: CardDisputeSubmitUserSubmissionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardDispute

    /** Withdraw a Card Dispute */
    fun withdraw(cardDisputeId: String): CardDispute =
        withdraw(cardDisputeId, CardDisputeWithdrawParams.none())

    /** @see withdraw */
    fun withdraw(
        cardDisputeId: String,
        params: CardDisputeWithdrawParams = CardDisputeWithdrawParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardDispute =
        withdraw(params.toBuilder().cardDisputeId(cardDisputeId).build(), requestOptions)

    /** @see withdraw */
    fun withdraw(
        cardDisputeId: String,
        params: CardDisputeWithdrawParams = CardDisputeWithdrawParams.none(),
    ): CardDispute = withdraw(cardDisputeId, params, RequestOptions.none())

    /** @see withdraw */
    fun withdraw(
        params: CardDisputeWithdrawParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardDispute

    /** @see withdraw */
    fun withdraw(params: CardDisputeWithdrawParams): CardDispute =
        withdraw(params, RequestOptions.none())

    /** @see withdraw */
    fun withdraw(cardDisputeId: String, requestOptions: RequestOptions): CardDispute =
        withdraw(cardDisputeId, CardDisputeWithdrawParams.none(), requestOptions)

    /**
     * A view of [CardDisputeService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CardDisputeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /card_disputes`, but is otherwise the same as
         * [CardDisputeService.create].
         */
        @MustBeClosed
        fun create(params: CardDisputeCreateParams): HttpResponseFor<CardDispute> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CardDisputeCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardDispute>

        /**
         * Returns a raw HTTP response for `get /card_disputes/{card_dispute_id}`, but is otherwise
         * the same as [CardDisputeService.retrieve].
         */
        @MustBeClosed
        fun retrieve(cardDisputeId: String): HttpResponseFor<CardDispute> =
            retrieve(cardDisputeId, CardDisputeRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            cardDisputeId: String,
            params: CardDisputeRetrieveParams = CardDisputeRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardDispute> =
            retrieve(params.toBuilder().cardDisputeId(cardDisputeId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            cardDisputeId: String,
            params: CardDisputeRetrieveParams = CardDisputeRetrieveParams.none(),
        ): HttpResponseFor<CardDispute> = retrieve(cardDisputeId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CardDisputeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardDispute>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: CardDisputeRetrieveParams): HttpResponseFor<CardDispute> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            cardDisputeId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardDispute> =
            retrieve(cardDisputeId, CardDisputeRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /card_disputes`, but is otherwise the same as
         * [CardDisputeService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<CardDisputeListPage> = list(CardDisputeListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CardDisputeListParams = CardDisputeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardDisputeListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: CardDisputeListParams = CardDisputeListParams.none()
        ): HttpResponseFor<CardDisputeListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CardDisputeListPage> =
            list(CardDisputeListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /card_disputes/{card_dispute_id}/submit_user_submission`, but is otherwise the same as
         * [CardDisputeService.submitUserSubmission].
         */
        @MustBeClosed
        fun submitUserSubmission(
            cardDisputeId: String,
            params: CardDisputeSubmitUserSubmissionParams,
        ): HttpResponseFor<CardDispute> =
            submitUserSubmission(cardDisputeId, params, RequestOptions.none())

        /** @see submitUserSubmission */
        @MustBeClosed
        fun submitUserSubmission(
            cardDisputeId: String,
            params: CardDisputeSubmitUserSubmissionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardDispute> =
            submitUserSubmission(
                params.toBuilder().cardDisputeId(cardDisputeId).build(),
                requestOptions,
            )

        /** @see submitUserSubmission */
        @MustBeClosed
        fun submitUserSubmission(
            params: CardDisputeSubmitUserSubmissionParams
        ): HttpResponseFor<CardDispute> = submitUserSubmission(params, RequestOptions.none())

        /** @see submitUserSubmission */
        @MustBeClosed
        fun submitUserSubmission(
            params: CardDisputeSubmitUserSubmissionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardDispute>

        /**
         * Returns a raw HTTP response for `post /card_disputes/{card_dispute_id}/withdraw`, but is
         * otherwise the same as [CardDisputeService.withdraw].
         */
        @MustBeClosed
        fun withdraw(cardDisputeId: String): HttpResponseFor<CardDispute> =
            withdraw(cardDisputeId, CardDisputeWithdrawParams.none())

        /** @see withdraw */
        @MustBeClosed
        fun withdraw(
            cardDisputeId: String,
            params: CardDisputeWithdrawParams = CardDisputeWithdrawParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardDispute> =
            withdraw(params.toBuilder().cardDisputeId(cardDisputeId).build(), requestOptions)

        /** @see withdraw */
        @MustBeClosed
        fun withdraw(
            cardDisputeId: String,
            params: CardDisputeWithdrawParams = CardDisputeWithdrawParams.none(),
        ): HttpResponseFor<CardDispute> = withdraw(cardDisputeId, params, RequestOptions.none())

        /** @see withdraw */
        @MustBeClosed
        fun withdraw(
            params: CardDisputeWithdrawParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardDispute>

        /** @see withdraw */
        @MustBeClosed
        fun withdraw(params: CardDisputeWithdrawParams): HttpResponseFor<CardDispute> =
            withdraw(params, RequestOptions.none())

        /** @see withdraw */
        @MustBeClosed
        fun withdraw(
            cardDisputeId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardDispute> =
            withdraw(cardDisputeId, CardDisputeWithdrawParams.none(), requestOptions)
    }
}
