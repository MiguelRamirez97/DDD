package com.example.DDD.casosdeuso.reserva;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.example.DDD.domain.recurso.objetosdevalor.RecursoId;
import com.example.DDD.domain.reserva.Reserva;
import com.example.DDD.domain.reserva.comandos.AsignarReserva;
import com.example.DDD.domain.reserva.eventos.ReservaAsignada;
import com.example.DDD.domain.reserva.objetosdevalor.DatosReserva;
import com.example.DDD.domain.reserva.objetosdevalor.EstadoReserva;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class AsignarReservaUseCase extends UseCase<RequestCommand<AsignarReserva>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AsignarReserva> asignarReservaRequestCommand) {

        /*var command = asignarReservaRequestCommand.getCommand();
        var reserva = new Reserva(command.getReservaId(), command.getEstadoReserva(), command.getDatosReserva());

        emit().onResponse(new ResponseEvents(
                reserva.getUncommittedChanges()*/
            emit().onResponse(new ResponseEvents(List.of(
                    new ReservaAsignada(EstadoReserva.REALIZADA,
                            new DatosReserva(LocalDate.of(2021, Month.APRIL, 5), LocalDate.of(2021, Month.APRIL, 10), "2"))
            )));

    }
}
