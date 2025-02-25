// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.DeclinedTransaction
import com.increase.api.models.DeclinedTransactionListPage
import com.increase.api.models.DeclinedTransactionListParams
import com.increase.api.models.DeclinedTransactionRetrieveParams

interface DeclinedTransactionService {

    /** Retrieve a Declined Transaction */
    @JvmOverloads
    fun retrieve(
        params: DeclinedTransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeclinedTransaction

    /** List Declined Transactions */
    @JvmOverloads
    fun list(
        params: DeclinedTransactionListParams = DeclinedTransactionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeclinedTransactionListPage

    /** List Declined Transactions */
    fun list(requestOptions: RequestOptions): DeclinedTransactionListPage =
        list(DeclinedTransactionListParams.none(), requestOptions)
}
