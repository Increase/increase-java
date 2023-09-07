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
import com.increase.api.models.WireTransferReverseParams
import com.increase.api.models.WireTransferSubmitParams

interface WireTransferService {

    /** Create a Wire Transfer */
    @JvmOverloads
    fun create(
        params: WireTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): WireTransfer

    /** Retrieve a Wire Transfer */
    @JvmOverloads
    fun retrieve(
        params: WireTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): WireTransfer

    /** List Wire Transfers */
    @JvmOverloads
    fun list(
        params: WireTransferListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): WireTransferListPage

    /** Approve a Wire Transfer */
    @JvmOverloads
    fun approve(
        params: WireTransferApproveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): WireTransfer

    /** Cancel a pending Wire Transfer */
    @JvmOverloads
    fun cancel(
        params: WireTransferCancelParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): WireTransfer

    /**
     * Simulates the reversal of a [Wire Transfer](#wire-transfers) by the Federal Reserve due to
     * error conditions. This will also create a [Transaction](#transaction) to account for the
     * returned funds. This Wire Transfer must first have a `status` of `complete`.
     */
    @JvmOverloads
    fun reverse(
        params: WireTransferReverseParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): WireTransfer

    /**
     * Simulates the submission of a [Wire Transfer](#wire-transfers) to the Federal Reserve. This
     * transfer must first have a `status` of `pending_approval` or `pending_creating`.
     */
    @JvmOverloads
    fun submit(
        params: WireTransferSubmitParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): WireTransfer
}
