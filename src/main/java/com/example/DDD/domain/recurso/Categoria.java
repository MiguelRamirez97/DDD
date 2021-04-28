package com.example.DDD.domain.recurso;

import co.com.sofka.domain.generic.Entity;
import com.example.DDD.domain.recurso.objetosdevalor.CategoriaId;
import com.example.DDD.domain.recurso.objetosdevalor.CodigoBarras;
import com.example.DDD.domain.recurso.objetosdevalor.CondicionPrestamo;
import com.example.DDD.domain.recurso.objetosdevalor.TipoCategoria;

public class Categoria extends Entity<CategoriaId> {
    protected CodigoBarras codigoBarras;
    protected TipoCategoria tipoCategoria;
    protected CondicionPrestamo condicionPrestamo;

    public Categoria(CategoriaId entityId,CodigoBarras codigoBarras, TipoCategoria tipoCategoria,
                     CondicionPrestamo condicionPrestamo) {
        super(entityId);
        this.codigoBarras=codigoBarras;
        this.tipoCategoria=tipoCategoria;
        this.condicionPrestamo=condicionPrestamo;
    }

    private Categoria(CategoriaId entityId){
        super(entityId);
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
