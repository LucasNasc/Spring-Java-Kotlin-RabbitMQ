package devindio.br.com.cleaningConsumer.configuration

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class RabbitConfig {

    @Bean
    fun converter(): Jackson2JsonMessageConverter? {
        return Jackson2JsonMessageConverter()
    }
}
