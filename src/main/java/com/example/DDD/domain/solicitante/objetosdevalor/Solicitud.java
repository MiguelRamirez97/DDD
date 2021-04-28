package com.example.DDD.domain.solicitante.objetosdevalor;

import co.com.sofka.domain.generic.ValueObject;
import com.example.DDD.domain.recurso.objetosdevalor.TipoCategoria;

public class Solicitud implements ValueObject<TipoCategoria> {
    protected final TipoCategoria tipo;

    public Solicitud(TipoCategoria tipo) {
        this.tipo = tipo;
    }

    @Override
    public TipoCategoria value() {
        return tipo;
    }
}
