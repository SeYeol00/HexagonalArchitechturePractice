package com.example.hexagonalarchitechturepractice.domain.valueobject;

import java.util.UUID;

public class RouterId {

    private final UUID id;

    public RouterId(UUID id) {
        this.id = id;
    }

    public static RouterId withId(String id){
        // String -> UUID
        return new RouterId(UUID.fromString(id));
    }
    public static RouterId withoutId(){
        // String -> UUID
        return new RouterId(UUID.randomUUID());
    }

    public static RouterId of(String id) {

    }
}
