package com.example.hexagonalarchitechturepractice.application.port.output;

import com.example.hexagonalarchitechturepractice.domain.entity.Router;

import java.util.List;

public interface RouterViewOutputPort {
    List<Router> fetchRouters();
}
