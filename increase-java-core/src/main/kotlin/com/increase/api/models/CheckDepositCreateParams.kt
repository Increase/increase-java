// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

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
import java.util.Optional

/** Create a Check Deposit */
class CheckDepositCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The identifier for the Account to deposit the check in. */
    fun accountId(): String = body.accountId()

    /** The deposit amount in USD cents. */
    fun amount(): Long = body.amount()

    /** The File containing the check's back image. */
    fun backImageFileId(): String = body.backImageFileId()

    /** The File containing the check's front image. */
    fun frontImageFileId(): String = body.frontImageFileId()

    /** The description you choose to give the Check Deposit, for display purposes only. */
    fun description(): Optional<String> = body.description()

    /** The identifier for the Account to deposit the check in. */
    fun _accountId(): JsonField<String> = body._accountId()

    /** The deposit amount in USD cents. */
    fun _amount(): JsonField<Long> = body._amount()

    /** The File containing the check's back image. */
    fun _backImageFileId(): JsonField<String> = body._backImageFileId()

    /** The File containing the check's front image. */
    fun _frontImageFileId(): JsonField<String> = body._frontImageFileId()

    /** The description you choose to give the Check Deposit, for display purposes only. */
    fun _description(): JsonField<String> = body._description()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("account_id")
        @ExcludeMissing
        private val accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("back_image_file_id")
        @ExcludeMissing
        private val backImageFileId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("front_image_file_id")
        @ExcludeMissing
        private val frontImageFileId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The identifier for the Account to deposit the check in. */
        fun accountId(): String = accountId.getRequired("account_id")

        /** The deposit amount in USD cents. */
        fun amount(): Long = amount.getRequired("amount")

        /** The File containing the check's back image. */
        fun backImageFileId(): String = backImageFileId.getRequired("back_image_file_id")

        /** The File containing the check's front image. */
        fun frontImageFileId(): String = frontImageFileId.getRequired("front_image_file_id")

        /** The description you choose to give the Check Deposit, for display purposes only. */
        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        /** The identifier for the Account to deposit the check in. */
        @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

        /** The deposit amount in USD cents. */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /** The File containing the check's back image. */
        @JsonProperty("back_image_file_id")
        @ExcludeMissing
        fun _backImageFileId(): JsonField<String> = backImageFileId

        /** The File containing the check's front image. */
        @JsonProperty("front_image_file_id")
        @ExcludeMissing
        fun _frontImageFileId(): JsonField<String> = frontImageFileId

        /** The description you choose to give the Check Deposit, for display purposes only. */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accountId()
            amount()
            backImageFileId()
            frontImageFileId()
            description()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var accountId: JsonField<String>? = null
            private var amount: JsonField<Long>? = null
            private var backImageFileId: JsonField<String>? = null
            private var frontImageFileId: JsonField<String>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                accountId = body.accountId
                amount = body.amount
                backImageFileId = body.backImageFileId
                frontImageFileId = body.frontImageFileId
                description = body.description
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The identifier for the Account to deposit the check in. */
            fun accountId(accountId: String) = accountId(JsonField.of(accountId))

            /** The identifier for the Account to deposit the check in. */
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /** The deposit amount in USD cents. */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /** The deposit amount in USD cents. */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** The File containing the check's back image. */
            fun backImageFileId(backImageFileId: String) =
                backImageFileId(JsonField.of(backImageFileId))

            /** The File containing the check's back image. */
            fun backImageFileId(backImageFileId: JsonField<String>) = apply {
                this.backImageFileId = backImageFileId
            }

            /** The File containing the check's front image. */
            fun frontImageFileId(frontImageFileId: String) =
                frontImageFileId(JsonField.of(frontImageFileId))

            /** The File containing the check's front image. */
            fun frontImageFileId(frontImageFileId: JsonField<String>) = apply {
                this.frontImageFileId = frontImageFileId
            }

            /** The description you choose to give the Check Deposit, for display purposes only. */
            fun description(description: String) = description(JsonField.of(description))

            /** The description you choose to give the Check Deposit, for display purposes only. */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): Body =
                Body(
                    checkRequired("accountId", accountId),
                    checkRequired("amount", amount),
                    checkRequired("backImageFileId", backImageFileId),
                    checkRequired("frontImageFileId", frontImageFileId),
                    description,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && accountId == other.accountId && amount == other.amount && backImageFileId == other.backImageFileId && frontImageFileId == other.frontImageFileId && description == other.description && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountId, amount, backImageFileId, frontImageFileId, description, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{accountId=$accountId, amount=$amount, backImageFileId=$backImageFileId, frontImageFileId=$frontImageFileId, description=$description, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CheckDepositCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(checkDepositCreateParams: CheckDepositCreateParams) = apply {
            body = checkDepositCreateParams.body.toBuilder()
            additionalHeaders = checkDepositCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = checkDepositCreateParams.additionalQueryParams.toBuilder()
        }

        /** The identifier for the Account to deposit the check in. */
        fun accountId(accountId: String) = apply { body.accountId(accountId) }

        /** The identifier for the Account to deposit the check in. */
        fun accountId(accountId: JsonField<String>) = apply { body.accountId(accountId) }

        /** The deposit amount in USD cents. */
        fun amount(amount: Long) = apply { body.amount(amount) }

        /** The deposit amount in USD cents. */
        fun amount(amount: JsonField<Long>) = apply { body.amount(amount) }

        /** The File containing the check's back image. */
        fun backImageFileId(backImageFileId: String) = apply {
            body.backImageFileId(backImageFileId)
        }

        /** The File containing the check's back image. */
        fun backImageFileId(backImageFileId: JsonField<String>) = apply {
            body.backImageFileId(backImageFileId)
        }

        /** The File containing the check's front image. */
        fun frontImageFileId(frontImageFileId: String) = apply {
            body.frontImageFileId(frontImageFileId)
        }

        /** The File containing the check's front image. */
        fun frontImageFileId(frontImageFileId: JsonField<String>) = apply {
            body.frontImageFileId(frontImageFileId)
        }

        /** The description you choose to give the Check Deposit, for display purposes only. */
        fun description(description: String) = apply { body.description(description) }

        /** The description you choose to give the Check Deposit, for display purposes only. */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

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

        fun build(): CheckDepositCreateParams =
            CheckDepositCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CheckDepositCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CheckDepositCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
