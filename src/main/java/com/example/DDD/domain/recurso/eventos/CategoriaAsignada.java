package com.example.DDD.domain.recurso.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import com.example.DDD.domain.recurso.objetosdevalor.CategoriaId;
import com.example.DDD.domain.recurso.objetosdevalor.CodigoBarras;
import com.example.DDD.domain.recurso.objetosdevalor.CondicionPrestamo;
import com.example.DDD.domain.recurso.objetosdevalor.TipoCategoria;

public class CategoriaAsignada extends DomainEvent {
    private final CategoriaId categoriaId;
    private final CodigoBarras codigoBarras;
    private final TipoCategoria tipoCategoria;
    private final CondicionPrestamo condicionPrestamo;

    public CategoriaAsignada(CategoriaId categoriaId,CodigoBarras codigoBarras, TipoCategoria tipoCategoria,
                             CondicionPrestamo condicionPrestamo) {
        super("centrodeprestamos.agregados.recurso.categoriaasignada");
        this.categoriaId = categoriaId;
        this.codigoBarras = codigoBarras;
        this.tipoCategoria = tipoCategoria;
        this.condicionPrestamo = condicionPrestamo;
    }

    public CategoriaId getCategoriaId() {
        return categoriaId;
    }

    public CodigoBarras getCodigoBarras() {
        return codigoBarras;
    }

    public TipoCategoria getTipoCategoria() {
        return tipoCategoria;
    }

    public CondicionPrestamo getCondicionPrestamo() {
        return condicionPrestamo;
    }
}
