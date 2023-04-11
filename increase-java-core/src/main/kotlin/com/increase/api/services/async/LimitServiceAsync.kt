@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.Limit
import com.increase.api.models.LimitCreateParams
import com.increase.api.models.LimitListPageAsync
import com.increase.api.models.LimitListParams
import com.increase.api.models.LimitRetrieveParams
import com.increase.api.models.LimitUpdateParams
import java.util.concurrent.CompletableFuture

interface LimitServiceAsync {

    /** Create a Limit */
    @JvmOverloads
    fun create(
        params: LimitCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Limit>

    /** Retrieve a Limit */
    @JvmOverloads
    fun retrieve(
        params: LimitRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Limit>

    /** Update a Limit */
    @JvmOverloads
    fun update(
        params: LimitUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Limit>

    /** List Limits */
    @JvmOverloads
    fun list(
        params: LimitListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<LimitListPageAsync>
}
