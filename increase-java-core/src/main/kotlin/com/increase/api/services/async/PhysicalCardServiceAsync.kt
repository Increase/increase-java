// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.PhysicalCard
import com.increase.api.models.PhysicalCardCreateParams
import com.increase.api.models.PhysicalCardListPageAsync
import com.increase.api.models.PhysicalCardListParams
import com.increase.api.models.PhysicalCardRetrieveParams
import com.increase.api.models.PhysicalCardUpdateParams
import java.util.concurrent.CompletableFuture

interface PhysicalCardServiceAsync {

    /** Create a Physical Card */
    @JvmOverloads
    fun create(
        params: PhysicalCardCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhysicalCard>

    /** Retrieve a Physical Card */
    @JvmOverloads
    fun retrieve(
        params: PhysicalCardRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhysicalCard>

    /** Update a Physical Card */
    @JvmOverloads
    fun update(
        params: PhysicalCardUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhysicalCard>

    /** List Physical Cards */
    @JvmOverloads
    fun list(
        params: PhysicalCardListParams = PhysicalCardListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhysicalCardListPageAsync>

    /** List Physical Cards */
    fun list(requestOptions: RequestOptions): CompletableFuture<PhysicalCardListPageAsync> =
        list(PhysicalCardListParams.none(), requestOptions)
}
