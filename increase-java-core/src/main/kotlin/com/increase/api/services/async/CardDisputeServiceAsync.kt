// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.carddisputes.CardDispute
import com.increase.api.models.carddisputes.CardDisputeCreateParams
import com.increase.api.models.carddisputes.CardDisputeListPageAsync
import com.increase.api.models.carddisputes.CardDisputeListParams
import com.increase.api.models.carddisputes.CardDisputeProvideProvisionalCreditParams
import com.increase.api.models.carddisputes.CardDisputeRetrieveParams
import com.increase.api.models.carddisputes.CardDisputeReverseProvisionalCreditParams
import com.increase.api.models.carddisputes.CardDisputeSubmitUserSubmissionParams
import com.increase.api.models.carddisputes.CardDisputeWithdrawParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CardDisputeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardDisputeServiceAsync

    /** Create a Card Dispute */
    fun create(params: CardDisputeCreateParams): CompletableFuture<CardDispute> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CardDisputeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardDispute>

    /** Retrieve a Card Dispute */
    fun retrieve(cardDisputeId: String): CompletableFuture<CardDispute> =
        retrieve(cardDisputeId, CardDisputeRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        cardDisputeId: String,
        params: CardDisputeRetrieveParams = CardDisputeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardDispute> =
        retrieve(params.toBuilder().cardDisputeId(cardDisputeId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        cardDisputeId: String,
        params: CardDisputeRetrieveParams = CardDisputeRetrieveParams.none(),
    ): CompletableFuture<CardDispute> = retrieve(cardDisputeId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CardDisputeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardDispute>

    /** @see retrieve */
    fun retrieve(params: CardDisputeRetrieveParams): CompletableFuture<CardDispute> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        cardDisputeId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CardDispute> =
        retrieve(cardDisputeId, CardDisputeRetrieveParams.none(), requestOptions)

    /** List Card Disputes */
    fun list(): CompletableFuture<CardDisputeListPageAsync> = list(CardDisputeListParams.none())

    /** @see list */
    fun list(
        params: CardDisputeListParams = CardDisputeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardDisputeListPageAsync>

    /** @see list */
    fun list(
        params: CardDisputeListParams = CardDisputeListParams.none()
    ): CompletableFuture<CardDisputeListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<CardDisputeListPageAsync> =
        list(CardDisputeListParams.none(), requestOptions)

    /**
     * Credits the cardholder's Account for the Card Dispute amount, funded by your program's
     * provisional credit Account.
     */
    fun provideProvisionalCredit(cardDisputeId: String): CompletableFuture<CardDispute> =
        provideProvisionalCredit(cardDisputeId, CardDisputeProvideProvisionalCreditParams.none())

    /** @see provideProvisionalCredit */
    fun provideProvisionalCredit(
        cardDisputeId: String,
        params: CardDisputeProvideProvisionalCreditParams =
            CardDisputeProvideProvisionalCreditParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardDispute> =
        provideProvisionalCredit(
            params.toBuilder().cardDisputeId(cardDisputeId).build(),
            requestOptions,
        )

    /** @see provideProvisionalCredit */
    fun provideProvisionalCredit(
        cardDisputeId: String,
        params: CardDisputeProvideProvisionalCreditParams =
            CardDisputeProvideProvisionalCreditParams.none(),
    ): CompletableFuture<CardDispute> =
        provideProvisionalCredit(cardDisputeId, params, RequestOptions.none())

    /** @see provideProvisionalCredit */
    fun provideProvisionalCredit(
        params: CardDisputeProvideProvisionalCreditParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardDispute>

    /** @see provideProvisionalCredit */
    fun provideProvisionalCredit(
        params: CardDisputeProvideProvisionalCreditParams
    ): CompletableFuture<CardDispute> = provideProvisionalCredit(params, RequestOptions.none())

    /** @see provideProvisionalCredit */
    fun provideProvisionalCredit(
        cardDisputeId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CardDispute> =
        provideProvisionalCredit(
            cardDisputeId,
            CardDisputeProvideProvisionalCreditParams.none(),
            requestOptions,
        )

    /**
     * Debits the cardholder's Account for the provisional credit and returns it to your program's
     * provisional credit Account.
     */
    fun reverseProvisionalCredit(cardDisputeId: String): CompletableFuture<CardDispute> =
        reverseProvisionalCredit(cardDisputeId, CardDisputeReverseProvisionalCreditParams.none())

    /** @see reverseProvisionalCredit */
    fun reverseProvisionalCredit(
        cardDisputeId: String,
        params: CardDisputeReverseProvisionalCreditParams =
            CardDisputeReverseProvisionalCreditParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardDispute> =
        reverseProvisionalCredit(
            params.toBuilder().cardDisputeId(cardDisputeId).build(),
            requestOptions,
        )

    /** @see reverseProvisionalCredit */
    fun reverseProvisionalCredit(
        cardDisputeId: String,
        params: CardDisputeReverseProvisionalCreditParams =
            CardDisputeReverseProvisionalCreditParams.none(),
    ): CompletableFuture<CardDispute> =
        reverseProvisionalCredit(cardDisputeId, params, RequestOptions.none())

    /** @see reverseProvisionalCredit */
    fun reverseProvisionalCredit(
        params: CardDisputeReverseProvisionalCreditParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardDispute>

    /** @see reverseProvisionalCredit */
    fun reverseProvisionalCredit(
        params: CardDisputeReverseProvisionalCreditParams
    ): CompletableFuture<CardDispute> = reverseProvisionalCredit(params, RequestOptions.none())

    /** @see reverseProvisionalCredit */
    fun reverseProvisionalCredit(
        cardDisputeId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CardDispute> =
        reverseProvisionalCredit(
            cardDisputeId,
            CardDisputeReverseProvisionalCreditParams.none(),
            requestOptions,
        )

    /** Submit a User Submission for a Card Dispute */
    fun submitUserSubmission(
        cardDisputeId: String,
        params: CardDisputeSubmitUserSubmissionParams,
    ): CompletableFuture<CardDispute> =
        submitUserSubmission(cardDisputeId, params, RequestOptions.none())

    /** @see submitUserSubmission */
    fun submitUserSubmission(
        cardDisputeId: String,
        params: CardDisputeSubmitUserSubmissionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardDispute> =
        submitUserSubmission(
            params.toBuilder().cardDisputeId(cardDisputeId).build(),
            requestOptions,
        )

    /** @see submitUserSubmission */
    fun submitUserSubmission(
        params: CardDisputeSubmitUserSubmissionParams
    ): CompletableFuture<CardDispute> = submitUserSubmission(params, RequestOptions.none())

    /** @see submitUserSubmission */
    fun submitUserSubmission(
        params: CardDisputeSubmitUserSubmissionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardDispute>

    /** Withdraw a Card Dispute */
    fun withdraw(cardDisputeId: String): CompletableFuture<CardDispute> =
        withdraw(cardDisputeId, CardDisputeWithdrawParams.none())

    /** @see withdraw */
    fun withdraw(
        cardDisputeId: String,
        params: CardDisputeWithdrawParams = CardDisputeWithdrawParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardDispute> =
        withdraw(params.toBuilder().cardDisputeId(cardDisputeId).build(), requestOptions)

    /** @see withdraw */
    fun withdraw(
        cardDisputeId: String,
        params: CardDisputeWithdrawParams = CardDisputeWithdrawParams.none(),
    ): CompletableFuture<CardDispute> = withdraw(cardDisputeId, params, RequestOptions.none())

    /** @see withdraw */
    fun withdraw(
        params: CardDisputeWithdrawParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardDispute>

    /** @see withdraw */
    fun withdraw(params: CardDisputeWithdrawParams): CompletableFuture<CardDispute> =
        withdraw(params, RequestOptions.none())

    /** @see withdraw */
    fun withdraw(
        cardDisputeId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CardDispute> =
        withdraw(cardDisputeId, CardDisputeWithdrawParams.none(), requestOptions)

    /**
     * A view of [CardDisputeServiceAsync] that provides access to raw HTTP responses for each
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
        ): CardDisputeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /card_disputes`, but is otherwise the same as
         * [CardDisputeServiceAsync.create].
         */
        fun create(
            params: CardDisputeCreateParams
        ): CompletableFuture<HttpResponseFor<CardDispute>> = create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CardDisputeCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardDispute>>

        /**
         * Returns a raw HTTP response for `get /card_disputes/{card_dispute_id}`, but is otherwise
         * the same as [CardDisputeServiceAsync.retrieve].
         */
        fun retrieve(cardDisputeId: String): CompletableFuture<HttpResponseFor<CardDispute>> =
            retrieve(cardDisputeId, CardDisputeRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            cardDisputeId: String,
            params: CardDisputeRetrieveParams = CardDisputeRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardDispute>> =
            retrieve(params.toBuilder().cardDisputeId(cardDisputeId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            cardDisputeId: String,
            params: CardDisputeRetrieveParams = CardDisputeRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<CardDispute>> =
            retrieve(cardDisputeId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: CardDisputeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardDispute>>

        /** @see retrieve */
        fun retrieve(
            params: CardDisputeRetrieveParams
        ): CompletableFuture<HttpResponseFor<CardDispute>> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            cardDisputeId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CardDispute>> =
            retrieve(cardDisputeId, CardDisputeRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /card_disputes`, but is otherwise the same as
         * [CardDisputeServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CardDisputeListPageAsync>> =
            list(CardDisputeListParams.none())

        /** @see list */
        fun list(
            params: CardDisputeListParams = CardDisputeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardDisputeListPageAsync>>

        /** @see list */
        fun list(
            params: CardDisputeListParams = CardDisputeListParams.none()
        ): CompletableFuture<HttpResponseFor<CardDisputeListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CardDisputeListPageAsync>> =
            list(CardDisputeListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /card_disputes/{card_dispute_id}/provide_provisional_credit`, but is otherwise the same
         * as [CardDisputeServiceAsync.provideProvisionalCredit].
         */
        fun provideProvisionalCredit(
            cardDisputeId: String
        ): CompletableFuture<HttpResponseFor<CardDispute>> =
            provideProvisionalCredit(
                cardDisputeId,
                CardDisputeProvideProvisionalCreditParams.none(),
            )

        /** @see provideProvisionalCredit */
        fun provideProvisionalCredit(
            cardDisputeId: String,
            params: CardDisputeProvideProvisionalCreditParams =
                CardDisputeProvideProvisionalCreditParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardDispute>> =
            provideProvisionalCredit(
                params.toBuilder().cardDisputeId(cardDisputeId).build(),
                requestOptions,
            )

        /** @see provideProvisionalCredit */
        fun provideProvisionalCredit(
            cardDisputeId: String,
            params: CardDisputeProvideProvisionalCreditParams =
                CardDisputeProvideProvisionalCreditParams.none(),
        ): CompletableFuture<HttpResponseFor<CardDispute>> =
            provideProvisionalCredit(cardDisputeId, params, RequestOptions.none())

        /** @see provideProvisionalCredit */
        fun provideProvisionalCredit(
            params: CardDisputeProvideProvisionalCreditParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardDispute>>

        /** @see provideProvisionalCredit */
        fun provideProvisionalCredit(
            params: CardDisputeProvideProvisionalCreditParams
        ): CompletableFuture<HttpResponseFor<CardDispute>> =
            provideProvisionalCredit(params, RequestOptions.none())

        /** @see provideProvisionalCredit */
        fun provideProvisionalCredit(
            cardDisputeId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CardDispute>> =
            provideProvisionalCredit(
                cardDisputeId,
                CardDisputeProvideProvisionalCreditParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post
         * /card_disputes/{card_dispute_id}/reverse_provisional_credit`, but is otherwise the same
         * as [CardDisputeServiceAsync.reverseProvisionalCredit].
         */
        fun reverseProvisionalCredit(
            cardDisputeId: String
        ): CompletableFuture<HttpResponseFor<CardDispute>> =
            reverseProvisionalCredit(
                cardDisputeId,
                CardDisputeReverseProvisionalCreditParams.none(),
            )

        /** @see reverseProvisionalCredit */
        fun reverseProvisionalCredit(
            cardDisputeId: String,
            params: CardDisputeReverseProvisionalCreditParams =
                CardDisputeReverseProvisionalCreditParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardDispute>> =
            reverseProvisionalCredit(
                params.toBuilder().cardDisputeId(cardDisputeId).build(),
                requestOptions,
            )

        /** @see reverseProvisionalCredit */
        fun reverseProvisionalCredit(
            cardDisputeId: String,
            params: CardDisputeReverseProvisionalCreditParams =
                CardDisputeReverseProvisionalCreditParams.none(),
        ): CompletableFuture<HttpResponseFor<CardDispute>> =
            reverseProvisionalCredit(cardDisputeId, params, RequestOptions.none())

        /** @see reverseProvisionalCredit */
        fun reverseProvisionalCredit(
            params: CardDisputeReverseProvisionalCreditParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardDispute>>

        /** @see reverseProvisionalCredit */
        fun reverseProvisionalCredit(
            params: CardDisputeReverseProvisionalCreditParams
        ): CompletableFuture<HttpResponseFor<CardDispute>> =
            reverseProvisionalCredit(params, RequestOptions.none())

        /** @see reverseProvisionalCredit */
        fun reverseProvisionalCredit(
            cardDisputeId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CardDispute>> =
            reverseProvisionalCredit(
                cardDisputeId,
                CardDisputeReverseProvisionalCreditParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post
         * /card_disputes/{card_dispute_id}/submit_user_submission`, but is otherwise the same as
         * [CardDisputeServiceAsync.submitUserSubmission].
         */
        fun submitUserSubmission(
            cardDisputeId: String,
            params: CardDisputeSubmitUserSubmissionParams,
        ): CompletableFuture<HttpResponseFor<CardDispute>> =
            submitUserSubmission(cardDisputeId, params, RequestOptions.none())

        /** @see submitUserSubmission */
        fun submitUserSubmission(
            cardDisputeId: String,
            params: CardDisputeSubmitUserSubmissionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardDispute>> =
            submitUserSubmission(
                params.toBuilder().cardDisputeId(cardDisputeId).build(),
                requestOptions,
            )

        /** @see submitUserSubmission */
        fun submitUserSubmission(
            params: CardDisputeSubmitUserSubmissionParams
        ): CompletableFuture<HttpResponseFor<CardDispute>> =
            submitUserSubmission(params, RequestOptions.none())

        /** @see submitUserSubmission */
        fun submitUserSubmission(
            params: CardDisputeSubmitUserSubmissionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardDispute>>

        /**
         * Returns a raw HTTP response for `post /card_disputes/{card_dispute_id}/withdraw`, but is
         * otherwise the same as [CardDisputeServiceAsync.withdraw].
         */
        fun withdraw(cardDisputeId: String): CompletableFuture<HttpResponseFor<CardDispute>> =
            withdraw(cardDisputeId, CardDisputeWithdrawParams.none())

        /** @see withdraw */
        fun withdraw(
            cardDisputeId: String,
            params: CardDisputeWithdrawParams = CardDisputeWithdrawParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardDispute>> =
            withdraw(params.toBuilder().cardDisputeId(cardDisputeId).build(), requestOptions)

        /** @see withdraw */
        fun withdraw(
            cardDisputeId: String,
            params: CardDisputeWithdrawParams = CardDisputeWithdrawParams.none(),
        ): CompletableFuture<HttpResponseFor<CardDispute>> =
            withdraw(cardDisputeId, params, RequestOptions.none())

        /** @see withdraw */
        fun withdraw(
            params: CardDisputeWithdrawParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardDispute>>

        /** @see withdraw */
        fun withdraw(
            params: CardDisputeWithdrawParams
        ): CompletableFuture<HttpResponseFor<CardDispute>> = withdraw(params, RequestOptions.none())

        /** @see withdraw */
        fun withdraw(
            cardDisputeId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CardDispute>> =
            withdraw(cardDisputeId, CardDisputeWithdrawParams.none(), requestOptions)
    }
}
