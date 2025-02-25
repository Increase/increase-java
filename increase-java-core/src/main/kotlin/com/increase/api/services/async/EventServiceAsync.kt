// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.Event
import com.increase.api.models.EventListPageAsync
import com.increase.api.models.EventListParams
import com.increase.api.models.EventRetrieveParams
import java.util.concurrent.CompletableFuture

interface EventServiceAsync {

    /** Retrieve an Event */
    @JvmOverloads
    fun retrieve(
        params: EventRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Event>

    /** List Events */
    @JvmOverloads
    fun list(
        params: EventListParams = EventListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventListPageAsync>

    /** List Events */
    fun list(requestOptions: RequestOptions): CompletableFuture<EventListPageAsync> =
        list(EventListParams.none(), requestOptions)
}
