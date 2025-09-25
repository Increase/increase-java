// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundachtransfers

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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

/** Create a notification of change for an Inbound ACH Transfer */
class InboundAchTransferCreateNotificationOfChangeParams
private constructor(
    private val inboundAchTransferId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The identifier of the Inbound ACH Transfer for which to create a notification of change. */
    fun inboundAchTransferId(): Optional<String> = Optional.ofNullable(inboundAchTransferId)

    /**
     * The updated account number to send in the notification of change.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAccountNumber(): Optional<String> = body.updatedAccountNumber()

    /**
     * The updated routing number to send in the notification of change.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedRoutingNumber(): Optional<String> = body.updatedRoutingNumber()

    /**
     * Returns the raw JSON value of [updatedAccountNumber].
     *
     * Unlike [updatedAccountNumber], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _updatedAccountNumber(): JsonField<String> = body._updatedAccountNumber()

    /**
     * Returns the raw JSON value of [updatedRoutingNumber].
     *
     * Unlike [updatedRoutingNumber], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _updatedRoutingNumber(): JsonField<String> = body._updatedRoutingNumber()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic
        fun none(): InboundAchTransferCreateNotificationOfChangeParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [InboundAchTransferCreateNotificationOfChangeParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InboundAchTransferCreateNotificationOfChangeParams]. */
    class Builder internal constructor() {

        private var inboundAchTransferId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            inboundAchTransferCreateNotificationOfChangeParams:
                InboundAchTransferCreateNotificationOfChangeParams
        ) = apply {
            inboundAchTransferId =
                inboundAchTransferCreateNotificationOfChangeParams.inboundAchTransferId
            body = inboundAchTransferCreateNotificationOfChangeParams.body.toBuilder()
            additionalHeaders =
                inboundAchTransferCreateNotificationOfChangeParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                inboundAchTransferCreateNotificationOfChangeParams.additionalQueryParams.toBuilder()
        }

        /**
         * The identifier of the Inbound ACH Transfer for which to create a notification of change.
         */
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
         * - [updatedAccountNumber]
         * - [updatedRoutingNumber]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The updated account number to send in the notification of change. */
        fun updatedAccountNumber(updatedAccountNumber: String) = apply {
            body.updatedAccountNumber(updatedAccountNumber)
        }

        /**
         * Sets [Builder.updatedAccountNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAccountNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAccountNumber(updatedAccountNumber: JsonField<String>) = apply {
            body.updatedAccountNumber(updatedAccountNumber)
        }

        /** The updated routing number to send in the notification of change. */
        fun updatedRoutingNumber(updatedRoutingNumber: String) = apply {
            body.updatedRoutingNumber(updatedRoutingNumber)
        }

        /**
         * Sets [Builder.updatedRoutingNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedRoutingNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedRoutingNumber(updatedRoutingNumber: JsonField<String>) = apply {
            body.updatedRoutingNumber(updatedRoutingNumber)
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
         * Returns an immutable instance of [InboundAchTransferCreateNotificationOfChangeParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): InboundAchTransferCreateNotificationOfChangeParams =
            InboundAchTransferCreateNotificationOfChangeParams(
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
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val updatedAccountNumber: JsonField<String>,
        private val updatedRoutingNumber: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("updated_account_number")
            @ExcludeMissing
            updatedAccountNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("updated_routing_number")
            @ExcludeMissing
            updatedRoutingNumber: JsonField<String> = JsonMissing.of(),
        ) : this(updatedAccountNumber, updatedRoutingNumber, mutableMapOf())

        /**
         * The updated account number to send in the notification of change.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun updatedAccountNumber(): Optional<String> =
            updatedAccountNumber.getOptional("updated_account_number")

        /**
         * The updated routing number to send in the notification of change.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun updatedRoutingNumber(): Optional<String> =
            updatedRoutingNumber.getOptional("updated_routing_number")

        /**
         * Returns the raw JSON value of [updatedAccountNumber].
         *
         * Unlike [updatedAccountNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("updated_account_number")
        @ExcludeMissing
        fun _updatedAccountNumber(): JsonField<String> = updatedAccountNumber

        /**
         * Returns the raw JSON value of [updatedRoutingNumber].
         *
         * Unlike [updatedRoutingNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("updated_routing_number")
        @ExcludeMissing
        fun _updatedRoutingNumber(): JsonField<String> = updatedRoutingNumber

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

            private var updatedAccountNumber: JsonField<String> = JsonMissing.of()
            private var updatedRoutingNumber: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                updatedAccountNumber = body.updatedAccountNumber
                updatedRoutingNumber = body.updatedRoutingNumber
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The updated account number to send in the notification of change. */
            fun updatedAccountNumber(updatedAccountNumber: String) =
                updatedAccountNumber(JsonField.of(updatedAccountNumber))

            /**
             * Sets [Builder.updatedAccountNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAccountNumber] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun updatedAccountNumber(updatedAccountNumber: JsonField<String>) = apply {
                this.updatedAccountNumber = updatedAccountNumber
            }

            /** The updated routing number to send in the notification of change. */
            fun updatedRoutingNumber(updatedRoutingNumber: String) =
                updatedRoutingNumber(JsonField.of(updatedRoutingNumber))

            /**
             * Sets [Builder.updatedRoutingNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedRoutingNumber] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun updatedRoutingNumber(updatedRoutingNumber: JsonField<String>) = apply {
                this.updatedRoutingNumber = updatedRoutingNumber
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
                    updatedAccountNumber,
                    updatedRoutingNumber,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            updatedAccountNumber()
            updatedRoutingNumber()
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
            (if (updatedAccountNumber.asKnown().isPresent) 1 else 0) +
                (if (updatedRoutingNumber.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                updatedAccountNumber == other.updatedAccountNumber &&
                updatedRoutingNumber == other.updatedRoutingNumber &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(updatedAccountNumber, updatedRoutingNumber, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{updatedAccountNumber=$updatedAccountNumber, updatedRoutingNumber=$updatedRoutingNumber, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InboundAchTransferCreateNotificationOfChangeParams &&
            inboundAchTransferId == other.inboundAchTransferId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(inboundAchTransferId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "InboundAchTransferCreateNotificationOfChangeParams{inboundAchTransferId=$inboundAchTransferId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
