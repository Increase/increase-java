// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.checkRequired
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import java.util.Objects

/** Create a Physical Card Profile */
class PhysicalCardProfileCreateParams
constructor(
    private val body: PhysicalCardProfileCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** The identifier of the File containing the physical card's carrier image. */
    fun carrierImageFileId(): String = body.carrierImageFileId()

    /** A phone number the user can contact to receive support for their card. */
    fun contactPhone(): String = body.contactPhone()

    /** A description you can use to identify the Card Profile. */
    fun description(): String = body.description()

    /** The identifier of the File containing the physical card's front image. */
    fun frontImageFileId(): String = body.frontImageFileId()

    /** The identifier of the File containing the physical card's carrier image. */
    fun _carrierImageFileId(): JsonField<String> = body._carrierImageFileId()

    /** A phone number the user can contact to receive support for their card. */
    fun _contactPhone(): JsonField<String> = body._contactPhone()

    /** A description you can use to identify the Card Profile. */
    fun _description(): JsonField<String> = body._description()

    /** The identifier of the File containing the physical card's front image. */
    fun _frontImageFileId(): JsonField<String> = body._frontImageFileId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): PhysicalCardProfileCreateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class PhysicalCardProfileCreateBody
    @JsonCreator
    internal constructor(
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
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The identifier of the File containing the physical card's carrier image. */
        fun carrierImageFileId(): String = carrierImageFileId.getRequired("carrier_image_file_id")

        /** A phone number the user can contact to receive support for their card. */
        fun contactPhone(): String = contactPhone.getRequired("contact_phone")

        /** A description you can use to identify the Card Profile. */
        fun description(): String = description.getRequired("description")

        /** The identifier of the File containing the physical card's front image. */
        fun frontImageFileId(): String = frontImageFileId.getRequired("front_image_file_id")

        /** The identifier of the File containing the physical card's carrier image. */
        @JsonProperty("carrier_image_file_id")
        @ExcludeMissing
        fun _carrierImageFileId(): JsonField<String> = carrierImageFileId

        /** A phone number the user can contact to receive support for their card. */
        @JsonProperty("contact_phone")
        @ExcludeMissing
        fun _contactPhone(): JsonField<String> = contactPhone

        /** A description you can use to identify the Card Profile. */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /** The identifier of the File containing the physical card's front image. */
        @JsonProperty("front_image_file_id")
        @ExcludeMissing
        fun _frontImageFileId(): JsonField<String> = frontImageFileId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): PhysicalCardProfileCreateBody = apply {
            if (validated) {
                return@apply
            }

            carrierImageFileId()
            contactPhone()
            description()
            frontImageFileId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var carrierImageFileId: JsonField<String>? = null
            private var contactPhone: JsonField<String>? = null
            private var description: JsonField<String>? = null
            private var frontImageFileId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(physicalCardProfileCreateBody: PhysicalCardProfileCreateBody) =
                apply {
                    carrierImageFileId = physicalCardProfileCreateBody.carrierImageFileId
                    contactPhone = physicalCardProfileCreateBody.contactPhone
                    description = physicalCardProfileCreateBody.description
                    frontImageFileId = physicalCardProfileCreateBody.frontImageFileId
                    additionalProperties =
                        physicalCardProfileCreateBody.additionalProperties.toMutableMap()
                }

            /** The identifier of the File containing the physical card's carrier image. */
            fun carrierImageFileId(carrierImageFileId: String) =
                carrierImageFileId(JsonField.of(carrierImageFileId))

            /** The identifier of the File containing the physical card's carrier image. */
            fun carrierImageFileId(carrierImageFileId: JsonField<String>) = apply {
                this.carrierImageFileId = carrierImageFileId
            }

            /** A phone number the user can contact to receive support for their card. */
            fun contactPhone(contactPhone: String) = contactPhone(JsonField.of(contactPhone))

            /** A phone number the user can contact to receive support for their card. */
            fun contactPhone(contactPhone: JsonField<String>) = apply {
                this.contactPhone = contactPhone
            }

            /** A description you can use to identify the Card Profile. */
            fun description(description: String) = description(JsonField.of(description))

            /** A description you can use to identify the Card Profile. */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** The identifier of the File containing the physical card's front image. */
            fun frontImageFileId(frontImageFileId: String) =
                frontImageFileId(JsonField.of(frontImageFileId))

            /** The identifier of the File containing the physical card's front image. */
            fun frontImageFileId(frontImageFileId: JsonField<String>) = apply {
                this.frontImageFileId = frontImageFileId
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

            fun build(): PhysicalCardProfileCreateBody =
                PhysicalCardProfileCreateBody(
                    checkRequired("carrierImageFileId", carrierImageFileId),
                    checkRequired("contactPhone", contactPhone),
                    checkRequired("description", description),
                    checkRequired("frontImageFileId", frontImageFileId),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PhysicalCardProfileCreateBody && carrierImageFileId == other.carrierImageFileId && contactPhone == other.contactPhone && description == other.description && frontImageFileId == other.frontImageFileId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(carrierImageFileId, contactPhone, description, frontImageFileId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PhysicalCardProfileCreateBody{carrierImageFileId=$carrierImageFileId, contactPhone=$contactPhone, description=$description, frontImageFileId=$frontImageFileId, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: PhysicalCardProfileCreateBody.Builder =
            PhysicalCardProfileCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(physicalCardProfileCreateParams: PhysicalCardProfileCreateParams) =
            apply {
                body = physicalCardProfileCreateParams.body.toBuilder()
                additionalHeaders = physicalCardProfileCreateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    physicalCardProfileCreateParams.additionalQueryParams.toBuilder()
            }

        /** The identifier of the File containing the physical card's carrier image. */
        fun carrierImageFileId(carrierImageFileId: String) = apply {
            body.carrierImageFileId(carrierImageFileId)
        }

        /** The identifier of the File containing the physical card's carrier image. */
        fun carrierImageFileId(carrierImageFileId: JsonField<String>) = apply {
            body.carrierImageFileId(carrierImageFileId)
        }

        /** A phone number the user can contact to receive support for their card. */
        fun contactPhone(contactPhone: String) = apply { body.contactPhone(contactPhone) }

        /** A phone number the user can contact to receive support for their card. */
        fun contactPhone(contactPhone: JsonField<String>) = apply {
            body.contactPhone(contactPhone)
        }

        /** A description you can use to identify the Card Profile. */
        fun description(description: String) = apply { body.description(description) }

        /** A description you can use to identify the Card Profile. */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /** The identifier of the File containing the physical card's front image. */
        fun frontImageFileId(frontImageFileId: String) = apply {
            body.frontImageFileId(frontImageFileId)
        }

        /** The identifier of the File containing the physical card's front image. */
        fun frontImageFileId(frontImageFileId: JsonField<String>) = apply {
            body.frontImageFileId(frontImageFileId)
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

        fun build(): PhysicalCardProfileCreateParams =
            PhysicalCardProfileCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PhysicalCardProfileCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "PhysicalCardProfileCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
