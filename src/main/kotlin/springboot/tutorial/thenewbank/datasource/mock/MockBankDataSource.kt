package springboot.tutorial.thenewbank.datasource.mock

import org.springframework.stereotype.Repository
import springboot.tutorial.thenewbank.datasource.BankDataSource
import springboot.tutorial.thenewbank.model.Bank

@Repository
class MockBankDataSource : BankDataSource {

    val banks = listOf(
        Bank("78955", 1.0, 91),
        Bank("78912", 2.0, 92),
        Bank("78956", 3.0, 93)
    )

    override fun retriveBanks(): Collection<Bank>  = banks

    override fun retrieveBank(accountNumber: String): Bank =
        banks.firstOrNull() { it.accountNumber == accountNumber }
            ?: throw NoSuchElementException("Could not find a bank with account number $accountNumber")

}