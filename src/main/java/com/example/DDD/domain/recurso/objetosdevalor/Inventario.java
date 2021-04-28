package com.example.DDD.domain.recurso.objetosdevalor;

import co.com.sofka.domain.generic.ValueObject;

public class Inventario implements ValueObject<Long> {
    protected final Long inventario;

    public Inventario(Long inventario) {
        this.inventario = inventario;
    }

    @Override
    public Long value() {
        return inventario;
    }
}
