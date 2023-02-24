package com.example.hexagonalarchitechturepractice.application.router.port.input;


import com.example.hexagonalarchitechturepractice.application.router.port.output.RouterViewOutputPort;
import com.example.hexagonalarchitechturepractice.application.router.usecase.RouterViewUseCase;
import com.example.hexagonalarchitechturepractice.domain.router.Router;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.function.Predicate;

@AllArgsConstructor
public class RouterViewInputPort implements RouterViewUseCase {
    private RouterViewOutputPort routerViewOutputPort;
    @Override
    public List<Router> getRouters(Predicate<Router> filter) {
        var routers= routerViewOutputPort.fetchRouters();
        return Router.retrieveRouter(routers,filter);
    }
}
