package devindio.br.com.receptionProducer.controller;

import devindio.br.com.receptionProducer.dto.ClientDTO;
import devindio.br.com.receptionProducer.producer.Client;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/producer")
public class receptionController {

    @Autowired
    Client client;

    @PostMapping()
    public ResponseEntity pushToQueue(@RequestBody ClientDTO dto) {

        client.sendToQueue(dto);

        return ResponseEntity.ok().build();

    }

}
