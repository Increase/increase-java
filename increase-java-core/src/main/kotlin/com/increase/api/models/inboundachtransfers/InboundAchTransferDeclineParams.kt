// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundachtransfers

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

/** Decline an Inbound ACH Transfer */
class InboundAchTransferDeclineParams
private constructor(
    private val inboundAchTransferId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The identifier of the Inbound ACH Transfer to decline. */
    fun inboundAchTransferId(): Optional<String> = Optional.ofNullable(inboundAchTransferId)

    /**
     * The reason why this transfer will be returned. If this parameter is unset, the return codes
     * will be `payment_stopped` for debits and `credit_entry_refused_by_receiver` for credits.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reason(): Optional<Reason> = body.reason()

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

        @JvmStatic fun none(): InboundAchTransferDeclineParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [InboundAchTransferDeclineParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InboundAchTransferDeclineParams]. */
    class Builder internal constructor() {

        private var inboundAchTransferId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(inboundAchTransferDeclineParams: InboundAchTransferDeclineParams) =
            apply {
                inboundAchTransferId = inboundAchTransferDeclineParams.inboundAchTransferId
                body = inboundAchTransferDeclineParams.body.toBuilder()
                additionalHeaders = inboundAchTransferDeclineParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    inboundAchTransferDeclineParams.additionalQueryParams.toBuilder()
            }

        /** The identifier of the Inbound ACH Transfer to decline. */
        fun inboundAchTransferId(inboundAchTransferId: String?) = apply {
            this.inboundAchTransferId = inboundAchTransferId
        }

        /**
         * Alias for calling [Builder.inboundAchTransferId] with
         * `inboundAchTransferId.orElse(null)`.
         */
        fun inboundAchTransferId(inboundAchTransferId: Optional<String>) =
            inboundAchTransferId(inboundAchTransferId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [reason]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * The reason why this transfer will be returned. If this parameter is unset, the return
         * codes will be `payment_stopped` for debits and `credit_entry_refused_by_receiver` for
         * credits.
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
         * Returns an immutable instance of [InboundAchTransferDeclineParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): InboundAchTransferDeclineParams =
            InboundAchTransferDeclineParams(
                inboundAchTransferId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> inboundAchTransferId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val reason: JsonField<Reason>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("reason") @ExcludeMissing reason: JsonField<Reason> = JsonMissing.of()
        ) : this(reason, mutableMapOf())

        /**
         * The reason why this transfer will be returned. If this parameter is unset, the return
         * codes will be `payment_stopped` for debits and `credit_entry_refused_by_receiver` for
         * credits.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun reason(): Optional<Reason> = reason.getOptional("reason")

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

            private var reason: JsonField<Reason> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                reason = body.reason
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * The reason why this transfer will be returned. If this parameter is unset, the return
             * codes will be `payment_stopped` for debits and `credit_entry_refused_by_receiver` for
             * credits.
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
            fun build(): Body = Body(reason, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

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
        @JvmSynthetic internal fun validity(): Int = (reason.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(reason, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Body{reason=$reason, additionalProperties=$additionalProperties}"
    }

    /**
     * The reason why this transfer will be returned. If this parameter is unset, the return codes
     * will be `payment_stopped` for debits and `credit_entry_refused_by_receiver` for credits.
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
             * The customer's account has insufficient funds. This reason is only allowed for
             * debits. The Nacha return code is R01.
             */
            @JvmField val INSUFFICIENT_FUNDS = of("insufficient_funds")

            /**
             * The originating financial institution asked for this transfer to be returned. The
             * receiving bank is complying with the request. The Nacha return code is R06.
             */
            @JvmField val RETURNED_PER_ODFI_REQUEST = of("returned_per_odfi_request")

            /** The customer no longer authorizes this transaction. The Nacha return code is R07. */
            @JvmField
            val AUTHORIZATION_REVOKED_BY_CUSTOMER = of("authorization_revoked_by_customer")

            /**
             * The customer asked for the payment to be stopped. This reason is only allowed for
             * debits. The Nacha return code is R08.
             */
            @JvmField val PAYMENT_STOPPED = of("payment_stopped")

            /**
             * The customer advises that the debit was unauthorized. The Nacha return code is R10.
             */
            @JvmField
            val CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE =
                of("customer_advised_unauthorized_improper_ineligible_or_incomplete")

            /** The payee is deceased. The Nacha return code is R14. */
            @JvmField
            val REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY =
                of("representative_payee_deceased_or_unable_to_continue_in_that_capacity")

            /** The account holder is deceased. The Nacha return code is R15. */
            @JvmField
            val BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED =
                of("beneficiary_or_account_holder_deceased")

            /**
             * The customer refused a credit entry. This reason is only allowed for credits. The
             * Nacha return code is R23.
             */
            @JvmField val CREDIT_ENTRY_REFUSED_BY_RECEIVER = of("credit_entry_refused_by_receiver")

            /**
             * The account holder identified this transaction as a duplicate. The Nacha return code
             * is R24.
             */
            @JvmField val DUPLICATE_ENTRY = of("duplicate_entry")

            /**
             * The corporate customer no longer authorizes this transaction. The Nacha return code
             * is R29.
             */
            @JvmField
            val CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED =
                of("corporate_customer_advised_not_authorized")

            @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
        }

        /** An enum containing [Reason]'s known values. */
        enum class Known {
            /**
             * The customer's account has insufficient funds. This reason is only allowed for
             * debits. The Nacha return code is R01.
             */
            INSUFFICIENT_FUNDS,
            /**
             * The originating financial institution asked for this transfer to be returned. The
             * receiving bank is complying with the request. The Nacha return code is R06.
             */
            RETURNED_PER_ODFI_REQUEST,
            /** The customer no longer authorizes this transaction. The Nacha return code is R07. */
            AUTHORIZATION_REVOKED_BY_CUSTOMER,
            /**
             * The customer asked for the payment to be stopped. This reason is only allowed for
             * debits. The Nacha return code is R08.
             */
            PAYMENT_STOPPED,
            /**
             * The customer advises that the debit was unauthorized. The Nacha return code is R10.
             */
            CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE,
            /** The payee is deceased. The Nacha return code is R14. */
            REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY,
            /** The account holder is deceased. The Nacha return code is R15. */
            BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED,
            /**
             * The customer refused a credit entry. This reason is only allowed for credits. The
             * Nacha return code is R23.
             */
            CREDIT_ENTRY_REFUSED_BY_RECEIVER,
            /**
             * The account holder identified this transaction as a duplicate. The Nacha return code
             * is R24.
             */
            DUPLICATE_ENTRY,
            /**
             * The corporate customer no longer authorizes this transaction. The Nacha return code
             * is R29.
             */
            CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED,
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
             * The customer's account has insufficient funds. This reason is only allowed for
             * debits. The Nacha return code is R01.
             */
            INSUFFICIENT_FUNDS,
            /**
             * The originating financial institution asked for this transfer to be returned. The
             * receiving bank is complying with the request. The Nacha return code is R06.
             */
            RETURNED_PER_ODFI_REQUEST,
            /** The customer no longer authorizes this transaction. The Nacha return code is R07. */
            AUTHORIZATION_REVOKED_BY_CUSTOMER,
            /**
             * The customer asked for the payment to be stopped. This reason is only allowed for
             * debits. The Nacha return code is R08.
             */
            PAYMENT_STOPPED,
            /**
             * The customer advises that the debit was unauthorized. The Nacha return code is R10.
             */
            CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE,
            /** The payee is deceased. The Nacha return code is R14. */
            REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY,
            /** The account holder is deceased. The Nacha return code is R15. */
            BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED,
            /**
             * The customer refused a credit entry. This reason is only allowed for credits. The
             * Nacha return code is R23.
             */
            CREDIT_ENTRY_REFUSED_BY_RECEIVER,
            /**
             * The account holder identified this transaction as a duplicate. The Nacha return code
             * is R24.
             */
            DUPLICATE_ENTRY,
            /**
             * The corporate customer no longer authorizes this transaction. The Nacha return code
             * is R29.
             */
            CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED,
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
                INSUFFICIENT_FUNDS -> Value.INSUFFICIENT_FUNDS
                RETURNED_PER_ODFI_REQUEST -> Value.RETURNED_PER_ODFI_REQUEST
                AUTHORIZATION_REVOKED_BY_CUSTOMER -> Value.AUTHORIZATION_REVOKED_BY_CUSTOMER
                PAYMENT_STOPPED -> Value.PAYMENT_STOPPED
                CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE ->
                    Value.CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE
                REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY ->
                    Value.REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY
                BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED ->
                    Value.BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED
                CREDIT_ENTRY_REFUSED_BY_RECEIVER -> Value.CREDIT_ENTRY_REFUSED_BY_RECEIVER
                DUPLICATE_ENTRY -> Value.DUPLICATE_ENTRY
                CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED ->
                    Value.CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED
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
                INSUFFICIENT_FUNDS -> Known.INSUFFICIENT_FUNDS
                RETURNED_PER_ODFI_REQUEST -> Known.RETURNED_PER_ODFI_REQUEST
                AUTHORIZATION_REVOKED_BY_CUSTOMER -> Known.AUTHORIZATION_REVOKED_BY_CUSTOMER
                PAYMENT_STOPPED -> Known.PAYMENT_STOPPED
                CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE ->
                    Known.CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE
                REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY ->
                    Known.REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY
                BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED ->
                    Known.BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED
                CREDIT_ENTRY_REFUSED_BY_RECEIVER -> Known.CREDIT_ENTRY_REFUSED_BY_RECEIVER
                DUPLICATE_ENTRY -> Known.DUPLICATE_ENTRY
                CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED ->
                    Known.CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED
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

            return /* spotless:off */ other is Reason && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InboundAchTransferDeclineParams && inboundAchTransferId == other.inboundAchTransferId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(inboundAchTransferId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "InboundAchTransferDeclineParams{inboundAchTransferId=$inboundAchTransferId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
