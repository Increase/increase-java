// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.achtransfers

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

/** Simulates receiving a Notification of Change for an [ACH Transfer](#ach-transfers). */
class AchTransferCreateNotificationOfChangeParams
private constructor(
    private val achTransferId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The identifier of the ACH Transfer you wish to create a notification of change for. */
    fun achTransferId(): Optional<String> = Optional.ofNullable(achTransferId)

    /**
     * The corrected account funding type.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun correctedAccountFunding(): Optional<CorrectedAccountFunding> =
        body.correctedAccountFunding()

    /**
     * The corrected account number.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun correctedAccountNumber(): Optional<String> = body.correctedAccountNumber()

    /**
     * The corrected individual identifier.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun correctedIndividualId(): Optional<String> = body.correctedIndividualId()

    /**
     * The corrected routing number.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun correctedRoutingNumber(): Optional<String> = body.correctedRoutingNumber()

    /**
     * Returns the raw JSON value of [correctedAccountFunding].
     *
     * Unlike [correctedAccountFunding], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _correctedAccountFunding(): JsonField<CorrectedAccountFunding> =
        body._correctedAccountFunding()

    /**
     * Returns the raw JSON value of [correctedAccountNumber].
     *
     * Unlike [correctedAccountNumber], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _correctedAccountNumber(): JsonField<String> = body._correctedAccountNumber()

    /**
     * Returns the raw JSON value of [correctedIndividualId].
     *
     * Unlike [correctedIndividualId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _correctedIndividualId(): JsonField<String> = body._correctedIndividualId()

    /**
     * Returns the raw JSON value of [correctedRoutingNumber].
     *
     * Unlike [correctedRoutingNumber], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _correctedRoutingNumber(): JsonField<String> = body._correctedRoutingNumber()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): AchTransferCreateNotificationOfChangeParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [AchTransferCreateNotificationOfChangeParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AchTransferCreateNotificationOfChangeParams]. */
    class Builder internal constructor() {

        private var achTransferId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            achTransferCreateNotificationOfChangeParams: AchTransferCreateNotificationOfChangeParams
        ) = apply {
            achTransferId = achTransferCreateNotificationOfChangeParams.achTransferId
            body = achTransferCreateNotificationOfChangeParams.body.toBuilder()
            additionalHeaders =
                achTransferCreateNotificationOfChangeParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                achTransferCreateNotificationOfChangeParams.additionalQueryParams.toBuilder()
        }

        /** The identifier of the ACH Transfer you wish to create a notification of change for. */
        fun achTransferId(achTransferId: String?) = apply { this.achTransferId = achTransferId }

        /** Alias for calling [Builder.achTransferId] with `achTransferId.orElse(null)`. */
        fun achTransferId(achTransferId: Optional<String>) =
            achTransferId(achTransferId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [correctedAccountFunding]
         * - [correctedAccountNumber]
         * - [correctedIndividualId]
         * - [correctedRoutingNumber]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The corrected account funding type. */
        fun correctedAccountFunding(correctedAccountFunding: CorrectedAccountFunding) = apply {
            body.correctedAccountFunding(correctedAccountFunding)
        }

        /**
         * Sets [Builder.correctedAccountFunding] to an arbitrary JSON value.
         *
         * You should usually call [Builder.correctedAccountFunding] with a well-typed
         * [CorrectedAccountFunding] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun correctedAccountFunding(correctedAccountFunding: JsonField<CorrectedAccountFunding>) =
            apply {
                body.correctedAccountFunding(correctedAccountFunding)
            }

        /** The corrected account number. */
        fun correctedAccountNumber(correctedAccountNumber: String) = apply {
            body.correctedAccountNumber(correctedAccountNumber)
        }

        /**
         * Sets [Builder.correctedAccountNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.correctedAccountNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun correctedAccountNumber(correctedAccountNumber: JsonField<String>) = apply {
            body.correctedAccountNumber(correctedAccountNumber)
        }

        /** The corrected individual identifier. */
        fun correctedIndividualId(correctedIndividualId: String) = apply {
            body.correctedIndividualId(correctedIndividualId)
        }

        /**
         * Sets [Builder.correctedIndividualId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.correctedIndividualId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun correctedIndividualId(correctedIndividualId: JsonField<String>) = apply {
            body.correctedIndividualId(correctedIndividualId)
        }

        /** The corrected routing number. */
        fun correctedRoutingNumber(correctedRoutingNumber: String) = apply {
            body.correctedRoutingNumber(correctedRoutingNumber)
        }

        /**
         * Sets [Builder.correctedRoutingNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.correctedRoutingNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun correctedRoutingNumber(correctedRoutingNumber: JsonField<String>) = apply {
            body.correctedRoutingNumber(correctedRoutingNumber)
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
         * Returns an immutable instance of [AchTransferCreateNotificationOfChangeParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AchTransferCreateNotificationOfChangeParams =
            AchTransferCreateNotificationOfChangeParams(
                achTransferId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> achTransferId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val correctedAccountFunding: JsonField<CorrectedAccountFunding>,
        private val correctedAccountNumber: JsonField<String>,
        private val correctedIndividualId: JsonField<String>,
        private val correctedRoutingNumber: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("corrected_account_funding")
            @ExcludeMissing
            correctedAccountFunding: JsonField<CorrectedAccountFunding> = JsonMissing.of(),
            @JsonProperty("corrected_account_number")
            @ExcludeMissing
            correctedAccountNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("corrected_individual_id")
            @ExcludeMissing
            correctedIndividualId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("corrected_routing_number")
            @ExcludeMissing
            correctedRoutingNumber: JsonField<String> = JsonMissing.of(),
        ) : this(
            correctedAccountFunding,
            correctedAccountNumber,
            correctedIndividualId,
            correctedRoutingNumber,
            mutableMapOf(),
        )

        /**
         * The corrected account funding type.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun correctedAccountFunding(): Optional<CorrectedAccountFunding> =
            correctedAccountFunding.getOptional("corrected_account_funding")

        /**
         * The corrected account number.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun correctedAccountNumber(): Optional<String> =
            correctedAccountNumber.getOptional("corrected_account_number")

        /**
         * The corrected individual identifier.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun correctedIndividualId(): Optional<String> =
            correctedIndividualId.getOptional("corrected_individual_id")

        /**
         * The corrected routing number.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun correctedRoutingNumber(): Optional<String> =
            correctedRoutingNumber.getOptional("corrected_routing_number")

        /**
         * Returns the raw JSON value of [correctedAccountFunding].
         *
         * Unlike [correctedAccountFunding], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("corrected_account_funding")
        @ExcludeMissing
        fun _correctedAccountFunding(): JsonField<CorrectedAccountFunding> = correctedAccountFunding

        /**
         * Returns the raw JSON value of [correctedAccountNumber].
         *
         * Unlike [correctedAccountNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("corrected_account_number")
        @ExcludeMissing
        fun _correctedAccountNumber(): JsonField<String> = correctedAccountNumber

        /**
         * Returns the raw JSON value of [correctedIndividualId].
         *
         * Unlike [correctedIndividualId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("corrected_individual_id")
        @ExcludeMissing
        fun _correctedIndividualId(): JsonField<String> = correctedIndividualId

        /**
         * Returns the raw JSON value of [correctedRoutingNumber].
         *
         * Unlike [correctedRoutingNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("corrected_routing_number")
        @ExcludeMissing
        fun _correctedRoutingNumber(): JsonField<String> = correctedRoutingNumber

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

            private var correctedAccountFunding: JsonField<CorrectedAccountFunding> =
                JsonMissing.of()
            private var correctedAccountNumber: JsonField<String> = JsonMissing.of()
            private var correctedIndividualId: JsonField<String> = JsonMissing.of()
            private var correctedRoutingNumber: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                correctedAccountFunding = body.correctedAccountFunding
                correctedAccountNumber = body.correctedAccountNumber
                correctedIndividualId = body.correctedIndividualId
                correctedRoutingNumber = body.correctedRoutingNumber
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The corrected account funding type. */
            fun correctedAccountFunding(correctedAccountFunding: CorrectedAccountFunding) =
                correctedAccountFunding(JsonField.of(correctedAccountFunding))

            /**
             * Sets [Builder.correctedAccountFunding] to an arbitrary JSON value.
             *
             * You should usually call [Builder.correctedAccountFunding] with a well-typed
             * [CorrectedAccountFunding] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun correctedAccountFunding(
                correctedAccountFunding: JsonField<CorrectedAccountFunding>
            ) = apply { this.correctedAccountFunding = correctedAccountFunding }

            /** The corrected account number. */
            fun correctedAccountNumber(correctedAccountNumber: String) =
                correctedAccountNumber(JsonField.of(correctedAccountNumber))

            /**
             * Sets [Builder.correctedAccountNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.correctedAccountNumber] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun correctedAccountNumber(correctedAccountNumber: JsonField<String>) = apply {
                this.correctedAccountNumber = correctedAccountNumber
            }

            /** The corrected individual identifier. */
            fun correctedIndividualId(correctedIndividualId: String) =
                correctedIndividualId(JsonField.of(correctedIndividualId))

            /**
             * Sets [Builder.correctedIndividualId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.correctedIndividualId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun correctedIndividualId(correctedIndividualId: JsonField<String>) = apply {
                this.correctedIndividualId = correctedIndividualId
            }

            /** The corrected routing number. */
            fun correctedRoutingNumber(correctedRoutingNumber: String) =
                correctedRoutingNumber(JsonField.of(correctedRoutingNumber))

            /**
             * Sets [Builder.correctedRoutingNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.correctedRoutingNumber] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun correctedRoutingNumber(correctedRoutingNumber: JsonField<String>) = apply {
                this.correctedRoutingNumber = correctedRoutingNumber
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
                    correctedAccountFunding,
                    correctedAccountNumber,
                    correctedIndividualId,
                    correctedRoutingNumber,
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

            correctedAccountFunding().ifPresent { it.validate() }
            correctedAccountNumber()
            correctedIndividualId()
            correctedRoutingNumber()
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
            (correctedAccountFunding.asKnown().getOrNull()?.validity() ?: 0) +
                (if (correctedAccountNumber.asKnown().isPresent) 1 else 0) +
                (if (correctedIndividualId.asKnown().isPresent) 1 else 0) +
                (if (correctedRoutingNumber.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                correctedAccountFunding == other.correctedAccountFunding &&
                correctedAccountNumber == other.correctedAccountNumber &&
                correctedIndividualId == other.correctedIndividualId &&
                correctedRoutingNumber == other.correctedRoutingNumber &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                correctedAccountFunding,
                correctedAccountNumber,
                correctedIndividualId,
                correctedRoutingNumber,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{correctedAccountFunding=$correctedAccountFunding, correctedAccountNumber=$correctedAccountNumber, correctedIndividualId=$correctedIndividualId, correctedRoutingNumber=$correctedRoutingNumber, additionalProperties=$additionalProperties}"
    }

    /** The corrected account funding type. */
    class CorrectedAccountFunding
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            /** A checking account. */
            @JvmField val CHECKING = of("checking")

            /** A savings account. */
            @JvmField val SAVINGS = of("savings")

            /** A loan account used in a lender-borrower relationship. Uncommon. */
            @JvmField val LOAN = of("loan")

            /** A bank's general ledger. Uncommon. */
            @JvmField val GENERAL_LEDGER = of("general_ledger")

            @JvmStatic fun of(value: String) = CorrectedAccountFunding(JsonField.of(value))
        }

        /** An enum containing [CorrectedAccountFunding]'s known values. */
        enum class Known {
            /** A checking account. */
            CHECKING,
            /** A savings account. */
            SAVINGS,
            /** A loan account used in a lender-borrower relationship. Uncommon. */
            LOAN,
            /** A bank's general ledger. Uncommon. */
            GENERAL_LEDGER,
        }

        /**
         * An enum containing [CorrectedAccountFunding]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [CorrectedAccountFunding] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** A checking account. */
            CHECKING,
            /** A savings account. */
            SAVINGS,
            /** A loan account used in a lender-borrower relationship. Uncommon. */
            LOAN,
            /** A bank's general ledger. Uncommon. */
            GENERAL_LEDGER,
            /**
             * An enum member indicating that [CorrectedAccountFunding] was instantiated with an
             * unknown value.
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
                CHECKING -> Value.CHECKING
                SAVINGS -> Value.SAVINGS
                LOAN -> Value.LOAN
                GENERAL_LEDGER -> Value.GENERAL_LEDGER
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
                CHECKING -> Known.CHECKING
                SAVINGS -> Known.SAVINGS
                LOAN -> Known.LOAN
                GENERAL_LEDGER -> Known.GENERAL_LEDGER
                else ->
                    throw IncreaseInvalidDataException("Unknown CorrectedAccountFunding: $value")
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
        fun validate(): CorrectedAccountFunding = apply {
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

            return other is CorrectedAccountFunding && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AchTransferCreateNotificationOfChangeParams &&
            achTransferId == other.achTransferId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(achTransferId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AchTransferCreateNotificationOfChangeParams{achTransferId=$achTransferId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
