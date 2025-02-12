// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.toImmutable
import com.increase.api.models.*
import java.util.Objects
import java.util.Optional

class CheckDepositCreateParams
constructor(
    private val accountId: String,
    private val amount: Long,
    private val backImageFileId: String,
    private val frontImageFileId: String,
    private val description: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
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

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = CheckDepositCreateBody.Builder::class)
    @NoAutoDetect
    class CheckDepositCreateBody
    internal constructor(
        private val accountId: String?,
        private val amount: Long?,
        private val backImageFileId: String?,
        private val frontImageFileId: String?,
        private val description: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The identifier for the Account to deposit the check in. */
        @JsonProperty("account_id") fun accountId(): String? = accountId

        /** The deposit amount in USD cents. */
        @JsonProperty("amount") fun amount(): Long? = amount

        /** The File containing the check's back image. */
        @JsonProperty("back_image_file_id") fun backImageFileId(): String? = backImageFileId

        /** The File containing the check's front image. */
        @JsonProperty("front_image_file_id") fun frontImageFileId(): String? = frontImageFileId

        /** The description you choose to give the Check Deposit, for display purposes only. */
        @JsonProperty("description") fun description(): String? = description

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
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
            fun accountId(accountId: String) = apply { this.accountId = accountId }

            /** The deposit amount in USD cents. */
            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

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
            fun description(description: String) = apply { this.description = description }

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

            fun build(): CheckDepositCreateBody =
                CheckDepositCreateBody(
                    checkNotNull(accountId) { "`accountId` is required but was not set" },
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    checkNotNull(backImageFileId) {
                        "`backImageFileId` is required but was not set"
                    },
                    checkNotNull(frontImageFileId) {
                        "`frontImageFileId` is required but was not set"
                    },
                    description,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CheckDepositCreateBody && this.accountId == other.accountId && this.amount == other.amount && this.backImageFileId == other.backImageFileId && this.frontImageFileId == other.frontImageFileId && this.description == other.description && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(accountId, amount, backImageFileId, frontImageFileId, description, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "CheckDepositCreateBody{accountId=$accountId, amount=$amount, backImageFileId=$backImageFileId, frontImageFileId=$frontImageFileId, description=$description, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CheckDepositCreateParams && this.accountId == other.accountId && this.amount == other.amount && this.backImageFileId == other.backImageFileId && this.frontImageFileId == other.frontImageFileId && this.description == other.description && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(accountId, amount, backImageFileId, frontImageFileId, description, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "CheckDepositCreateParams{accountId=$accountId, amount=$amount, backImageFileId=$backImageFileId, frontImageFileId=$frontImageFileId, description=$description, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountId: String? = null
        private var amount: Long? = null
        private var backImageFileId: String? = null
        private var frontImageFileId: String? = null
        private var description: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(checkDepositCreateParams: CheckDepositCreateParams) = apply {
            this.accountId = checkDepositCreateParams.accountId
            this.amount = checkDepositCreateParams.amount
            this.backImageFileId = checkDepositCreateParams.backImageFileId
            this.frontImageFileId = checkDepositCreateParams.frontImageFileId
            this.description = checkDepositCreateParams.description
            additionalHeaders(checkDepositCreateParams.additionalHeaders)
            additionalQueryParams(checkDepositCreateParams.additionalQueryParams)
            additionalBodyProperties(checkDepositCreateParams.additionalBodyProperties)
        }

        /** The identifier for the Account to deposit the check in. */
        fun accountId(accountId: String) = apply { this.accountId = accountId }

        /** The deposit amount in USD cents. */
        fun amount(amount: Long) = apply { this.amount = amount }

        /** The File containing the check's back image. */
        fun backImageFileId(backImageFileId: String) = apply {
            this.backImageFileId = backImageFileId
        }

        /** The File containing the check's front image. */
        fun frontImageFileId(frontImageFileId: String) = apply {
            this.frontImageFileId = frontImageFileId
        }

        /** The description you choose to give the Check Deposit, for display purposes only. */
        fun description(description: String) = apply { this.description = description }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): CheckDepositCreateParams =
            CheckDepositCreateParams(
                checkNotNull(accountId) { "`accountId` is required but was not set" },
                checkNotNull(amount) { "`amount` is required but was not set" },
                checkNotNull(backImageFileId) { "`backImageFileId` is required but was not set" },
                checkNotNull(frontImageFileId) { "`frontImageFileId` is required but was not set" },
                description,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }
}
