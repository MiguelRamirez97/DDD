package com.example.DDD.domain.recurso.objetosdevalor;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CondicionPrestamo implements ValueObject<CondicionPrestamo.Value> {
    protected final Long MaximoHorasPrestamo;
    protected final PrestamoCategoria prestamoCategoria;

    public CondicionPrestamo(Long MaximoHorasPrestamo, PrestamoCategoria prestamoCategoria) {
        this.MaximoHorasPrestamo = Objects.requireNonNull(MaximoHorasPrestamo);
        this.prestamoCategoria = prestamoCategoria;
    }
    @Override
    public CondicionPrestamo.Value value() {
        return new Value() {
            @Override
            public Long MaximoHorasPrestamo() {
                return MaximoHorasPrestamo;
            }

            @Override
            public PrestamoCategoria prestamoCategoria() {
                return prestamoCategoria;
            }
        };
    }

    public interface Value {
        Long MaximoHorasPrestamo();

        PrestamoCategoria prestamoCategoria();
    }

}
