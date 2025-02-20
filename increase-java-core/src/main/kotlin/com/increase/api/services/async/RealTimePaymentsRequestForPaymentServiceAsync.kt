// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.RealTimePaymentsRequestForPayment
import com.increase.api.models.RealTimePaymentsRequestForPaymentCreateParams
import com.increase.api.models.RealTimePaymentsRequestForPaymentListPageAsync
import com.increase.api.models.RealTimePaymentsRequestForPaymentListParams
import com.increase.api.models.RealTimePaymentsRequestForPaymentRetrieveParams
import java.util.concurrent.CompletableFuture

interface RealTimePaymentsRequestForPaymentServiceAsync {

    /** Create a Real-Time Payments Request for Payment */
    @JvmOverloads
    fun create(
        params: RealTimePaymentsRequestForPaymentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RealTimePaymentsRequestForPayment>

    /** Retrieve a Real-Time Payments Request for Payment */
    @JvmOverloads
    fun retrieve(
        params: RealTimePaymentsRequestForPaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RealTimePaymentsRequestForPayment>

    /** List Real-Time Payments Request for Payments */
    @JvmOverloads
    fun list(
        params: RealTimePaymentsRequestForPaymentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RealTimePaymentsRequestForPaymentListPageAsync>
}
