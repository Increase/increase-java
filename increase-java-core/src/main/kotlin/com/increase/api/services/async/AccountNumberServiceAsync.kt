// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.accountnumbers.AccountNumber
import com.increase.api.models.accountnumbers.AccountNumberCreateParams
import com.increase.api.models.accountnumbers.AccountNumberListPageAsync
import com.increase.api.models.accountnumbers.AccountNumberListParams
import com.increase.api.models.accountnumbers.AccountNumberRetrieveParams
import com.increase.api.models.accountnumbers.AccountNumberUpdateParams
import java.util.concurrent.CompletableFuture

interface AccountNumberServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create an Account Number */
    fun create(params: AccountNumberCreateParams): CompletableFuture<AccountNumber> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: AccountNumberCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountNumber>

    /** Retrieve an Account Number */
    fun retrieve(accountNumberId: String): CompletableFuture<AccountNumber> =
        retrieve(accountNumberId, AccountNumberRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        accountNumberId: String,
        params: AccountNumberRetrieveParams = AccountNumberRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountNumber> =
        retrieve(params.toBuilder().accountNumberId(accountNumberId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        accountNumberId: String,
        params: AccountNumberRetrieveParams = AccountNumberRetrieveParams.none(),
    ): CompletableFuture<AccountNumber> = retrieve(accountNumberId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: AccountNumberRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountNumber>

    /** @see [retrieve] */
    fun retrieve(params: AccountNumberRetrieveParams): CompletableFuture<AccountNumber> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        accountNumberId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccountNumber> =
        retrieve(accountNumberId, AccountNumberRetrieveParams.none(), requestOptions)

    /** Update an Account Number */
    fun update(accountNumberId: String): CompletableFuture<AccountNumber> =
        update(accountNumberId, AccountNumberUpdateParams.none())

    /** @see [update] */
    fun update(
        accountNumberId: String,
        params: AccountNumberUpdateParams = AccountNumberUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountNumber> =
        update(params.toBuilder().accountNumberId(accountNumberId).build(), requestOptions)

    /** @see [update] */
    fun update(
        accountNumberId: String,
        params: AccountNumberUpdateParams = AccountNumberUpdateParams.none(),
    ): CompletableFuture<AccountNumber> = update(accountNumberId, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: AccountNumberUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountNumber>

    /** @see [update] */
    fun update(params: AccountNumberUpdateParams): CompletableFuture<AccountNumber> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        accountNumberId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccountNumber> =
        update(accountNumberId, AccountNumberUpdateParams.none(), requestOptions)

    /** List Account Numbers */
    fun list(): CompletableFuture<AccountNumberListPageAsync> = list(AccountNumberListParams.none())

    /** @see [list] */
    fun list(
        params: AccountNumberListParams = AccountNumberListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountNumberListPageAsync>

    /** @see [list] */
    fun list(
        params: AccountNumberListParams = AccountNumberListParams.none()
    ): CompletableFuture<AccountNumberListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<AccountNumberListPageAsync> =
        list(AccountNumberListParams.none(), requestOptions)

    /**
     * A view of [AccountNumberServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /account_numbers`, but is otherwise the same as
         * [AccountNumberServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: AccountNumberCreateParams
        ): CompletableFuture<HttpResponseFor<AccountNumber>> = create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: AccountNumberCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountNumber>>

        /**
         * Returns a raw HTTP response for `get /account_numbers/{account_number_id}`, but is
         * otherwise the same as [AccountNumberServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(accountNumberId: String): CompletableFuture<HttpResponseFor<AccountNumber>> =
            retrieve(accountNumberId, AccountNumberRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            accountNumberId: String,
            params: AccountNumberRetrieveParams = AccountNumberRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountNumber>> =
            retrieve(params.toBuilder().accountNumberId(accountNumberId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            accountNumberId: String,
            params: AccountNumberRetrieveParams = AccountNumberRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<AccountNumber>> =
            retrieve(accountNumberId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: AccountNumberRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountNumber>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: AccountNumberRetrieveParams
        ): CompletableFuture<HttpResponseFor<AccountNumber>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            accountNumberId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccountNumber>> =
            retrieve(accountNumberId, AccountNumberRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /account_numbers/{account_number_id}`, but is
         * otherwise the same as [AccountNumberServiceAsync.update].
         */
        @MustBeClosed
        fun update(accountNumberId: String): CompletableFuture<HttpResponseFor<AccountNumber>> =
            update(accountNumberId, AccountNumberUpdateParams.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            accountNumberId: String,
            params: AccountNumberUpdateParams = AccountNumberUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountNumber>> =
            update(params.toBuilder().accountNumberId(accountNumberId).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            accountNumberId: String,
            params: AccountNumberUpdateParams = AccountNumberUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<AccountNumber>> =
            update(accountNumberId, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: AccountNumberUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountNumber>>

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: AccountNumberUpdateParams
        ): CompletableFuture<HttpResponseFor<AccountNumber>> = update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            accountNumberId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccountNumber>> =
            update(accountNumberId, AccountNumberUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /account_numbers`, but is otherwise the same as
         * [AccountNumberServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<AccountNumberListPageAsync>> =
            list(AccountNumberListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: AccountNumberListParams = AccountNumberListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountNumberListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: AccountNumberListParams = AccountNumberListParams.none()
        ): CompletableFuture<HttpResponseFor<AccountNumberListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AccountNumberListPageAsync>> =
            list(AccountNumberListParams.none(), requestOptions)
    }
}
