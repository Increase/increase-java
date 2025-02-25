// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.ExternalAccount
import com.increase.api.models.ExternalAccountCreateParams
import com.increase.api.models.ExternalAccountListPage
import com.increase.api.models.ExternalAccountListParams
import com.increase.api.models.ExternalAccountRetrieveParams
import com.increase.api.models.ExternalAccountUpdateParams

interface ExternalAccountService {

    /** Create an External Account */
    @JvmOverloads
    fun create(
        params: ExternalAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalAccount

    /** Retrieve an External Account */
    @JvmOverloads
    fun retrieve(
        params: ExternalAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalAccount

    /** Update an External Account */
    @JvmOverloads
    fun update(
        params: ExternalAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalAccount

    /** List External Accounts */
    @JvmOverloads
    fun list(
        params: ExternalAccountListParams = ExternalAccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalAccountListPage

    /** List External Accounts */
    fun list(requestOptions: RequestOptions): ExternalAccountListPage =
        list(ExternalAccountListParams.none(), requestOptions)
}
