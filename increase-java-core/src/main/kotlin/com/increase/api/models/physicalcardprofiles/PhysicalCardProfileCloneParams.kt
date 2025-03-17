// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.physicalcardprofiles

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.Params
import com.increase.api.core.checkRequired
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.util.Objects
import java.util.Optional

/** Clone a Physical Card Profile */
class PhysicalCardProfileCloneParams
private constructor(
    private val physicalCardProfileId: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The identifier of the Physical Card Profile to clone. */
    fun physicalCardProfileId(): String = physicalCardProfileId

    /**
     * The identifier of the File containing the physical card's carrier image.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun carrierImageFileId(): Optional<String> = body.carrierImageFileId()

    /**
     * A phone number the user can contact to receive support for their card.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contactPhone(): Optional<String> = body.contactPhone()

    /**
     * A description you can use to identify the Card Profile.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * The identifier of the File containing the physical card's front image.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun frontImageFileId(): Optional<String> = body.frontImageFileId()

    /**
     * Text printed on the front of the card. Reach out to
     * [support@increase.com](mailto:support@increase.com) for more information.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun frontText(): Optional<FrontText> = body.frontText()

    /**
     * Returns the raw JSON value of [carrierImageFileId].
     *
     * Unlike [carrierImageFileId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _carrierImageFileId(): JsonField<String> = body._carrierImageFileId()

    /**
     * Returns the raw JSON value of [contactPhone].
     *
     * Unlike [contactPhone], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _contactPhone(): JsonField<String> = body._contactPhone()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [frontImageFileId].
     *
     * Unlike [frontImageFileId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _frontImageFileId(): JsonField<String> = body._frontImageFileId()

    /**
     * Returns the raw JSON value of [frontText].
     *
     * Unlike [frontText], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _frontText(): JsonField<FrontText> = body._frontText()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> physicalCardProfileId
            else -> ""
        }
    }

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("carrier_image_file_id")
        @ExcludeMissing
        private val carrierImageFileId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("contact_phone")
        @ExcludeMissing
        private val contactPhone: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("front_image_file_id")
        @ExcludeMissing
        private val frontImageFileId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("front_text")
        @ExcludeMissing
        private val frontText: JsonField<FrontText> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The identifier of the File containing the physical card's carrier image.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun carrierImageFileId(): Optional<String> =
            Optional.ofNullable(carrierImageFileId.getNullable("carrier_image_file_id"))

        /**
         * A phone number the user can contact to receive support for their card.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun contactPhone(): Optional<String> =
            Optional.ofNullable(contactPhone.getNullable("contact_phone"))

        /**
         * A description you can use to identify the Card Profile.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        /**
         * The identifier of the File containing the physical card's front image.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun frontImageFileId(): Optional<String> =
            Optional.ofNullable(frontImageFileId.getNullable("front_image_file_id"))

        /**
         * Text printed on the front of the card. Reach out to
         * [support@increase.com](mailto:support@increase.com) for more information.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun frontText(): Optional<FrontText> =
            Optional.ofNullable(frontText.getNullable("front_text"))

        /**
         * Returns the raw JSON value of [carrierImageFileId].
         *
         * Unlike [carrierImageFileId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("carrier_image_file_id")
        @ExcludeMissing
        fun _carrierImageFileId(): JsonField<String> = carrierImageFileId

        /**
         * Returns the raw JSON value of [contactPhone].
         *
         * Unlike [contactPhone], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("contact_phone")
        @ExcludeMissing
        fun _contactPhone(): JsonField<String> = contactPhone

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [frontImageFileId].
         *
         * Unlike [frontImageFileId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("front_image_file_id")
        @ExcludeMissing
        fun _frontImageFileId(): JsonField<String> = frontImageFileId

        /**
         * Returns the raw JSON value of [frontText].
         *
         * Unlike [frontText], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("front_text")
        @ExcludeMissing
        fun _frontText(): JsonField<FrontText> = frontText

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            carrierImageFileId()
            contactPhone()
            description()
            frontImageFileId()
            frontText().ifPresent { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var carrierImageFileId: JsonField<String> = JsonMissing.of()
            private var contactPhone: JsonField<String> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var frontImageFileId: JsonField<String> = JsonMissing.of()
            private var frontText: JsonField<FrontText> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                carrierImageFileId = body.carrierImageFileId
                contactPhone = body.contactPhone
                description = body.description
                frontImageFileId = body.frontImageFileId
                frontText = body.frontText
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The identifier of the File containing the physical card's carrier image. */
            fun carrierImageFileId(carrierImageFileId: String) =
                carrierImageFileId(JsonField.of(carrierImageFileId))

            /**
             * Sets [Builder.carrierImageFileId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.carrierImageFileId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun carrierImageFileId(carrierImageFileId: JsonField<String>) = apply {
                this.carrierImageFileId = carrierImageFileId
            }

            /** A phone number the user can contact to receive support for their card. */
            fun contactPhone(contactPhone: String) = contactPhone(JsonField.of(contactPhone))

            /**
             * Sets [Builder.contactPhone] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contactPhone] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contactPhone(contactPhone: JsonField<String>) = apply {
                this.contactPhone = contactPhone
            }

            /** A description you can use to identify the Card Profile. */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** The identifier of the File containing the physical card's front image. */
            fun frontImageFileId(frontImageFileId: String) =
                frontImageFileId(JsonField.of(frontImageFileId))

            /**
             * Sets [Builder.frontImageFileId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.frontImageFileId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun frontImageFileId(frontImageFileId: JsonField<String>) = apply {
                this.frontImageFileId = frontImageFileId
            }

            /**
             * Text printed on the front of the card. Reach out to
             * [support@increase.com](mailto:support@increase.com) for more information.
             */
            fun frontText(frontText: FrontText) = frontText(JsonField.of(frontText))

            /**
             * Sets [Builder.frontText] to an arbitrary JSON value.
             *
             * You should usually call [Builder.frontText] with a well-typed [FrontText] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun frontText(frontText: JsonField<FrontText>) = apply { this.frontText = frontText }

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
                    carrierImageFileId,
                    contactPhone,
                    description,
                    frontImageFileId,
                    frontText,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && carrierImageFileId == other.carrierImageFileId && contactPhone == other.contactPhone && description == other.description && frontImageFileId == other.frontImageFileId && frontText == other.frontText && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(carrierImageFileId, contactPhone, description, frontImageFileId, frontText, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{carrierImageFileId=$carrierImageFileId, contactPhone=$contactPhone, description=$description, frontImageFileId=$frontImageFileId, frontText=$frontText, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PhysicalCardProfileCloneParams].
         *
         * The following fields are required:
         * ```java
         * .physicalCardProfileId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PhysicalCardProfileCloneParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var physicalCardProfileId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(physicalCardProfileCloneParams: PhysicalCardProfileCloneParams) = apply {
            physicalCardProfileId = physicalCardProfileCloneParams.physicalCardProfileId
            body = physicalCardProfileCloneParams.body.toBuilder()
            additionalHeaders = physicalCardProfileCloneParams.additionalHeaders.toBuilder()
            additionalQueryParams = physicalCardProfileCloneParams.additionalQueryParams.toBuilder()
        }

        /** The identifier of the Physical Card Profile to clone. */
        fun physicalCardProfileId(physicalCardProfileId: String) = apply {
            this.physicalCardProfileId = physicalCardProfileId
        }

        /** The identifier of the File containing the physical card's carrier image. */
        fun carrierImageFileId(carrierImageFileId: String) = apply {
            body.carrierImageFileId(carrierImageFileId)
        }

        /**
         * Sets [Builder.carrierImageFileId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.carrierImageFileId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun carrierImageFileId(carrierImageFileId: JsonField<String>) = apply {
            body.carrierImageFileId(carrierImageFileId)
        }

        /** A phone number the user can contact to receive support for their card. */
        fun contactPhone(contactPhone: String) = apply { body.contactPhone(contactPhone) }

        /**
         * Sets [Builder.contactPhone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contactPhone] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contactPhone(contactPhone: JsonField<String>) = apply {
            body.contactPhone(contactPhone)
        }

        /** A description you can use to identify the Card Profile. */
        fun description(description: String) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /** The identifier of the File containing the physical card's front image. */
        fun frontImageFileId(frontImageFileId: String) = apply {
            body.frontImageFileId(frontImageFileId)
        }

        /**
         * Sets [Builder.frontImageFileId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.frontImageFileId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun frontImageFileId(frontImageFileId: JsonField<String>) = apply {
            body.frontImageFileId(frontImageFileId)
        }

        /**
         * Text printed on the front of the card. Reach out to
         * [support@increase.com](mailto:support@increase.com) for more information.
         */
        fun frontText(frontText: FrontText) = apply { body.frontText(frontText) }

        /**
         * Sets [Builder.frontText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.frontText] with a well-typed [FrontText] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun frontText(frontText: JsonField<FrontText>) = apply { body.frontText(frontText) }

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
         * Returns an immutable instance of [PhysicalCardProfileCloneParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .physicalCardProfileId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PhysicalCardProfileCloneParams =
            PhysicalCardProfileCloneParams(
                checkRequired("physicalCardProfileId", physicalCardProfileId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /**
     * Text printed on the front of the card. Reach out to
     * [support@increase.com](mailto:support@increase.com) for more information.
     */
    @NoAutoDetect
    class FrontText
    @JsonCreator
    private constructor(
        @JsonProperty("line1")
        @ExcludeMissing
        private val line1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("line2")
        @ExcludeMissing
        private val line2: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The first line of text on the front of the card.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun line1(): String = line1.getRequired("line1")

        /**
         * The second line of text on the front of the card. Providing a second line moves the first
         * line slightly higher and prints the second line in the spot where the first line would
         * have otherwise been printed.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun line2(): Optional<String> = Optional.ofNullable(line2.getNullable("line2"))

        /**
         * Returns the raw JSON value of [line1].
         *
         * Unlike [line1], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

        /**
         * Returns the raw JSON value of [line2].
         *
         * Unlike [line2], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): FrontText = apply {
            if (validated) {
                return@apply
            }

            line1()
            line2()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [FrontText].
             *
             * The following fields are required:
             * ```java
             * .line1()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [FrontText]. */
        class Builder internal constructor() {

            private var line1: JsonField<String>? = null
            private var line2: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(frontText: FrontText) = apply {
                line1 = frontText.line1
                line2 = frontText.line2
                additionalProperties = frontText.additionalProperties.toMutableMap()
            }

            /** The first line of text on the front of the card. */
            fun line1(line1: String) = line1(JsonField.of(line1))

            /**
             * Sets [Builder.line1] to an arbitrary JSON value.
             *
             * You should usually call [Builder.line1] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

            /**
             * The second line of text on the front of the card. Providing a second line moves the
             * first line slightly higher and prints the second line in the spot where the first
             * line would have otherwise been printed.
             */
            fun line2(line2: String) = line2(JsonField.of(line2))

            /**
             * Sets [Builder.line2] to an arbitrary JSON value.
             *
             * You should usually call [Builder.line2] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

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
             * Returns an immutable instance of [FrontText].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .line1()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): FrontText =
                FrontText(checkRequired("line1", line1), line2, additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is FrontText && line1 == other.line1 && line2 == other.line2 && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(line1, line2, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "FrontText{line1=$line1, line2=$line2, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PhysicalCardProfileCloneParams && physicalCardProfileId == other.physicalCardProfileId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(physicalCardProfileId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "PhysicalCardProfileCloneParams{physicalCardProfileId=$physicalCardProfileId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
