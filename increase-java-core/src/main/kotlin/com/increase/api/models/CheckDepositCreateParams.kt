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

class CheckDepositCreateParams constructor(
  private val accountId: String,
  private val amount: Long,
  private val backImageFileId: String,
  private val frontImageFileId: String,
  private val description: String?,
  private val additionalQueryParams: Map<String, List<String>>,
  private val additionalHeaders: Map<String, List<String>>,
  private val additionalBodyProperties: Map<String, JsonValue>,

) {

    fun accountId(): String = accountId

    fun amount(): Long = amount

    fun backImageFileId(): String = backImageFileId

    fun frontImageFileId(): String = frontImageFileId

    fun description(): Optional<String> = Optional.ofNullable(description)

    @JvmSynthetic
    internal fun getBody(): CheckDepositCreateBody {
      return CheckDepositCreateBody(
          accountId,
          amount,
          backImageFileId,
          frontImageFileId,
          description,
          additionalBodyProperties,
      )
    }

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic
    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = CheckDepositCreateBody.Builder::class)
    @NoAutoDetect
    class CheckDepositCreateBody internal constructor(
      private val accountId: String?,
      private val amount: Long?,
      private val backImageFileId: String?,
      private val frontImageFileId: String?,
      private val description: String?,
      private val additionalProperties: Map<String, JsonValue>,

    ) {

        private var hashCode: Int = 0

        /** The identifier for the Account to deposit the check in. */
        @JsonProperty("account_id")
        fun accountId(): String? = accountId

        /**
         * The deposit amount in the minor unit of the account currency. For dollars, for
         * example, this is cents.
         */
        @JsonProperty("amount")
        fun amount(): Long? = amount

        /** The File containing the check's back image. */
        @JsonProperty("back_image_file_id")
        fun backImageFileId(): String? = backImageFileId

        /** The File containing the check's front image. */
        @JsonProperty("front_image_file_id")
        fun frontImageFileId(): String? = frontImageFileId

        /** The description you choose to give the Check Deposit, for display purposes only. */
        @JsonProperty("description")
        fun description(): String? = description

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is CheckDepositCreateBody &&
              this.accountId == other.accountId &&
              this.amount == other.amount &&
              this.backImageFileId == other.backImageFileId &&
              this.frontImageFileId == other.frontImageFileId &&
              this.description == other.description &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                accountId,
                amount,
                backImageFileId,
                frontImageFileId,
                description,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "CheckDepositCreateBody{accountId=$accountId, amount=$amount, backImageFileId=$backImageFileId, frontImageFileId=$frontImageFileId, description=$description, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var accountId: String? = null
            private var amount: Long? = null
            private var backImageFileId: String? = null
            private var frontImageFileId: String? = null
            private var description: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(checkDepositCreateBody: CheckDepositCreateBody) = apply {
                this.accountId = checkDepositCreateBody.accountId
                this.amount = checkDepositCreateBody.amount
                this.backImageFileId = checkDepositCreateBody.backImageFileId
                this.frontImageFileId = checkDepositCreateBody.frontImageFileId
                this.description = checkDepositCreateBody.description
                additionalProperties(checkDepositCreateBody.additionalProperties)
            }

            /** The identifier for the Account to deposit the check in. */
            @JsonProperty("account_id")
            fun accountId(accountId: String) = apply {
                this.accountId = accountId
            }

            /**
             * The deposit amount in the minor unit of the account currency. For dollars, for
             * example, this is cents.
             */
            @JsonProperty("amount")
            fun amount(amount: Long) = apply {
                this.amount = amount
            }

            /** The File containing the check's back image. */
            @JsonProperty("back_image_file_id")
            fun backImageFileId(backImageFileId: String) = apply {
                this.backImageFileId = backImageFileId
            }

            /** The File containing the check's front image. */
            @JsonProperty("front_image_file_id")
            fun frontImageFileId(frontImageFileId: String) = apply {
                this.frontImageFileId = frontImageFileId
            }

            /** The description you choose to give the Check Deposit, for display purposes only. */
            @JsonProperty("description")
            fun description(description: String) = apply {
                this.description = description
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

            fun build(): CheckDepositCreateBody = CheckDepositCreateBody(
                checkNotNull(accountId) {
                    "`accountId` is required but was not set"
                },
                checkNotNull(amount) {
                    "`amount` is required but was not set"
                },
                checkNotNull(backImageFileId) {
                    "`backImageFileId` is required but was not set"
                },
                checkNotNull(frontImageFileId) {
                    "`frontImageFileId` is required but was not set"
                },
                description,
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

      return other is CheckDepositCreateParams &&
          this.accountId == other.accountId &&
          this.amount == other.amount &&
          this.backImageFileId == other.backImageFileId &&
          this.frontImageFileId == other.frontImageFileId &&
          this.description == other.description &&
          this.additionalQueryParams == other.additionalQueryParams &&
          this.additionalHeaders == other.additionalHeaders &&
          this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
      return Objects.hash(
          accountId,
          amount,
          backImageFileId,
          frontImageFileId,
          description,
          additionalQueryParams,
          additionalHeaders,
          additionalBodyProperties,
      )
    }

    override fun toString() = "CheckDepositCreateParams{accountId=$accountId, amount=$amount, backImageFileId=$backImageFileId, frontImageFileId=$frontImageFileId, description=$description, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountId: String? = null
        private var amount: Long? = null
        private var backImageFileId: String? = null
        private var frontImageFileId: String? = null
        private var description: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(checkDepositCreateParams: CheckDepositCreateParams) = apply {
            this.accountId = checkDepositCreateParams.accountId
            this.amount = checkDepositCreateParams.amount
            this.backImageFileId = checkDepositCreateParams.backImageFileId
            this.frontImageFileId = checkDepositCreateParams.frontImageFileId
            this.description = checkDepositCreateParams.description
            additionalQueryParams(checkDepositCreateParams.additionalQueryParams)
            additionalHeaders(checkDepositCreateParams.additionalHeaders)
            additionalBodyProperties(checkDepositCreateParams.additionalBodyProperties)
        }

        /** The identifier for the Account to deposit the check in. */
        fun accountId(accountId: String) = apply {
            this.accountId = accountId
        }

        /**
         * The deposit amount in the minor unit of the account currency. For dollars, for
         * example, this is cents.
         */
        fun amount(amount: Long) = apply {
            this.amount = amount
        }

        /** The File containing the check's back image. */
        fun backImageFileId(backImageFileId: String) = apply {
            this.backImageFileId = backImageFileId
        }

        /** The File containing the check's front image. */
        fun frontImageFileId(frontImageFileId: String) = apply {
            this.frontImageFileId = frontImageFileId
        }

        /** The description you choose to give the Check Deposit, for display purposes only. */
        fun description(description: String) = apply {
            this.description = description
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

        fun build(): CheckDepositCreateParams = CheckDepositCreateParams(
            checkNotNull(accountId) {
                "`accountId` is required but was not set"
            },
            checkNotNull(amount) {
                "`amount` is required but was not set"
            },
            checkNotNull(backImageFileId) {
                "`backImageFileId` is required but was not set"
            },
            checkNotNull(frontImageFileId) {
                "`frontImageFileId` is required but was not set"
            },
            description,
            additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalBodyProperties.toUnmodifiable(),
        )
    }
}
