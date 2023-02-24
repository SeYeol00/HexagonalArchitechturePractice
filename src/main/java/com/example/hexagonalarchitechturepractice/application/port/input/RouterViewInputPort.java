package com.example.hexagonalarchitechturepractice.application.port.input;


import com.example.hexagonalarchitechturepractice.application.port.output.RouterViewOutputPort;
import com.example.hexagonalarchitechturepractice.application.usecase.RouterViewUseCase;
import com.example.hexagonalarchitechturepractice.domain.entity.Router;
import com.example.hexagonalarchitechturepractice.domain.service.RouterSearch;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.function.Predicate;

@AllArgsConstructor
public class RouterViewInputPort implements RouterViewUseCase {
    private RouterViewOutputPort routerViewOutputPort;
    @Override
    public List<Router> getRouters(Predicate<Router> filter) {
        var routers= routerViewOutputPort.fetchRouters();
        return RouterSearch.retrieveRouter(routers,filter);
    }
}
