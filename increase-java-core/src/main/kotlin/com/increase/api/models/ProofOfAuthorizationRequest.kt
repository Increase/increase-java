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
    @JsonProperty("ach_transfers")
    @ExcludeMissing
    private val achTransfers: JsonField<List<AchTransfer>> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("due_on")
    @ExcludeMissing
    private val dueOn: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonProperty("updated_at")
    @ExcludeMissing
    private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The ACH Transfers associated with the request. */
    fun achTransfers(): List<AchTransfer> = achTransfers.getRequired("ach_transfers")

    /** The time the Proof of Authorization Request was created. */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The time the Proof of Authorization Request is due. */
    fun dueOn(): OffsetDateTime = dueOn.getRequired("due_on")

    /** The Proof of Authorization Request identifier. */
    fun id(): String = id.getRequired("id")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `proof_of_authorization_request`.
     */
    fun type(): Type = type.getRequired("type")

    /** The time the Proof of Authorization Request was last updated. */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /** The ACH Transfers associated with the request. */
    @JsonProperty("ach_transfers") @ExcludeMissing fun _achTransfers() = achTransfers

    /** The time the Proof of Authorization Request was created. */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** The time the Proof of Authorization Request is due. */
    @JsonProperty("due_on") @ExcludeMissing fun _dueOn() = dueOn

    /** The Proof of Authorization Request identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /**
     * A constant representing the object's type. For this resource it will always be
     * `proof_of_authorization_request`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    /** The time the Proof of Authorization Request was last updated. */
    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ProofOfAuthorizationRequest = apply {
        if (!validated) {
            achTransfers().forEach { it.validate() }
            createdAt()
            dueOn()
            id()
            type()
            updatedAt()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var achTransfers: JsonField<List<AchTransfer>> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dueOn: JsonField<OffsetDateTime> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(proofOfAuthorizationRequest: ProofOfAuthorizationRequest) = apply {
            achTransfers = proofOfAuthorizationRequest.achTransfers
            createdAt = proofOfAuthorizationRequest.createdAt
            dueOn = proofOfAuthorizationRequest.dueOn
            id = proofOfAuthorizationRequest.id
            type = proofOfAuthorizationRequest.type
            updatedAt = proofOfAuthorizationRequest.updatedAt
            additionalProperties = proofOfAuthorizationRequest.additionalProperties.toMutableMap()
        }

        /** The ACH Transfers associated with the request. */
        fun achTransfers(achTransfers: List<AchTransfer>) = achTransfers(JsonField.of(achTransfers))

        /** The ACH Transfers associated with the request. */
        fun achTransfers(achTransfers: JsonField<List<AchTransfer>>) = apply {
            this.achTransfers = achTransfers
        }

        /** The time the Proof of Authorization Request was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /** The time the Proof of Authorization Request was created. */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The time the Proof of Authorization Request is due. */
        fun dueOn(dueOn: OffsetDateTime) = dueOn(JsonField.of(dueOn))

        /** The time the Proof of Authorization Request is due. */
        fun dueOn(dueOn: JsonField<OffsetDateTime>) = apply { this.dueOn = dueOn }

        /** The Proof of Authorization Request identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Proof of Authorization Request identifier. */
        fun id(id: JsonField<String>) = apply { this.id = id }

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
                achTransfers.map { it.toImmutable() },
                createdAt,
                dueOn,
                id,
                type,
                updatedAt,
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
        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): AchTransfer = apply {
            if (!validated) {
                id()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
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

            fun build(): AchTransfer = AchTransfer(id, additionalProperties.toImmutable())
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

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val PROOF_OF_AUTHORIZATION_REQUEST = of("proof_of_authorization_request")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            PROOF_OF_AUTHORIZATION_REQUEST,
        }

        enum class Value {
            PROOF_OF_AUTHORIZATION_REQUEST,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PROOF_OF_AUTHORIZATION_REQUEST -> Value.PROOF_OF_AUTHORIZATION_REQUEST
                else -> Value._UNKNOWN
            }

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

        return /* spotless:off */ other is ProofOfAuthorizationRequest && achTransfers == other.achTransfers && createdAt == other.createdAt && dueOn == other.dueOn && id == other.id && type == other.type && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(achTransfers, createdAt, dueOn, id, type, updatedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ProofOfAuthorizationRequest{achTransfers=$achTransfers, createdAt=$createdAt, dueOn=$dueOn, id=$id, type=$type, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
