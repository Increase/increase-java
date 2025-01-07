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
import java.util.Optional

/**
 * Lockboxes are physical locations that can receive mail containing paper checks. Increase will
 * automatically create a Check Deposit for checks received this way.
 */
@NoAutoDetect
class Lockbox
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("account_id")
    @ExcludeMissing
    private val accountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("address")
    @ExcludeMissing
    private val address: JsonField<Address> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    private val idempotencyKey: JsonField<String> = JsonMissing.of(),
    @JsonProperty("recipient_name")
    @ExcludeMissing
    private val recipientName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The Lockbox identifier. */
    fun id(): String = id.getRequired("id")

    /** The identifier for the Account checks sent to this lockbox will be deposited into. */
    fun accountId(): String = accountId.getRequired("account_id")

    /** The mailing address for the Lockbox. */
    fun address(): Address = address.getRequired("address")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Lockbox was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The description you choose for the Lockbox. */
    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    fun idempotencyKey(): Optional<String> =
        Optional.ofNullable(idempotencyKey.getNullable("idempotency_key"))

    /** The recipient name you choose for the Lockbox. */
    fun recipientName(): Optional<String> =
        Optional.ofNullable(recipientName.getNullable("recipient_name"))

    /** This indicates if mail can be sent to this address. */
    fun status(): Status = status.getRequired("status")

    /** A constant representing the object's type. For this resource it will always be `lockbox`. */
    fun type(): Type = type.getRequired("type")

    /** The Lockbox identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The identifier for the Account checks sent to this lockbox will be deposited into. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

    /** The mailing address for the Lockbox. */
    @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<Address> = address

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Lockbox was created.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /** The description you choose for the Lockbox. */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    fun _idempotencyKey(): JsonField<String> = idempotencyKey

    /** The recipient name you choose for the Lockbox. */
    @JsonProperty("recipient_name")
    @ExcludeMissing
    fun _recipientName(): JsonField<String> = recipientName

    /** This indicates if mail can be sent to this address. */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /** A constant representing the object's type. For this resource it will always be `lockbox`. */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Lockbox = apply {
        if (!validated) {
            id()
            accountId()
            address().validate()
            createdAt()
            description()
            idempotencyKey()
            recipientName()
            status()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String>? = null
        private var accountId: JsonField<String>? = null
        private var address: JsonField<Address>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var description: JsonField<String>? = null
        private var idempotencyKey: JsonField<String>? = null
        private var recipientName: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(lockbox: Lockbox) = apply {
            id = lockbox.id
            accountId = lockbox.accountId
            address = lockbox.address
            createdAt = lockbox.createdAt
            description = lockbox.description
            idempotencyKey = lockbox.idempotencyKey
            recipientName = lockbox.recipientName
            status = lockbox.status
            type = lockbox.type
            additionalProperties = lockbox.additionalProperties.toMutableMap()
        }

        /** The Lockbox identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Lockbox identifier. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The identifier for the Account checks sent to this lockbox will be deposited into. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** The identifier for the Account checks sent to this lockbox will be deposited into. */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /** The mailing address for the Lockbox. */
        fun address(address: Address) = address(JsonField.of(address))

        /** The mailing address for the Lockbox. */
        fun address(address: JsonField<Address>) = apply { this.address = address }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Lockbox was
         * created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Lockbox was
         * created.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The description you choose for the Lockbox. */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** The description you choose for the Lockbox. */
        fun description(description: Optional<String>) = description(description.orElse(null))

        /** The description you choose for the Lockbox. */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: String?) =
            idempotencyKey(JsonField.ofNullable(idempotencyKey))

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: Optional<String>) =
            idempotencyKey(idempotencyKey.orElse(null))

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: JsonField<String>) = apply {
            this.idempotencyKey = idempotencyKey
        }

        /** The recipient name you choose for the Lockbox. */
        fun recipientName(recipientName: String?) =
            recipientName(JsonField.ofNullable(recipientName))

        /** The recipient name you choose for the Lockbox. */
        fun recipientName(recipientName: Optional<String>) =
            recipientName(recipientName.orElse(null))

        /** The recipient name you choose for the Lockbox. */
        fun recipientName(recipientName: JsonField<String>) = apply {
            this.recipientName = recipientName
        }

        /** This indicates if mail can be sent to this address. */
        fun status(status: Status) = status(JsonField.of(status))

        /** This indicates if mail can be sent to this address. */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * A constant representing the object's type. For this resource it will always be `lockbox`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be `lockbox`.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

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

        fun build(): Lockbox =
            Lockbox(
                checkNotNull(id) { "`id` is required but was not set" },
                checkNotNull(accountId) { "`accountId` is required but was not set" },
                checkNotNull(address) { "`address` is required but was not set" },
                checkNotNull(createdAt) { "`createdAt` is required but was not set" },
                checkNotNull(description) { "`description` is required but was not set" },
                checkNotNull(idempotencyKey) { "`idempotencyKey` is required but was not set" },
                checkNotNull(recipientName) { "`recipientName` is required but was not set" },
                checkNotNull(status) { "`status` is required but was not set" },
                checkNotNull(type) { "`type` is required but was not set" },
                additionalProperties.toImmutable(),
            )
    }

    /** The mailing address for the Lockbox. */
    @NoAutoDetect
    class Address
    @JsonCreator
    private constructor(
        @JsonProperty("city")
        @ExcludeMissing
        private val city: JsonField<String> = JsonMissing.of(),
        @JsonProperty("line1")
        @ExcludeMissing
        private val line1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("line2")
        @ExcludeMissing
        private val line2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("postal_code")
        @ExcludeMissing
        private val postalCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("recipient")
        @ExcludeMissing
        private val recipient: JsonField<String> = JsonMissing.of(),
        @JsonProperty("state")
        @ExcludeMissing
        private val state: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The city of the address. */
        fun city(): String = city.getRequired("city")

        /** The first line of the address. */
        fun line1(): String = line1.getRequired("line1")

        /** The second line of the address. */
        fun line2(): String = line2.getRequired("line2")

        /** The postal code of the address. */
        fun postalCode(): String = postalCode.getRequired("postal_code")

        /**
         * The recipient line of the address. This will include the recipient name you provide when
         * creating the address, as well as an ATTN suffix to help route the mail to your lockbox.
         * Mail senders must include this ATTN line to receive mail at this Lockbox.
         */
        fun recipient(): Optional<String> = Optional.ofNullable(recipient.getNullable("recipient"))

        /**
         * The two-letter United States Postal Service (USPS) abbreviation for the state of the
         * address.
         */
        fun state(): String = state.getRequired("state")

        /** The city of the address. */
        @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

        /** The first line of the address. */
        @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

        /** The second line of the address. */
        @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

        /** The postal code of the address. */
        @JsonProperty("postal_code")
        @ExcludeMissing
        fun _postalCode(): JsonField<String> = postalCode

        /**
         * The recipient line of the address. This will include the recipient name you provide when
         * creating the address, as well as an ATTN suffix to help route the mail to your lockbox.
         * Mail senders must include this ATTN line to receive mail at this Lockbox.
         */
        @JsonProperty("recipient") @ExcludeMissing fun _recipient(): JsonField<String> = recipient

        /**
         * The two-letter United States Postal Service (USPS) abbreviation for the state of the
         * address.
         */
        @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Address = apply {
            if (!validated) {
                city()
                line1()
                line2()
                postalCode()
                recipient()
                state()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var city: JsonField<String>? = null
            private var line1: JsonField<String>? = null
            private var line2: JsonField<String>? = null
            private var postalCode: JsonField<String>? = null
            private var recipient: JsonField<String>? = null
            private var state: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(address: Address) = apply {
                city = address.city
                line1 = address.line1
                line2 = address.line2
                postalCode = address.postalCode
                recipient = address.recipient
                state = address.state
                additionalProperties = address.additionalProperties.toMutableMap()
            }

            /** The city of the address. */
            fun city(city: String) = city(JsonField.of(city))

            /** The city of the address. */
            fun city(city: JsonField<String>) = apply { this.city = city }

            /** The first line of the address. */
            fun line1(line1: String) = line1(JsonField.of(line1))

            /** The first line of the address. */
            fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

            /** The second line of the address. */
            fun line2(line2: String) = line2(JsonField.of(line2))

            /** The second line of the address. */
            fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

            /** The postal code of the address. */
            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            /** The postal code of the address. */
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            /**
             * The recipient line of the address. This will include the recipient name you provide
             * when creating the address, as well as an ATTN suffix to help route the mail to your
             * lockbox. Mail senders must include this ATTN line to receive mail at this Lockbox.
             */
            fun recipient(recipient: String?) = recipient(JsonField.ofNullable(recipient))

            /**
             * The recipient line of the address. This will include the recipient name you provide
             * when creating the address, as well as an ATTN suffix to help route the mail to your
             * lockbox. Mail senders must include this ATTN line to receive mail at this Lockbox.
             */
            fun recipient(recipient: Optional<String>) = recipient(recipient.orElse(null))

            /**
             * The recipient line of the address. This will include the recipient name you provide
             * when creating the address, as well as an ATTN suffix to help route the mail to your
             * lockbox. Mail senders must include this ATTN line to receive mail at this Lockbox.
             */
            fun recipient(recipient: JsonField<String>) = apply { this.recipient = recipient }

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the state of the
             * address.
             */
            fun state(state: String) = state(JsonField.of(state))

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the state of the
             * address.
             */
            fun state(state: JsonField<String>) = apply { this.state = state }

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

            fun build(): Address =
                Address(
                    checkNotNull(city) { "`city` is required but was not set" },
                    checkNotNull(line1) { "`line1` is required but was not set" },
                    checkNotNull(line2) { "`line2` is required but was not set" },
                    checkNotNull(postalCode) { "`postalCode` is required but was not set" },
                    checkNotNull(recipient) { "`recipient` is required but was not set" },
                    checkNotNull(state) { "`state` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Address && city == other.city && line1 == other.line1 && line2 == other.line2 && postalCode == other.postalCode && recipient == other.recipient && state == other.state && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(city, line1, line2, postalCode, recipient, state, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Address{city=$city, line1=$line1, line2=$line2, postalCode=$postalCode, recipient=$recipient, state=$state, additionalProperties=$additionalProperties}"
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ACTIVE = of("active")

            @JvmField val INACTIVE = of("inactive")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            ACTIVE,
            INACTIVE,
        }

        enum class Value {
            ACTIVE,
            INACTIVE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACTIVE -> Value.ACTIVE
                INACTIVE -> Value.INACTIVE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACTIVE -> Known.ACTIVE
                INACTIVE -> Known.INACTIVE
                else -> throw IncreaseInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val LOCKBOX = of("lockbox")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            LOCKBOX,
        }

        enum class Value {
            LOCKBOX,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                LOCKBOX -> Value.LOCKBOX
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                LOCKBOX -> Known.LOCKBOX
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

        return /* spotless:off */ other is Lockbox && id == other.id && accountId == other.accountId && address == other.address && createdAt == other.createdAt && description == other.description && idempotencyKey == other.idempotencyKey && recipientName == other.recipientName && status == other.status && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, accountId, address, createdAt, description, idempotencyKey, recipientName, status, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Lockbox{id=$id, accountId=$accountId, address=$address, createdAt=$createdAt, description=$description, idempotencyKey=$idempotencyKey, recipientName=$recipientName, status=$status, type=$type, additionalProperties=$additionalProperties}"
}
