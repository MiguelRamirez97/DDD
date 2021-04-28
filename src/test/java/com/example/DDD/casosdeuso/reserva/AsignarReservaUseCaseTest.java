package com.example.DDD.casosdeuso.reserva;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import com.example.DDD.casosdeuso.recurso.CrearRecursoUseCase;
import com.example.DDD.domain.recurso.comandos.CrearRecurso;
import com.example.DDD.domain.recurso.eventos.RecursoCreado;
import com.example.DDD.domain.recurso.objetosdevalor.EstadoRecurso;
import com.example.DDD.domain.recurso.objetosdevalor.Inventario;
import com.example.DDD.domain.recurso.objetosdevalor.RecursoId;
import com.example.DDD.domain.reserva.comandos.AsignarReserva;
import com.example.DDD.domain.reserva.eventos.ReservaAsignada;
import com.example.DDD.domain.reserva.objetosdevalor.DatosReserva;
import com.example.DDD.domain.reserva.objetosdevalor.EstadoReserva;
import com.example.DDD.domain.reserva.objetosdevalor.ReservaId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AsignarReservaUseCaseTest {
    @Test
    void asignarNuevaReserva() throws ParseException {
        var id = new ReservaId();
        var estadoReserva = EstadoReserva.REALIZADA;
        var datosReserva = new DatosReserva(LocalDate.of(2021, Month.APRIL,1),
                LocalDate.of(2021,Month.APRIL,2),"3");
        var command = new AsignarReserva(id,estadoReserva,datosReserva);
        var useCase = new AsignarReservaUseCase();

        List<DomainEvent> events = UseCaseHandler.getInstance().
                syncExecutor(useCase,new RequestCommand<>(command)).
                orElseThrow().
                getDomainEvents();

        ReservaAsignada event = (ReservaAsignada) events.get(0);
        Assertions.assertEquals(EstadoReserva.REALIZADA,event.getEstadoReserva());
        Assertions.assertEquals(LocalDate.of(2021, Month.APRIL,5),event.getDatosReserva().value().fechaInicio());
        Assertions.assertEquals(LocalDate.of(2021,Month.APRIL,10),event.getDatosReserva().value().fechaFinal());
        Assertions.assertEquals("2",event.getDatosReserva().value().recursoId());
    }


}