// File generated from our OpenAPI spec by Stainless.

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
import org.apache.hc.core5.http.ContentType
import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import java.util.UUID
import com.increase.api.core.BaseDeserializer
import com.increase.api.core.BaseSerializer
import com.increase.api.core.getOrThrow
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.MultipartFormValue
import com.increase.api.core.toUnmodifiable
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.Enum
import com.increase.api.core.ContentTypes
import com.increase.api.errors.IncreaseInvalidDataException
import com.increase.api.models.*

class OAuthTokenCreateParams constructor(
  private val grantType: GrantType,
  private val clientId: String?,
  private val clientSecret: String?,
  private val code: String?,
  private val productionToken: String?,
  private val additionalQueryParams: Map<String, List<String>>,
  private val additionalHeaders: Map<String, List<String>>,
  private val additionalBodyProperties: Map<String, JsonValue>,

) {

    fun grantType(): GrantType = grantType

    fun clientId(): Optional<String> = Optional.ofNullable(clientId)

    fun clientSecret(): Optional<String> = Optional.ofNullable(clientSecret)

    fun code(): Optional<String> = Optional.ofNullable(code)

    fun productionToken(): Optional<String> = Optional.ofNullable(productionToken)

    @JvmSynthetic
    internal fun getBody(): OAuthTokenCreateBody {
      return OAuthTokenCreateBody(
          grantType,
          clientId,
          clientSecret,
          code,
          productionToken,
          additionalBodyProperties,
      )
    }

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic
    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = OAuthTokenCreateBody.Builder::class)
    @NoAutoDetect
    class OAuthTokenCreateBody internal constructor(
      private val grantType: GrantType?,
      private val clientId: String?,
      private val clientSecret: String?,
      private val code: String?,
      private val productionToken: String?,
      private val additionalProperties: Map<String, JsonValue>,

    ) {

        private var hashCode: Int = 0

        /**
         * The credential you request in exchange for the code. In Production, this is
         * always `authorization_code`. In Sandbox, you can pass either enum value.
         */
        @JsonProperty("grant_type")
        fun grantType(): GrantType? = grantType

        /** The public identifier for your application. */
        @JsonProperty("client_id")
        fun clientId(): String? = clientId

        /**
         * The secret that confirms you own the application. This is redundent given that
         * the request is made with your API key but it's a required component of OAuth
         * 2.0.
         */
        @JsonProperty("client_secret")
        fun clientSecret(): String? = clientSecret

        /**
         * The authorization code generated by the user and given to you as a query
         * parameter.
         */
        @JsonProperty("code")
        fun code(): String? = code

        /**
         * The production token you want to exchange for a sandbox token. This is only
         * available in Sandbox. Set `grant_type` to `production_token` to use this
         * parameter.
         */
        @JsonProperty("production_token")
        fun productionToken(): String? = productionToken

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is OAuthTokenCreateBody &&
              this.grantType == other.grantType &&
              this.clientId == other.clientId &&
              this.clientSecret == other.clientSecret &&
              this.code == other.code &&
              this.productionToken == other.productionToken &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                grantType,
                clientId,
                clientSecret,
                code,
                productionToken,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "OAuthTokenCreateBody{grantType=$grantType, clientId=$clientId, clientSecret=$clientSecret, code=$code, productionToken=$productionToken, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var grantType: GrantType? = null
            private var clientId: String? = null
            private var clientSecret: String? = null
            private var code: String? = null
            private var productionToken: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(oauthTokenCreateBody: OAuthTokenCreateBody) = apply {
                this.grantType = oauthTokenCreateBody.grantType
                this.clientId = oauthTokenCreateBody.clientId
                this.clientSecret = oauthTokenCreateBody.clientSecret
                this.code = oauthTokenCreateBody.code
                this.productionToken = oauthTokenCreateBody.productionToken
                additionalProperties(oauthTokenCreateBody.additionalProperties)
            }

            /**
             * The credential you request in exchange for the code. In Production, this is
             * always `authorization_code`. In Sandbox, you can pass either enum value.
             */
            @JsonProperty("grant_type")
            fun grantType(grantType: GrantType) = apply {
                this.grantType = grantType
            }

            /** The public identifier for your application. */
            @JsonProperty("client_id")
            fun clientId(clientId: String) = apply {
                this.clientId = clientId
            }

            /**
             * The secret that confirms you own the application. This is redundent given that
             * the request is made with your API key but it's a required component of OAuth
             * 2.0.
             */
            @JsonProperty("client_secret")
            fun clientSecret(clientSecret: String) = apply {
                this.clientSecret = clientSecret
            }

            /**
             * The authorization code generated by the user and given to you as a query
             * parameter.
             */
            @JsonProperty("code")
            fun code(code: String) = apply {
                this.code = code
            }

            /**
             * The production token you want to exchange for a sandbox token. This is only
             * available in Sandbox. Set `grant_type` to `production_token` to use this
             * parameter.
             */
            @JsonProperty("production_token")
            fun productionToken(productionToken: String) = apply {
                this.productionToken = productionToken
            }

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

            fun build(): OAuthTokenCreateBody = OAuthTokenCreateBody(
                checkNotNull(grantType) {
                    "`grantType` is required but was not set"
                },
                clientId,
                clientSecret,
                code,
                productionToken,
                additionalProperties.toUnmodifiable(),
            )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is OAuthTokenCreateParams &&
          this.grantType == other.grantType &&
          this.clientId == other.clientId &&
          this.clientSecret == other.clientSecret &&
          this.code == other.code &&
          this.productionToken == other.productionToken &&
          this.additionalQueryParams == other.additionalQueryParams &&
          this.additionalHeaders == other.additionalHeaders &&
          this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
      return Objects.hash(
          grantType,
          clientId,
          clientSecret,
          code,
          productionToken,
          additionalQueryParams,
          additionalHeaders,
          additionalBodyProperties,
      )
    }

    override fun toString() = "OAuthTokenCreateParams{grantType=$grantType, clientId=$clientId, clientSecret=$clientSecret, code=$code, productionToken=$productionToken, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var grantType: GrantType? = null
        private var clientId: String? = null
        private var clientSecret: String? = null
        private var code: String? = null
        private var productionToken: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(oauthTokenCreateParams: OAuthTokenCreateParams) = apply {
            this.grantType = oauthTokenCreateParams.grantType
            this.clientId = oauthTokenCreateParams.clientId
            this.clientSecret = oauthTokenCreateParams.clientSecret
            this.code = oauthTokenCreateParams.code
            this.productionToken = oauthTokenCreateParams.productionToken
            additionalQueryParams(oauthTokenCreateParams.additionalQueryParams)
            additionalHeaders(oauthTokenCreateParams.additionalHeaders)
            additionalBodyProperties(oauthTokenCreateParams.additionalBodyProperties)
        }

        /**
         * The credential you request in exchange for the code. In Production, this is
         * always `authorization_code`. In Sandbox, you can pass either enum value.
         */
        fun grantType(grantType: GrantType) = apply {
            this.grantType = grantType
        }

        /** The public identifier for your application. */
        fun clientId(clientId: String) = apply {
            this.clientId = clientId
        }

        /**
         * The secret that confirms you own the application. This is redundent given that
         * the request is made with your API key but it's a required component of OAuth
         * 2.0.
         */
        fun clientSecret(clientSecret: String) = apply {
            this.clientSecret = clientSecret
        }

        /**
         * The authorization code generated by the user and given to you as a query
         * parameter.
         */
        fun code(code: String) = apply {
            this.code = code
        }

        /**
         * The production token you want to exchange for a sandbox token. This is only
         * available in Sandbox. Set `grant_type` to `production_token` to use this
         * parameter.
         */
        fun productionToken(productionToken: String) = apply {
            this.productionToken = productionToken
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

        fun removeHeader(name: String) = apply {
            this.additionalHeaders.put(name, mutableListOf())
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun build(): OAuthTokenCreateParams = OAuthTokenCreateParams(
            checkNotNull(grantType) {
                "`grantType` is required but was not set"
            },
            clientId,
            clientSecret,
            code,
            productionToken,
            additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalBodyProperties.toUnmodifiable(),
        )
    }

    class GrantType @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is GrantType &&
              this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val AUTHORIZATION_CODE = GrantType(JsonField.of("authorization_code"))

            @JvmField val PRODUCTION_TOKEN = GrantType(JsonField.of("production_token"))

            @JvmStatic fun of(value: String) = GrantType(JsonField.of(value))
        }

        enum class Known {
            AUTHORIZATION_CODE,
            PRODUCTION_TOKEN,
        }

        enum class Value {
            AUTHORIZATION_CODE,
            PRODUCTION_TOKEN,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            AUTHORIZATION_CODE -> Value.AUTHORIZATION_CODE
            PRODUCTION_TOKEN -> Value.PRODUCTION_TOKEN
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            AUTHORIZATION_CODE -> Known.AUTHORIZATION_CODE
            PRODUCTION_TOKEN -> Known.PRODUCTION_TOKEN
            else -> throw IncreaseInvalidDataException("Unknown GrantType: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }
}
