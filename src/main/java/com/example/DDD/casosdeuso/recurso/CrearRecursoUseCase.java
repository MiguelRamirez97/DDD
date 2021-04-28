package com.example.DDD.casosdeuso.recurso;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.example.DDD.domain.recurso.Recurso;
import com.example.DDD.domain.recurso.comandos.CrearRecurso;
import com.example.DDD.domain.recurso.eventos.RecursoCreado;
import com.example.DDD.domain.recurso.objetosdevalor.EstadoRecurso;
import com.example.DDD.domain.recurso.objetosdevalor.Inventario;

import java.awt.geom.RectangularShape;
import java.util.List;

public class CrearRecursoUseCase extends UseCase<RequestCommand<CrearRecurso>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearRecurso> crearRecursoRequestCommand){
        /*var command = crearRecursoRequestCommand.getCommand();
        var recurso = new Recurso(command.getRecursoId(),command.getEstado(), command.getInventario());
        emit().onResponse(new ResponseEvents(recurso.getUncommittedChanges()));*/
        emit().onResponse(new ResponseEvents(List.of(
                new RecursoCreado(EstadoRecurso.DISPONIBLE,
                        new Inventario(5L))
        )));
    }
}
