// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.Document
import com.increase.api.models.DocumentListPage
import com.increase.api.models.DocumentListParams
import com.increase.api.models.DocumentRetrieveParams

interface DocumentService {

    /** Retrieve a Document */
    @JvmOverloads
    fun retrieve(
        params: DocumentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Document

    /** List Documents */
    @JvmOverloads
    fun list(
        params: DocumentListParams = DocumentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentListPage

    /** List Documents */
    fun list(requestOptions: RequestOptions): DocumentListPage =
        list(DocumentListParams.none(), requestOptions)
}
