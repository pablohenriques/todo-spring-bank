package springboot.tutorial.thenewbank

import org.springframework.stereotype.Service
import springboot.tutorial.thenewbank.datasource.BankDataSource
import springboot.tutorial.thenewbank.model.Bank

@Service
class BankService(private val dataSource: BankDataSource) {

    fun getBanks(): Collection<Bank> = dataSource.retriveBanks()
    fun getBank(accountNumber: String): Bank = dataSource.retrieveBank(accountNumber)

}