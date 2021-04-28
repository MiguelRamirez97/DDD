package com.example.DDD.domain.solicitante;

import co.com.sofka.domain.generic.EventChange;
import com.example.DDD.domain.solicitante.eventos.DatosAcualizados;
import com.example.DDD.domain.solicitante.eventos.SolicitanteCreado;
import com.example.DDD.domain.solicitante.eventos.SolicitudCreada;

public class SolicitanteChange extends EventChange {
    public SolicitanteChange(Solicitante solicitante) {
        apply((SolicitanteCreado event) ->{
            solicitante.datosSolicitante=event.getDatosSolicitante();
            solicitante.sancion = event.getSancion();
            solicitante.historialPrestamos=event.getHistorialPrestamos();
        });
        apply((DatosAcualizados event) ->{
            solicitante.datosSolicitante=event.getNuevosDatos();
        });
        apply((SolicitudCreada event) -> {
            solicitante.solicitud=event.getSolicitud();
        });
    }
}
