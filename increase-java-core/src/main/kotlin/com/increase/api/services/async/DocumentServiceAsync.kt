// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.Document
import com.increase.api.models.DocumentListPageAsync
import com.increase.api.models.DocumentListParams
import com.increase.api.models.DocumentRetrieveParams
import java.util.concurrent.CompletableFuture

interface DocumentServiceAsync {

    /** Retrieve a Document */
    @JvmOverloads
    fun retrieve(
        params: DocumentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Document>

    /** List Documents */
    @JvmOverloads
    fun list(
        params: DocumentListParams = DocumentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentListPageAsync>

    /** List Documents */
    fun list(requestOptions: RequestOptions): CompletableFuture<DocumentListPageAsync> =
        list(DocumentListParams.none(), requestOptions)
}
