package com.example.DDD.domain.reserva.objetosdevalor;

import co.com.sofka.domain.generic.Identity;

public class ReservaId extends Identity {

    private ReservaId(String uid) {
        super(uid);
    }

    public ReservaId() {
    }

    public static ReservaId of(String uid) {
        return new ReservaId(uid);
    }
}

