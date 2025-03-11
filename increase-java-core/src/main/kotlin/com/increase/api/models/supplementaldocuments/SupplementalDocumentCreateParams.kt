// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.supplementaldocuments

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.Params
import com.increase.api.core.checkRequired
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import java.util.Objects

/** Create a supplemental document for an Entity */
class SupplementalDocumentCreateParams private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,

) : Params {

    /** The identifier of the Entity to associate with the supplemental document. */
    fun entityId(): String = body.entityId()

    /** The identifier of the File containing the document. */
    fun fileId(): String = body.fileId()

    /** The identifier of the Entity to associate with the supplemental document. */
    fun _entityId(): JsonField<String> = body._entityId()

    /** The identifier of the File containing the document. */
    fun _fileId(): JsonField<String> = body._fileId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic
    internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class Body @JsonCreator private constructor(
        @JsonProperty("entity_id") @ExcludeMissing private val entityId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("file_id") @ExcludeMissing private val fileId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

    ) {

        /** The identifier of the Entity to associate with the supplemental document. */
        fun entityId(): String = entityId.getRequired("entity_id")

        /** The identifier of the File containing the document. */
        fun fileId(): String = fileId.getRequired("file_id")

        /** The identifier of the Entity to associate with the supplemental document. */
        @JsonProperty("entity_id")
        @ExcludeMissing
        fun _entityId(): JsonField<String> = entityId

        /** The identifier of the File containing the document. */
        @JsonProperty("file_id")
        @ExcludeMissing
        fun _fileId(): JsonField<String> = fileId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body =
            apply {
                if (validated) {
                  return@apply
                }

                entityId()
                fileId()
                validated = true
            }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             *
             * ```java
             * .entityId()
             * .fileId()
             * ```
             */
            @JvmStatic
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var entityId: JsonField<String>? = null
            private var fileId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) =
                apply {
                    entityId = body.entityId
                    fileId = body.fileId
                    additionalProperties = body.additionalProperties.toMutableMap()
                }

            /** The identifier of the Entity to associate with the supplemental document. */
            fun entityId(entityId: String) = entityId(JsonField.of(entityId))

            /** The identifier of the Entity to associate with the supplemental document. */
            fun entityId(entityId: JsonField<String>) =
                apply {
                    this.entityId = entityId
                }

            /** The identifier of the File containing the document. */
            fun fileId(fileId: String) = fileId(JsonField.of(fileId))

            /** The identifier of the File containing the document. */
            fun fileId(fileId: JsonField<String>) =
                apply {
                    this.fileId = fileId
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

            fun putAdditionalProperty(key: String, value: JsonValue) =
                apply {
                    additionalProperties.put(key, value)
                }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun removeAdditionalProperty(key: String) =
                apply {
                    additionalProperties.remove(key)
                }

            fun removeAllAdditionalProperties(keys: Set<String>) =
                apply {
                    keys.forEach(::removeAdditionalProperty)
                }

            fun build(): Body =
                Body(
                  checkRequired(
                    "entityId", entityId
                  ),
                  checkRequired(
                    "fileId", fileId
                  ),
                  additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return /* spotless:off */ other is Body && entityId == other.entityId && fileId == other.fileId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(entityId, fileId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Body{entityId=$entityId, fileId=$fileId, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SupplementalDocumentCreateParams].
         *
         * The following fields are required:
         *
         * ```java
         * .entityId()
         * .fileId()
         * ```
         */
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [SupplementalDocumentCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(supplementalDocumentCreateParams: SupplementalDocumentCreateParams) =
            apply {
                body = supplementalDocumentCreateParams.body.toBuilder()
                additionalHeaders = supplementalDocumentCreateParams.additionalHeaders.toBuilder()
                additionalQueryParams = supplementalDocumentCreateParams.additionalQueryParams.toBuilder()
            }

        /** The identifier of the Entity to associate with the supplemental document. */
        fun entityId(entityId: String) =
            apply {
                body.entityId(entityId)
            }

        /** The identifier of the Entity to associate with the supplemental document. */
        fun entityId(entityId: JsonField<String>) =
            apply {
                body.entityId(entityId)
            }

        /** The identifier of the File containing the document. */
        fun fileId(fileId: String) =
            apply {
                body.fileId(fileId)
            }

        /** The identifier of the File containing the document. */
        fun fileId(fileId: JsonField<String>) =
            apply {
                body.fileId(fileId)
            }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.additionalProperties(additionalBodyProperties)
            }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) =
            apply {
                body.putAdditionalProperty(
                  key, value
                )
            }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) =
            apply {
                body.removeAdditionalProperty(key)
            }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) =
            apply {
                body.removeAllAdditionalProperties(keys)
            }

        fun additionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.clear()
                putAllAdditionalHeaders(additionalHeaders)
            }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.clear()
                putAllAdditionalHeaders(additionalHeaders)
            }

        fun putAdditionalHeader(name: String, value: String) =
            apply {
                additionalHeaders.put(name, value)
            }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) =
            apply {
                additionalHeaders.put(name, values)
            }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.putAll(additionalHeaders)
            }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.putAll(additionalHeaders)
            }

        fun replaceAdditionalHeaders(name: String, value: String) =
            apply {
                additionalHeaders.replace(name, value)
            }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) =
            apply {
                additionalHeaders.replace(name, values)
            }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.replaceAll(additionalHeaders)
            }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.replaceAll(additionalHeaders)
            }

        fun removeAdditionalHeaders(name: String) =
            apply {
                additionalHeaders.remove(name)
            }

        fun removeAllAdditionalHeaders(names: Set<String>) =
            apply {
                additionalHeaders.removeAll(names)
            }

        fun additionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.clear()
                putAllAdditionalQueryParams(additionalQueryParams)
            }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.clear()
                putAllAdditionalQueryParams(additionalQueryParams)
            }

        fun putAdditionalQueryParam(key: String, value: String) =
            apply {
                additionalQueryParams.put(key, value)
            }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) =
            apply {
                additionalQueryParams.put(key, values)
            }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) =
            apply {
                additionalQueryParams.replace(key, value)
            }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) =
            apply {
                additionalQueryParams.replace(key, values)
            }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) =
            apply {
                additionalQueryParams.remove(key)
            }

        fun removeAllAdditionalQueryParams(keys: Set<String>) =
            apply {
                additionalQueryParams.removeAll(keys)
            }

        fun build(): SupplementalDocumentCreateParams =
            SupplementalDocumentCreateParams(
              body.build(),
              additionalHeaders.build(),
              additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is SupplementalDocumentCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() = "SupplementalDocumentCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
