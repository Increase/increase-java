package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.JsonField
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.errors.IncreaseInvalidDataException
import com.increase.api.models.*
import java.util.Objects
import java.util.Optional

class CardProfileListParams
constructor(
    private val cursor: String?,
    private val limit: Long?,
    private val status: Status?,
    private val physicalCardsStatus: PhysicalCardsStatus?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun status(): Optional<Status> = Optional.ofNullable(status)

    fun physicalCardsStatus(): Optional<PhysicalCardsStatus> =
        Optional.ofNullable(physicalCardsStatus)

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.cursor?.let { params.put("cursor", listOf(it.toString())) }
        this.limit?.let { params.put("limit", listOf(it.toString())) }
        this.status?.forEachQueryParam { key, values -> params.put("status.$key", values) }
        this.physicalCardsStatus?.forEachQueryParam { key, values ->
            params.put("physical_cards_status.$key", values)
        }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardProfileListParams &&
            this.cursor == other.cursor &&
            this.limit == other.limit &&
            this.status == other.status &&
            this.physicalCardsStatus == other.physicalCardsStatus &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            cursor,
            limit,
            status,
            physicalCardsStatus,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "CardProfileListParams{cursor=$cursor, limit=$limit, status=$status, physicalCardsStatus=$physicalCardsStatus, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var cursor: String? = null
        private var limit: Long? = null
        private var status: Status? = null
        private var physicalCardsStatus: PhysicalCardsStatus? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardProfileListParams: CardProfileListParams) = apply {
            this.cursor = cardProfileListParams.cursor
            this.limit = cardProfileListParams.limit
            this.status = cardProfileListParams.status
            this.physicalCardsStatus = cardProfileListParams.physicalCardsStatus
            additionalQueryParams(cardProfileListParams.additionalQueryParams)
            additionalHeaders(cardProfileListParams.additionalHeaders)
        }

        /** Return the page of entries after this one. */
        fun cursor(cursor: String) = apply { this.cursor = cursor }

        /**
         * Limit the size of the list that is returned. The default (and maximum) is 100 objects.
         */
        fun limit(limit: Long) = apply { this.limit = limit }

        fun status(status: Status) = apply { this.status = status }

        fun physicalCardsStatus(physicalCardsStatus: PhysicalCardsStatus) = apply {
            this.physicalCardsStatus = physicalCardsStatus
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun build(): CardProfileListParams =
            CardProfileListParams(
                cursor,
                limit,
                status,
                physicalCardsStatus,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = PhysicalCardsStatus.Builder::class)
    @NoAutoDetect
    class PhysicalCardsStatus
    private constructor(
        private val in_: List<In>?,
        private val additionalProperties: Map<String, List<String>>,
    ) {

        private var hashCode: Int = 0

        /**
         * Filter Card Profiles for those with the specified physical card status or statuses. For
         * GET requests, this should be encoded as a comma-delimited string, such as
         * `?in=one,two,three`.
         */
        fun in_(): List<In>? = in_

        fun _additionalProperties(): Map<String, List<String>> = additionalProperties

        @JvmSynthetic
        internal fun forEachQueryParam(putParam: (String, List<String>) -> Unit) {
            this.in_?.let { putParam("in", listOf(it.joinToString(separator = ","))) }
            this.additionalProperties.forEach { key, values -> putParam(key, values) }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PhysicalCardsStatus &&
                this.in_ == other.in_ &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(in_, additionalProperties)
            }
            return hashCode
        }

        override fun toString() =
            "PhysicalCardsStatus{in_=$in_, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var in_: List<In>? = null
            private var additionalProperties: MutableMap<String, List<String>> = mutableMapOf()

            @JvmSynthetic
            internal fun from(physicalCardsStatus: PhysicalCardsStatus) = apply {
                this.in_ = physicalCardsStatus.in_
                additionalProperties(physicalCardsStatus.additionalProperties)
            }

            /**
             * Filter Card Profiles for those with the specified physical card status or statuses.
             * For GET requests, this should be encoded as a comma-delimited string, such as
             * `?in=one,two,three`.
             */
            fun in_(in_: List<In>) = apply { this.in_ = in_ }

            fun additionalProperties(additionalProperties: Map<String, List<String>>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: List<String>) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, List<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun build(): PhysicalCardsStatus =
                PhysicalCardsStatus(in_?.toUnmodifiable(), additionalProperties.toUnmodifiable())
        }

        class In
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is In && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val NOT_ELIGIBLE = In(JsonField.of("not_eligible"))

                @JvmField val REJECTED = In(JsonField.of("rejected"))

                @JvmField val PENDING_CREATING = In(JsonField.of("pending_creating"))

                @JvmField val PENDING_REVIEWING = In(JsonField.of("pending_reviewing"))

                @JvmField val PENDING_SUBMITTING = In(JsonField.of("pending_submitting"))

                @JvmField val ACTIVE = In(JsonField.of("active"))

                @JvmStatic fun of(value: String) = In(JsonField.of(value))
            }

            enum class Known {
                NOT_ELIGIBLE,
                REJECTED,
                PENDING_CREATING,
                PENDING_REVIEWING,
                PENDING_SUBMITTING,
                ACTIVE,
            }

            enum class Value {
                NOT_ELIGIBLE,
                REJECTED,
                PENDING_CREATING,
                PENDING_REVIEWING,
                PENDING_SUBMITTING,
                ACTIVE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    NOT_ELIGIBLE -> Value.NOT_ELIGIBLE
                    REJECTED -> Value.REJECTED
                    PENDING_CREATING -> Value.PENDING_CREATING
                    PENDING_REVIEWING -> Value.PENDING_REVIEWING
                    PENDING_SUBMITTING -> Value.PENDING_SUBMITTING
                    ACTIVE -> Value.ACTIVE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    NOT_ELIGIBLE -> Known.NOT_ELIGIBLE
                    REJECTED -> Known.REJECTED
                    PENDING_CREATING -> Known.PENDING_CREATING
                    PENDING_REVIEWING -> Known.PENDING_REVIEWING
                    PENDING_SUBMITTING -> Known.PENDING_SUBMITTING
                    ACTIVE -> Known.ACTIVE
                    else -> throw IncreaseInvalidDataException("Unknown In: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    @JsonDeserialize(builder = Status.Builder::class)
    @NoAutoDetect
    class Status
    private constructor(
        private val in_: List<In>?,
        private val additionalProperties: Map<String, List<String>>,
    ) {

        private var hashCode: Int = 0

        /**
         * Filter Card Profiles for those with the specified digital wallet status or statuses. For
         * GET requests, this should be encoded as a comma-delimited string, such as
         * `?in=one,two,three`.
         */
        fun in_(): List<In>? = in_

        fun _additionalProperties(): Map<String, List<String>> = additionalProperties

        @JvmSynthetic
        internal fun forEachQueryParam(putParam: (String, List<String>) -> Unit) {
            this.in_?.let { putParam("in", listOf(it.joinToString(separator = ","))) }
            this.additionalProperties.forEach { key, values -> putParam(key, values) }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status &&
                this.in_ == other.in_ &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(in_, additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "Status{in_=$in_, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var in_: List<In>? = null
            private var additionalProperties: MutableMap<String, List<String>> = mutableMapOf()

            @JvmSynthetic
            internal fun from(status: Status) = apply {
                this.in_ = status.in_
                additionalProperties(status.additionalProperties)
            }

            /**
             * Filter Card Profiles for those with the specified digital wallet status or statuses.
             * For GET requests, this should be encoded as a comma-delimited string, such as
             * `?in=one,two,three`.
             */
            fun in_(in_: List<In>) = apply { this.in_ = in_ }

            fun additionalProperties(additionalProperties: Map<String, List<String>>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: List<String>) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, List<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun build(): Status =
                Status(in_?.toUnmodifiable(), additionalProperties.toUnmodifiable())
        }

        class In
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is In && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val PENDING = In(JsonField.of("pending"))

                @JvmField val REJECTED = In(JsonField.of("rejected"))

                @JvmField val ACTIVE = In(JsonField.of("active"))

                @JvmField val ARCHIVED = In(JsonField.of("archived"))

                @JvmStatic fun of(value: String) = In(JsonField.of(value))
            }

            enum class Known {
                PENDING,
                REJECTED,
                ACTIVE,
                ARCHIVED,
            }

            enum class Value {
                PENDING,
                REJECTED,
                ACTIVE,
                ARCHIVED,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    PENDING -> Value.PENDING
                    REJECTED -> Value.REJECTED
                    ACTIVE -> Value.ACTIVE
                    ARCHIVED -> Value.ARCHIVED
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    PENDING -> Known.PENDING
                    REJECTED -> Known.REJECTED
                    ACTIVE -> Known.ACTIVE
                    ARCHIVED -> Known.ARCHIVED
                    else -> throw IncreaseInvalidDataException("Unknown In: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }
}
