package devindio.br.com.receptionProducer.producer;

import devindio.br.com.receptionProducer.dto.ClientDTO;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class ClientImpl implements Client{

    private final Environment env;

    final RabbitTemplate rabbitTemplate;

    public ClientImpl(Environment env, RabbitTemplate rabbitTemplate) {
        this.env = env;
        this.rabbitTemplate = rabbitTemplate;
    }

    @Override
    public void sendToQueue(ClientDTO dto) {

        rabbitTemplate.convertAndSend(env.getProperty("rabbitmq.message.qeue.name"), dto);

    }

}
