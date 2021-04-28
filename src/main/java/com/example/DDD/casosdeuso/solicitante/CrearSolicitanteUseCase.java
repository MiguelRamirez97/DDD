package com.example.DDD.casosdeuso.solicitante;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.example.DDD.domain.recurso.objetosdevalor.TipoCategoria;
import com.example.DDD.domain.solicitante.Solicitante;
import com.example.DDD.domain.solicitante.comandos.CrearSolicitante;
import com.example.DDD.domain.solicitante.eventos.SolicitanteCreado;
import com.example.DDD.domain.solicitante.objetosdevalor.*;

import java.util.List;

public class CrearSolicitanteUseCase extends UseCase<RequestCommand<CrearSolicitante>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearSolicitante> crearSolicitanteRequestCommand) {
        /*var command = crearSolicitanteRequestCommand.getCommand();

        var solicitante = new Solicitante(
                command.getSolicitanteId(),
                command.getDatosSolicitante(),
                command.getSancion(),
                command.getSolicitud(),
                command.getHistorialPrestamos());
        emit().onResponse(new ResponseEvents(solicitante.getUncommittedChanges()));*/

        emit().onResponse(new ResponseEvents(List.of(
                new SolicitanteCreado(new DatosSolicitante("miguel","migue",111L),
                        new Sancion(EstadoSancion.NOACTIVO,"hola",0L),
                        new Solicitud(TipoCategoria.EQUIPODECOMPUTO),
                        new HistorialPrestamos(3L))
        )));
    }
}
