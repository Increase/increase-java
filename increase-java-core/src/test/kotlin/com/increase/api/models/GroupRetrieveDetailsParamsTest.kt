package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.increase.api.models.*

class GroupRetrieveDetailsParamsTest {

    @Test
    fun createGroupRetrieveDetailsParams() {
      GroupRetrieveDetailsParams.builder().build()
    }
}
