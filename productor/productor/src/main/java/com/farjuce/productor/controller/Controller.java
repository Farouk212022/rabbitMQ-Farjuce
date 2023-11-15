package com.farjuce.productor.controller;

import com.farjuce.productor.logic.LogicaTransaccion;
import com.farjuce.productor.controller.dto.TransaccionDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    LogicaTransaccion logicaTransaccion;

    public Controller(LogicaTransaccion logicaTransaccion){
        this.logicaTransaccion = logicaTransaccion;
    }
    @PostMapping(path="/enviar/transaccion")
    public void enviar(@RequestBody TransaccionDTO transaccionDTO) throws JsonProcessingException {
        logicaTransaccion.enviarTransaccion(transaccionDTO);
    }
}
