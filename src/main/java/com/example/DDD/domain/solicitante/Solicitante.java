package com.example.DDD.domain.solicitante;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.example.DDD.domain.solicitante.eventos.DatosAcualizados;
import com.example.DDD.domain.solicitante.eventos.SolicitanteCreado;
import com.example.DDD.domain.solicitante.eventos.SolicitudCreada;
import com.example.DDD.domain.solicitante.objetosdevalor.*;

import java.util.List;

public class Solicitante extends AggregateEvent<SolicitanteId> {
    protected DatosSolicitante datosSolicitante;
    protected Solicitud solicitud;
    protected Sancion sancion;
    protected HistorialPrestamos historialPrestamos;

    public Solicitante(SolicitanteId entityId,DatosSolicitante datosSolicitante,Sancion sancion,
                       Solicitud solicitud,HistorialPrestamos historialPrestamos) {
        super(entityId);
        appendChange(new SolicitanteCreado(datosSolicitante,sancion,solicitud,historialPrestamos)).apply();
    }

    private Solicitante(SolicitanteId entityId){
        super(entityId);
        subscribe(new SolicitanteChange(this));
    }

    public static Solicitante from(SolicitanteId entityId, List<DomainEvent> eventList) {
        var solicitante = new Solicitante(entityId);
        eventList.forEach(solicitante::applyEvent);
        return solicitante;
    }

    public void actualizarDatosSolicitante(SolicitanteId solicitanteId,String nombre,String correo,Long numeroCelular){
        DatosSolicitante nuevosDatos = new DatosSolicitante(nombre,correo,numeroCelular);
        appendChange(new DatosAcualizados(solicitanteId,nuevosDatos)).apply();
    }

    public void crearSolicitud(SolicitanteId solicitanteId,Solicitud solicitud){
        appendChange(new SolicitudCreada(solicitanteId,solicitud)).apply();
    }

}
