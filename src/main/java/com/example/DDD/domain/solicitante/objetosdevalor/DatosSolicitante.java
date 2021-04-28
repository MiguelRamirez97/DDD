package com.example.DDD.domain.solicitante.objetosdevalor;

import co.com.sofka.domain.generic.ValueObject;
import java.util.Objects;

public class DatosSolicitante implements ValueObject<DatosSolicitante.Value> {
    protected final String nombre;
    protected final String correo;
    protected final Long numeroCelular;

    public DatosSolicitante(String nombre, String correo, Long numeroCelular) {
        this.nombre = Objects.requireNonNull(nombre);;
        if(nombre.isBlank()){
            throw new IllegalArgumentException("Nombre no puede estar vacio");
        }
        this.correo = Objects.requireNonNull(correo);
        if(correo.isBlank()){
            throw new IllegalArgumentException("Correo no puede estar vacio");
        }
        this.numeroCelular = Objects.requireNonNull(numeroCelular);
    }

    @Override
    public DatosSolicitante.Value value() {
        return new DatosSolicitante.Value() {
            @Override
            public String nombre() {
                return nombre;
            }

            @Override
            public String correo() {
                return correo;
            }

            @Override
            public Long numeroCelular() {
                return numeroCelular;
            }
        };
    }

    public interface Value {
        String nombre();

        String correo();

        Long numeroCelular();
    }

}

