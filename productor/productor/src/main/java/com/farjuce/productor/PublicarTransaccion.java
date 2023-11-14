package com.farjuce.productor;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
public class PublicarTransaccion {

    private RabbitTemplate rabbitTemplate;

    public PublicarTransaccion(RabbitTemplate rabbitTemplate){
        this.rabbitTemplate=rabbitTemplate;
    }

    public void enviarTransaccion (String codigoTransaccion){
        rabbitTemplate.convertAndSend("otro","farjuce",codigoTransaccion);
    }
}
