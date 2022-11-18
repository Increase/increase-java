@file:JvmName("HttpRequestBodies")

package com.increase.api.services

import com.fasterxml.jackson.databind.json.JsonMapper
import com.increase.api.core.http.HttpRequestBody
import com.increase.api.errors.IncreaseException
import java.io.OutputStream

@JvmSynthetic
internal inline fun <reified T> json(
    jsonMapper: JsonMapper,
    value: T,
): HttpRequestBody {
    return object : HttpRequestBody {
        override fun writeTo(outputStream: OutputStream) {
            try {
                return jsonMapper.writeValue(outputStream, value)
            } catch (e: Exception) {
                throw IncreaseException("Error writing request", e)
            }
        }

        override fun contentType(): String = "application/json"

        override fun repeatable(): Boolean = true

        override fun close() {}
    }
}
