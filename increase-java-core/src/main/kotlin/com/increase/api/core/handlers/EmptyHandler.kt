@file:JvmName("EmptyHandler")

package com.increase.api.core.handlers

import com.increase.api.core.http.HttpResponse
import com.increase.api.core.http.HttpResponse.Handler

@JvmSynthetic internal fun emptyHandler(): Handler<Void?> = EmptyHandlerInternal

private object EmptyHandlerInternal : Handler<Void?> {
    override fun handle(response: HttpResponse): Void? = null
}
