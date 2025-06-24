// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.documents

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.checkRequired
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Increase generates certain documents / forms automatically for your application; they can be
 * listed here.
 */
class Document
private constructor(
    private val id: JsonField<String>,
    private val accountVerificationLetter: JsonField<AccountVerificationLetter>,
    private val category: JsonField<Category>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val entityId: JsonField<String>,
    private val fileId: JsonField<String>,
    private val fundingInstructions: JsonField<FundingInstructions>,
    private val idempotencyKey: JsonField<String>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_verification_letter")
        @ExcludeMissing
        accountVerificationLetter: JsonField<AccountVerificationLetter> = JsonMissing.of(),
        @JsonProperty("category") @ExcludeMissing category: JsonField<Category> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("entity_id") @ExcludeMissing entityId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("file_id") @ExcludeMissing fileId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("funding_instructions")
        @ExcludeMissing
        fundingInstructions: JsonField<FundingInstructions> = JsonMissing.of(),
        @JsonProperty("idempotency_key")
        @ExcludeMissing
        idempotencyKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(
        id,
        accountVerificationLetter,
        category,
        createdAt,
        entityId,
        fileId,
        fundingInstructions,
        idempotencyKey,
        type,
        mutableMapOf(),
    )

    /**
     * The Document identifier.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Properties of an account verification letter document.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountVerificationLetter(): Optional<AccountVerificationLetter> =
        accountVerificationLetter.getOptional("account_verification_letter")

    /**
     * The type of document.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun category(): Category = category.getRequired("category")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Document was
     * created.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The identifier of the Entity the document was generated for.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun entityId(): Optional<String> = entityId.getOptional("entity_id")

    /**
     * The identifier of the File containing the Document's contents.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fileId(): String = fileId.getRequired("file_id")

    /**
     * Properties of a funding instructions document.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fundingInstructions(): Optional<FundingInstructions> =
        fundingInstructions.getOptional("funding_instructions")

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun idempotencyKey(): Optional<String> = idempotencyKey.getOptional("idempotency_key")

    /**
     * A constant representing the object's type. For this resource it will always be `document`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [accountVerificationLetter].
     *
     * Unlike [accountVerificationLetter], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("account_verification_letter")
    @ExcludeMissing
    fun _accountVerificationLetter(): JsonField<AccountVerificationLetter> =
        accountVerificationLetter

    /**
     * Returns the raw JSON value of [category].
     *
     * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<Category> = category

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [entityId].
     *
     * Unlike [entityId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("entity_id") @ExcludeMissing fun _entityId(): JsonField<String> = entityId

    /**
     * Returns the raw JSON value of [fileId].
     *
     * Unlike [fileId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("file_id") @ExcludeMissing fun _fileId(): JsonField<String> = fileId

    /**
     * Returns the raw JSON value of [fundingInstructions].
     *
     * Unlike [fundingInstructions], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("funding_instructions")
    @ExcludeMissing
    fun _fundingInstructions(): JsonField<FundingInstructions> = fundingInstructions

    /**
     * Returns the raw JSON value of [idempotencyKey].
     *
     * Unlike [idempotencyKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    fun _idempotencyKey(): JsonField<String> = idempotencyKey

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
         * Returns a mutable builder for constructing an instance of [Document].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .accountVerificationLetter()
         * .category()
         * .createdAt()
         * .entityId()
         * .fileId()
         * .fundingInstructions()
         * .idempotencyKey()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Document]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var accountVerificationLetter: JsonField<AccountVerificationLetter>? = null
        private var category: JsonField<Category>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var entityId: JsonField<String>? = null
        private var fileId: JsonField<String>? = null
        private var fundingInstructions: JsonField<FundingInstructions>? = null
        private var idempotencyKey: JsonField<String>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(document: Document) = apply {
            id = document.id
            accountVerificationLetter = document.accountVerificationLetter
            category = document.category
            createdAt = document.createdAt
            entityId = document.entityId
            fileId = document.fileId
            fundingInstructions = document.fundingInstructions
            idempotencyKey = document.idempotencyKey
            type = document.type
            additionalProperties = document.additionalProperties.toMutableMap()
        }

        /** The Document identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Properties of an account verification letter document. */
        fun accountVerificationLetter(accountVerificationLetter: AccountVerificationLetter?) =
            accountVerificationLetter(JsonField.ofNullable(accountVerificationLetter))

        /**
         * Alias for calling [Builder.accountVerificationLetter] with
         * `accountVerificationLetter.orElse(null)`.
         */
        fun accountVerificationLetter(
            accountVerificationLetter: Optional<AccountVerificationLetter>
        ) = accountVerificationLetter(accountVerificationLetter.getOrNull())

        /**
         * Sets [Builder.accountVerificationLetter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountVerificationLetter] with a well-typed
         * [AccountVerificationLetter] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun accountVerificationLetter(
            accountVerificationLetter: JsonField<AccountVerificationLetter>
        ) = apply { this.accountVerificationLetter = accountVerificationLetter }

        /** The type of document. */
        fun category(category: Category) = category(JsonField.of(category))

        /**
         * Sets [Builder.category] to an arbitrary JSON value.
         *
         * You should usually call [Builder.category] with a well-typed [Category] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun category(category: JsonField<Category>) = apply { this.category = category }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Document was
         * created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The identifier of the Entity the document was generated for. */
        fun entityId(entityId: String?) = entityId(JsonField.ofNullable(entityId))

        /** Alias for calling [Builder.entityId] with `entityId.orElse(null)`. */
        fun entityId(entityId: Optional<String>) = entityId(entityId.getOrNull())

        /**
         * Sets [Builder.entityId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entityId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun entityId(entityId: JsonField<String>) = apply { this.entityId = entityId }

        /** The identifier of the File containing the Document's contents. */
        fun fileId(fileId: String) = fileId(JsonField.of(fileId))

        /**
         * Sets [Builder.fileId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fileId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

        /** Properties of a funding instructions document. */
        fun fundingInstructions(fundingInstructions: FundingInstructions?) =
            fundingInstructions(JsonField.ofNullable(fundingInstructions))

        /**
         * Alias for calling [Builder.fundingInstructions] with `fundingInstructions.orElse(null)`.
         */
        fun fundingInstructions(fundingInstructions: Optional<FundingInstructions>) =
            fundingInstructions(fundingInstructions.getOrNull())

        /**
         * Sets [Builder.fundingInstructions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fundingInstructions] with a well-typed
         * [FundingInstructions] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun fundingInstructions(fundingInstructions: JsonField<FundingInstructions>) = apply {
            this.fundingInstructions = fundingInstructions
        }

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: String?) =
            idempotencyKey(JsonField.ofNullable(idempotencyKey))

        /** Alias for calling [Builder.idempotencyKey] with `idempotencyKey.orElse(null)`. */
        fun idempotencyKey(idempotencyKey: Optional<String>) =
            idempotencyKey(idempotencyKey.getOrNull())

        /**
         * Sets [Builder.idempotencyKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idempotencyKey] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun idempotencyKey(idempotencyKey: JsonField<String>) = apply {
            this.idempotencyKey = idempotencyKey
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `document`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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

        /**
         * Returns an immutable instance of [Document].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .accountVerificationLetter()
         * .category()
         * .createdAt()
         * .entityId()
         * .fileId()
         * .fundingInstructions()
         * .idempotencyKey()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Document =
            Document(
                checkRequired("id", id),
                checkRequired("accountVerificationLetter", accountVerificationLetter),
                checkRequired("category", category),
                checkRequired("createdAt", createdAt),
                checkRequired("entityId", entityId),
                checkRequired("fileId", fileId),
                checkRequired("fundingInstructions", fundingInstructions),
                checkRequired("idempotencyKey", idempotencyKey),
                checkRequired("type", type),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Document = apply {
        if (validated) {
            return@apply
        }

        id()
        accountVerificationLetter().ifPresent { it.validate() }
        category().validate()
        createdAt()
        entityId()
        fileId()
        fundingInstructions().ifPresent { it.validate() }
        idempotencyKey()
        type().validate()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (accountVerificationLetter.asKnown().getOrNull()?.validity() ?: 0) +
            (category.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (entityId.asKnown().isPresent) 1 else 0) +
            (if (fileId.asKnown().isPresent) 1 else 0) +
            (fundingInstructions.asKnown().getOrNull()?.validity() ?: 0) +
            (if (idempotencyKey.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

    /** Properties of an account verification letter document. */
    class AccountVerificationLetter
    private constructor(
        private val accountNumberId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("account_number_id")
            @ExcludeMissing
            accountNumberId: JsonField<String> = JsonMissing.of()
        ) : this(accountNumberId, mutableMapOf())

        /**
         * The identifier of the Account Number the document was generated for.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountNumberId(): String = accountNumberId.getRequired("account_number_id")

        /**
         * Returns the raw JSON value of [accountNumberId].
         *
         * Unlike [accountNumberId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("account_number_id")
        @ExcludeMissing
        fun _accountNumberId(): JsonField<String> = accountNumberId

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
             * [AccountVerificationLetter].
             *
             * The following fields are required:
             * ```java
             * .accountNumberId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AccountVerificationLetter]. */
        class Builder internal constructor() {

            private var accountNumberId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(accountVerificationLetter: AccountVerificationLetter) = apply {
                accountNumberId = accountVerificationLetter.accountNumberId
                additionalProperties = accountVerificationLetter.additionalProperties.toMutableMap()
            }

            /** The identifier of the Account Number the document was generated for. */
            fun accountNumberId(accountNumberId: String) =
                accountNumberId(JsonField.of(accountNumberId))

            /**
             * Sets [Builder.accountNumberId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountNumberId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountNumberId(accountNumberId: JsonField<String>) = apply {
                this.accountNumberId = accountNumberId
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
             * Returns an immutable instance of [AccountVerificationLetter].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .accountNumberId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): AccountVerificationLetter =
                AccountVerificationLetter(
                    checkRequired("accountNumberId", accountNumberId),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AccountVerificationLetter = apply {
            if (validated) {
                return@apply
            }

            accountNumberId()
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
        internal fun validity(): Int = (if (accountNumberId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AccountVerificationLetter && accountNumberId == other.accountNumberId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountNumberId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AccountVerificationLetter{accountNumberId=$accountNumberId, additionalProperties=$additionalProperties}"
    }

    /** The type of document. */
    class Category @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            /** Internal Revenue Service Form 1099-INT. */
            @JvmField val FORM_1099_INT = of("form_1099_int")

            /** Internal Revenue Service Form 1099-MISC. */
            @JvmField val FORM_1099_MISC = of("form_1099_misc")

            /**
             * A document submitted in response to a proof of authorization request for an ACH
             * transfer.
             */
            @JvmField val PROOF_OF_AUTHORIZATION = of("proof_of_authorization")

            /**
             * Company information, such a policies or procedures, typically submitted during our
             * due diligence process.
             */
            @JvmField val COMPANY_INFORMATION = of("company_information")

            /** An account verification letter. */
            @JvmField val ACCOUNT_VERIFICATION_LETTER = of("account_verification_letter")

            /** Funding instructions. */
            @JvmField val FUNDING_INSTRUCTIONS = of("funding_instructions")

            @JvmStatic fun of(value: String) = Category(JsonField.of(value))
        }

        /** An enum containing [Category]'s known values. */
        enum class Known {
            /** Internal Revenue Service Form 1099-INT. */
            FORM_1099_INT,
            /** Internal Revenue Service Form 1099-MISC. */
            FORM_1099_MISC,
            /**
             * A document submitted in response to a proof of authorization request for an ACH
             * transfer.
             */
            PROOF_OF_AUTHORIZATION,
            /**
             * Company information, such a policies or procedures, typically submitted during our
             * due diligence process.
             */
            COMPANY_INFORMATION,
            /** An account verification letter. */
            ACCOUNT_VERIFICATION_LETTER,
            /** Funding instructions. */
            FUNDING_INSTRUCTIONS,
        }

        /**
         * An enum containing [Category]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Category] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** Internal Revenue Service Form 1099-INT. */
            FORM_1099_INT,
            /** Internal Revenue Service Form 1099-MISC. */
            FORM_1099_MISC,
            /**
             * A document submitted in response to a proof of authorization request for an ACH
             * transfer.
             */
            PROOF_OF_AUTHORIZATION,
            /**
             * Company information, such a policies or procedures, typically submitted during our
             * due diligence process.
             */
            COMPANY_INFORMATION,
            /** An account verification letter. */
            ACCOUNT_VERIFICATION_LETTER,
            /** Funding instructions. */
            FUNDING_INSTRUCTIONS,
            /** An enum member indicating that [Category] was instantiated with an unknown value. */
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
                FORM_1099_INT -> Value.FORM_1099_INT
                FORM_1099_MISC -> Value.FORM_1099_MISC
                PROOF_OF_AUTHORIZATION -> Value.PROOF_OF_AUTHORIZATION
                COMPANY_INFORMATION -> Value.COMPANY_INFORMATION
                ACCOUNT_VERIFICATION_LETTER -> Value.ACCOUNT_VERIFICATION_LETTER
                FUNDING_INSTRUCTIONS -> Value.FUNDING_INSTRUCTIONS
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
                FORM_1099_INT -> Known.FORM_1099_INT
                FORM_1099_MISC -> Known.FORM_1099_MISC
                PROOF_OF_AUTHORIZATION -> Known.PROOF_OF_AUTHORIZATION
                COMPANY_INFORMATION -> Known.COMPANY_INFORMATION
                ACCOUNT_VERIFICATION_LETTER -> Known.ACCOUNT_VERIFICATION_LETTER
                FUNDING_INSTRUCTIONS -> Known.FUNDING_INSTRUCTIONS
                else -> throw IncreaseInvalidDataException("Unknown Category: $value")
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

        fun validate(): Category = apply {
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

            return /* spotless:off */ other is Category && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Properties of a funding instructions document. */
    class FundingInstructions
    private constructor(
        private val accountNumberId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("account_number_id")
            @ExcludeMissing
            accountNumberId: JsonField<String> = JsonMissing.of()
        ) : this(accountNumberId, mutableMapOf())

        /**
         * The identifier of the Account Number the document was generated for.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountNumberId(): String = accountNumberId.getRequired("account_number_id")

        /**
         * Returns the raw JSON value of [accountNumberId].
         *
         * Unlike [accountNumberId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("account_number_id")
        @ExcludeMissing
        fun _accountNumberId(): JsonField<String> = accountNumberId

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
             * Returns a mutable builder for constructing an instance of [FundingInstructions].
             *
             * The following fields are required:
             * ```java
             * .accountNumberId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [FundingInstructions]. */
        class Builder internal constructor() {

            private var accountNumberId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(fundingInstructions: FundingInstructions) = apply {
                accountNumberId = fundingInstructions.accountNumberId
                additionalProperties = fundingInstructions.additionalProperties.toMutableMap()
            }

            /** The identifier of the Account Number the document was generated for. */
            fun accountNumberId(accountNumberId: String) =
                accountNumberId(JsonField.of(accountNumberId))

            /**
             * Sets [Builder.accountNumberId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountNumberId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountNumberId(accountNumberId: JsonField<String>) = apply {
                this.accountNumberId = accountNumberId
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
             * Returns an immutable instance of [FundingInstructions].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .accountNumberId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): FundingInstructions =
                FundingInstructions(
                    checkRequired("accountNumberId", accountNumberId),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): FundingInstructions = apply {
            if (validated) {
                return@apply
            }

            accountNumberId()
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
        internal fun validity(): Int = (if (accountNumberId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is FundingInstructions && accountNumberId == other.accountNumberId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountNumberId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "FundingInstructions{accountNumberId=$accountNumberId, additionalProperties=$additionalProperties}"
    }

    /**
     * A constant representing the object's type. For this resource it will always be `document`.
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

            @JvmField val DOCUMENT = of("document")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            DOCUMENT
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
            DOCUMENT,
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
                DOCUMENT -> Value.DOCUMENT
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
                DOCUMENT -> Known.DOCUMENT
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
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

        fun validate(): Type = apply {
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

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Document && id == other.id && accountVerificationLetter == other.accountVerificationLetter && category == other.category && createdAt == other.createdAt && entityId == other.entityId && fileId == other.fileId && fundingInstructions == other.fundingInstructions && idempotencyKey == other.idempotencyKey && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, accountVerificationLetter, category, createdAt, entityId, fileId, fundingInstructions, idempotencyKey, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Document{id=$id, accountVerificationLetter=$accountVerificationLetter, category=$category, createdAt=$createdAt, entityId=$entityId, fileId=$fileId, fundingInstructions=$fundingInstructions, idempotencyKey=$idempotencyKey, type=$type, additionalProperties=$additionalProperties}"
}
