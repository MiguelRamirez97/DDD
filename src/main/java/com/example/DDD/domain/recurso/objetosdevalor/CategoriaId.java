package com.example.DDD.domain.recurso.objetosdevalor;

import co.com.sofka.domain.generic.Identity;

public class CategoriaId extends Identity{

    private CategoriaId(String uid) {
        super(uid);
    }

    public CategoriaId() {
    }

    public static CategoriaId of(String uid) {
        return new CategoriaId(uid);
    }

}
