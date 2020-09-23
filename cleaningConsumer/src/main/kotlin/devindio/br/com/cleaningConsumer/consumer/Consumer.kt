package devindio.br.com.cleaningConsumer.consumer

import devindio.br.com.receptionProducer.dto.ClientDTO
import org.springframework.amqp.rabbit.annotation.RabbitHandler
import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.stereotype.Component

@Component
@RabbitListener(queues = ["clientQueue"])
class Consumer {

    @RabbitHandler
    fun receive(client: ClientDTO) {
        println("Nome do cliente: '${client.name}' e Idade: '${client.age}")
    }

}
