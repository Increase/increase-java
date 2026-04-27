// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.inboundmailitems

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.Params
import com.increase.api.core.checkRequired
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.errors.IncreaseInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

/**
 * Simulates an inbound mail item to your account, as if someone had mailed a physical check to one
 * of your account's Lockboxes.
 */
class InboundMailItemCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The amount of the check to be simulated, in cents.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = body.amount()

    /**
     * The file containing the PDF contents. If not present, a default check image file will be
     * used.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contentsFileId(): Optional<String> = body.contentsFileId()

    /**
     * The identifier of the Lockbox Address to simulate inbound mail to.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lockboxAddressId(): Optional<String> = body.lockboxAddressId()

    /**
     * The identifier of the Lockbox Recipient to simulate inbound mail to.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lockboxRecipientId(): Optional<String> = body.lockboxRecipientId()

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _amount(): JsonField<Long> = body._amount()

    /**
     * Returns the raw JSON value of [contentsFileId].
     *
     * Unlike [contentsFileId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _contentsFileId(): JsonField<String> = body._contentsFileId()

    /**
     * Returns the raw JSON value of [lockboxAddressId].
     *
     * Unlike [lockboxAddressId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _lockboxAddressId(): JsonField<String> = body._lockboxAddressId()

    /**
     * Returns the raw JSON value of [lockboxRecipientId].
     *
     * Unlike [lockboxRecipientId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _lockboxRecipientId(): JsonField<String> = body._lockboxRecipientId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [InboundMailItemCreateParams].
         *
         * The following fields are required:
         * ```java
         * .amount()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InboundMailItemCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(inboundMailItemCreateParams: InboundMailItemCreateParams) = apply {
            body = inboundMailItemCreateParams.body.toBuilder()
            additionalHeaders = inboundMailItemCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = inboundMailItemCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [amount]
         * - [contentsFileId]
         * - [lockboxAddressId]
         * - [lockboxRecipientId]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The amount of the check to be simulated, in cents. */
        fun amount(amount: Long) = apply { body.amount(amount) }

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { body.amount(amount) }

        /**
         * The file containing the PDF contents. If not present, a default check image file will be
         * used.
         */
        fun contentsFileId(contentsFileId: String) = apply { body.contentsFileId(contentsFileId) }

        /**
         * Sets [Builder.contentsFileId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contentsFileId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun contentsFileId(contentsFileId: JsonField<String>) = apply {
            body.contentsFileId(contentsFileId)
        }

        /** The identifier of the Lockbox Address to simulate inbound mail to. */
        fun lockboxAddressId(lockboxAddressId: String) = apply {
            body.lockboxAddressId(lockboxAddressId)
        }

        /**
         * Sets [Builder.lockboxAddressId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lockboxAddressId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lockboxAddressId(lockboxAddressId: JsonField<String>) = apply {
            body.lockboxAddressId(lockboxAddressId)
        }

        /** The identifier of the Lockbox Recipient to simulate inbound mail to. */
        fun lockboxRecipientId(lockboxRecipientId: String) = apply {
            body.lockboxRecipientId(lockboxRecipientId)
        }

        /**
         * Sets [Builder.lockboxRecipientId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lockboxRecipientId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lockboxRecipientId(lockboxRecipientId: JsonField<String>) = apply {
            body.lockboxRecipientId(lockboxRecipientId)
        }

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

        /**
         * Returns an immutable instance of [InboundMailItemCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .amount()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InboundMailItemCreateParams =
            InboundMailItemCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val amount: JsonField<Long>,
        private val contentsFileId: JsonField<String>,
        private val lockboxAddressId: JsonField<String>,
        private val lockboxRecipientId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("contents_file_id")
            @ExcludeMissing
            contentsFileId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("lockbox_address_id")
            @ExcludeMissing
            lockboxAddressId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("lockbox_recipient_id")
            @ExcludeMissing
            lockboxRecipientId: JsonField<String> = JsonMissing.of(),
        ) : this(amount, contentsFileId, lockboxAddressId, lockboxRecipientId, mutableMapOf())

        /**
         * The amount of the check to be simulated, in cents.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * The file containing the PDF contents. If not present, a default check image file will be
         * used.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun contentsFileId(): Optional<String> = contentsFileId.getOptional("contents_file_id")

        /**
         * The identifier of the Lockbox Address to simulate inbound mail to.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun lockboxAddressId(): Optional<String> =
            lockboxAddressId.getOptional("lockbox_address_id")

        /**
         * The identifier of the Lockbox Recipient to simulate inbound mail to.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun lockboxRecipientId(): Optional<String> =
            lockboxRecipientId.getOptional("lockbox_recipient_id")

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /**
         * Returns the raw JSON value of [contentsFileId].
         *
         * Unlike [contentsFileId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("contents_file_id")
        @ExcludeMissing
        fun _contentsFileId(): JsonField<String> = contentsFileId

        /**
         * Returns the raw JSON value of [lockboxAddressId].
         *
         * Unlike [lockboxAddressId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("lockbox_address_id")
        @ExcludeMissing
        fun _lockboxAddressId(): JsonField<String> = lockboxAddressId

        /**
         * Returns the raw JSON value of [lockboxRecipientId].
         *
         * Unlike [lockboxRecipientId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("lockbox_recipient_id")
        @ExcludeMissing
        fun _lockboxRecipientId(): JsonField<String> = lockboxRecipientId

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .amount()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var amount: JsonField<Long>? = null
            private var contentsFileId: JsonField<String> = JsonMissing.of()
            private var lockboxAddressId: JsonField<String> = JsonMissing.of()
            private var lockboxRecipientId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                amount = body.amount
                contentsFileId = body.contentsFileId
                lockboxAddressId = body.lockboxAddressId
                lockboxRecipientId = body.lockboxRecipientId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The amount of the check to be simulated, in cents. */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /**
             * The file containing the PDF contents. If not present, a default check image file will
             * be used.
             */
            fun contentsFileId(contentsFileId: String) =
                contentsFileId(JsonField.of(contentsFileId))

            /**
             * Sets [Builder.contentsFileId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contentsFileId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contentsFileId(contentsFileId: JsonField<String>) = apply {
                this.contentsFileId = contentsFileId
            }

            /** The identifier of the Lockbox Address to simulate inbound mail to. */
            fun lockboxAddressId(lockboxAddressId: String) =
                lockboxAddressId(JsonField.of(lockboxAddressId))

            /**
             * Sets [Builder.lockboxAddressId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lockboxAddressId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lockboxAddressId(lockboxAddressId: JsonField<String>) = apply {
                this.lockboxAddressId = lockboxAddressId
            }

            /** The identifier of the Lockbox Recipient to simulate inbound mail to. */
            fun lockboxRecipientId(lockboxRecipientId: String) =
                lockboxRecipientId(JsonField.of(lockboxRecipientId))

            /**
             * Sets [Builder.lockboxRecipientId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lockboxRecipientId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lockboxRecipientId(lockboxRecipientId: JsonField<String>) = apply {
                this.lockboxRecipientId = lockboxRecipientId
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

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .amount()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("amount", amount),
                    contentsFileId,
                    lockboxAddressId,
                    lockboxRecipientId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            amount()
            contentsFileId()
            lockboxAddressId()
            lockboxRecipientId()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IncreaseInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (amount.asKnown().isPresent) 1 else 0) +
                (if (contentsFileId.asKnown().isPresent) 1 else 0) +
                (if (lockboxAddressId.asKnown().isPresent) 1 else 0) +
                (if (lockboxRecipientId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                amount == other.amount &&
                contentsFileId == other.contentsFileId &&
                lockboxAddressId == other.lockboxAddressId &&
                lockboxRecipientId == other.lockboxRecipientId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                amount,
                contentsFileId,
                lockboxAddressId,
                lockboxRecipientId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{amount=$amount, contentsFileId=$contentsFileId, lockboxAddressId=$lockboxAddressId, lockboxRecipientId=$lockboxRecipientId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InboundMailItemCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "InboundMailItemCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
