package springboot.tutorial.thenewbank

import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import springboot.tutorial.thenewbank.datasource.BankDataSource

internal class BankServiceTest {

    private val dataSource: BankDataSource = mockk()
    private val bankService = BankService(dataSource)


    @Test
    fun `should call its data source retrive banks`() {
        // given
        every { dataSource.retriveBanks() } returns emptyList()

        // when
        val banks = bankService.getBanks()

        // then
        verify(exactly = 1) { dataSource.retriveBanks() }

    }

}