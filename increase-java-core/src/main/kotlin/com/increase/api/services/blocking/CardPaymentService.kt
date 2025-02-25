// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.CardPayment
import com.increase.api.models.CardPaymentListPage
import com.increase.api.models.CardPaymentListParams
import com.increase.api.models.CardPaymentRetrieveParams

interface CardPaymentService {

    /** Retrieve a Card Payment */
    @JvmOverloads
    fun retrieve(
        params: CardPaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPayment

    /** List Card Payments */
    @JvmOverloads
    fun list(
        params: CardPaymentListParams = CardPaymentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPaymentListPage

    /** List Card Payments */
    fun list(requestOptions: RequestOptions): CardPaymentListPage =
        list(CardPaymentListParams.none(), requestOptions)
}
