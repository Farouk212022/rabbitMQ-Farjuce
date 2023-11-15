package com.farjuce.productor.controller.dto;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDateTime;
@Data
@RequiredArgsConstructor
public class TransaccionDTO {


    public String getCodigoTransaccion() {
        return codigoTransaccion;
    }

    public void setCodigoTransaccion(String codigoTransaccion) {
        this.codigoTransaccion = codigoTransaccion;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNombreReceptor() {
        return nombreReceptor;
    }

    public void setNombreReceptor(String nombreReceptor) {
        this.nombreReceptor = nombreReceptor;
    }

    public int getValorTransaccion() {
        return valorTransaccion;
    }

    public void setValorTransaccion(int valorTransaccion) {
        this.valorTransaccion = valorTransaccion;
    }

    public String getFechaTransaccion() {
        return fechaTransaccion;
    }

    public void setFechaTransaccion(String fechaTransaccion) {
        this.fechaTransaccion = fechaTransaccion;
    }

    private String codigoTransaccion;
    @NotNull
    private String nombreCliente;
    @NotNull
    private String nombreReceptor;
    @NotNull
    private int valorTransaccion;

    private String fechaTransaccion;


}
