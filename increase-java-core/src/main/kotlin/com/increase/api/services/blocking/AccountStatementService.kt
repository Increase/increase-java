// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.AccountStatement
import com.increase.api.models.AccountStatementListPage
import com.increase.api.models.AccountStatementListParams
import com.increase.api.models.AccountStatementRetrieveParams

interface AccountStatementService {

    /** Retrieve an Account Statement */
    @JvmOverloads
    fun retrieve(
        params: AccountStatementRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountStatement

    /** List Account Statements */
    @JvmOverloads
    fun list(
        params: AccountStatementListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountStatementListPage
}
