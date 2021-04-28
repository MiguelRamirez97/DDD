package com.example.DDD.domain.recurso.objetosdevalor;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CodigoBarras implements ValueObject<String>{

    private final String codigoDeBarras;

    public CodigoBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public String value() {
        return codigoDeBarras;
    }
}
