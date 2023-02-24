package com.example.hexagonalarchitechturepractice.application.router.port.output;

import com.example.hexagonalarchitechturepractice.domain.router.Router;

import java.util.List;

public interface RouterViewOutputPort {
    List<Router> fetchRouters();
}
