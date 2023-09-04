package springboot.tutorial.thenewbank.datasource

import springboot.tutorial.thenewbank.model.Bank

interface BankDataSource {

    fun retriveBanks(): Collection<Bank>
}