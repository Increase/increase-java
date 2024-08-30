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

class PhysicalCardProfileCreateParams constructor(
  private val carrierImageFileId: String,
  private val contactPhone: String,
  private val description: String,
  private val frontImageFileId: String,
  private val additionalQueryParams: Map<String, List<String>>,
  private val additionalHeaders: Map<String, List<String>>,
  private val additionalBodyProperties: Map<String, JsonValue>,

) {

    fun carrierImageFileId(): String = carrierImageFileId

    fun contactPhone(): String = contactPhone

    fun description(): String = description

    fun frontImageFileId(): String = frontImageFileId

    @JvmSynthetic
    internal fun getBody(): PhysicalCardProfileCreateBody {
      return PhysicalCardProfileCreateBody(
          carrierImageFileId,
          contactPhone,
          description,
          frontImageFileId,
          additionalBodyProperties,
      )
    }

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic
    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = PhysicalCardProfileCreateBody.Builder::class)
    @NoAutoDetect
    class PhysicalCardProfileCreateBody internal constructor(
      private val carrierImageFileId: String?,
      private val contactPhone: String?,
      private val description: String?,
      private val frontImageFileId: String?,
      private val additionalProperties: Map<String, JsonValue>,

    ) {

        private var hashCode: Int = 0

        /** The identifier of the File containing the physical card's carrier image. */
        @JsonProperty("carrier_image_file_id")
        fun carrierImageFileId(): String? = carrierImageFileId

        /** A phone number the user can contact to receive support for their card. */
        @JsonProperty("contact_phone")
        fun contactPhone(): String? = contactPhone

        /** A description you can use to identify the Card Profile. */
        @JsonProperty("description")
        fun description(): String? = description

        /** The identifier of the File containing the physical card's front image. */
        @JsonProperty("front_image_file_id")
        fun frontImageFileId(): String? = frontImageFileId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is PhysicalCardProfileCreateBody &&
              this.carrierImageFileId == other.carrierImageFileId &&
              this.contactPhone == other.contactPhone &&
              this.description == other.description &&
              this.frontImageFileId == other.frontImageFileId &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                carrierImageFileId,
                contactPhone,
                description,
                frontImageFileId,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "PhysicalCardProfileCreateBody{carrierImageFileId=$carrierImageFileId, contactPhone=$contactPhone, description=$description, frontImageFileId=$frontImageFileId, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var carrierImageFileId: String? = null
            private var contactPhone: String? = null
            private var description: String? = null
            private var frontImageFileId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(physicalCardProfileCreateBody: PhysicalCardProfileCreateBody) = apply {
                this.carrierImageFileId = physicalCardProfileCreateBody.carrierImageFileId
                this.contactPhone = physicalCardProfileCreateBody.contactPhone
                this.description = physicalCardProfileCreateBody.description
                this.frontImageFileId = physicalCardProfileCreateBody.frontImageFileId
                additionalProperties(physicalCardProfileCreateBody.additionalProperties)
            }

            /** The identifier of the File containing the physical card's carrier image. */
            @JsonProperty("carrier_image_file_id")
            fun carrierImageFileId(carrierImageFileId: String) = apply {
                this.carrierImageFileId = carrierImageFileId
            }

            /** A phone number the user can contact to receive support for their card. */
            @JsonProperty("contact_phone")
            fun contactPhone(contactPhone: String) = apply {
                this.contactPhone = contactPhone
            }

            /** A description you can use to identify the Card Profile. */
            @JsonProperty("description")
            fun description(description: String) = apply {
                this.description = description
            }

            /** The identifier of the File containing the physical card's front image. */
            @JsonProperty("front_image_file_id")
            fun frontImageFileId(frontImageFileId: String) = apply {
                this.frontImageFileId = frontImageFileId
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

            fun build(): PhysicalCardProfileCreateBody = PhysicalCardProfileCreateBody(
                checkNotNull(carrierImageFileId) {
                    "`carrierImageFileId` is required but was not set"
                },
                checkNotNull(contactPhone) {
                    "`contactPhone` is required but was not set"
                },
                checkNotNull(description) {
                    "`description` is required but was not set"
                },
                checkNotNull(frontImageFileId) {
                    "`frontImageFileId` is required but was not set"
                },
                additionalProperties.toUnmodifiable(),
            )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is PhysicalCardProfileCreateParams &&
          this.carrierImageFileId == other.carrierImageFileId &&
          this.contactPhone == other.contactPhone &&
          this.description == other.description &&
          this.frontImageFileId == other.frontImageFileId &&
          this.additionalQueryParams == other.additionalQueryParams &&
          this.additionalHeaders == other.additionalHeaders &&
          this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
      return Objects.hash(
          carrierImageFileId,
          contactPhone,
          description,
          frontImageFileId,
          additionalQueryParams,
          additionalHeaders,
          additionalBodyProperties,
      )
    }

    override fun toString() = "PhysicalCardProfileCreateParams{carrierImageFileId=$carrierImageFileId, contactPhone=$contactPhone, description=$description, frontImageFileId=$frontImageFileId, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var carrierImageFileId: String? = null
        private var contactPhone: String? = null
        private var description: String? = null
        private var frontImageFileId: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(physicalCardProfileCreateParams: PhysicalCardProfileCreateParams) = apply {
            this.carrierImageFileId = physicalCardProfileCreateParams.carrierImageFileId
            this.contactPhone = physicalCardProfileCreateParams.contactPhone
            this.description = physicalCardProfileCreateParams.description
            this.frontImageFileId = physicalCardProfileCreateParams.frontImageFileId
            additionalQueryParams(physicalCardProfileCreateParams.additionalQueryParams)
            additionalHeaders(physicalCardProfileCreateParams.additionalHeaders)
            additionalBodyProperties(physicalCardProfileCreateParams.additionalBodyProperties)
        }

        /** The identifier of the File containing the physical card's carrier image. */
        fun carrierImageFileId(carrierImageFileId: String) = apply {
            this.carrierImageFileId = carrierImageFileId
        }

        /** A phone number the user can contact to receive support for their card. */
        fun contactPhone(contactPhone: String) = apply {
            this.contactPhone = contactPhone
        }

        /** A description you can use to identify the Card Profile. */
        fun description(description: String) = apply {
            this.description = description
        }

        /** The identifier of the File containing the physical card's front image. */
        fun frontImageFileId(frontImageFileId: String) = apply {
            this.frontImageFileId = frontImageFileId
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

        fun build(): PhysicalCardProfileCreateParams = PhysicalCardProfileCreateParams(
            checkNotNull(carrierImageFileId) {
                "`carrierImageFileId` is required but was not set"
            },
            checkNotNull(contactPhone) {
                "`contactPhone` is required but was not set"
            },
            checkNotNull(description) {
                "`description` is required but was not set"
            },
            checkNotNull(frontImageFileId) {
                "`frontImageFileId` is required but was not set"
            },
            additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalBodyProperties.toUnmodifiable(),
        )
    }
}
