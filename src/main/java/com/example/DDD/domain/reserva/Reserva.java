package com.example.DDD.domain.reserva;

import co.com.sofka.domain.generic.AggregateEvent;
import com.example.DDD.domain.reserva.eventos.ReservaAsignada;
import com.example.DDD.domain.reserva.objetosdevalor.DatosReserva;
import com.example.DDD.domain.reserva.objetosdevalor.EstadoReserva;
import com.example.DDD.domain.reserva.objetosdevalor.ReservaId;

public class Reserva extends AggregateEvent<ReservaId> {
    protected EstadoReserva estadoReserva;
    protected DatosReserva datosReserva;

    public Reserva(ReservaId entityId,EstadoReserva estadoReserva,DatosReserva datosReserva) {
        super(entityId);
        appendChange(new ReservaAsignada(estadoReserva.REALIZADA,datosReserva));
    }

    private Reserva(ReservaId entityId){
        super(entityId);
        subscribe(new ReservaChange(this));
    }
}
