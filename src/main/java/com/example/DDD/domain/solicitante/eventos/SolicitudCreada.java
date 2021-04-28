package com.example.DDD.domain.solicitante.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import com.example.DDD.domain.solicitante.objetosdevalor.SolicitanteId;
import com.example.DDD.domain.solicitante.objetosdevalor.Solicitud;

public class SolicitudCreada extends DomainEvent {
    private final SolicitanteId solicitanteId;
    private final Solicitud solicitud;

    public SolicitudCreada(SolicitanteId solicitanteId, Solicitud solicitud) {
        super("centrodeprestamos.solicitante.solicitudcreada");
        this.solicitanteId = solicitanteId;
        this.solicitud = solicitud;
    }

    public SolicitanteId getSolicitanteId() {
        return solicitanteId;
    }

    public Solicitud getSolicitud() {
        return solicitud;
    }
}
