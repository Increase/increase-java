// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.wiredrawdownrequests

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.Params
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.errors.IncreaseInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Simulates a Wire Drawdown Request being refused by the debtor. */
class WireDrawdownRequestRefuseParams
private constructor(
    private val wireDrawdownRequestId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The identifier of the Wire Drawdown Request you wish to refuse. */
    fun wireDrawdownRequestId(): Optional<String> = Optional.ofNullable(wireDrawdownRequestId)

    /**
     * Additional information about the refusal that the simulated refusal will have.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun refusalReasonAdditionalInformation(): Optional<String> =
        body.refusalReasonAdditionalInformation()

    /**
     * The reason code that the simulated refusal will have.
     *
     * Defaults to `other`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun refusalReasonCode(): Optional<RefusalReasonCode> = body.refusalReasonCode()

    /**
     * Returns the raw JSON value of [refusalReasonAdditionalInformation].
     *
     * Unlike [refusalReasonAdditionalInformation], this method doesn't throw if the JSON field has
     * an unexpected type.
     */
    fun _refusalReasonAdditionalInformation(): JsonField<String> =
        body._refusalReasonAdditionalInformation()

    /**
     * Returns the raw JSON value of [refusalReasonCode].
     *
     * Unlike [refusalReasonCode], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _refusalReasonCode(): JsonField<RefusalReasonCode> = body._refusalReasonCode()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): WireDrawdownRequestRefuseParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [WireDrawdownRequestRefuseParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WireDrawdownRequestRefuseParams]. */
    class Builder internal constructor() {

        private var wireDrawdownRequestId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(wireDrawdownRequestRefuseParams: WireDrawdownRequestRefuseParams) =
            apply {
                wireDrawdownRequestId = wireDrawdownRequestRefuseParams.wireDrawdownRequestId
                body = wireDrawdownRequestRefuseParams.body.toBuilder()
                additionalHeaders = wireDrawdownRequestRefuseParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    wireDrawdownRequestRefuseParams.additionalQueryParams.toBuilder()
            }

        /** The identifier of the Wire Drawdown Request you wish to refuse. */
        fun wireDrawdownRequestId(wireDrawdownRequestId: String?) = apply {
            this.wireDrawdownRequestId = wireDrawdownRequestId
        }

        /**
         * Alias for calling [Builder.wireDrawdownRequestId] with
         * `wireDrawdownRequestId.orElse(null)`.
         */
        fun wireDrawdownRequestId(wireDrawdownRequestId: Optional<String>) =
            wireDrawdownRequestId(wireDrawdownRequestId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [refusalReasonAdditionalInformation]
         * - [refusalReasonCode]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Additional information about the refusal that the simulated refusal will have. */
        fun refusalReasonAdditionalInformation(refusalReasonAdditionalInformation: String) = apply {
            body.refusalReasonAdditionalInformation(refusalReasonAdditionalInformation)
        }

        /**
         * Sets [Builder.refusalReasonAdditionalInformation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.refusalReasonAdditionalInformation] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun refusalReasonAdditionalInformation(
            refusalReasonAdditionalInformation: JsonField<String>
        ) = apply { body.refusalReasonAdditionalInformation(refusalReasonAdditionalInformation) }

        /**
         * The reason code that the simulated refusal will have.
         *
         * Defaults to `other`.
         */
        fun refusalReasonCode(refusalReasonCode: RefusalReasonCode) = apply {
            body.refusalReasonCode(refusalReasonCode)
        }

        /**
         * Sets [Builder.refusalReasonCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.refusalReasonCode] with a well-typed [RefusalReasonCode]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun refusalReasonCode(refusalReasonCode: JsonField<RefusalReasonCode>) = apply {
            body.refusalReasonCode(refusalReasonCode)
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
         * Returns an immutable instance of [WireDrawdownRequestRefuseParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): WireDrawdownRequestRefuseParams =
            WireDrawdownRequestRefuseParams(
                wireDrawdownRequestId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> wireDrawdownRequestId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val refusalReasonAdditionalInformation: JsonField<String>,
        private val refusalReasonCode: JsonField<RefusalReasonCode>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("refusal_reason_additional_information")
            @ExcludeMissing
            refusalReasonAdditionalInformation: JsonField<String> = JsonMissing.of(),
            @JsonProperty("refusal_reason_code")
            @ExcludeMissing
            refusalReasonCode: JsonField<RefusalReasonCode> = JsonMissing.of(),
        ) : this(refusalReasonAdditionalInformation, refusalReasonCode, mutableMapOf())

        /**
         * Additional information about the refusal that the simulated refusal will have.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun refusalReasonAdditionalInformation(): Optional<String> =
            refusalReasonAdditionalInformation.getOptional("refusal_reason_additional_information")

        /**
         * The reason code that the simulated refusal will have.
         *
         * Defaults to `other`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun refusalReasonCode(): Optional<RefusalReasonCode> =
            refusalReasonCode.getOptional("refusal_reason_code")

        /**
         * Returns the raw JSON value of [refusalReasonAdditionalInformation].
         *
         * Unlike [refusalReasonAdditionalInformation], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("refusal_reason_additional_information")
        @ExcludeMissing
        fun _refusalReasonAdditionalInformation(): JsonField<String> =
            refusalReasonAdditionalInformation

        /**
         * Returns the raw JSON value of [refusalReasonCode].
         *
         * Unlike [refusalReasonCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("refusal_reason_code")
        @ExcludeMissing
        fun _refusalReasonCode(): JsonField<RefusalReasonCode> = refusalReasonCode

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var refusalReasonAdditionalInformation: JsonField<String> = JsonMissing.of()
            private var refusalReasonCode: JsonField<RefusalReasonCode> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                refusalReasonAdditionalInformation = body.refusalReasonAdditionalInformation
                refusalReasonCode = body.refusalReasonCode
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Additional information about the refusal that the simulated refusal will have. */
            fun refusalReasonAdditionalInformation(refusalReasonAdditionalInformation: String) =
                refusalReasonAdditionalInformation(JsonField.of(refusalReasonAdditionalInformation))

            /**
             * Sets [Builder.refusalReasonAdditionalInformation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.refusalReasonAdditionalInformation] with a
             * well-typed [String] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun refusalReasonAdditionalInformation(
                refusalReasonAdditionalInformation: JsonField<String>
            ) = apply {
                this.refusalReasonAdditionalInformation = refusalReasonAdditionalInformation
            }

            /**
             * The reason code that the simulated refusal will have.
             *
             * Defaults to `other`.
             */
            fun refusalReasonCode(refusalReasonCode: RefusalReasonCode) =
                refusalReasonCode(JsonField.of(refusalReasonCode))

            /**
             * Sets [Builder.refusalReasonCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.refusalReasonCode] with a well-typed
             * [RefusalReasonCode] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun refusalReasonCode(refusalReasonCode: JsonField<RefusalReasonCode>) = apply {
                this.refusalReasonCode = refusalReasonCode
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
             */
            fun build(): Body =
                Body(
                    refusalReasonAdditionalInformation,
                    refusalReasonCode,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws IncreaseInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            refusalReasonAdditionalInformation()
            refusalReasonCode().ifPresent { it.validate() }
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
            (if (refusalReasonAdditionalInformation.asKnown().isPresent) 1 else 0) +
                (refusalReasonCode.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                refusalReasonAdditionalInformation == other.refusalReasonAdditionalInformation &&
                refusalReasonCode == other.refusalReasonCode &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                refusalReasonAdditionalInformation,
                refusalReasonCode,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{refusalReasonAdditionalInformation=$refusalReasonAdditionalInformation, refusalReasonCode=$refusalReasonCode, additionalProperties=$additionalProperties}"
    }

    /** The reason code that the simulated refusal will have. */
    class RefusalReasonCode @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            /**
             * The debtor's account number is invalid or missing. Corresponds to the Fedwire reason
             * code `AC02`.
             */
            @JvmField val INVALID_DEBTOR_ACCOUNT_NUMBER = of("invalid_debtor_account_number")

            /**
             * The debtor account does not allow drawdown requests. Corresponds to the Fedwire
             * reason code `AG01`.
             */
            @JvmField val TRANSACTION_FORBIDDEN = of("transaction_forbidden")

            /**
             * The debtor account cannot be debited for a generic reason. Corresponds to the Fedwire
             * reason code `AG07`.
             */
            @JvmField val UNSUCCESSFUL_DIRECT_DEBIT = of("unsuccessful_direct_debit")

            /**
             * The debtor's identification is inconsistent with the debtor account number.
             * Corresponds to the Fedwire reason code `BE01`.
             */
            @JvmField val INCONSISTENT_WITH_END_CUSTOMER = of("inconsistent_with_end_customer")

            /**
             * The reason is provided as narrative information in the additional information field.
             * Corresponds to the Fedwire reason code `NARR`.
             */
            @JvmField val NARRATIVE = of("narrative")

            /** Some other error or issue has occurred. */
            @JvmField val OTHER = of("other")

            @JvmStatic fun of(value: String) = RefusalReasonCode(JsonField.of(value))
        }

        /** An enum containing [RefusalReasonCode]'s known values. */
        enum class Known {
            /**
             * The debtor's account number is invalid or missing. Corresponds to the Fedwire reason
             * code `AC02`.
             */
            INVALID_DEBTOR_ACCOUNT_NUMBER,
            /**
             * The debtor account does not allow drawdown requests. Corresponds to the Fedwire
             * reason code `AG01`.
             */
            TRANSACTION_FORBIDDEN,
            /**
             * The debtor account cannot be debited for a generic reason. Corresponds to the Fedwire
             * reason code `AG07`.
             */
            UNSUCCESSFUL_DIRECT_DEBIT,
            /**
             * The debtor's identification is inconsistent with the debtor account number.
             * Corresponds to the Fedwire reason code `BE01`.
             */
            INCONSISTENT_WITH_END_CUSTOMER,
            /**
             * The reason is provided as narrative information in the additional information field.
             * Corresponds to the Fedwire reason code `NARR`.
             */
            NARRATIVE,
            /** Some other error or issue has occurred. */
            OTHER,
        }

        /**
         * An enum containing [RefusalReasonCode]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RefusalReasonCode] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /**
             * The debtor's account number is invalid or missing. Corresponds to the Fedwire reason
             * code `AC02`.
             */
            INVALID_DEBTOR_ACCOUNT_NUMBER,
            /**
             * The debtor account does not allow drawdown requests. Corresponds to the Fedwire
             * reason code `AG01`.
             */
            TRANSACTION_FORBIDDEN,
            /**
             * The debtor account cannot be debited for a generic reason. Corresponds to the Fedwire
             * reason code `AG07`.
             */
            UNSUCCESSFUL_DIRECT_DEBIT,
            /**
             * The debtor's identification is inconsistent with the debtor account number.
             * Corresponds to the Fedwire reason code `BE01`.
             */
            INCONSISTENT_WITH_END_CUSTOMER,
            /**
             * The reason is provided as narrative information in the additional information field.
             * Corresponds to the Fedwire reason code `NARR`.
             */
            NARRATIVE,
            /** Some other error or issue has occurred. */
            OTHER,
            /**
             * An enum member indicating that [RefusalReasonCode] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                INVALID_DEBTOR_ACCOUNT_NUMBER -> Value.INVALID_DEBTOR_ACCOUNT_NUMBER
                TRANSACTION_FORBIDDEN -> Value.TRANSACTION_FORBIDDEN
                UNSUCCESSFUL_DIRECT_DEBIT -> Value.UNSUCCESSFUL_DIRECT_DEBIT
                INCONSISTENT_WITH_END_CUSTOMER -> Value.INCONSISTENT_WITH_END_CUSTOMER
                NARRATIVE -> Value.NARRATIVE
                OTHER -> Value.OTHER
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws IncreaseInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                INVALID_DEBTOR_ACCOUNT_NUMBER -> Known.INVALID_DEBTOR_ACCOUNT_NUMBER
                TRANSACTION_FORBIDDEN -> Known.TRANSACTION_FORBIDDEN
                UNSUCCESSFUL_DIRECT_DEBIT -> Known.UNSUCCESSFUL_DIRECT_DEBIT
                INCONSISTENT_WITH_END_CUSTOMER -> Known.INCONSISTENT_WITH_END_CUSTOMER
                NARRATIVE -> Known.NARRATIVE
                OTHER -> Known.OTHER
                else -> throw IncreaseInvalidDataException("Unknown RefusalReasonCode: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws IncreaseInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                IncreaseInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws IncreaseInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): RefusalReasonCode = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RefusalReasonCode && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WireDrawdownRequestRefuseParams &&
            wireDrawdownRequestId == other.wireDrawdownRequestId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(wireDrawdownRequestId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "WireDrawdownRequestRefuseParams{wireDrawdownRequestId=$wireDrawdownRequestId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
