package devindio.br.com.receptionProducer.configuration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.annotation.PostConstruct;


@Slf4j
@Configuration
public class RabbitConfig {

    private final Environment env;

    private final AmqpAdmin amqpAdmin;

    public RabbitConfig(Environment env, AmqpAdmin amqpAdmin) {
        this.env = env;
        this.amqpAdmin = amqpAdmin;
    }

    @Bean
    public Jackson2JsonMessageConverter converter() {
        return new Jackson2JsonMessageConverter();
    }

    @PostConstruct
    public void createQueue() {
        log.info("-------- CRIANDO FILA ------------");
        amqpAdmin.declareQueue(new Queue(env.getProperty("rabbitmq.message.qeue.name"), true));
        log.info("-------- FILA CRIADA  ------------");

    }
}
