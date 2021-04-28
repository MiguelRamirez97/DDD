package com.example.DDD.casosdeuso.recurso;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import com.example.DDD.domain.recurso.comandos.CrearRecurso;
import com.example.DDD.domain.recurso.eventos.RecursoCreado;
import com.example.DDD.domain.recurso.objetosdevalor.EstadoRecurso;
import com.example.DDD.domain.recurso.objetosdevalor.Inventario;
import com.example.DDD.domain.recurso.objetosdevalor.RecursoId;
import com.example.DDD.domain.solicitante.eventos.SolicitanteCreado;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CrearRecursoUseCaseTest {

    @Test
    void crearNuevoRecurso(){
        var id = new RecursoId();
        var inventario = new Inventario(10L);
        var command = new CrearRecurso(id,EstadoRecurso.DISPONIBLE,inventario);
        var useCase = new CrearRecursoUseCase();

        List<DomainEvent> events = UseCaseHandler.getInstance().
                syncExecutor(useCase,new RequestCommand<>(command)).
                orElseThrow().
                getDomainEvents();

        RecursoCreado event = (RecursoCreado) events.get(0);
        Assertions.assertEquals(5L,event.getInventario().value());
        Assertions.assertEquals(EstadoRecurso.DISPONIBLE,event.getEstado());
    }

}