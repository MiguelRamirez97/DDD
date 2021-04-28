package com.example.DDD.domain.solicitante.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import com.example.DDD.domain.solicitante.Solicitante;
import com.example.DDD.domain.solicitante.objetosdevalor.*;

public class SolicitanteCreado extends DomainEvent {
    private final DatosSolicitante datosSolicitante;
    private Sancion sancion;
    private Solicitud solicitud;
    private HistorialPrestamos historialPrestamos;

    public SolicitanteCreado(DatosSolicitante datosSolicitante, Sancion sancion, Solicitud solicitud,
                             HistorialPrestamos historialPrestamos) {
        super("centrodeprestamos.agregados.solicitante.solicitantecreado");
        this.datosSolicitante = datosSolicitante;
        this.sancion = sancion;
        this.solicitud = solicitud;
        this.historialPrestamos = historialPrestamos;
    }

    public DatosSolicitante getDatosSolicitante() {
        return datosSolicitante;
    }

    public Sancion getSancion() {
        return sancion;
    }

    public Solicitud getSolicitud() {
        return solicitud;
    }

    public HistorialPrestamos getHistorialPrestamos() {
        return historialPrestamos;
    }
}
