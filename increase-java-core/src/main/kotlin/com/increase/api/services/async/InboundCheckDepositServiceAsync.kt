// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.InboundCheckDeposit
import com.increase.api.models.InboundCheckDepositDeclineParams
import com.increase.api.models.InboundCheckDepositListPageAsync
import com.increase.api.models.InboundCheckDepositListParams
import com.increase.api.models.InboundCheckDepositRetrieveParams
import java.util.concurrent.CompletableFuture

interface InboundCheckDepositServiceAsync {

    /** Retrieve an Inbound Check Deposit */
    @JvmOverloads
    fun retrieve(
        params: InboundCheckDepositRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<InboundCheckDeposit>

    /** List Inbound Check Deposits */
    @JvmOverloads
    fun list(
        params: InboundCheckDepositListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<InboundCheckDepositListPageAsync>

    /** Decline an Inbound Check Deposit */
    @JvmOverloads
    fun decline(
        params: InboundCheckDepositDeclineParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<InboundCheckDeposit>
}
