package com.example.DDD.domain.solicitante.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import com.example.DDD.domain.solicitante.objetosdevalor.DatosSolicitante;
import com.example.DDD.domain.solicitante.objetosdevalor.SolicitanteId;

public class DatosAcualizados extends DomainEvent {
    private final SolicitanteId solicitanteId;
    private final DatosSolicitante nuevosDatos;

    public DatosAcualizados(SolicitanteId solicitanteId,DatosSolicitante nuevosDatos) {
        super("centrodeprestamos.solicitante.datosactualizados");
        this.solicitanteId=solicitanteId;
        this.nuevosDatos = nuevosDatos;
    }

    public SolicitanteId getSolicitanteId() {
        return solicitanteId;
    }

    public DatosSolicitante getNuevosDatos() {
        return nuevosDatos;
    }
}
