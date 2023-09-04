package springboot.tutorial.thenewbank

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ThenewbankApplication

fun main(args: Array<String>) {
	runApplication<ThenewbankApplication>(*args)
}
