// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.checkRequired
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

/** A request for proof of authorization for one or more ACH debit transfers. */
@NoAutoDetect
class ProofOfAuthorizationRequest
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("ach_transfers")
    @ExcludeMissing
    private val achTransfers: JsonField<List<AchTransfer>> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("due_on")
    @ExcludeMissing
    private val dueOn: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonProperty("updated_at")
    @ExcludeMissing
    private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The Proof of Authorization Request identifier. */
    fun id(): String = id.getRequired("id")

    /** The ACH Transfers associated with the request. */
    fun achTransfers(): List<AchTransfer> = achTransfers.getRequired("ach_transfers")

    /** The time the Proof of Authorization Request was created. */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The time the Proof of Authorization Request is due. */
    fun dueOn(): OffsetDateTime = dueOn.getRequired("due_on")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `proof_of_authorization_request`.
     */
    fun type(): Type = type.getRequired("type")

    /** The time the Proof of Authorization Request was last updated. */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /** The Proof of Authorization Request identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The ACH Transfers associated with the request. */
    @JsonProperty("ach_transfers")
    @ExcludeMissing
    fun _achTransfers(): JsonField<List<AchTransfer>> = achTransfers

    /** The time the Proof of Authorization Request was created. */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /** The time the Proof of Authorization Request is due. */
    @JsonProperty("due_on") @ExcludeMissing fun _dueOn(): JsonField<OffsetDateTime> = dueOn

    /**
     * A constant representing the object's type. For this resource it will always be
     * `proof_of_authorization_request`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /** The time the Proof of Authorization Request was last updated. */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ProofOfAuthorizationRequest = apply {
        if (validated) {
            return@apply
        }

        id()
        achTransfers().forEach { it.validate() }
        createdAt()
        dueOn()
        type()
        updatedAt()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ProofOfAuthorizationRequest]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var achTransfers: JsonField<MutableList<AchTransfer>>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var dueOn: JsonField<OffsetDateTime>? = null
        private var type: JsonField<Type>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(proofOfAuthorizationRequest: ProofOfAuthorizationRequest) = apply {
            id = proofOfAuthorizationRequest.id
            achTransfers = proofOfAuthorizationRequest.achTransfers.map { it.toMutableList() }
            createdAt = proofOfAuthorizationRequest.createdAt
            dueOn = proofOfAuthorizationRequest.dueOn
            type = proofOfAuthorizationRequest.type
            updatedAt = proofOfAuthorizationRequest.updatedAt
            additionalProperties = proofOfAuthorizationRequest.additionalProperties.toMutableMap()
        }

        /** The Proof of Authorization Request identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Proof of Authorization Request identifier. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The ACH Transfers associated with the request. */
        fun achTransfers(achTransfers: List<AchTransfer>) = achTransfers(JsonField.of(achTransfers))

        /** The ACH Transfers associated with the request. */
        fun achTransfers(achTransfers: JsonField<List<AchTransfer>>) = apply {
            this.achTransfers = achTransfers.map { it.toMutableList() }
        }

        /** The ACH Transfers associated with the request. */
        fun addAchTransfer(achTransfer: AchTransfer) = apply {
            achTransfers =
                (achTransfers ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(achTransfer)
                }
        }

        /** The time the Proof of Authorization Request was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /** The time the Proof of Authorization Request was created. */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The time the Proof of Authorization Request is due. */
        fun dueOn(dueOn: OffsetDateTime) = dueOn(JsonField.of(dueOn))

        /** The time the Proof of Authorization Request is due. */
        fun dueOn(dueOn: JsonField<OffsetDateTime>) = apply { this.dueOn = dueOn }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `proof_of_authorization_request`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `proof_of_authorization_request`.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** The time the Proof of Authorization Request was last updated. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /** The time the Proof of Authorization Request was last updated. */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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

        fun build(): ProofOfAuthorizationRequest =
            ProofOfAuthorizationRequest(
                checkRequired("id", id),
                checkRequired("achTransfers", achTransfers).map { it.toImmutable() },
                checkRequired("createdAt", createdAt),
                checkRequired("dueOn", dueOn),
                checkRequired("type", type),
                checkRequired("updatedAt", updatedAt),
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class AchTransfer
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The ACH Transfer identifier. */
        fun id(): String = id.getRequired("id")

        /** The ACH Transfer identifier. */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): AchTransfer = apply {
            if (validated) {
                return@apply
            }

            id()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AchTransfer]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(achTransfer: AchTransfer) = apply {
                id = achTransfer.id
                additionalProperties = achTransfer.additionalProperties.toMutableMap()
            }

            /** The ACH Transfer identifier. */
            fun id(id: String) = id(JsonField.of(id))

            /** The ACH Transfer identifier. */
            fun id(id: JsonField<String>) = apply { this.id = id }

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

            fun build(): AchTransfer =
                AchTransfer(checkRequired("id", id), additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AchTransfer && id == other.id && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "AchTransfer{id=$id, additionalProperties=$additionalProperties}"
    }

    /**
     * A constant representing the object's type. For this resource it will always be
     * `proof_of_authorization_request`.
     */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val PROOF_OF_AUTHORIZATION_REQUEST = of("proof_of_authorization_request")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            PROOF_OF_AUTHORIZATION_REQUEST
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PROOF_OF_AUTHORIZATION_REQUEST,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                PROOF_OF_AUTHORIZATION_REQUEST -> Value.PROOF_OF_AUTHORIZATION_REQUEST
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
                PROOF_OF_AUTHORIZATION_REQUEST -> Known.PROOF_OF_AUTHORIZATION_REQUEST
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProofOfAuthorizationRequest && id == other.id && achTransfers == other.achTransfers && createdAt == other.createdAt && dueOn == other.dueOn && type == other.type && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, achTransfers, createdAt, dueOn, type, updatedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ProofOfAuthorizationRequest{id=$id, achTransfers=$achTransfers, createdAt=$createdAt, dueOn=$dueOn, type=$type, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
