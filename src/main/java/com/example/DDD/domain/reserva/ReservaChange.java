package com.example.DDD.domain.reserva;

import co.com.sofka.domain.generic.EventChange;
import com.example.DDD.domain.reserva.eventos.ReservaAsignada;

public class ReservaChange extends EventChange {
    public ReservaChange(Reserva reserva) {
        apply((ReservaAsignada event)->{
            reserva.estadoReserva=event.getEstadoReserva();
            reserva.datosReserva= event.getDatosReserva();
        });
    }
}
