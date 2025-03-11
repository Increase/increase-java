// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.accountnumbers.AccountNumber
import com.increase.api.models.accountnumbers.AccountNumberCreateParams
import com.increase.api.models.accountnumbers.AccountNumberListPage
import com.increase.api.models.accountnumbers.AccountNumberListParams
import com.increase.api.models.accountnumbers.AccountNumberRetrieveParams
import com.increase.api.models.accountnumbers.AccountNumberUpdateParams

interface AccountNumberService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create an Account Number */
    fun create(params: AccountNumberCreateParams): AccountNumber =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: AccountNumberCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountNumber

    /** Retrieve an Account Number */
    fun retrieve(params: AccountNumberRetrieveParams): AccountNumber =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: AccountNumberRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountNumber

    /** Update an Account Number */
    fun update(params: AccountNumberUpdateParams): AccountNumber =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: AccountNumberUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountNumber

    /** List Account Numbers */
    fun list(): AccountNumberListPage = list(AccountNumberListParams.none())

    /** @see [list] */
    fun list(
        params: AccountNumberListParams = AccountNumberListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountNumberListPage

    /** @see [list] */
    fun list(
        params: AccountNumberListParams = AccountNumberListParams.none()
    ): AccountNumberListPage = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): AccountNumberListPage =
        list(AccountNumberListParams.none(), requestOptions)

    /**
     * A view of [AccountNumberService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /account_numbers`, but is otherwise the same as
         * [AccountNumberService.create].
         */
        @MustBeClosed
        fun create(params: AccountNumberCreateParams): HttpResponseFor<AccountNumber> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: AccountNumberCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountNumber>

        /**
         * Returns a raw HTTP response for `get /account_numbers/{account_number_id}`, but is
         * otherwise the same as [AccountNumberService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: AccountNumberRetrieveParams): HttpResponseFor<AccountNumber> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: AccountNumberRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountNumber>

        /**
         * Returns a raw HTTP response for `patch /account_numbers/{account_number_id}`, but is
         * otherwise the same as [AccountNumberService.update].
         */
        @MustBeClosed
        fun update(params: AccountNumberUpdateParams): HttpResponseFor<AccountNumber> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: AccountNumberUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountNumber>

        /**
         * Returns a raw HTTP response for `get /account_numbers`, but is otherwise the same as
         * [AccountNumberService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<AccountNumberListPage> = list(AccountNumberListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: AccountNumberListParams = AccountNumberListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountNumberListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: AccountNumberListParams = AccountNumberListParams.none()
        ): HttpResponseFor<AccountNumberListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AccountNumberListPage> =
            list(AccountNumberListParams.none(), requestOptions)
    }
}
