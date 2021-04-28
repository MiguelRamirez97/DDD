package com.example.DDD.domain.recurso;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.example.DDD.domain.recurso.eventos.CategoriaAsignada;
import com.example.DDD.domain.recurso.eventos.RecursoCreado;
import com.example.DDD.domain.recurso.objetosdevalor.*;

import java.util.List;
import java.util.Map;

public class Recurso extends AggregateEvent<RecursoId> {

    protected Map<CategoriaId, Categoria> categorias;
    protected EstadoRecurso estado;
    protected Inventario inventario;

    public Recurso(RecursoId entityId, EstadoRecurso estado, Inventario inventario) {
        super(entityId);
        appendChange(new RecursoCreado(estado.DISPONIBLE,inventario)).apply();
    }

    private Recurso(RecursoId entityId){
        super(entityId);
        subscribe(new RecursoChange(this));
    }

    public static Recurso from(RecursoId entityId, List<DomainEvent> eventList) {
        var recurso = new Recurso(entityId);
        eventList.forEach(recurso::applyEvent);
        return recurso;
    }

    public void asignarCategoria(CategoriaId categoriaId, CodigoBarras codigoBarras, TipoCategoria tipoCategoria,
                                 CondicionPrestamo condicionPrestamo) {
        appendChange(new CategoriaAsignada(categoriaId,codigoBarras, tipoCategoria, condicionPrestamo)).apply();
    }

}
