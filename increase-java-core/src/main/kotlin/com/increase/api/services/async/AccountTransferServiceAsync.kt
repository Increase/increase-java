// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.AccountTransfer
import com.increase.api.models.AccountTransferApproveParams
import com.increase.api.models.AccountTransferCancelParams
import com.increase.api.models.AccountTransferCreateParams
import com.increase.api.models.AccountTransferListPageAsync
import com.increase.api.models.AccountTransferListParams
import com.increase.api.models.AccountTransferRetrieveParams
import java.util.concurrent.CompletableFuture

interface AccountTransferServiceAsync {

    /** Create an Account Transfer */
    @JvmOverloads
    fun create(
        params: AccountTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountTransfer>

    /** Retrieve an Account Transfer */
    @JvmOverloads
    fun retrieve(
        params: AccountTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountTransfer>

    /** List Account Transfers */
    @JvmOverloads
    fun list(
        params: AccountTransferListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountTransferListPageAsync>

    /** Approve an Account Transfer */
    @JvmOverloads
    fun approve(
        params: AccountTransferApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountTransfer>

    /** Cancel an Account Transfer */
    @JvmOverloads
    fun cancel(
        params: AccountTransferCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountTransfer>
}
