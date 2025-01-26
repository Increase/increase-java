// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.increase.api.core.Enum
import com.increase.api.core.JsonField
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional

/** List Files */
class FileListParams
private constructor(
    private val createdAt: CreatedAt?,
    private val cursor: String?,
    private val idempotencyKey: String?,
    private val limit: Long?,
    private val purpose: Purpose?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun createdAt(): Optional<CreatedAt> = Optional.ofNullable(createdAt)

    /** Return the page of entries after this one. */
    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    /**
     * Filter records to the one with the specified `idempotency_key` you chose for that object.
     * This value is unique across Increase and is used to ensure that a request is only processed
     * once. Learn more about [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    fun idempotencyKey(): Optional<String> = Optional.ofNullable(idempotencyKey)

    /** Limit the size of the list that is returned. The default (and maximum) is 100 objects. */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun purpose(): Optional<Purpose> = Optional.ofNullable(purpose)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.createdAt?.forEachQueryParam { key, values ->
            queryParams.put("created_at.$key", values)
        }
        this.cursor?.let { queryParams.put("cursor", listOf(it.toString())) }
        this.idempotencyKey?.let { queryParams.put("idempotency_key", listOf(it.toString())) }
        this.limit?.let { queryParams.put("limit", listOf(it.toString())) }
        this.purpose?.forEachQueryParam { key, values -> queryParams.put("purpose.$key", values) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder internal constructor() {

        private var createdAt: CreatedAt? = null
        private var cursor: String? = null
        private var idempotencyKey: String? = null
        private var limit: Long? = null
        private var purpose: Purpose? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(fileListParams: FileListParams) = apply {
            createdAt = fileListParams.createdAt
            cursor = fileListParams.cursor
            idempotencyKey = fileListParams.idempotencyKey
            limit = fileListParams.limit
            purpose = fileListParams.purpose
            additionalHeaders = fileListParams.additionalHeaders.toBuilder()
            additionalQueryParams = fileListParams.additionalQueryParams.toBuilder()
        }

        fun createdAt(createdAt: CreatedAt?) = apply { this.createdAt = createdAt }

        fun createdAt(createdAt: Optional<CreatedAt>) = createdAt(createdAt.orElse(null))

        /** Return the page of entries after this one. */
        fun cursor(cursor: String?) = apply { this.cursor = cursor }

        /** Return the page of entries after this one. */
        fun cursor(cursor: Optional<String>) = cursor(cursor.orElse(null))

        /**
         * Filter records to the one with the specified `idempotency_key` you chose for that object.
         * This value is unique across Increase and is used to ensure that a request is only
         * processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: String?) = apply { this.idempotencyKey = idempotencyKey }

        /**
         * Filter records to the one with the specified `idempotency_key` you chose for that object.
         * This value is unique across Increase and is used to ensure that a request is only
         * processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: Optional<String>) =
            idempotencyKey(idempotencyKey.orElse(null))

        /**
         * Limit the size of the list that is returned. The default (and maximum) is 100 objects.
         */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Limit the size of the list that is returned. The default (and maximum) is 100 objects.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /**
         * Limit the size of the list that is returned. The default (and maximum) is 100 objects.
         */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun limit(limit: Optional<Long>) = limit(limit.orElse(null) as Long?)

        fun purpose(purpose: Purpose?) = apply { this.purpose = purpose }

        fun purpose(purpose: Optional<Purpose>) = purpose(purpose.orElse(null))

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

        fun build(): FileListParams =
            FileListParams(
                createdAt,
                cursor,
                idempotencyKey,
                limit,
                purpose,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class CreatedAt
    private constructor(
        private val after: OffsetDateTime?,
        private val before: OffsetDateTime?,
        private val onOrAfter: OffsetDateTime?,
        private val onOrBefore: OffsetDateTime?,
        private val additionalProperties: QueryParams,
    ) {

        /**
         * Return results after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
         */
        fun after(): Optional<OffsetDateTime> = Optional.ofNullable(after)

        /**
         * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
         */
        fun before(): Optional<OffsetDateTime> = Optional.ofNullable(before)

        /**
         * Return results on or after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
         * timestamp.
         */
        fun onOrAfter(): Optional<OffsetDateTime> = Optional.ofNullable(onOrAfter)

        /**
         * Return results on or before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
         * timestamp.
         */
        fun onOrBefore(): Optional<OffsetDateTime> = Optional.ofNullable(onOrBefore)

        fun _additionalProperties(): QueryParams = additionalProperties

        @JvmSynthetic
        internal fun forEachQueryParam(putParam: (String, List<String>) -> Unit) {
            this.after?.let {
                putParam("after", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
            }
            this.before?.let {
                putParam("before", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
            }
            this.onOrAfter?.let {
                putParam("on_or_after", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
            }
            this.onOrBefore?.let {
                putParam("on_or_before", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
            }
            additionalProperties.keys().forEach { putParam(it, additionalProperties.values(it)) }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder internal constructor() {

            private var after: OffsetDateTime? = null
            private var before: OffsetDateTime? = null
            private var onOrAfter: OffsetDateTime? = null
            private var onOrBefore: OffsetDateTime? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(createdAt: CreatedAt) = apply {
                after = createdAt.after
                before = createdAt.before
                onOrAfter = createdAt.onOrAfter
                onOrBefore = createdAt.onOrBefore
                additionalProperties = createdAt.additionalProperties.toBuilder()
            }

            /**
             * Return results after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun after(after: OffsetDateTime?) = apply { this.after = after }

            /**
             * Return results after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun after(after: Optional<OffsetDateTime>) = after(after.orElse(null))

            /**
             * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun before(before: OffsetDateTime?) = apply { this.before = before }

            /**
             * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun before(before: Optional<OffsetDateTime>) = before(before.orElse(null))

            /**
             * Return results on or after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun onOrAfter(onOrAfter: OffsetDateTime?) = apply { this.onOrAfter = onOrAfter }

            /**
             * Return results on or after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun onOrAfter(onOrAfter: Optional<OffsetDateTime>) = onOrAfter(onOrAfter.orElse(null))

            /**
             * Return results on or before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun onOrBefore(onOrBefore: OffsetDateTime?) = apply { this.onOrBefore = onOrBefore }

            /**
             * Return results on or before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun onOrBefore(onOrBefore: Optional<OffsetDateTime>) =
                onOrBefore(onOrBefore.orElse(null))

            fun additionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: String) = apply {
                additionalProperties.put(key, value)
            }

            fun putAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.put(key, values)
            }

            fun putAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceAdditionalProperties(key: String, value: String) = apply {
                additionalProperties.replace(key, value)
            }

            fun replaceAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.replace(key, values)
            }

            fun replaceAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.replaceAll(additionalProperties)
            }

            fun replaceAllAdditionalProperties(
                additionalProperties: Map<String, Iterable<String>>
            ) = apply { this.additionalProperties.replaceAll(additionalProperties) }

            fun removeAdditionalProperties(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                additionalProperties.removeAll(keys)
            }

            fun build(): CreatedAt =
                CreatedAt(
                    after,
                    before,
                    onOrAfter,
                    onOrBefore,
                    additionalProperties.build(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CreatedAt && after == other.after && before == other.before && onOrAfter == other.onOrAfter && onOrBefore == other.onOrBefore && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(after, before, onOrAfter, onOrBefore, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CreatedAt{after=$after, before=$before, onOrAfter=$onOrAfter, onOrBefore=$onOrBefore, additionalProperties=$additionalProperties}"
    }

    class Purpose
    private constructor(
        private val in_: List<In>?,
        private val additionalProperties: QueryParams,
    ) {

        /**
         * Filter Files for those with the specified purpose or purposes. For GET requests, this
         * should be encoded as a comma-delimited string, such as `?in=one,two,three`.
         */
        fun in_(): Optional<List<In>> = Optional.ofNullable(in_)

        fun _additionalProperties(): QueryParams = additionalProperties

        @JvmSynthetic
        internal fun forEachQueryParam(putParam: (String, List<String>) -> Unit) {
            this.in_?.let { putParam("in", listOf(it.joinToString(separator = ","))) }
            additionalProperties.keys().forEach { putParam(it, additionalProperties.values(it)) }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder internal constructor() {

            private var in_: MutableList<In>? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(purpose: Purpose) = apply {
                in_ = purpose.in_?.toMutableList()
                additionalProperties = purpose.additionalProperties.toBuilder()
            }

            /**
             * Filter Files for those with the specified purpose or purposes. For GET requests, this
             * should be encoded as a comma-delimited string, such as `?in=one,two,three`.
             */
            fun in_(in_: List<In>?) = apply { this.in_ = in_?.toMutableList() }

            /**
             * Filter Files for those with the specified purpose or purposes. For GET requests, this
             * should be encoded as a comma-delimited string, such as `?in=one,two,three`.
             */
            fun in_(in_: Optional<List<In>>) = in_(in_.orElse(null))

            /**
             * Filter Files for those with the specified purpose or purposes. For GET requests, this
             * should be encoded as a comma-delimited string, such as `?in=one,two,three`.
             */
            fun addIn(in_: In) = apply {
                this.in_ = (this.in_ ?: mutableListOf()).apply { add(in_) }
            }

            fun additionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: String) = apply {
                additionalProperties.put(key, value)
            }

            fun putAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.put(key, values)
            }

            fun putAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceAdditionalProperties(key: String, value: String) = apply {
                additionalProperties.replace(key, value)
            }

            fun replaceAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.replace(key, values)
            }

            fun replaceAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.replaceAll(additionalProperties)
            }

            fun replaceAllAdditionalProperties(
                additionalProperties: Map<String, Iterable<String>>
            ) = apply { this.additionalProperties.replaceAll(additionalProperties) }

            fun removeAdditionalProperties(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                additionalProperties.removeAll(keys)
            }

            fun build(): Purpose = Purpose(in_?.toImmutable(), additionalProperties.build())
        }

        class In
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                /** An image of the front of a check, used for check deposits. */
                @JvmField val CHECK_IMAGE_FRONT = of("check_image_front")

                /** An image of the back of a check, used for check deposits. */
                @JvmField val CHECK_IMAGE_BACK = of("check_image_back")

                /**
                 * An image of the front of a deposited check after processing by Increase and
                 * submission to the Federal Reserve.
                 */
                @JvmField val PROCESSED_CHECK_IMAGE_FRONT = of("processed_check_image_front")

                /**
                 * An image of the back of a deposited check after processing by Increase and
                 * submission to the Federal Reserve.
                 */
                @JvmField val PROCESSED_CHECK_IMAGE_BACK = of("processed_check_image_back")

                /** An image of a check that was mailed to a recipient. */
                @JvmField val MAILED_CHECK_IMAGE = of("mailed_check_image")

                /**
                 * An image to be printed on the bottom or voucher of a check that you've requested
                 * Increase print.
                 */
                @JvmField val CHECK_VOUCHER_IMAGE = of("check_voucher_image")

                /**
                 * An image to be printed on an additional page and mailed with a check that you've
                 * requested Increase print.
                 */
                @JvmField val CHECK_ATTACHMENT_IMAGE = of("check_attachment_image")

                /** A scanned mail item sent to Increase. */
                @JvmField val INBOUND_MAIL_ITEM = of("inbound_mail_item")

                /** IRS Form 1099-INT. */
                @JvmField val FORM_1099_INT = of("form_1099_int")

                /** IRS Form SS-4. */
                @JvmField val FORM_SS_4 = of("form_ss_4")

                /** An image of a government-issued ID. */
                @JvmField val IDENTITY_DOCUMENT = of("identity_document")

                /** A statement generated by Increase. */
                @JvmField val INCREASE_STATEMENT = of("increase_statement")

                /** A file purpose not covered by any of the other cases. */
                @JvmField val OTHER = of("other")

                /** A legal document forming a trust. */
                @JvmField val TRUST_FORMATION_DOCUMENT = of("trust_formation_document")

                /**
                 * A card image to be rendered inside digital wallet apps. This must be a 1536x969
                 * pixel PNG.
                 */
                @JvmField val DIGITAL_WALLET_ARTWORK = of("digital_wallet_artwork")

                /**
                 * An icon for you app to be rendered inside digital wallet apps. This must be a
                 * 100x100 pixel PNG.
                 */
                @JvmField val DIGITAL_WALLET_APP_ICON = of("digital_wallet_app_icon")

                /**
                 * A card image to be printed on the front of a physical card. This must be a
                 * 2100x1340 pixel PNG with no other color but black.
                 */
                @JvmField val PHYSICAL_CARD_FRONT = of("physical_card_front")

                /** The image to be printed on the back of a physical card. */
                @JvmField val PHYSICAL_CARD_BACK = of("physical_card_back")

                /**
                 * An image representing the entirety of the carrier used for a physical card. This
                 * must be a 2550x3300 pixel PNG with no other color but black.
                 */
                @JvmField val PHYSICAL_CARD_CARRIER = of("physical_card_carrier")

                /** A document requested by Increase. */
                @JvmField val DOCUMENT_REQUEST = of("document_request")

                /** A supplemental document associated an an Entity. */
                @JvmField val ENTITY_SUPPLEMENTAL_DOCUMENT = of("entity_supplemental_document")

                /** The results of an Export you requested via the dashboard or API. */
                @JvmField val EXPORT = of("export")

                /** An attachment to an Unusual Activity Report. */
                @JvmField
                val UNUSUAL_ACTIVITY_REPORT_ATTACHMENT = of("unusual_activity_report_attachment")

                /** A document granting another entity access to the funds into your account. */
                @JvmField
                val DEPOSIT_ACCOUNT_CONTROL_AGREEMENT = of("deposit_account_control_agreement")

                @JvmStatic fun of(value: String) = In(JsonField.of(value))
            }

            enum class Known {
                /** An image of the front of a check, used for check deposits. */
                CHECK_IMAGE_FRONT,
                /** An image of the back of a check, used for check deposits. */
                CHECK_IMAGE_BACK,
                /**
                 * An image of the front of a deposited check after processing by Increase and
                 * submission to the Federal Reserve.
                 */
                PROCESSED_CHECK_IMAGE_FRONT,
                /**
                 * An image of the back of a deposited check after processing by Increase and
                 * submission to the Federal Reserve.
                 */
                PROCESSED_CHECK_IMAGE_BACK,
                /** An image of a check that was mailed to a recipient. */
                MAILED_CHECK_IMAGE,
                /**
                 * An image to be printed on the bottom or voucher of a check that you've requested
                 * Increase print.
                 */
                CHECK_VOUCHER_IMAGE,
                /**
                 * An image to be printed on an additional page and mailed with a check that you've
                 * requested Increase print.
                 */
                CHECK_ATTACHMENT_IMAGE,
                /** A scanned mail item sent to Increase. */
                INBOUND_MAIL_ITEM,
                /** IRS Form 1099-INT. */
                FORM_1099_INT,
                /** IRS Form SS-4. */
                FORM_SS_4,
                /** An image of a government-issued ID. */
                IDENTITY_DOCUMENT,
                /** A statement generated by Increase. */
                INCREASE_STATEMENT,
                /** A file purpose not covered by any of the other cases. */
                OTHER,
                /** A legal document forming a trust. */
                TRUST_FORMATION_DOCUMENT,
                /**
                 * A card image to be rendered inside digital wallet apps. This must be a 1536x969
                 * pixel PNG.
                 */
                DIGITAL_WALLET_ARTWORK,
                /**
                 * An icon for you app to be rendered inside digital wallet apps. This must be a
                 * 100x100 pixel PNG.
                 */
                DIGITAL_WALLET_APP_ICON,
                /**
                 * A card image to be printed on the front of a physical card. This must be a
                 * 2100x1340 pixel PNG with no other color but black.
                 */
                PHYSICAL_CARD_FRONT,
                /** The image to be printed on the back of a physical card. */
                PHYSICAL_CARD_BACK,
                /**
                 * An image representing the entirety of the carrier used for a physical card. This
                 * must be a 2550x3300 pixel PNG with no other color but black.
                 */
                PHYSICAL_CARD_CARRIER,
                /** A document requested by Increase. */
                DOCUMENT_REQUEST,
                /** A supplemental document associated an an Entity. */
                ENTITY_SUPPLEMENTAL_DOCUMENT,
                /** The results of an Export you requested via the dashboard or API. */
                EXPORT,
                /** An attachment to an Unusual Activity Report. */
                UNUSUAL_ACTIVITY_REPORT_ATTACHMENT,
                /** A document granting another entity access to the funds into your account. */
                DEPOSIT_ACCOUNT_CONTROL_AGREEMENT,
            }

            enum class Value {
                /** An image of the front of a check, used for check deposits. */
                CHECK_IMAGE_FRONT,
                /** An image of the back of a check, used for check deposits. */
                CHECK_IMAGE_BACK,
                /**
                 * An image of the front of a deposited check after processing by Increase and
                 * submission to the Federal Reserve.
                 */
                PROCESSED_CHECK_IMAGE_FRONT,
                /**
                 * An image of the back of a deposited check after processing by Increase and
                 * submission to the Federal Reserve.
                 */
                PROCESSED_CHECK_IMAGE_BACK,
                /** An image of a check that was mailed to a recipient. */
                MAILED_CHECK_IMAGE,
                /**
                 * An image to be printed on the bottom or voucher of a check that you've requested
                 * Increase print.
                 */
                CHECK_VOUCHER_IMAGE,
                /**
                 * An image to be printed on an additional page and mailed with a check that you've
                 * requested Increase print.
                 */
                CHECK_ATTACHMENT_IMAGE,
                /** A scanned mail item sent to Increase. */
                INBOUND_MAIL_ITEM,
                /** IRS Form 1099-INT. */
                FORM_1099_INT,
                /** IRS Form SS-4. */
                FORM_SS_4,
                /** An image of a government-issued ID. */
                IDENTITY_DOCUMENT,
                /** A statement generated by Increase. */
                INCREASE_STATEMENT,
                /** A file purpose not covered by any of the other cases. */
                OTHER,
                /** A legal document forming a trust. */
                TRUST_FORMATION_DOCUMENT,
                /**
                 * A card image to be rendered inside digital wallet apps. This must be a 1536x969
                 * pixel PNG.
                 */
                DIGITAL_WALLET_ARTWORK,
                /**
                 * An icon for you app to be rendered inside digital wallet apps. This must be a
                 * 100x100 pixel PNG.
                 */
                DIGITAL_WALLET_APP_ICON,
                /**
                 * A card image to be printed on the front of a physical card. This must be a
                 * 2100x1340 pixel PNG with no other color but black.
                 */
                PHYSICAL_CARD_FRONT,
                /** The image to be printed on the back of a physical card. */
                PHYSICAL_CARD_BACK,
                /**
                 * An image representing the entirety of the carrier used for a physical card. This
                 * must be a 2550x3300 pixel PNG with no other color but black.
                 */
                PHYSICAL_CARD_CARRIER,
                /** A document requested by Increase. */
                DOCUMENT_REQUEST,
                /** A supplemental document associated an an Entity. */
                ENTITY_SUPPLEMENTAL_DOCUMENT,
                /** The results of an Export you requested via the dashboard or API. */
                EXPORT,
                /** An attachment to an Unusual Activity Report. */
                UNUSUAL_ACTIVITY_REPORT_ATTACHMENT,
                /** A document granting another entity access to the funds into your account. */
                DEPOSIT_ACCOUNT_CONTROL_AGREEMENT,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    CHECK_IMAGE_FRONT -> Value.CHECK_IMAGE_FRONT
                    CHECK_IMAGE_BACK -> Value.CHECK_IMAGE_BACK
                    PROCESSED_CHECK_IMAGE_FRONT -> Value.PROCESSED_CHECK_IMAGE_FRONT
                    PROCESSED_CHECK_IMAGE_BACK -> Value.PROCESSED_CHECK_IMAGE_BACK
                    MAILED_CHECK_IMAGE -> Value.MAILED_CHECK_IMAGE
                    CHECK_VOUCHER_IMAGE -> Value.CHECK_VOUCHER_IMAGE
                    CHECK_ATTACHMENT_IMAGE -> Value.CHECK_ATTACHMENT_IMAGE
                    INBOUND_MAIL_ITEM -> Value.INBOUND_MAIL_ITEM
                    FORM_1099_INT -> Value.FORM_1099_INT
                    FORM_SS_4 -> Value.FORM_SS_4
                    IDENTITY_DOCUMENT -> Value.IDENTITY_DOCUMENT
                    INCREASE_STATEMENT -> Value.INCREASE_STATEMENT
                    OTHER -> Value.OTHER
                    TRUST_FORMATION_DOCUMENT -> Value.TRUST_FORMATION_DOCUMENT
                    DIGITAL_WALLET_ARTWORK -> Value.DIGITAL_WALLET_ARTWORK
                    DIGITAL_WALLET_APP_ICON -> Value.DIGITAL_WALLET_APP_ICON
                    PHYSICAL_CARD_FRONT -> Value.PHYSICAL_CARD_FRONT
                    PHYSICAL_CARD_BACK -> Value.PHYSICAL_CARD_BACK
                    PHYSICAL_CARD_CARRIER -> Value.PHYSICAL_CARD_CARRIER
                    DOCUMENT_REQUEST -> Value.DOCUMENT_REQUEST
                    ENTITY_SUPPLEMENTAL_DOCUMENT -> Value.ENTITY_SUPPLEMENTAL_DOCUMENT
                    EXPORT -> Value.EXPORT
                    UNUSUAL_ACTIVITY_REPORT_ATTACHMENT -> Value.UNUSUAL_ACTIVITY_REPORT_ATTACHMENT
                    DEPOSIT_ACCOUNT_CONTROL_AGREEMENT -> Value.DEPOSIT_ACCOUNT_CONTROL_AGREEMENT
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    CHECK_IMAGE_FRONT -> Known.CHECK_IMAGE_FRONT
                    CHECK_IMAGE_BACK -> Known.CHECK_IMAGE_BACK
                    PROCESSED_CHECK_IMAGE_FRONT -> Known.PROCESSED_CHECK_IMAGE_FRONT
                    PROCESSED_CHECK_IMAGE_BACK -> Known.PROCESSED_CHECK_IMAGE_BACK
                    MAILED_CHECK_IMAGE -> Known.MAILED_CHECK_IMAGE
                    CHECK_VOUCHER_IMAGE -> Known.CHECK_VOUCHER_IMAGE
                    CHECK_ATTACHMENT_IMAGE -> Known.CHECK_ATTACHMENT_IMAGE
                    INBOUND_MAIL_ITEM -> Known.INBOUND_MAIL_ITEM
                    FORM_1099_INT -> Known.FORM_1099_INT
                    FORM_SS_4 -> Known.FORM_SS_4
                    IDENTITY_DOCUMENT -> Known.IDENTITY_DOCUMENT
                    INCREASE_STATEMENT -> Known.INCREASE_STATEMENT
                    OTHER -> Known.OTHER
                    TRUST_FORMATION_DOCUMENT -> Known.TRUST_FORMATION_DOCUMENT
                    DIGITAL_WALLET_ARTWORK -> Known.DIGITAL_WALLET_ARTWORK
                    DIGITAL_WALLET_APP_ICON -> Known.DIGITAL_WALLET_APP_ICON
                    PHYSICAL_CARD_FRONT -> Known.PHYSICAL_CARD_FRONT
                    PHYSICAL_CARD_BACK -> Known.PHYSICAL_CARD_BACK
                    PHYSICAL_CARD_CARRIER -> Known.PHYSICAL_CARD_CARRIER
                    DOCUMENT_REQUEST -> Known.DOCUMENT_REQUEST
                    ENTITY_SUPPLEMENTAL_DOCUMENT -> Known.ENTITY_SUPPLEMENTAL_DOCUMENT
                    EXPORT -> Known.EXPORT
                    UNUSUAL_ACTIVITY_REPORT_ATTACHMENT -> Known.UNUSUAL_ACTIVITY_REPORT_ATTACHMENT
                    DEPOSIT_ACCOUNT_CONTROL_AGREEMENT -> Known.DEPOSIT_ACCOUNT_CONTROL_AGREEMENT
                    else -> throw IncreaseInvalidDataException("Unknown In: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is In && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Purpose && in_ == other.in_ && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(in_, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Purpose{in_=$in_, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FileListParams && createdAt == other.createdAt && cursor == other.cursor && idempotencyKey == other.idempotencyKey && limit == other.limit && purpose == other.purpose && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(createdAt, cursor, idempotencyKey, limit, purpose, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "FileListParams{createdAt=$createdAt, cursor=$cursor, idempotencyKey=$idempotencyKey, limit=$limit, purpose=$purpose, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
