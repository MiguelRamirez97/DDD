package com.example.DDD.domain.solicitante.objetosdevalor;

import co.com.sofka.domain.generic.ValueObject;

public class Sancion implements ValueObject<Sancion.Value> {
    protected final EstadoSancion estadoSancion ;
    protected final String motivoSancion;
    protected final Long horasSancion;

    public Sancion(EstadoSancion estadoSancion,String motivoSancion,Long horasSancion) {
        this.estadoSancion = EstadoSancion.NOACTIVO;
        this.motivoSancion = motivoSancion;
        this.horasSancion = horasSancion;
    }
    @Override
    public Sancion.Value value() {
        return new Value(){
            @Override
            public EstadoSancion estadoSancion() {
                return estadoSancion;
            }

            @Override
            public String motivoSancion() {
                return motivoSancion;
            }

            @Override
            public Long horasSancion() {
                return horasSancion;
            }
        };
    }

    public interface Value {
        EstadoSancion estadoSancion();

        String motivoSancion();

        Long horasSancion();
    }

}
