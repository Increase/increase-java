// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.InboundCheckDeposit
import com.increase.api.models.InboundCheckDepositListPage
import com.increase.api.models.InboundCheckDepositListParams
import com.increase.api.models.InboundCheckDepositRetrieveParams

interface InboundCheckDepositService {

    /** Retrieve an Inbound Check Deposit */
    @JvmOverloads
    fun retrieve(
        params: InboundCheckDepositRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): InboundCheckDeposit

    /** List Inbound Check Deposits */
    @JvmOverloads
    fun list(
        params: InboundCheckDepositListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): InboundCheckDepositListPage
}
