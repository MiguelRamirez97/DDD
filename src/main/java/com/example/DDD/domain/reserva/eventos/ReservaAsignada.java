package com.example.DDD.domain.reserva.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import com.example.DDD.domain.reserva.objetosdevalor.DatosReserva;
import com.example.DDD.domain.reserva.objetosdevalor.EstadoReserva;

public class ReservaAsignada extends DomainEvent {
    private EstadoReserva estadoReserva;
    private final DatosReserva datosReserva;

    public ReservaAsignada(EstadoReserva estadoReserva, DatosReserva datosReserva) {
        super("centrodeprestamos.agregados.reserva.reservaasignada");
        this.estadoReserva = estadoReserva;
        this.datosReserva = datosReserva;
    }

    public EstadoReserva getEstadoReserva() {
        return estadoReserva;
    }

    public DatosReserva getDatosReserva() {
        return datosReserva;
    }
}
