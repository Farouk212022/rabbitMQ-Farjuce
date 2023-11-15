package com.farjuce.productor.logic;

import com.farjuce.productor.controller.dto.TransaccionDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Component
public class LogicaTransaccion {

    private RabbitTemplate rabbitTemplate;

    private int contador;

    public LogicaTransaccion(RabbitTemplate rabbitTemplate){
        this.rabbitTemplate=rabbitTemplate;
        this.contador=0;
    }

    public void enviarTransaccion (TransaccionDTO transaccionDTO) throws JsonProcessingException {
        this.contador++;
        transaccionDTO.setCodigoTransaccion("Transaccion-"+this.contador);
        String fechaTransaccion = LocalDateTime.now().toString();
        transaccionDTO.setFechaTransaccion(fechaTransaccion);

        ObjectMapper mapper = new ObjectMapper();
        String jsonTransaccion = mapper.writeValueAsString(transaccionDTO);
        rabbitTemplate.convertAndSend("transaccion-exchange","farjuce",jsonTransaccion);

    }
}
