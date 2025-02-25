// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.DeclinedTransaction
import com.increase.api.models.DeclinedTransactionListPageAsync
import com.increase.api.models.DeclinedTransactionListParams
import com.increase.api.models.DeclinedTransactionRetrieveParams
import java.util.concurrent.CompletableFuture

interface DeclinedTransactionServiceAsync {

    /** Retrieve a Declined Transaction */
    @JvmOverloads
    fun retrieve(
        params: DeclinedTransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DeclinedTransaction>

    /** List Declined Transactions */
    @JvmOverloads
    fun list(
        params: DeclinedTransactionListParams = DeclinedTransactionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DeclinedTransactionListPageAsync>

    /** List Declined Transactions */
    fun list(requestOptions: RequestOptions): CompletableFuture<DeclinedTransactionListPageAsync> =
        list(DeclinedTransactionListParams.none(), requestOptions)
}
