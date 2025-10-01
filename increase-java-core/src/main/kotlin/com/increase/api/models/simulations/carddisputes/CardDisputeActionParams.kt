// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.carddisputes

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
import com.increase.api.core.checkRequired
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.errors.IncreaseInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * After a [Card Dispute](#card-disputes) is created in production, the dispute will initially be in
 * a `pending_user_submission_reviewing` state. Since no review or further action happens in
 * sandbox, this endpoint simulates moving a Card Dispute through its various states.
 */
class CardDisputeActionParams
private constructor(
    private val cardDisputeId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The dispute you would like to action. */
    fun cardDisputeId(): Optional<String> = Optional.ofNullable(cardDisputeId)

    /**
     * The network of the Card Dispute. Details specific to the network are required under the
     * sub-object with the same identifier as the network.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun network(): Network = body.network()

    /**
     * The Visa-specific parameters for the taking action on the dispute. Required if and only if
     * `network` is `visa`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun visa(): Optional<Visa> = body.visa()

    /**
     * Returns the raw JSON value of [network].
     *
     * Unlike [network], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _network(): JsonField<Network> = body._network()

    /**
     * Returns the raw JSON value of [visa].
     *
     * Unlike [visa], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _visa(): JsonField<Visa> = body._visa()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CardDisputeActionParams].
         *
         * The following fields are required:
         * ```java
         * .network()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CardDisputeActionParams]. */
    class Builder internal constructor() {

        private var cardDisputeId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(cardDisputeActionParams: CardDisputeActionParams) = apply {
            cardDisputeId = cardDisputeActionParams.cardDisputeId
            body = cardDisputeActionParams.body.toBuilder()
            additionalHeaders = cardDisputeActionParams.additionalHeaders.toBuilder()
            additionalQueryParams = cardDisputeActionParams.additionalQueryParams.toBuilder()
        }

        /** The dispute you would like to action. */
        fun cardDisputeId(cardDisputeId: String?) = apply { this.cardDisputeId = cardDisputeId }

        /** Alias for calling [Builder.cardDisputeId] with `cardDisputeId.orElse(null)`. */
        fun cardDisputeId(cardDisputeId: Optional<String>) =
            cardDisputeId(cardDisputeId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [network]
         * - [visa]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * The network of the Card Dispute. Details specific to the network are required under the
         * sub-object with the same identifier as the network.
         */
        fun network(network: Network) = apply { body.network(network) }

        /**
         * Sets [Builder.network] to an arbitrary JSON value.
         *
         * You should usually call [Builder.network] with a well-typed [Network] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun network(network: JsonField<Network>) = apply { body.network(network) }

        /**
         * The Visa-specific parameters for the taking action on the dispute. Required if and only
         * if `network` is `visa`.
         */
        fun visa(visa: Visa) = apply { body.visa(visa) }

        /**
         * Sets [Builder.visa] to an arbitrary JSON value.
         *
         * You should usually call [Builder.visa] with a well-typed [Visa] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun visa(visa: JsonField<Visa>) = apply { body.visa(visa) }

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
         * Returns an immutable instance of [CardDisputeActionParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .network()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CardDisputeActionParams =
            CardDisputeActionParams(
                cardDisputeId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> cardDisputeId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val network: JsonField<Network>,
        private val visa: JsonField<Visa>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("network") @ExcludeMissing network: JsonField<Network> = JsonMissing.of(),
            @JsonProperty("visa") @ExcludeMissing visa: JsonField<Visa> = JsonMissing.of(),
        ) : this(network, visa, mutableMapOf())

        /**
         * The network of the Card Dispute. Details specific to the network are required under the
         * sub-object with the same identifier as the network.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun network(): Network = network.getRequired("network")

        /**
         * The Visa-specific parameters for the taking action on the dispute. Required if and only
         * if `network` is `visa`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun visa(): Optional<Visa> = visa.getOptional("visa")

        /**
         * Returns the raw JSON value of [network].
         *
         * Unlike [network], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("network") @ExcludeMissing fun _network(): JsonField<Network> = network

        /**
         * Returns the raw JSON value of [visa].
         *
         * Unlike [visa], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("visa") @ExcludeMissing fun _visa(): JsonField<Visa> = visa

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
             * .network()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var network: JsonField<Network>? = null
            private var visa: JsonField<Visa> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                network = body.network
                visa = body.visa
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * The network of the Card Dispute. Details specific to the network are required under
             * the sub-object with the same identifier as the network.
             */
            fun network(network: Network) = network(JsonField.of(network))

            /**
             * Sets [Builder.network] to an arbitrary JSON value.
             *
             * You should usually call [Builder.network] with a well-typed [Network] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun network(network: JsonField<Network>) = apply { this.network = network }

            /**
             * The Visa-specific parameters for the taking action on the dispute. Required if and
             * only if `network` is `visa`.
             */
            fun visa(visa: Visa) = visa(JsonField.of(visa))

            /**
             * Sets [Builder.visa] to an arbitrary JSON value.
             *
             * You should usually call [Builder.visa] with a well-typed [Visa] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun visa(visa: JsonField<Visa>) = apply { this.visa = visa }

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
             * .network()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(checkRequired("network", network), visa, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            network().validate()
            visa().ifPresent { it.validate() }
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
            (network.asKnown().getOrNull()?.validity() ?: 0) +
                (visa.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                network == other.network &&
                visa == other.visa &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(network, visa, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{network=$network, visa=$visa, additionalProperties=$additionalProperties}"
    }

    /**
     * The network of the Card Dispute. Details specific to the network are required under the
     * sub-object with the same identifier as the network.
     */
    class Network @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            /** Visa */
            @JvmField val VISA = of("visa")

            @JvmStatic fun of(value: String) = Network(JsonField.of(value))
        }

        /** An enum containing [Network]'s known values. */
        enum class Known {
            /** Visa */
            VISA
        }

        /**
         * An enum containing [Network]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Network] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** Visa */
            VISA,
            /** An enum member indicating that [Network] was instantiated with an unknown value. */
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
                VISA -> Value.VISA
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
                VISA -> Known.VISA
                else -> throw IncreaseInvalidDataException("Unknown Network: $value")
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

        fun validate(): Network = apply {
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

            return other is Network && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * The Visa-specific parameters for the taking action on the dispute. Required if and only if
     * `network` is `visa`.
     */
    class Visa
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val action: JsonField<Action>,
        private val acceptChargeback: JsonValue,
        private val acceptUserSubmission: JsonValue,
        private val declineUserPrearbitration: JsonValue,
        private val receiveMerchantPrearbitration: JsonValue,
        private val represent: JsonValue,
        private val requestFurtherInformation: JsonField<RequestFurtherInformation>,
        private val timeOutChargeback: JsonValue,
        private val timeOutMerchantPrearbitration: JsonValue,
        private val timeOutRepresentment: JsonValue,
        private val timeOutUserPrearbitration: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("action") @ExcludeMissing action: JsonField<Action> = JsonMissing.of(),
            @JsonProperty("accept_chargeback")
            @ExcludeMissing
            acceptChargeback: JsonValue = JsonMissing.of(),
            @JsonProperty("accept_user_submission")
            @ExcludeMissing
            acceptUserSubmission: JsonValue = JsonMissing.of(),
            @JsonProperty("decline_user_prearbitration")
            @ExcludeMissing
            declineUserPrearbitration: JsonValue = JsonMissing.of(),
            @JsonProperty("receive_merchant_prearbitration")
            @ExcludeMissing
            receiveMerchantPrearbitration: JsonValue = JsonMissing.of(),
            @JsonProperty("represent") @ExcludeMissing represent: JsonValue = JsonMissing.of(),
            @JsonProperty("request_further_information")
            @ExcludeMissing
            requestFurtherInformation: JsonField<RequestFurtherInformation> = JsonMissing.of(),
            @JsonProperty("time_out_chargeback")
            @ExcludeMissing
            timeOutChargeback: JsonValue = JsonMissing.of(),
            @JsonProperty("time_out_merchant_prearbitration")
            @ExcludeMissing
            timeOutMerchantPrearbitration: JsonValue = JsonMissing.of(),
            @JsonProperty("time_out_representment")
            @ExcludeMissing
            timeOutRepresentment: JsonValue = JsonMissing.of(),
            @JsonProperty("time_out_user_prearbitration")
            @ExcludeMissing
            timeOutUserPrearbitration: JsonValue = JsonMissing.of(),
        ) : this(
            action,
            acceptChargeback,
            acceptUserSubmission,
            declineUserPrearbitration,
            receiveMerchantPrearbitration,
            represent,
            requestFurtherInformation,
            timeOutChargeback,
            timeOutMerchantPrearbitration,
            timeOutRepresentment,
            timeOutUserPrearbitration,
            mutableMapOf(),
        )

        /**
         * The action to take. Details specific to the action are required under the sub-object with
         * the same identifier as the action.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun action(): Action = action.getRequired("action")

        /**
         * The parameters for accepting the chargeback. Required if and only if `action` is
         * `accept_chargeback`.
         */
        @JsonProperty("accept_chargeback")
        @ExcludeMissing
        fun _acceptChargeback(): JsonValue = acceptChargeback

        /**
         * The parameters for accepting the user submission. Required if and only if `action` is
         * `accept_user_submission`.
         */
        @JsonProperty("accept_user_submission")
        @ExcludeMissing
        fun _acceptUserSubmission(): JsonValue = acceptUserSubmission

        /**
         * The parameters for declining the prearbitration. Required if and only if `action` is
         * `decline_user_prearbitration`.
         */
        @JsonProperty("decline_user_prearbitration")
        @ExcludeMissing
        fun _declineUserPrearbitration(): JsonValue = declineUserPrearbitration

        /**
         * The parameters for receiving the prearbitration. Required if and only if `action` is
         * `receive_merchant_prearbitration`.
         */
        @JsonProperty("receive_merchant_prearbitration")
        @ExcludeMissing
        fun _receiveMerchantPrearbitration(): JsonValue = receiveMerchantPrearbitration

        /**
         * The parameters for re-presenting the dispute. Required if and only if `action` is
         * `represent`.
         */
        @JsonProperty("represent") @ExcludeMissing fun _represent(): JsonValue = represent

        /**
         * The parameters for requesting further information from the user. Required if and only if
         * `action` is `request_further_information`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun requestFurtherInformation(): Optional<RequestFurtherInformation> =
            requestFurtherInformation.getOptional("request_further_information")

        /**
         * The parameters for timing out the chargeback. Required if and only if `action` is
         * `time_out_chargeback`.
         */
        @JsonProperty("time_out_chargeback")
        @ExcludeMissing
        fun _timeOutChargeback(): JsonValue = timeOutChargeback

        /**
         * The parameters for timing out the merchant prearbitration. Required if and only if
         * `action` is `time_out_merchant_prearbitration`.
         */
        @JsonProperty("time_out_merchant_prearbitration")
        @ExcludeMissing
        fun _timeOutMerchantPrearbitration(): JsonValue = timeOutMerchantPrearbitration

        /**
         * The parameters for timing out the re-presentment. Required if and only if `action` is
         * `time_out_representment`.
         */
        @JsonProperty("time_out_representment")
        @ExcludeMissing
        fun _timeOutRepresentment(): JsonValue = timeOutRepresentment

        /**
         * The parameters for timing out the user prearbitration. Required if and only if `action`
         * is `time_out_user_prearbitration`.
         */
        @JsonProperty("time_out_user_prearbitration")
        @ExcludeMissing
        fun _timeOutUserPrearbitration(): JsonValue = timeOutUserPrearbitration

        /**
         * Returns the raw JSON value of [action].
         *
         * Unlike [action], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("action") @ExcludeMissing fun _action(): JsonField<Action> = action

        /**
         * Returns the raw JSON value of [requestFurtherInformation].
         *
         * Unlike [requestFurtherInformation], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("request_further_information")
        @ExcludeMissing
        fun _requestFurtherInformation(): JsonField<RequestFurtherInformation> =
            requestFurtherInformation

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
             * Returns a mutable builder for constructing an instance of [Visa].
             *
             * The following fields are required:
             * ```java
             * .action()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Visa]. */
        class Builder internal constructor() {

            private var action: JsonField<Action>? = null
            private var acceptChargeback: JsonValue = JsonMissing.of()
            private var acceptUserSubmission: JsonValue = JsonMissing.of()
            private var declineUserPrearbitration: JsonValue = JsonMissing.of()
            private var receiveMerchantPrearbitration: JsonValue = JsonMissing.of()
            private var represent: JsonValue = JsonMissing.of()
            private var requestFurtherInformation: JsonField<RequestFurtherInformation> =
                JsonMissing.of()
            private var timeOutChargeback: JsonValue = JsonMissing.of()
            private var timeOutMerchantPrearbitration: JsonValue = JsonMissing.of()
            private var timeOutRepresentment: JsonValue = JsonMissing.of()
            private var timeOutUserPrearbitration: JsonValue = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(visa: Visa) = apply {
                action = visa.action
                acceptChargeback = visa.acceptChargeback
                acceptUserSubmission = visa.acceptUserSubmission
                declineUserPrearbitration = visa.declineUserPrearbitration
                receiveMerchantPrearbitration = visa.receiveMerchantPrearbitration
                represent = visa.represent
                requestFurtherInformation = visa.requestFurtherInformation
                timeOutChargeback = visa.timeOutChargeback
                timeOutMerchantPrearbitration = visa.timeOutMerchantPrearbitration
                timeOutRepresentment = visa.timeOutRepresentment
                timeOutUserPrearbitration = visa.timeOutUserPrearbitration
                additionalProperties = visa.additionalProperties.toMutableMap()
            }

            /**
             * The action to take. Details specific to the action are required under the sub-object
             * with the same identifier as the action.
             */
            fun action(action: Action) = action(JsonField.of(action))

            /**
             * Sets [Builder.action] to an arbitrary JSON value.
             *
             * You should usually call [Builder.action] with a well-typed [Action] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun action(action: JsonField<Action>) = apply { this.action = action }

            /**
             * The parameters for accepting the chargeback. Required if and only if `action` is
             * `accept_chargeback`.
             */
            fun acceptChargeback(acceptChargeback: JsonValue) = apply {
                this.acceptChargeback = acceptChargeback
            }

            /**
             * The parameters for accepting the user submission. Required if and only if `action` is
             * `accept_user_submission`.
             */
            fun acceptUserSubmission(acceptUserSubmission: JsonValue) = apply {
                this.acceptUserSubmission = acceptUserSubmission
            }

            /**
             * The parameters for declining the prearbitration. Required if and only if `action` is
             * `decline_user_prearbitration`.
             */
            fun declineUserPrearbitration(declineUserPrearbitration: JsonValue) = apply {
                this.declineUserPrearbitration = declineUserPrearbitration
            }

            /**
             * The parameters for receiving the prearbitration. Required if and only if `action` is
             * `receive_merchant_prearbitration`.
             */
            fun receiveMerchantPrearbitration(receiveMerchantPrearbitration: JsonValue) = apply {
                this.receiveMerchantPrearbitration = receiveMerchantPrearbitration
            }

            /**
             * The parameters for re-presenting the dispute. Required if and only if `action` is
             * `represent`.
             */
            fun represent(represent: JsonValue) = apply { this.represent = represent }

            /**
             * The parameters for requesting further information from the user. Required if and only
             * if `action` is `request_further_information`.
             */
            fun requestFurtherInformation(requestFurtherInformation: RequestFurtherInformation) =
                requestFurtherInformation(JsonField.of(requestFurtherInformation))

            /**
             * Sets [Builder.requestFurtherInformation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requestFurtherInformation] with a well-typed
             * [RequestFurtherInformation] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun requestFurtherInformation(
                requestFurtherInformation: JsonField<RequestFurtherInformation>
            ) = apply { this.requestFurtherInformation = requestFurtherInformation }

            /**
             * The parameters for timing out the chargeback. Required if and only if `action` is
             * `time_out_chargeback`.
             */
            fun timeOutChargeback(timeOutChargeback: JsonValue) = apply {
                this.timeOutChargeback = timeOutChargeback
            }

            /**
             * The parameters for timing out the merchant prearbitration. Required if and only if
             * `action` is `time_out_merchant_prearbitration`.
             */
            fun timeOutMerchantPrearbitration(timeOutMerchantPrearbitration: JsonValue) = apply {
                this.timeOutMerchantPrearbitration = timeOutMerchantPrearbitration
            }

            /**
             * The parameters for timing out the re-presentment. Required if and only if `action` is
             * `time_out_representment`.
             */
            fun timeOutRepresentment(timeOutRepresentment: JsonValue) = apply {
                this.timeOutRepresentment = timeOutRepresentment
            }

            /**
             * The parameters for timing out the user prearbitration. Required if and only if
             * `action` is `time_out_user_prearbitration`.
             */
            fun timeOutUserPrearbitration(timeOutUserPrearbitration: JsonValue) = apply {
                this.timeOutUserPrearbitration = timeOutUserPrearbitration
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
             * Returns an immutable instance of [Visa].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .action()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Visa =
                Visa(
                    checkRequired("action", action),
                    acceptChargeback,
                    acceptUserSubmission,
                    declineUserPrearbitration,
                    receiveMerchantPrearbitration,
                    represent,
                    requestFurtherInformation,
                    timeOutChargeback,
                    timeOutMerchantPrearbitration,
                    timeOutRepresentment,
                    timeOutUserPrearbitration,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Visa = apply {
            if (validated) {
                return@apply
            }

            action().validate()
            requestFurtherInformation().ifPresent { it.validate() }
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
            (action.asKnown().getOrNull()?.validity() ?: 0) +
                (requestFurtherInformation.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * The action to take. Details specific to the action are required under the sub-object with
         * the same identifier as the action.
         */
        class Action @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                /**
                 * Simulate the merchant accepting the chargeback. This will move the dispute to a
                 * `won` state.
                 */
                @JvmField val ACCEPT_CHARGEBACK = of("accept_chargeback")

                /**
                 * Accept the user's submission and transmit it to the network. This will move the
                 * dispute to a `pending_response` state.
                 */
                @JvmField val ACCEPT_USER_SUBMISSION = of("accept_user_submission")

                /**
                 * Simulate the merchant declining the user's pre-arbitration. This will move the
                 * dispute to a `lost` state.
                 */
                @JvmField val DECLINE_USER_PREARBITRATION = of("decline_user_prearbitration")

                /**
                 * Simulate the merchant issuing pre-arbitration. This will move the dispute to a
                 * `user_submission_required` state.
                 */
                @JvmField
                val RECEIVE_MERCHANT_PREARBITRATION = of("receive_merchant_prearbitration")

                /**
                 * Simulate the merchant re-presenting the dispute. This will move the dispute to a
                 * `user_submission_required` state.
                 */
                @JvmField val REPRESENT = of("represent")

                /**
                 * Simulate further information being requested from the user. This will move the
                 * dispute to a `user_submission_required` state.
                 */
                @JvmField val REQUEST_FURTHER_INFORMATION = of("request_further_information")

                /**
                 * Simulate the merchant timing out responding to the chargeback. This will move the
                 * dispute to a `won` state.
                 */
                @JvmField val TIME_OUT_CHARGEBACK = of("time_out_chargeback")

                /**
                 * Simulate the user timing out responding to a merchant pre-arbitration. This will
                 * move the dispute to a `lost` state.
                 */
                @JvmField
                val TIME_OUT_MERCHANT_PREARBITRATION = of("time_out_merchant_prearbitration")

                /**
                 * Simulate the user timing out responding to a merchant re-presentment. This will
                 * move the dispute to a `lost` state.
                 */
                @JvmField val TIME_OUT_REPRESENTMENT = of("time_out_representment")

                /**
                 * Simulate the merchant timing out responding to a user pre-arbitration. This will
                 * move the dispute to a `win` state.
                 */
                @JvmField val TIME_OUT_USER_PREARBITRATION = of("time_out_user_prearbitration")

                @JvmStatic fun of(value: String) = Action(JsonField.of(value))
            }

            /** An enum containing [Action]'s known values. */
            enum class Known {
                /**
                 * Simulate the merchant accepting the chargeback. This will move the dispute to a
                 * `won` state.
                 */
                ACCEPT_CHARGEBACK,
                /**
                 * Accept the user's submission and transmit it to the network. This will move the
                 * dispute to a `pending_response` state.
                 */
                ACCEPT_USER_SUBMISSION,
                /**
                 * Simulate the merchant declining the user's pre-arbitration. This will move the
                 * dispute to a `lost` state.
                 */
                DECLINE_USER_PREARBITRATION,
                /**
                 * Simulate the merchant issuing pre-arbitration. This will move the dispute to a
                 * `user_submission_required` state.
                 */
                RECEIVE_MERCHANT_PREARBITRATION,
                /**
                 * Simulate the merchant re-presenting the dispute. This will move the dispute to a
                 * `user_submission_required` state.
                 */
                REPRESENT,
                /**
                 * Simulate further information being requested from the user. This will move the
                 * dispute to a `user_submission_required` state.
                 */
                REQUEST_FURTHER_INFORMATION,
                /**
                 * Simulate the merchant timing out responding to the chargeback. This will move the
                 * dispute to a `won` state.
                 */
                TIME_OUT_CHARGEBACK,
                /**
                 * Simulate the user timing out responding to a merchant pre-arbitration. This will
                 * move the dispute to a `lost` state.
                 */
                TIME_OUT_MERCHANT_PREARBITRATION,
                /**
                 * Simulate the user timing out responding to a merchant re-presentment. This will
                 * move the dispute to a `lost` state.
                 */
                TIME_OUT_REPRESENTMENT,
                /**
                 * Simulate the merchant timing out responding to a user pre-arbitration. This will
                 * move the dispute to a `win` state.
                 */
                TIME_OUT_USER_PREARBITRATION,
            }

            /**
             * An enum containing [Action]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Action] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /**
                 * Simulate the merchant accepting the chargeback. This will move the dispute to a
                 * `won` state.
                 */
                ACCEPT_CHARGEBACK,
                /**
                 * Accept the user's submission and transmit it to the network. This will move the
                 * dispute to a `pending_response` state.
                 */
                ACCEPT_USER_SUBMISSION,
                /**
                 * Simulate the merchant declining the user's pre-arbitration. This will move the
                 * dispute to a `lost` state.
                 */
                DECLINE_USER_PREARBITRATION,
                /**
                 * Simulate the merchant issuing pre-arbitration. This will move the dispute to a
                 * `user_submission_required` state.
                 */
                RECEIVE_MERCHANT_PREARBITRATION,
                /**
                 * Simulate the merchant re-presenting the dispute. This will move the dispute to a
                 * `user_submission_required` state.
                 */
                REPRESENT,
                /**
                 * Simulate further information being requested from the user. This will move the
                 * dispute to a `user_submission_required` state.
                 */
                REQUEST_FURTHER_INFORMATION,
                /**
                 * Simulate the merchant timing out responding to the chargeback. This will move the
                 * dispute to a `won` state.
                 */
                TIME_OUT_CHARGEBACK,
                /**
                 * Simulate the user timing out responding to a merchant pre-arbitration. This will
                 * move the dispute to a `lost` state.
                 */
                TIME_OUT_MERCHANT_PREARBITRATION,
                /**
                 * Simulate the user timing out responding to a merchant re-presentment. This will
                 * move the dispute to a `lost` state.
                 */
                TIME_OUT_REPRESENTMENT,
                /**
                 * Simulate the merchant timing out responding to a user pre-arbitration. This will
                 * move the dispute to a `win` state.
                 */
                TIME_OUT_USER_PREARBITRATION,
                /**
                 * An enum member indicating that [Action] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    ACCEPT_CHARGEBACK -> Value.ACCEPT_CHARGEBACK
                    ACCEPT_USER_SUBMISSION -> Value.ACCEPT_USER_SUBMISSION
                    DECLINE_USER_PREARBITRATION -> Value.DECLINE_USER_PREARBITRATION
                    RECEIVE_MERCHANT_PREARBITRATION -> Value.RECEIVE_MERCHANT_PREARBITRATION
                    REPRESENT -> Value.REPRESENT
                    REQUEST_FURTHER_INFORMATION -> Value.REQUEST_FURTHER_INFORMATION
                    TIME_OUT_CHARGEBACK -> Value.TIME_OUT_CHARGEBACK
                    TIME_OUT_MERCHANT_PREARBITRATION -> Value.TIME_OUT_MERCHANT_PREARBITRATION
                    TIME_OUT_REPRESENTMENT -> Value.TIME_OUT_REPRESENTMENT
                    TIME_OUT_USER_PREARBITRATION -> Value.TIME_OUT_USER_PREARBITRATION
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws IncreaseInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    ACCEPT_CHARGEBACK -> Known.ACCEPT_CHARGEBACK
                    ACCEPT_USER_SUBMISSION -> Known.ACCEPT_USER_SUBMISSION
                    DECLINE_USER_PREARBITRATION -> Known.DECLINE_USER_PREARBITRATION
                    RECEIVE_MERCHANT_PREARBITRATION -> Known.RECEIVE_MERCHANT_PREARBITRATION
                    REPRESENT -> Known.REPRESENT
                    REQUEST_FURTHER_INFORMATION -> Known.REQUEST_FURTHER_INFORMATION
                    TIME_OUT_CHARGEBACK -> Known.TIME_OUT_CHARGEBACK
                    TIME_OUT_MERCHANT_PREARBITRATION -> Known.TIME_OUT_MERCHANT_PREARBITRATION
                    TIME_OUT_REPRESENTMENT -> Known.TIME_OUT_REPRESENTMENT
                    TIME_OUT_USER_PREARBITRATION -> Known.TIME_OUT_USER_PREARBITRATION
                    else -> throw IncreaseInvalidDataException("Unknown Action: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws IncreaseInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    IncreaseInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Action = apply {
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

                return other is Action && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * The parameters for requesting further information from the user. Required if and only if
         * `action` is `request_further_information`.
         */
        class RequestFurtherInformation
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val reason: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of()
            ) : this(reason, mutableMapOf())

            /**
             * The reason for requesting further information from the user.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun reason(): String = reason.getRequired("reason")

            /**
             * Returns the raw JSON value of [reason].
             *
             * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

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
                 * Returns a mutable builder for constructing an instance of
                 * [RequestFurtherInformation].
                 *
                 * The following fields are required:
                 * ```java
                 * .reason()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [RequestFurtherInformation]. */
            class Builder internal constructor() {

                private var reason: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(requestFurtherInformation: RequestFurtherInformation) = apply {
                    reason = requestFurtherInformation.reason
                    additionalProperties =
                        requestFurtherInformation.additionalProperties.toMutableMap()
                }

                /** The reason for requesting further information from the user. */
                fun reason(reason: String) = reason(JsonField.of(reason))

                /**
                 * Sets [Builder.reason] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reason] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reason(reason: JsonField<String>) = apply { this.reason = reason }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [RequestFurtherInformation].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .reason()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): RequestFurtherInformation =
                    RequestFurtherInformation(
                        checkRequired("reason", reason),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): RequestFurtherInformation = apply {
                if (validated) {
                    return@apply
                }

                reason()
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
            @JvmSynthetic internal fun validity(): Int = (if (reason.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is RequestFurtherInformation &&
                    reason == other.reason &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(reason, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RequestFurtherInformation{reason=$reason, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Visa &&
                action == other.action &&
                acceptChargeback == other.acceptChargeback &&
                acceptUserSubmission == other.acceptUserSubmission &&
                declineUserPrearbitration == other.declineUserPrearbitration &&
                receiveMerchantPrearbitration == other.receiveMerchantPrearbitration &&
                represent == other.represent &&
                requestFurtherInformation == other.requestFurtherInformation &&
                timeOutChargeback == other.timeOutChargeback &&
                timeOutMerchantPrearbitration == other.timeOutMerchantPrearbitration &&
                timeOutRepresentment == other.timeOutRepresentment &&
                timeOutUserPrearbitration == other.timeOutUserPrearbitration &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                action,
                acceptChargeback,
                acceptUserSubmission,
                declineUserPrearbitration,
                receiveMerchantPrearbitration,
                represent,
                requestFurtherInformation,
                timeOutChargeback,
                timeOutMerchantPrearbitration,
                timeOutRepresentment,
                timeOutUserPrearbitration,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Visa{action=$action, acceptChargeback=$acceptChargeback, acceptUserSubmission=$acceptUserSubmission, declineUserPrearbitration=$declineUserPrearbitration, receiveMerchantPrearbitration=$receiveMerchantPrearbitration, represent=$represent, requestFurtherInformation=$requestFurtherInformation, timeOutChargeback=$timeOutChargeback, timeOutMerchantPrearbitration=$timeOutMerchantPrearbitration, timeOutRepresentment=$timeOutRepresentment, timeOutUserPrearbitration=$timeOutUserPrearbitration, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardDisputeActionParams &&
            cardDisputeId == other.cardDisputeId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(cardDisputeId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CardDisputeActionParams{cardDisputeId=$cardDisputeId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
