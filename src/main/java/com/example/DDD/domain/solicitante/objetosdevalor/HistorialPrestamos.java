package com.example.DDD.domain.solicitante.objetosdevalor;

import co.com.sofka.domain.generic.ValueObject;

public class HistorialPrestamos implements ValueObject<Long> {
    protected Long cantidadRecursosPrestados;

    public HistorialPrestamos(Long cantidadRecursosPrestados){
        this.cantidadRecursosPrestados=cantidadRecursosPrestados;
    }

    @Override
    public Long value() {
        return cantidadRecursosPrestados;
    }
}
