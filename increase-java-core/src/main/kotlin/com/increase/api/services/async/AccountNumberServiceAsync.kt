// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.AccountNumber
import com.increase.api.models.AccountNumberCreateParams
import com.increase.api.models.AccountNumberListPageAsync
import com.increase.api.models.AccountNumberListParams
import com.increase.api.models.AccountNumberRetrieveParams
import com.increase.api.models.AccountNumberUpdateParams
import java.util.concurrent.CompletableFuture

interface AccountNumberServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create an Account Number */
    @JvmOverloads
    fun create(
        params: AccountNumberCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountNumber>

    /** Retrieve an Account Number */
    @JvmOverloads
    fun retrieve(
        params: AccountNumberRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountNumber>

    /** Update an Account Number */
    @JvmOverloads
    fun update(
        params: AccountNumberUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountNumber>

    /** List Account Numbers */
    @JvmOverloads
    fun list(
        params: AccountNumberListParams = AccountNumberListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountNumberListPageAsync>

    /** List Account Numbers */
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
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: AccountNumberCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountNumber>>

        /**
         * Returns a raw HTTP response for `get /account_numbers/{account_number_id}`, but is
         * otherwise the same as [AccountNumberServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: AccountNumberRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountNumber>>

        /**
         * Returns a raw HTTP response for `patch /account_numbers/{account_number_id}`, but is
         * otherwise the same as [AccountNumberServiceAsync.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: AccountNumberUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountNumber>>

        /**
         * Returns a raw HTTP response for `get /account_numbers`, but is otherwise the same as
         * [AccountNumberServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: AccountNumberListParams = AccountNumberListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountNumberListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /account_numbers`, but is otherwise the same as
         * [AccountNumberServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AccountNumberListPageAsync>> =
            list(AccountNumberListParams.none(), requestOptions)
    }
}
