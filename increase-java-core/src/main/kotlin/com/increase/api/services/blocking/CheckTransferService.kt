// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.CheckTransfer
import com.increase.api.models.CheckTransferApproveParams
import com.increase.api.models.CheckTransferCancelParams
import com.increase.api.models.CheckTransferCreateParams
import com.increase.api.models.CheckTransferListPage
import com.increase.api.models.CheckTransferListParams
import com.increase.api.models.CheckTransferRetrieveParams
import com.increase.api.models.CheckTransferStopPaymentParams

interface CheckTransferService {

    /** Create a Check Transfer */
    @JvmOverloads
    fun create(
        params: CheckTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckTransfer

    /** Retrieve a Check Transfer */
    @JvmOverloads
    fun retrieve(
        params: CheckTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckTransfer

    /** List Check Transfers */
    @JvmOverloads
    fun list(
        params: CheckTransferListParams = CheckTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckTransferListPage

    /** List Check Transfers */
    fun list(requestOptions: RequestOptions): CheckTransferListPage =
        list(CheckTransferListParams.none(), requestOptions)

    /** Approve a Check Transfer */
    @JvmOverloads
    fun approve(
        params: CheckTransferApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckTransfer

    /** Cancel a pending Check Transfer */
    @JvmOverloads
    fun cancel(
        params: CheckTransferCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckTransfer

    /** Request a stop payment on a Check Transfer */
    @JvmOverloads
    fun stopPayment(
        params: CheckTransferStopPaymentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckTransfer
}
