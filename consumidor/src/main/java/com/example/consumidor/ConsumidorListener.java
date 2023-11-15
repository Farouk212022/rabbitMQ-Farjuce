package com.example.consumidor;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumidorListener {

    Logica logica = new Logica();
    @RabbitListener(queues = {"com.consumidor.cons1"})
    public void recibirTransferencia(String json) throws InterruptedException, JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();
        TransaccionDTO transaccionDTO = mapper.readValue(json, TransaccionDTO.class);

        System.out.println("Atentiendo al cliente: " + transaccionDTO.getNombreCliente()+" le manda a "+transaccionDTO.getNombreReceptor());
    }




}
