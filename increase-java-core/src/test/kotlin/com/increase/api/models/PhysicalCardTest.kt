// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.increase.api.core.JsonNull
import com.increase.api.core.JsonString
import com.increase.api.core.JsonValue
import com.increase.api.models.PhysicalCard

class PhysicalCardTest {

    @Test
    fun createPhysicalCard() {
      val physicalCard = PhysicalCard.builder()
          .id("id")
          .cardId("card_id")
          .cardholder(PhysicalCard.Cardholder.builder()
              .firstName("first_name")
              .lastName("last_name")
              .build())
          .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .idempotencyKey("idempotency_key")
          .physicalCardProfileId("physical_card_profile_id")
          .shipment(PhysicalCard.Shipment.builder()
              .address(PhysicalCard.Shipment.Address.builder()
                  .city("city")
                  .line1("line1")
                  .line2("line2")
                  .line3("line3")
                  .name("name")
                  .postalCode("postal_code")
                  .state("state")
                  .build())
              .method(PhysicalCard.Shipment.Method.USPS)
              .status(PhysicalCard.Shipment.Status.PENDING)
              .tracking(PhysicalCard.Shipment.Tracking.builder()
                  .number("number")
                  .returnNumber("return_number")
                  .returnReason("return_reason")
                  .shippedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .build())
              .build())
          .status(PhysicalCard.Status.ACTIVE)
          .type(PhysicalCard.Type.PHYSICAL_CARD)
          .build()
      assertThat(physicalCard).isNotNull
      assertThat(physicalCard.id()).isEqualTo("id")
      assertThat(physicalCard.cardId()).isEqualTo("card_id")
      assertThat(physicalCard.cardholder()).isEqualTo(PhysicalCard.Cardholder.builder()
          .firstName("first_name")
          .lastName("last_name")
          .build())
      assertThat(physicalCard.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(physicalCard.idempotencyKey()).contains("idempotency_key")
      assertThat(physicalCard.physicalCardProfileId()).contains("physical_card_profile_id")
      assertThat(physicalCard.shipment()).isEqualTo(PhysicalCard.Shipment.builder()
          .address(PhysicalCard.Shipment.Address.builder()
              .city("city")
              .line1("line1")
              .line2("line2")
              .line3("line3")
              .name("name")
              .postalCode("postal_code")
              .state("state")
              .build())
          .method(PhysicalCard.Shipment.Method.USPS)
          .status(PhysicalCard.Shipment.Status.PENDING)
          .tracking(PhysicalCard.Shipment.Tracking.builder()
              .number("number")
              .returnNumber("return_number")
              .returnReason("return_reason")
              .shippedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .build())
          .build())
      assertThat(physicalCard.status()).isEqualTo(PhysicalCard.Status.ACTIVE)
      assertThat(physicalCard.type()).isEqualTo(PhysicalCard.Type.PHYSICAL_CARD)
    }
}
