package com.farjuce.productor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    PublicarTransaccion publicarTransaccion;

    public Controller(PublicarTransaccion publicarTransaccion){
        this.publicarTransaccion=publicarTransaccion;
    }
    @GetMapping(path="/enviarTransaccion/{codigoTransaccion}")
    public void enviarAlBanco(@PathVariable String codigoTransaccion){
        publicarTransaccion.enviarTransaccion(codigoTransaccion);
    }
}
