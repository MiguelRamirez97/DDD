package com.example.DDD.domain.recurso.comandos;

import co.com.sofka.domain.generic.Command;
import com.example.DDD.domain.recurso.objetosdevalor.EstadoRecurso;
import com.example.DDD.domain.recurso.objetosdevalor.Inventario;
import com.example.DDD.domain.recurso.objetosdevalor.RecursoId;

public class CrearRecurso implements Command {
    private final RecursoId recursoId;
    private final EstadoRecurso estado;
    private final Inventario inventario;

    public CrearRecurso(RecursoId entityId, EstadoRecurso estado, Inventario inventario) {
        this.recursoId = entityId;
        this.estado = estado;
        this.inventario = inventario;
    }

    public RecursoId getRecursoId() {
        return recursoId;
    }

    public EstadoRecurso getEstado() {
        return estado;
    }

    public Inventario getInventario() {
        return inventario;
    }
}
