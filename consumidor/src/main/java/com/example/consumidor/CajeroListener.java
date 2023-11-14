package com.example.consumidor;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class CajeroListener {


    @RabbitListener(queues = {"com.consumidor.cons1"})
    public void recibirClienteConsignacion(String nombreCliente) throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Atentiendo al cliente: " + nombreCliente);
    }

    @RabbitListener(queues = {"com.consumidor.cons1"})
    public void recibirClienteAperturaProductos(String nombreCliente) throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Atentiendo al cliente para abrir cajero: " + nombreCliente);
    }


}
