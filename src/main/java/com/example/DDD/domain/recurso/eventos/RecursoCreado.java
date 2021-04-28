package com.example.DDD.domain.recurso.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import com.example.DDD.domain.recurso.objetosdevalor.EstadoRecurso;
import com.example.DDD.domain.recurso.objetosdevalor.Inventario;

public class RecursoCreado extends DomainEvent {

    private EstadoRecurso estado;
    private Inventario inventario;

    public RecursoCreado(EstadoRecurso estado, Inventario inventario) {
        super("centrodeprestamos.agregados.recurso.recursocreado");
        this.estado = estado;
        this.inventario = inventario;
    }

    public EstadoRecurso getEstado() {
        return estado;
    }

    public Inventario getInventario(){
        return inventario;
    }
}
