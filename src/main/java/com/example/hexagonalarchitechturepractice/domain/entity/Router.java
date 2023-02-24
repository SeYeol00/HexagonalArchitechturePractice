package com.example.hexagonalarchitechturepractice.domain.entity;

import com.example.hexagonalarchitechturepractice.domain.valueobject.RouterId;
import com.example.hexagonalarchitechturepractice.domain.valueobject.RouterType;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.function.Predicate;

@Getter
@AllArgsConstructor
public class Router {

    private final RouterType routerType;
    private final RouterId routerId;

    public static Predicate<Router> filterRouterByType(RouterType routerType){
        return routerType.equals(RouterType.CORE)
                ? isCore(): isEDGE();
    }

    private static Predicate<Router> isCore(){
        return p -> p.getRouterType() == RouterType.CORE;
    }
    private static Predicate<Router> isEDGE(){
        return p -> p.getRouterType() == RouterType.EDGE;
    }


}
