// File generated from our OpenAPI spec by Stainless.

package com.increase.api.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.core.jsonMapper
import com.increase.api.models.accounts.Account
import java.time.LocalDate
import java.time.OffsetDateTime
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream("META-INF/proguard/increase-java-core.pro")

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = IncreaseOkHttpClient.builder().apiKey("My API Key").build()

        assertThat(client).isNotNull()
        assertThat(client.accounts()).isNotNull()
        assertThat(client.accountNumbers()).isNotNull()
        assertThat(client.accountTransfers()).isNotNull()
        assertThat(client.cards()).isNotNull()
        assertThat(client.cardPayments()).isNotNull()
        assertThat(client.cardPurchaseSupplements()).isNotNull()
        assertThat(client.physicalCards()).isNotNull()
        assertThat(client.digitalCardProfiles()).isNotNull()
        assertThat(client.physicalCardProfiles()).isNotNull()
        assertThat(client.digitalWalletTokens()).isNotNull()
        assertThat(client.transactions()).isNotNull()
        assertThat(client.pendingTransactions()).isNotNull()
        assertThat(client.declinedTransactions()).isNotNull()
        assertThat(client.achTransfers()).isNotNull()
        assertThat(client.achPrenotifications()).isNotNull()
        assertThat(client.inboundAchTransfers()).isNotNull()
        assertThat(client.wireTransfers()).isNotNull()
        assertThat(client.inboundWireTransfers()).isNotNull()
        assertThat(client.wireDrawdownRequests()).isNotNull()
        assertThat(client.inboundWireDrawdownRequests()).isNotNull()
        assertThat(client.checkTransfers()).isNotNull()
        assertThat(client.inboundCheckDeposits()).isNotNull()
        assertThat(client.realTimePaymentsTransfers()).isNotNull()
        assertThat(client.inboundRealTimePaymentsTransfers()).isNotNull()
        assertThat(client.checkDeposits()).isNotNull()
        assertThat(client.lockboxes()).isNotNull()
        assertThat(client.inboundMailItems()).isNotNull()
        assertThat(client.routingNumbers()).isNotNull()
        assertThat(client.externalAccounts()).isNotNull()
        assertThat(client.entities()).isNotNull()
        assertThat(client.supplementalDocuments()).isNotNull()
        assertThat(client.programs()).isNotNull()
        assertThat(client.accountStatements()).isNotNull()
        assertThat(client.files()).isNotNull()
        assertThat(client.fileLinks()).isNotNull()
        assertThat(client.documents()).isNotNull()
        assertThat(client.exports()).isNotNull()
        assertThat(client.events()).isNotNull()
        assertThat(client.eventSubscriptions()).isNotNull()
        assertThat(client.realTimeDecisions()).isNotNull()
        assertThat(client.bookkeepingAccounts()).isNotNull()
        assertThat(client.bookkeepingEntrySets()).isNotNull()
        assertThat(client.bookkeepingEntries()).isNotNull()
        assertThat(client.groups()).isNotNull()
        assertThat(client.oauthApplications()).isNotNull()
        assertThat(client.oauthConnections()).isNotNull()
        assertThat(client.oauthTokens()).isNotNull()
        assertThat(client.intrafiAccountEnrollments()).isNotNull()
        assertThat(client.intrafiBalances()).isNotNull()
        assertThat(client.intrafiExclusions()).isNotNull()
        assertThat(client.cardTokens()).isNotNull()
        assertThat(client.cardPushTransfers()).isNotNull()
        assertThat(client.cardValidations()).isNotNull()
        assertThat(client.simulations()).isNotNull()
    }

    @Test
    fun accountRoundtrip() {
        val jsonMapper = jsonMapper()
        val account =
            Account.builder()
                .id("account_in71c4amph0vgo2qllky")
                .accountRevenueRate(null)
                .bank(Account.Bank.FIRST_INTERNET_BANK)
                .closedAt(null)
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .currency(Account.Currency.USD)
                .entityId("entity_n8y8tnk2p9339ti393yi")
                .idempotencyKey(null)
                .informationalEntityId(null)
                .interestAccrued("0.01")
                .interestAccruedAt(LocalDate.parse("2020-01-31"))
                .interestRate("0.055")
                .name("My first account!")
                .programId("program_i2v2os4mwza1oetokh9i")
                .status(Account.Status.OPEN)
                .type(Account.Type.ACCOUNT)
                .build()

        val roundtrippedAccount =
            jsonMapper.readValue(jsonMapper.writeValueAsString(account), jacksonTypeRef<Account>())

        assertThat(roundtrippedAccount).isEqualTo(account)
    }
}
