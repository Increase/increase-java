// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import java.util.Objects
import java.util.Optional

/** A list of Lockbox objects. */
@JsonDeserialize(builder = LockboxList.Builder::class)
@NoAutoDetect
class LockboxList
private constructor(
    private val data: JsonField<List<Lockbox>>,
    private val nextCursor: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** The contents of the list. */
    fun data(): List<Lockbox> = data.getRequired("data")

    /** A pointer to a place in the list. */
    fun nextCursor(): Optional<String> = Optional.ofNullable(nextCursor.getNullable("next_cursor"))

    /** The contents of the list. */
    @JsonProperty("data") @ExcludeMissing fun _data() = data

    /** A pointer to a place in the list. */
    @JsonProperty("next_cursor") @ExcludeMissing fun _nextCursor() = nextCursor

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): LockboxList = apply {
        if (!validated) {
            data().forEach { it.validate() }
            nextCursor()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LockboxList &&
            this.data == other.data &&
            this.nextCursor == other.nextCursor &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    data,
                    nextCursor,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "LockboxList{data=$data, nextCursor=$nextCursor, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var data: JsonField<List<Lockbox>> = JsonMissing.of()
        private var nextCursor: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(lockboxList: LockboxList) = apply {
            this.data = lockboxList.data
            this.nextCursor = lockboxList.nextCursor
            additionalProperties(lockboxList.additionalProperties)
        }

        /** The contents of the list. */
        fun data(data: List<Lockbox>) = data(JsonField.of(data))

        /** The contents of the list. */
        @JsonProperty("data")
        @ExcludeMissing
        fun data(data: JsonField<List<Lockbox>>) = apply { this.data = data }

        /** A pointer to a place in the list. */
        fun nextCursor(nextCursor: String) = nextCursor(JsonField.of(nextCursor))

        /** A pointer to a place in the list. */
        @JsonProperty("next_cursor")
        @ExcludeMissing
        fun nextCursor(nextCursor: JsonField<String>) = apply { this.nextCursor = nextCursor }

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

        fun build(): LockboxList =
            LockboxList(
                data.map { it.toUnmodifiable() },
                nextCursor,
                additionalProperties.toUnmodifiable(),
            )
    }
}
