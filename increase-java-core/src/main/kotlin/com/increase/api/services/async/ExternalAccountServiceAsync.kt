// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.ExternalAccount
import com.increase.api.models.ExternalAccountCreateParams
import com.increase.api.models.ExternalAccountListPageAsync
import com.increase.api.models.ExternalAccountListParams
import com.increase.api.models.ExternalAccountRetrieveParams
import com.increase.api.models.ExternalAccountUpdateParams
import java.util.concurrent.CompletableFuture

interface ExternalAccountServiceAsync {

    /** Create an External Account */
    @JvmOverloads
    fun create(
        params: ExternalAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalAccount>

    /** Retrieve an External Account */
    @JvmOverloads
    fun retrieve(
        params: ExternalAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalAccount>

    /** Update an External Account */
    @JvmOverloads
    fun update(
        params: ExternalAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalAccount>

    /** List External Accounts */
    @JvmOverloads
    fun list(
        params: ExternalAccountListParams = ExternalAccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalAccountListPageAsync>

    /** List External Accounts */
    fun list(requestOptions: RequestOptions): CompletableFuture<ExternalAccountListPageAsync> =
        list(ExternalAccountListParams.none(), requestOptions)
}
