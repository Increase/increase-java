// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.CardPayment
import com.increase.api.models.CardPaymentListPageAsync
import com.increase.api.models.CardPaymentListParams
import com.increase.api.models.CardPaymentRetrieveParams
import java.util.concurrent.CompletableFuture

interface CardPaymentServiceAsync {

    /** Retrieve a Card Payment */
    @JvmOverloads
    fun retrieve(
        params: CardPaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CardPayment>

    /** List Card Payments */
    @JvmOverloads
    fun list(
        params: CardPaymentListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CardPaymentListPageAsync>
}
