// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.AccountNumber
import com.increase.api.models.AccountNumberCreateParams
import com.increase.api.models.AccountNumberListPageAsync
import com.increase.api.models.AccountNumberListParams
import com.increase.api.models.AccountNumberRetrieveParams
import com.increase.api.models.AccountNumberUpdateParams
import java.util.concurrent.CompletableFuture

interface AccountNumberServiceAsync {

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
        params: AccountNumberListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountNumberListPageAsync>
}
