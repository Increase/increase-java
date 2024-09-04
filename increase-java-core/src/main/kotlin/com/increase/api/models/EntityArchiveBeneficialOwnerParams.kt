// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.apache.hc.core5.http.ContentType
import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import java.util.UUID
import com.increase.api.core.BaseDeserializer
import com.increase.api.core.BaseSerializer
import com.increase.api.core.getOrThrow
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.MultipartFormValue
import com.increase.api.core.toUnmodifiable
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.Enum
import com.increase.api.core.ContentTypes
import com.increase.api.errors.IncreaseInvalidDataException
import com.increase.api.models.*

class EntityArchiveBeneficialOwnerParams constructor(
  private val entityId: String,
  private val beneficialOwnerId: String,
  private val additionalQueryParams: Map<String, List<String>>,
  private val additionalHeaders: Map<String, List<String>>,
  private val additionalBodyProperties: Map<String, JsonValue>,

) {

    fun entityId(): String = entityId

    fun beneficialOwnerId(): String = beneficialOwnerId

    @JvmSynthetic
    internal fun getBody(): EntityArchiveBeneficialOwnerBody {
      return EntityArchiveBeneficialOwnerBody(beneficialOwnerId, additionalBodyProperties)
    }

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic
    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
      return when (index) {
          0 -> entityId
          else -> ""
      }
    }

    @JsonDeserialize(builder = EntityArchiveBeneficialOwnerBody.Builder::class)
    @NoAutoDetect
    class EntityArchiveBeneficialOwnerBody internal constructor(private val beneficialOwnerId: String?, private val additionalProperties: Map<String, JsonValue>, ) {

        private var hashCode: Int = 0

        /**
         * The identifying details of anyone controlling or owning 25% or more of the
         * corporation.
         */
        @JsonProperty("beneficial_owner_id")
        fun beneficialOwnerId(): String? = beneficialOwnerId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is EntityArchiveBeneficialOwnerBody &&
              this.beneficialOwnerId == other.beneficialOwnerId &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(beneficialOwnerId, additionalProperties)
          }
          return hashCode
        }

        override fun toString() = "EntityArchiveBeneficialOwnerBody{beneficialOwnerId=$beneficialOwnerId, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var beneficialOwnerId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(entityArchiveBeneficialOwnerBody: EntityArchiveBeneficialOwnerBody) = apply {
                this.beneficialOwnerId = entityArchiveBeneficialOwnerBody.beneficialOwnerId
                additionalProperties(entityArchiveBeneficialOwnerBody.additionalProperties)
            }

            /**
             * The identifying details of anyone controlling or owning 25% or more of the
             * corporation.
             */
            @JsonProperty("beneficial_owner_id")
            fun beneficialOwnerId(beneficialOwnerId: String) = apply {
                this.beneficialOwnerId = beneficialOwnerId
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): EntityArchiveBeneficialOwnerBody = EntityArchiveBeneficialOwnerBody(checkNotNull(beneficialOwnerId) {
                "`beneficialOwnerId` is required but was not set"
            }, additionalProperties.toUnmodifiable())
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is EntityArchiveBeneficialOwnerParams &&
          this.entityId == other.entityId &&
          this.beneficialOwnerId == other.beneficialOwnerId &&
          this.additionalQueryParams == other.additionalQueryParams &&
          this.additionalHeaders == other.additionalHeaders &&
          this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
      return Objects.hash(
          entityId,
          beneficialOwnerId,
          additionalQueryParams,
          additionalHeaders,
          additionalBodyProperties,
      )
    }

    override fun toString() = "EntityArchiveBeneficialOwnerParams{entityId=$entityId, beneficialOwnerId=$beneficialOwnerId, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var entityId: String? = null
        private var beneficialOwnerId: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(entityArchiveBeneficialOwnerParams: EntityArchiveBeneficialOwnerParams) = apply {
            this.entityId = entityArchiveBeneficialOwnerParams.entityId
            this.beneficialOwnerId = entityArchiveBeneficialOwnerParams.beneficialOwnerId
            additionalQueryParams(entityArchiveBeneficialOwnerParams.additionalQueryParams)
            additionalHeaders(entityArchiveBeneficialOwnerParams.additionalHeaders)
            additionalBodyProperties(entityArchiveBeneficialOwnerParams.additionalBodyProperties)
        }

        /**
         * The identifier of the Entity associated with the Beneficial Owner that is being
         * archived.
         */
        fun entityId(entityId: String) = apply {
            this.entityId = entityId
        }

        /**
         * The identifying details of anyone controlling or owning 25% or more of the
         * corporation.
         */
        fun beneficialOwnerId(beneficialOwnerId: String) = apply {
            this.beneficialOwnerId = beneficialOwnerId
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply {
            this.additionalHeaders.put(name, mutableListOf())
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun build(): EntityArchiveBeneficialOwnerParams = EntityArchiveBeneficialOwnerParams(
            checkNotNull(entityId) {
                "`entityId` is required but was not set"
            },
            checkNotNull(beneficialOwnerId) {
                "`beneficialOwnerId` is required but was not set"
            },
            additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalBodyProperties.toUnmodifiable(),
        )
    }
}
