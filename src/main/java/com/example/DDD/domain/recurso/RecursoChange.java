package com.example.DDD.domain.recurso;

import co.com.sofka.domain.generic.EventChange;
import com.example.DDD.domain.recurso.eventos.CategoriaAsignada;
import com.example.DDD.domain.recurso.eventos.RecursoCreado;

public class RecursoChange extends EventChange {
    public RecursoChange(Recurso recurso) {
        apply((RecursoCreado event) -> {
            recurso.estado=event.getEstado();
            recurso.inventario=event.getInventario();
        });
        apply((CategoriaAsignada event)->{
            recurso.categorias.put(event.getCategoriaId(),new Categoria(event.getCategoriaId(),event.getCodigoBarras(),
                    event.getTipoCategoria(), event.getCondicionPrestamo()));
        });
    }
}
