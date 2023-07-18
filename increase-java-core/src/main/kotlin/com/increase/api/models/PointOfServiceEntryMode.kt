package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.increase.api.core.JsonField
import com.increase.api.core.JsonValue
import com.increase.api.errors.IncreaseInvalidDataException

class PointOfServiceEntryMode
@JsonCreator
private constructor(
    private val value: JsonField<String>,
) {

    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PointOfServiceEntryMode && this.value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()

    companion object {

        @JvmField val UNKNOWN = PointOfServiceEntryMode(JsonField.of("unknown"))

        @JvmField val MANUAL = PointOfServiceEntryMode(JsonField.of("manual"))

        @JvmField
        val MAGNETIC_STRIPE_NO_CVV = PointOfServiceEntryMode(JsonField.of("magnetic_stripe_no_cvv"))

        @JvmField val OPTICAL_CODE = PointOfServiceEntryMode(JsonField.of("optical_code"))

        @JvmField
        val INTEGRATED_CIRCUIT_CARD =
            PointOfServiceEntryMode(JsonField.of("integrated_circuit_card"))

        @JvmField val CONTACTLESS = PointOfServiceEntryMode(JsonField.of("contactless"))

        @JvmField
        val CREDENTIAL_ON_FILE = PointOfServiceEntryMode(JsonField.of("credential_on_file"))

        @JvmField val MAGNETIC_STRIPE = PointOfServiceEntryMode(JsonField.of("magnetic_stripe"))

        @JvmField
        val CONTACTLESS_MAGNETIC_STRIPE =
            PointOfServiceEntryMode(JsonField.of("contactless_magnetic_stripe"))

        @JvmField
        val INTEGRATED_CIRCUIT_CARD_NO_CVV =
            PointOfServiceEntryMode(JsonField.of("integrated_circuit_card_no_cvv"))

        @JvmStatic fun of(value: String) = PointOfServiceEntryMode(JsonField.of(value))
    }

    enum class Known {
        UNKNOWN,
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
        UNKNOWN,
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

    fun value(): Value =
        when (this) {
            UNKNOWN -> Value.UNKNOWN
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

    fun known(): Known =
        when (this) {
            UNKNOWN -> Known.UNKNOWN
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
