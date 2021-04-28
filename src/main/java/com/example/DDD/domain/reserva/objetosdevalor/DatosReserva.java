package com.example.DDD.domain.reserva.objetosdevalor;

import co.com.sofka.domain.generic.ValueObject;
import com.example.DDD.domain.recurso.objetosdevalor.RecursoId;

import java.time.*;

public class DatosReserva implements ValueObject<DatosReserva.Value> {
    protected LocalDate fechaInicio;
    protected LocalDate fechaFinal;
    protected String recursoId;

    public DatosReserva(LocalDate fechaInicio,LocalDate fechaFinal,String recursoId){
        this.fechaInicio=fechaInicio;
        this.fechaFinal=fechaFinal;
        this.recursoId=recursoId;
    }

    @Override
    public DatosReserva.Value value(){
        return new DatosReserva.Value() {
            @Override
            public LocalDate fechaInicio() {
                return fechaInicio;
            }

            @Override
            public LocalDate fechaFinal() {
                return fechaFinal;
            }

            @Override
            public String recursoId() {
                return recursoId;
            }
        };
    }
    public interface Value {
        LocalDate fechaInicio();

        LocalDate fechaFinal();

        String  recursoId();
    }
}
