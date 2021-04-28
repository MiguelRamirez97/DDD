package com.example.DDD.domain.reserva.comandos;

import co.com.sofka.domain.generic.Command;
import com.example.DDD.domain.reserva.objetosdevalor.DatosReserva;
import com.example.DDD.domain.reserva.objetosdevalor.EstadoReserva;
import com.example.DDD.domain.reserva.objetosdevalor.ReservaId;

public class AsignarReserva implements Command {
    private final ReservaId reservaId;
    private final EstadoReserva estadoReserva;
    private final DatosReserva datosReserva;

    public AsignarReserva(ReservaId reservaId, EstadoReserva estadoReserva, DatosReserva datosReserva) {
        this.reservaId = reservaId;
        this.estadoReserva = estadoReserva;
        this.datosReserva = datosReserva;
    }

    public ReservaId getReservaId() {
        return reservaId;
    }

    public EstadoReserva getEstadoReserva() {
        return estadoReserva;
    }

    public DatosReserva getDatosReserva() {
        return datosReserva;
    }
}
