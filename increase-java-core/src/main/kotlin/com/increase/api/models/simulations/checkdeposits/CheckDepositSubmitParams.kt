// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.checkdeposits

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
import kotlin.jvm.optionals.getOrNull

/**
 * Simulates the submission of a [Check Deposit](#check-deposits) to the Federal Reserve. This Check
 * Deposit must first have a `status` of `pending`.
 */
class CheckDepositSubmitParams
private constructor(
    private val checkDepositId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The identifier of the Check Deposit you wish to submit. */
    fun checkDepositId(): Optional<String> = Optional.ofNullable(checkDepositId)

    /**
     * If set, the simulation will use these values for the check's scanned MICR data.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scan(): Optional<Scan> = body.scan()

    /**
     * Returns the raw JSON value of [scan].
     *
     * Unlike [scan], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _scan(): JsonField<Scan> = body._scan()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): CheckDepositSubmitParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [CheckDepositSubmitParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CheckDepositSubmitParams]. */
    class Builder internal constructor() {

        private var checkDepositId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(checkDepositSubmitParams: CheckDepositSubmitParams) = apply {
            checkDepositId = checkDepositSubmitParams.checkDepositId
            body = checkDepositSubmitParams.body.toBuilder()
            additionalHeaders = checkDepositSubmitParams.additionalHeaders.toBuilder()
            additionalQueryParams = checkDepositSubmitParams.additionalQueryParams.toBuilder()
        }

        /** The identifier of the Check Deposit you wish to submit. */
        fun checkDepositId(checkDepositId: String?) = apply { this.checkDepositId = checkDepositId }

        /** Alias for calling [Builder.checkDepositId] with `checkDepositId.orElse(null)`. */
        fun checkDepositId(checkDepositId: Optional<String>) =
            checkDepositId(checkDepositId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [scan]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** If set, the simulation will use these values for the check's scanned MICR data. */
        fun scan(scan: Scan) = apply { body.scan(scan) }

        /**
         * Sets [Builder.scan] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scan] with a well-typed [Scan] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun scan(scan: JsonField<Scan>) = apply { body.scan(scan) }

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
         * Returns an immutable instance of [CheckDepositSubmitParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CheckDepositSubmitParams =
            CheckDepositSubmitParams(
                checkDepositId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> checkDepositId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val scan: JsonField<Scan>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("scan") @ExcludeMissing scan: JsonField<Scan> = JsonMissing.of()
        ) : this(scan, mutableMapOf())

        /**
         * If set, the simulation will use these values for the check's scanned MICR data.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun scan(): Optional<Scan> = scan.getOptional("scan")

        /**
         * Returns the raw JSON value of [scan].
         *
         * Unlike [scan], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("scan") @ExcludeMissing fun _scan(): JsonField<Scan> = scan

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

            private var scan: JsonField<Scan> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                scan = body.scan
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** If set, the simulation will use these values for the check's scanned MICR data. */
            fun scan(scan: Scan) = scan(JsonField.of(scan))

            /**
             * Sets [Builder.scan] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scan] with a well-typed [Scan] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun scan(scan: JsonField<Scan>) = apply { this.scan = scan }

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
            fun build(): Body = Body(scan, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            scan().ifPresent { it.validate() }
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
        @JvmSynthetic internal fun validity(): Int = (scan.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                scan == other.scan &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(scan, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Body{scan=$scan, additionalProperties=$additionalProperties}"
    }

    /** If set, the simulation will use these values for the check's scanned MICR data. */
    class Scan
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountNumber: JsonField<String>,
        private val routingNumber: JsonField<String>,
        private val auxiliaryOnUs: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("account_number")
            @ExcludeMissing
            accountNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("routing_number")
            @ExcludeMissing
            routingNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("auxiliary_on_us")
            @ExcludeMissing
            auxiliaryOnUs: JsonField<String> = JsonMissing.of(),
        ) : this(accountNumber, routingNumber, auxiliaryOnUs, mutableMapOf())

        /**
         * The account number to be returned in the check deposit's scan data.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountNumber(): String = accountNumber.getRequired("account_number")

        /**
         * The routing number to be returned in the check deposit's scan data.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun routingNumber(): String = routingNumber.getRequired("routing_number")

        /**
         * The auxiliary on-us data to be returned in the check deposit's scan data.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun auxiliaryOnUs(): Optional<String> = auxiliaryOnUs.getOptional("auxiliary_on_us")

        /**
         * Returns the raw JSON value of [accountNumber].
         *
         * Unlike [accountNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("account_number")
        @ExcludeMissing
        fun _accountNumber(): JsonField<String> = accountNumber

        /**
         * Returns the raw JSON value of [routingNumber].
         *
         * Unlike [routingNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("routing_number")
        @ExcludeMissing
        fun _routingNumber(): JsonField<String> = routingNumber

        /**
         * Returns the raw JSON value of [auxiliaryOnUs].
         *
         * Unlike [auxiliaryOnUs], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("auxiliary_on_us")
        @ExcludeMissing
        fun _auxiliaryOnUs(): JsonField<String> = auxiliaryOnUs

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
             * Returns a mutable builder for constructing an instance of [Scan].
             *
             * The following fields are required:
             * ```java
             * .accountNumber()
             * .routingNumber()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Scan]. */
        class Builder internal constructor() {

            private var accountNumber: JsonField<String>? = null
            private var routingNumber: JsonField<String>? = null
            private var auxiliaryOnUs: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(scan: Scan) = apply {
                accountNumber = scan.accountNumber
                routingNumber = scan.routingNumber
                auxiliaryOnUs = scan.auxiliaryOnUs
                additionalProperties = scan.additionalProperties.toMutableMap()
            }

            /** The account number to be returned in the check deposit's scan data. */
            fun accountNumber(accountNumber: String) = accountNumber(JsonField.of(accountNumber))

            /**
             * Sets [Builder.accountNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountNumber(accountNumber: JsonField<String>) = apply {
                this.accountNumber = accountNumber
            }

            /** The routing number to be returned in the check deposit's scan data. */
            fun routingNumber(routingNumber: String) = routingNumber(JsonField.of(routingNumber))

            /**
             * Sets [Builder.routingNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.routingNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun routingNumber(routingNumber: JsonField<String>) = apply {
                this.routingNumber = routingNumber
            }

            /** The auxiliary on-us data to be returned in the check deposit's scan data. */
            fun auxiliaryOnUs(auxiliaryOnUs: String) = auxiliaryOnUs(JsonField.of(auxiliaryOnUs))

            /**
             * Sets [Builder.auxiliaryOnUs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.auxiliaryOnUs] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun auxiliaryOnUs(auxiliaryOnUs: JsonField<String>) = apply {
                this.auxiliaryOnUs = auxiliaryOnUs
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
             * Returns an immutable instance of [Scan].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .accountNumber()
             * .routingNumber()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Scan =
                Scan(
                    checkRequired("accountNumber", accountNumber),
                    checkRequired("routingNumber", routingNumber),
                    auxiliaryOnUs,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Scan = apply {
            if (validated) {
                return@apply
            }

            accountNumber()
            routingNumber()
            auxiliaryOnUs()
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
            (if (accountNumber.asKnown().isPresent) 1 else 0) +
                (if (routingNumber.asKnown().isPresent) 1 else 0) +
                (if (auxiliaryOnUs.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Scan &&
                accountNumber == other.accountNumber &&
                routingNumber == other.routingNumber &&
                auxiliaryOnUs == other.auxiliaryOnUs &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(accountNumber, routingNumber, auxiliaryOnUs, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Scan{accountNumber=$accountNumber, routingNumber=$routingNumber, auxiliaryOnUs=$auxiliaryOnUs, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CheckDepositSubmitParams &&
            checkDepositId == other.checkDepositId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(checkDepositId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CheckDepositSubmitParams{checkDepositId=$checkDepositId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
