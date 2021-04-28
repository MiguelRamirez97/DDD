package com.example.DDD.domain.solicitante.comandos;

import co.com.sofka.domain.generic.Command;
import com.example.DDD.domain.solicitante.objetosdevalor.*;

public class CrearSolicitante implements Command {
    private final SolicitanteId solicitanteId;
    private final DatosSolicitante datosSolicitante;
    private final Solicitud solicitud;
    private final Sancion sancion;
    private final HistorialPrestamos historialPrestamos;

    public CrearSolicitante(SolicitanteId solicitanteId, DatosSolicitante datosSolicitante, Solicitud solicitud,
                            Sancion sancion, HistorialPrestamos historialPrestamos) {
        this.solicitanteId = solicitanteId;
        this.datosSolicitante = datosSolicitante;
        this.solicitud = solicitud;
        this.sancion = sancion;
        this.historialPrestamos = historialPrestamos;
    }

    public SolicitanteId getSolicitanteId() {
        return solicitanteId;
    }

    public DatosSolicitante getDatosSolicitante() {
        return datosSolicitante;
    }


    public Sancion getSancion() {
        return sancion;
    }

    public HistorialPrestamos getHistorialPrestamos() {
        return historialPrestamos;
    }

    public Solicitud getSolicitud() { return solicitud;}

}
