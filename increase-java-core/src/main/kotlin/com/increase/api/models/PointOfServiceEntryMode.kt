package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional
import java.util.UUID
import com.increase.api.core.BaseDeserializer
import com.increase.api.core.BaseSerializer
import com.increase.api.core.getOrThrow
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.JsonField
import com.increase.api.core.toUnmodifiable
import com.increase.api.core.NoAutoDetect
import com.increase.api.errors.IncreaseInvalidDataException

class PointOfServiceEntryMode @JsonCreator private constructor(private val value: JsonField<String>,) {

    @com.fasterxml.jackson.annotation.JsonValue
    fun _value(): JsonField<String> = value

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is PointOfServiceEntryMode &&
          this.value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()

    companion object {

        @JvmField val MANUAL = PointOfServiceEntryMode(JsonField.of("manual"))

        @JvmField val MAGNETIC_STRIPE_NO_CVV = PointOfServiceEntryMode(JsonField.of("magnetic_stripe_no_cvv"))

        @JvmField val OPTICAL_CODE = PointOfServiceEntryMode(JsonField.of("optical_code"))

        @JvmField val INTEGRATED_CIRCUIT_CARD = PointOfServiceEntryMode(JsonField.of("integrated_circuit_card"))

        @JvmField val CONTACTLESS = PointOfServiceEntryMode(JsonField.of("contactless"))

        @JvmField val CREDENTIAL_ON_FILE = PointOfServiceEntryMode(JsonField.of("credential_on_file"))

        @JvmField val MAGNETIC_STRIPE = PointOfServiceEntryMode(JsonField.of("magnetic_stripe"))

        @JvmField val CONTACTLESS_MAGNETIC_STRIPE = PointOfServiceEntryMode(JsonField.of("contactless_magnetic_stripe"))

        @JvmField val INTEGRATED_CIRCUIT_CARD_NO_CVV = PointOfServiceEntryMode(JsonField.of("integrated_circuit_card_no_cvv"))

        @JvmStatic fun of(value: String) = PointOfServiceEntryMode(JsonField.of(value))
    }

    enum class Known {
        MANUAL,
        MAGNETIC_STRIPE_NO_CVV,
        OPTICAL_CODE,
        INTEGRATED_CIRCUIT_CARD,
        CONTACTLESS,
        CREDENTIAL_ON_FILE,
        MAGNETIC_STRIPE,
        CONTACTLESS_MAGNETIC_STRIPE,
        INTEGRATED_CIRCUIT_CARD_NO_CVV,
    }

    enum class Value {
        MANUAL,
        MAGNETIC_STRIPE_NO_CVV,
        OPTICAL_CODE,
        INTEGRATED_CIRCUIT_CARD,
        CONTACTLESS,
        CREDENTIAL_ON_FILE,
        MAGNETIC_STRIPE,
        CONTACTLESS_MAGNETIC_STRIPE,
        INTEGRATED_CIRCUIT_CARD_NO_CVV,
        _UNKNOWN,
    }

    fun value(): Value = when (this) {
        MANUAL -> Value.MANUAL
        MAGNETIC_STRIPE_NO_CVV -> Value.MAGNETIC_STRIPE_NO_CVV
        OPTICAL_CODE -> Value.OPTICAL_CODE
        INTEGRATED_CIRCUIT_CARD -> Value.INTEGRATED_CIRCUIT_CARD
        CONTACTLESS -> Value.CONTACTLESS
        CREDENTIAL_ON_FILE -> Value.CREDENTIAL_ON_FILE
        MAGNETIC_STRIPE -> Value.MAGNETIC_STRIPE
        CONTACTLESS_MAGNETIC_STRIPE -> Value.CONTACTLESS_MAGNETIC_STRIPE
        INTEGRATED_CIRCUIT_CARD_NO_CVV -> Value.INTEGRATED_CIRCUIT_CARD_NO_CVV
        else -> Value._UNKNOWN
    }

    fun known(): Known = when (this) {
        MANUAL -> Known.MANUAL
        MAGNETIC_STRIPE_NO_CVV -> Known.MAGNETIC_STRIPE_NO_CVV
        OPTICAL_CODE -> Known.OPTICAL_CODE
        INTEGRATED_CIRCUIT_CARD -> Known.INTEGRATED_CIRCUIT_CARD
        CONTACTLESS -> Known.CONTACTLESS
        CREDENTIAL_ON_FILE -> Known.CREDENTIAL_ON_FILE
        MAGNETIC_STRIPE -> Known.MAGNETIC_STRIPE
        CONTACTLESS_MAGNETIC_STRIPE -> Known.CONTACTLESS_MAGNETIC_STRIPE
        INTEGRATED_CIRCUIT_CARD_NO_CVV -> Known.INTEGRATED_CIRCUIT_CARD_NO_CVV
        else -> throw IncreaseInvalidDataException("Unknown PointOfServiceEntryMode: $value")
    }

    fun asString(): String = _value().asStringOrThrow()
}
