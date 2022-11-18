@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.AccountStatement
import com.increase.api.models.AccountStatementListPageAsync
import com.increase.api.models.AccountStatementListParams
import com.increase.api.models.AccountStatementRetrieveParams
import java.util.concurrent.CompletableFuture

interface AccountStatementServiceAsync {

    /** Retrieve an Account Statement */
    @JvmOverloads
    fun retrieve(
        params: AccountStatementRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AccountStatement>

    /** List Account Statements */
    @JvmOverloads
    fun list(
        params: AccountStatementListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AccountStatementListPageAsync>
}
