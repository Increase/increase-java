// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/**
 * Lockboxes are physical locations that can receive mail containing paper checks. Increase will
 * automatically create a Check Deposit for checks received this way.
 */
@JsonDeserialize(builder = Lockbox.Builder::class)
@NoAutoDetect
class Lockbox
private constructor(
    private val accountId: JsonField<String>,
    private val address: JsonField<Address>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val description: JsonField<String>,
    private val id: JsonField<String>,
    private val idempotencyKey: JsonField<String>,
    private val recipientName: JsonField<String>,
    private val status: JsonField<Status>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

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

    /** The Lockbox identifier. */
    fun id(): String = id.getRequired("id")

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

    /** The identifier for the Account checks sent to this lockbox will be deposited into. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

    /** The mailing address for the Lockbox. */
    @JsonProperty("address") @ExcludeMissing fun _address() = address

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Lockbox was created.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** The description you choose for the Lockbox. */
    @JsonProperty("description") @ExcludeMissing fun _description() = description

    /** The Lockbox identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    @JsonProperty("idempotency_key") @ExcludeMissing fun _idempotencyKey() = idempotencyKey

    /** The recipient name you choose for the Lockbox. */
    @JsonProperty("recipient_name") @ExcludeMissing fun _recipientName() = recipientName

    /** This indicates if mail can be sent to this address. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /** A constant representing the object's type. For this resource it will always be `lockbox`. */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Lockbox = apply {
        if (!validated) {
            accountId()
            address().validate()
            createdAt()
            description()
            id()
            idempotencyKey()
            recipientName()
            status()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Lockbox &&
            this.accountId == other.accountId &&
            this.address == other.address &&
            this.createdAt == other.createdAt &&
            this.description == other.description &&
            this.id == other.id &&
            this.idempotencyKey == other.idempotencyKey &&
            this.recipientName == other.recipientName &&
            this.status == other.status &&
            this.type == other.type &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    accountId,
                    address,
                    createdAt,
                    description,
                    id,
                    idempotencyKey,
                    recipientName,
                    status,
                    type,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Lockbox{accountId=$accountId, address=$address, createdAt=$createdAt, description=$description, id=$id, idempotencyKey=$idempotencyKey, recipientName=$recipientName, status=$status, type=$type, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var accountId: JsonField<String> = JsonMissing.of()
        private var address: JsonField<Address> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var idempotencyKey: JsonField<String> = JsonMissing.of()
        private var recipientName: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(lockbox: Lockbox) = apply {
            this.accountId = lockbox.accountId
            this.address = lockbox.address
            this.createdAt = lockbox.createdAt
            this.description = lockbox.description
            this.id = lockbox.id
            this.idempotencyKey = lockbox.idempotencyKey
            this.recipientName = lockbox.recipientName
            this.status = lockbox.status
            this.type = lockbox.type
            additionalProperties(lockbox.additionalProperties)
        }

        /** The identifier for the Account checks sent to this lockbox will be deposited into. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** The identifier for the Account checks sent to this lockbox will be deposited into. */
        @JsonProperty("account_id")
        @ExcludeMissing
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /** The mailing address for the Lockbox. */
        fun address(address: Address) = address(JsonField.of(address))

        /** The mailing address for the Lockbox. */
        @JsonProperty("address")
        @ExcludeMissing
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
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The description you choose for the Lockbox. */
        fun description(description: String) = description(JsonField.of(description))

        /** The description you choose for the Lockbox. */
        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** The Lockbox identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Lockbox identifier. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: String) = idempotencyKey(JsonField.of(idempotencyKey))

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        @JsonProperty("idempotency_key")
        @ExcludeMissing
        fun idempotencyKey(idempotencyKey: JsonField<String>) = apply {
            this.idempotencyKey = idempotencyKey
        }

        /** The recipient name you choose for the Lockbox. */
        fun recipientName(recipientName: String) = recipientName(JsonField.of(recipientName))

        /** The recipient name you choose for the Lockbox. */
        @JsonProperty("recipient_name")
        @ExcludeMissing
        fun recipientName(recipientName: JsonField<String>) = apply {
            this.recipientName = recipientName
        }

        /** This indicates if mail can be sent to this address. */
        fun status(status: Status) = status(JsonField.of(status))

        /** This indicates if mail can be sent to this address. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * A constant representing the object's type. For this resource it will always be `lockbox`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be `lockbox`.
         */
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): Lockbox =
            Lockbox(
                accountId,
                address,
                createdAt,
                description,
                id,
                idempotencyKey,
                recipientName,
                status,
                type,
                additionalProperties.toUnmodifiable(),
            )
    }

    /** The mailing address for the Lockbox. */
    @JsonDeserialize(builder = Address.Builder::class)
    @NoAutoDetect
    class Address
    private constructor(
        private val city: JsonField<String>,
        private val line1: JsonField<String>,
        private val line2: JsonField<String>,
        private val postalCode: JsonField<String>,
        private val recipient: JsonField<String>,
        private val state: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

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
        @JsonProperty("city") @ExcludeMissing fun _city() = city

        /** The first line of the address. */
        @JsonProperty("line1") @ExcludeMissing fun _line1() = line1

        /** The second line of the address. */
        @JsonProperty("line2") @ExcludeMissing fun _line2() = line2

        /** The postal code of the address. */
        @JsonProperty("postal_code") @ExcludeMissing fun _postalCode() = postalCode

        /**
         * The recipient line of the address. This will include the recipient name you provide when
         * creating the address, as well as an ATTN suffix to help route the mail to your lockbox.
         * Mail senders must include this ATTN line to receive mail at this Lockbox.
         */
        @JsonProperty("recipient") @ExcludeMissing fun _recipient() = recipient

        /**
         * The two-letter United States Postal Service (USPS) abbreviation for the state of the
         * address.
         */
        @JsonProperty("state") @ExcludeMissing fun _state() = state

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Address &&
                this.city == other.city &&
                this.line1 == other.line1 &&
                this.line2 == other.line2 &&
                this.postalCode == other.postalCode &&
                this.recipient == other.recipient &&
                this.state == other.state &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        city,
                        line1,
                        line2,
                        postalCode,
                        recipient,
                        state,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Address{city=$city, line1=$line1, line2=$line2, postalCode=$postalCode, recipient=$recipient, state=$state, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var city: JsonField<String> = JsonMissing.of()
            private var line1: JsonField<String> = JsonMissing.of()
            private var line2: JsonField<String> = JsonMissing.of()
            private var postalCode: JsonField<String> = JsonMissing.of()
            private var recipient: JsonField<String> = JsonMissing.of()
            private var state: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(address: Address) = apply {
                this.city = address.city
                this.line1 = address.line1
                this.line2 = address.line2
                this.postalCode = address.postalCode
                this.recipient = address.recipient
                this.state = address.state
                additionalProperties(address.additionalProperties)
            }

            /** The city of the address. */
            fun city(city: String) = city(JsonField.of(city))

            /** The city of the address. */
            @JsonProperty("city")
            @ExcludeMissing
            fun city(city: JsonField<String>) = apply { this.city = city }

            /** The first line of the address. */
            fun line1(line1: String) = line1(JsonField.of(line1))

            /** The first line of the address. */
            @JsonProperty("line1")
            @ExcludeMissing
            fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

            /** The second line of the address. */
            fun line2(line2: String) = line2(JsonField.of(line2))

            /** The second line of the address. */
            @JsonProperty("line2")
            @ExcludeMissing
            fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

            /** The postal code of the address. */
            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            /** The postal code of the address. */
            @JsonProperty("postal_code")
            @ExcludeMissing
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            /**
             * The recipient line of the address. This will include the recipient name you provide
             * when creating the address, as well as an ATTN suffix to help route the mail to your
             * lockbox. Mail senders must include this ATTN line to receive mail at this Lockbox.
             */
            fun recipient(recipient: String) = recipient(JsonField.of(recipient))

            /**
             * The recipient line of the address. This will include the recipient name you provide
             * when creating the address, as well as an ATTN suffix to help route the mail to your
             * lockbox. Mail senders must include this ATTN line to receive mail at this Lockbox.
             */
            @JsonProperty("recipient")
            @ExcludeMissing
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
            @JsonProperty("state")
            @ExcludeMissing
            fun state(state: JsonField<String>) = apply { this.state = state }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Address =
                Address(
                    city,
                    line1,
                    line2,
                    postalCode,
                    recipient,
                    state,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val ACTIVE = Status(JsonField.of("active"))

            @JvmField val INACTIVE = Status(JsonField.of("inactive"))

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
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Type && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val LOCKBOX = Type(JsonField.of("lockbox"))

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
    }
}
