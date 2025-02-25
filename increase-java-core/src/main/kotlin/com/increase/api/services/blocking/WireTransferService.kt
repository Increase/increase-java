// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.WireTransfer
import com.increase.api.models.WireTransferApproveParams
import com.increase.api.models.WireTransferCancelParams
import com.increase.api.models.WireTransferCreateParams
import com.increase.api.models.WireTransferListPage
import com.increase.api.models.WireTransferListParams
import com.increase.api.models.WireTransferRetrieveParams

interface WireTransferService {

    /** Create a Wire Transfer */
    @JvmOverloads
    fun create(
        params: WireTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireTransfer

    /** Retrieve a Wire Transfer */
    @JvmOverloads
    fun retrieve(
        params: WireTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireTransfer

    /** List Wire Transfers */
    @JvmOverloads
    fun list(
        params: WireTransferListParams = WireTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireTransferListPage

    /** List Wire Transfers */
    fun list(requestOptions: RequestOptions): WireTransferListPage =
        list(WireTransferListParams.none(), requestOptions)

    /** Approve a Wire Transfer */
    @JvmOverloads
    fun approve(
        params: WireTransferApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireTransfer

    /** Cancel a pending Wire Transfer */
    @JvmOverloads
    fun cancel(
        params: WireTransferCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireTransfer
}
