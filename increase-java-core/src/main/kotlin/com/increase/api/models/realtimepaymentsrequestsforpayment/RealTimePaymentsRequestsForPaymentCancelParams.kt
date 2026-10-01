// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.realtimepaymentsrequestsforpayment

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

/** Cancels a Real-Time Payments Request for Payment that is still awaiting payment. */
class RealTimePaymentsRequestsForPaymentCancelParams
private constructor(
    private val realTimePaymentsRequestForPaymentId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The identifier of the Real-Time Payments Request for Payment to cancel. */
    fun realTimePaymentsRequestForPaymentId(): Optional<String> =
        Optional.ofNullable(realTimePaymentsRequestForPaymentId)

    /**
     * Additional information about the cancellation to pass on to the recipient bank.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun additionalInformation(): Optional<String> = body.additionalInformation()

    /**
     * The reason the request for payment is being canceled. Defaults to `requested_by_customer`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reason(): Optional<Reason> = body.reason()

    /**
     * Returns the raw JSON value of [additionalInformation].
     *
     * Unlike [additionalInformation], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _additionalInformation(): JsonField<String> = body._additionalInformation()

    /**
     * Returns the raw JSON value of [reason].
     *
     * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _reason(): JsonField<Reason> = body._reason()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): RealTimePaymentsRequestsForPaymentCancelParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [RealTimePaymentsRequestsForPaymentCancelParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RealTimePaymentsRequestsForPaymentCancelParams]. */
    class Builder internal constructor() {

        private var realTimePaymentsRequestForPaymentId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            realTimePaymentsRequestsForPaymentCancelParams:
                RealTimePaymentsRequestsForPaymentCancelParams
        ) = apply {
            realTimePaymentsRequestForPaymentId =
                realTimePaymentsRequestsForPaymentCancelParams.realTimePaymentsRequestForPaymentId
            body = realTimePaymentsRequestsForPaymentCancelParams.body.toBuilder()
            additionalHeaders =
                realTimePaymentsRequestsForPaymentCancelParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                realTimePaymentsRequestsForPaymentCancelParams.additionalQueryParams.toBuilder()
        }

        /** The identifier of the Real-Time Payments Request for Payment to cancel. */
        fun realTimePaymentsRequestForPaymentId(realTimePaymentsRequestForPaymentId: String?) =
            apply {
                this.realTimePaymentsRequestForPaymentId = realTimePaymentsRequestForPaymentId
            }

        /**
         * Alias for calling [Builder.realTimePaymentsRequestForPaymentId] with
         * `realTimePaymentsRequestForPaymentId.orElse(null)`.
         */
        fun realTimePaymentsRequestForPaymentId(
            realTimePaymentsRequestForPaymentId: Optional<String>
        ) = realTimePaymentsRequestForPaymentId(realTimePaymentsRequestForPaymentId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [additionalInformation]
         * - [reason]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Additional information about the cancellation to pass on to the recipient bank. */
        fun additionalInformation(additionalInformation: String) = apply {
            body.additionalInformation(additionalInformation)
        }

        /**
         * Sets [Builder.additionalInformation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.additionalInformation] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun additionalInformation(additionalInformation: JsonField<String>) = apply {
            body.additionalInformation(additionalInformation)
        }

        /**
         * The reason the request for payment is being canceled. Defaults to
         * `requested_by_customer`.
         */
        fun reason(reason: Reason) = apply { body.reason(reason) }

        /**
         * Sets [Builder.reason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reason] with a well-typed [Reason] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun reason(reason: JsonField<Reason>) = apply { body.reason(reason) }

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
         * Returns an immutable instance of [RealTimePaymentsRequestsForPaymentCancelParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RealTimePaymentsRequestsForPaymentCancelParams =
            RealTimePaymentsRequestsForPaymentCancelParams(
                realTimePaymentsRequestForPaymentId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> realTimePaymentsRequestForPaymentId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val additionalInformation: JsonField<String>,
        private val reason: JsonField<Reason>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("additional_information")
            @ExcludeMissing
            additionalInformation: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reason") @ExcludeMissing reason: JsonField<Reason> = JsonMissing.of(),
        ) : this(additionalInformation, reason, mutableMapOf())

        /**
         * Additional information about the cancellation to pass on to the recipient bank.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun additionalInformation(): Optional<String> =
            additionalInformation.getOptional("additional_information")

        /**
         * The reason the request for payment is being canceled. Defaults to
         * `requested_by_customer`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun reason(): Optional<Reason> = reason.getOptional("reason")

        /**
         * Returns the raw JSON value of [additionalInformation].
         *
         * Unlike [additionalInformation], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("additional_information")
        @ExcludeMissing
        fun _additionalInformation(): JsonField<String> = additionalInformation

        /**
         * Returns the raw JSON value of [reason].
         *
         * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<Reason> = reason

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

            private var additionalInformation: JsonField<String> = JsonMissing.of()
            private var reason: JsonField<Reason> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                additionalInformation = body.additionalInformation
                reason = body.reason
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Additional information about the cancellation to pass on to the recipient bank. */
            fun additionalInformation(additionalInformation: String) =
                additionalInformation(JsonField.of(additionalInformation))

            /**
             * Sets [Builder.additionalInformation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.additionalInformation] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun additionalInformation(additionalInformation: JsonField<String>) = apply {
                this.additionalInformation = additionalInformation
            }

            /**
             * The reason the request for payment is being canceled. Defaults to
             * `requested_by_customer`.
             */
            fun reason(reason: Reason) = reason(JsonField.of(reason))

            /**
             * Sets [Builder.reason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reason] with a well-typed [Reason] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

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
                Body(additionalInformation, reason, additionalProperties.toMutableMap())
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

            additionalInformation()
            reason().ifPresent { it.validate() }
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
            (if (additionalInformation.asKnown().isPresent) 1 else 0) +
                (reason.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                additionalInformation == other.additionalInformation &&
                reason == other.reason &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(additionalInformation, reason, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{additionalInformation=$additionalInformation, reason=$reason, additionalProperties=$additionalProperties}"
    }

    /**
     * The reason the request for payment is being canceled. Defaults to `requested_by_customer`.
     */
    class Reason @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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
             * The creditor no longer wants to be paid. Corresponds to the Real-Time Payments reason
             * code `CUST`.
             */
            @JvmField val REQUESTED_BY_CUSTOMER = of("requested_by_customer")

            /**
             * The requested payment has already been made through another channel. Corresponds to
             * the Real-Time Payments reason code `UPAY`.
             */
            @JvmField val PAID_BY_OTHER_MEANS = of("paid_by_other_means")

            /**
             * The request for payment duplicated another request for payment. Corresponds to the
             * Real-Time Payments reason code `DUPL`.
             */
            @JvmField val DUPLICATE = of("duplicate")

            /**
             * The request for payment was sent for the wrong amount. Corresponds to the Real-Time
             * Payments reason code `AM09`.
             */
            @JvmField val WRONG_AMOUNT = of("wrong_amount")

            @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
        }

        /** An enum containing [Reason]'s known values. */
        enum class Known {
            /**
             * The creditor no longer wants to be paid. Corresponds to the Real-Time Payments reason
             * code `CUST`.
             */
            REQUESTED_BY_CUSTOMER,
            /**
             * The requested payment has already been made through another channel. Corresponds to
             * the Real-Time Payments reason code `UPAY`.
             */
            PAID_BY_OTHER_MEANS,
            /**
             * The request for payment duplicated another request for payment. Corresponds to the
             * Real-Time Payments reason code `DUPL`.
             */
            DUPLICATE,
            /**
             * The request for payment was sent for the wrong amount. Corresponds to the Real-Time
             * Payments reason code `AM09`.
             */
            WRONG_AMOUNT,
        }

        /**
         * An enum containing [Reason]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Reason] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /**
             * The creditor no longer wants to be paid. Corresponds to the Real-Time Payments reason
             * code `CUST`.
             */
            REQUESTED_BY_CUSTOMER,
            /**
             * The requested payment has already been made through another channel. Corresponds to
             * the Real-Time Payments reason code `UPAY`.
             */
            PAID_BY_OTHER_MEANS,
            /**
             * The request for payment duplicated another request for payment. Corresponds to the
             * Real-Time Payments reason code `DUPL`.
             */
            DUPLICATE,
            /**
             * The request for payment was sent for the wrong amount. Corresponds to the Real-Time
             * Payments reason code `AM09`.
             */
            WRONG_AMOUNT,
            /** An enum member indicating that [Reason] was instantiated with an unknown value. */
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
                REQUESTED_BY_CUSTOMER -> Value.REQUESTED_BY_CUSTOMER
                PAID_BY_OTHER_MEANS -> Value.PAID_BY_OTHER_MEANS
                DUPLICATE -> Value.DUPLICATE
                WRONG_AMOUNT -> Value.WRONG_AMOUNT
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
                REQUESTED_BY_CUSTOMER -> Known.REQUESTED_BY_CUSTOMER
                PAID_BY_OTHER_MEANS -> Known.PAID_BY_OTHER_MEANS
                DUPLICATE -> Known.DUPLICATE
                WRONG_AMOUNT -> Known.WRONG_AMOUNT
                else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
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
        fun validate(): Reason = apply {
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

            return other is Reason && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RealTimePaymentsRequestsForPaymentCancelParams &&
            realTimePaymentsRequestForPaymentId == other.realTimePaymentsRequestForPaymentId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            realTimePaymentsRequestForPaymentId,
            body,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "RealTimePaymentsRequestsForPaymentCancelParams{realTimePaymentsRequestForPaymentId=$realTimePaymentsRequestForPaymentId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
