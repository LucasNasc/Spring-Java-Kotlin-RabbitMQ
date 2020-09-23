package devindio.br.com.cleaningConsumer

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class CleaningConsumerApplication

fun main(args: Array<String>) {
	runApplication<CleaningConsumerApplication>(*args)

}



