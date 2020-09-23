package devindio.br.com.receptionProducer.producer;

import devindio.br.com.receptionProducer.dto.ClientDTO;

public interface Client {

    void sendToQueue(ClientDTO dto);

}
