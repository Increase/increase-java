// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.Transaction
import com.increase.api.models.TransactionListPageAsync
import com.increase.api.models.TransactionListParams
import com.increase.api.models.TransactionRetrieveParams
import java.util.concurrent.CompletableFuture

interface TransactionServiceAsync {

    /** Retrieve a Transaction */
    @JvmOverloads
    fun retrieve(
        params: TransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Transaction>

    /** List Transactions */
    @JvmOverloads
    fun list(
        params: TransactionListParams = TransactionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransactionListPageAsync>

    /** List Transactions */
    fun list(requestOptions: RequestOptions): CompletableFuture<TransactionListPageAsync> =
        list(TransactionListParams.none(), requestOptions)
}
