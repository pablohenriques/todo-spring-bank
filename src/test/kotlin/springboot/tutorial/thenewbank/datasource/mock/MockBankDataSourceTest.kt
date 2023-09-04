package springboot.tutorial.thenewbank.datasource.mock

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MockBankDataSourceTest {

    private val mockBankDataSource = MockBankDataSource()

    @Test
    fun `should provide a collection of banks`() {
        val banks = mockBankDataSource.retriveBanks()
//        assertThat(banks).isNotEmpty()
        assertThat(banks.size).isGreaterThanOrEqualTo(3)
    }

    @Test
    fun `should provide some mock data`() {
        val banks = mockBankDataSource.retriveBanks()
//        assertThat(banks).allSatisfy { it.accountNumber.isNotBlank() }
        assertThat(banks).allMatch { it.accountNumber.isNotBlank() }
        assertThat(banks).anyMatch { it.trust != 0.0 }
        assertThat(banks).anyMatch { it.transactinoFee != 0 }
    }
}