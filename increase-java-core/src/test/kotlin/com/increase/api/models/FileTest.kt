package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.increase.api.models.File

class FileTest {

    @Test
    fun createFile() {
      val file = File.builder()
          .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .id("string")
          .purpose(File.Purpose.CHECK_IMAGE_FRONT)
          .description("string")
          .direction(File.Direction.TO_INCREASE)
          .filename("string")
          .downloadUrl("string")
          .type(File.Type.FILE)
          .build()
      assertThat(file).isNotNull
      assertThat(file.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(file.id()).isEqualTo("string")
      assertThat(file.purpose()).isEqualTo(File.Purpose.CHECK_IMAGE_FRONT)
      assertThat(file.description()).contains("string")
      assertThat(file.direction()).isEqualTo(File.Direction.TO_INCREASE)
      assertThat(file.filename()).contains("string")
      assertThat(file.downloadUrl()).contains("string")
      assertThat(file.type()).isEqualTo(File.Type.FILE)
    }
}
