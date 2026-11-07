// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.checkbooks.Checkbook
import com.increase.api.models.simulations.checkbooks.CheckbookMailParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CheckbookServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CheckbookServiceAsync

    /**
     * Simulates the mailing of a [Checkbook](#checkbooks), which happens periodically throughout
     * the day in production but can be sped up in sandbox. This Checkbook must have a `status` of
     * `pending_submission` or `pending_mailing`.
     */
    fun mail(checkbookId: String): CompletableFuture<Checkbook> =
        mail(checkbookId, CheckbookMailParams.none())

    /** @see mail */
    fun mail(
        checkbookId: String,
        params: CheckbookMailParams = CheckbookMailParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Checkbook> =
        mail(params.toBuilder().checkbookId(checkbookId).build(), requestOptions)

    /** @see mail */
    fun mail(
        checkbookId: String,
        params: CheckbookMailParams = CheckbookMailParams.none(),
    ): CompletableFuture<Checkbook> = mail(checkbookId, params, RequestOptions.none())

    /** @see mail */
    fun mail(
        params: CheckbookMailParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Checkbook>

    /** @see mail */
    fun mail(params: CheckbookMailParams): CompletableFuture<Checkbook> =
        mail(params, RequestOptions.none())

    /** @see mail */
    fun mail(checkbookId: String, requestOptions: RequestOptions): CompletableFuture<Checkbook> =
        mail(checkbookId, CheckbookMailParams.none(), requestOptions)

    /**
     * A view of [CheckbookServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CheckbookServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /simulations/checkbooks/{checkbook_id}/mail`, but
         * is otherwise the same as [CheckbookServiceAsync.mail].
         */
        fun mail(checkbookId: String): CompletableFuture<HttpResponseFor<Checkbook>> =
            mail(checkbookId, CheckbookMailParams.none())

        /** @see mail */
        fun mail(
            checkbookId: String,
            params: CheckbookMailParams = CheckbookMailParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Checkbook>> =
            mail(params.toBuilder().checkbookId(checkbookId).build(), requestOptions)

        /** @see mail */
        fun mail(
            checkbookId: String,
            params: CheckbookMailParams = CheckbookMailParams.none(),
        ): CompletableFuture<HttpResponseFor<Checkbook>> =
            mail(checkbookId, params, RequestOptions.none())

        /** @see mail */
        fun mail(
            params: CheckbookMailParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Checkbook>>

        /** @see mail */
        fun mail(params: CheckbookMailParams): CompletableFuture<HttpResponseFor<Checkbook>> =
            mail(params, RequestOptions.none())

        /** @see mail */
        fun mail(
            checkbookId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Checkbook>> =
            mail(checkbookId, CheckbookMailParams.none(), requestOptions)
    }
}
