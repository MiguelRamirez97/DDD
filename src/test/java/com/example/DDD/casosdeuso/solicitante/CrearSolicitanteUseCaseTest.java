package com.example.DDD.casosdeuso.solicitante;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import com.example.DDD.domain.recurso.objetosdevalor.TipoCategoria;
import com.example.DDD.domain.solicitante.comandos.CrearSolicitante;
import com.example.DDD.domain.solicitante.eventos.SolicitanteCreado;
import com.example.DDD.domain.solicitante.objetosdevalor.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class CrearSolicitanteUseCaseTest {

    @Test
    void crearNuevoSolicitante(){
        var id = new SolicitanteId();
        var datosSolicitante = new DatosSolicitante("miguel","migue",111L);
        var sancion = new Sancion(EstadoSancion.NOACTIVO,"hola",0L);
        var solicitud = new Solicitud(TipoCategoria.EQUIPODECOMPUTO);
        var historialPrestamos = new HistorialPrestamos(3L);
        var command = new CrearSolicitante(id,datosSolicitante, solicitud, sancion,historialPrestamos);
        var useCase = new CrearSolicitanteUseCase();

        List<DomainEvent> events = UseCaseHandler.getInstance().
                syncExecutor(useCase,new RequestCommand<>(command)).
                orElseThrow().
                getDomainEvents();

        SolicitanteCreado event = (SolicitanteCreado) events.get(0);
        Assertions.assertEquals("miguel",event.getDatosSolicitante().value().nombre());
        Assertions.assertEquals("migue",event.getDatosSolicitante().value().correo());
        Assertions.assertEquals(111L,event.getDatosSolicitante().value().numeroCelular());
        Assertions.assertEquals(EstadoSancion.NOACTIVO,event.getSancion().value().estadoSancion());
        Assertions.assertEquals("hola",event.getSancion().value().motivoSancion());
        Assertions.assertEquals(0L,event.getSancion().value().horasSancion());
        Assertions.assertEquals(TipoCategoria.EQUIPODECOMPUTO,event.getSolicitud().value());
        Assertions.assertEquals(3L,event.getHistorialPrestamos().value());
    }

}