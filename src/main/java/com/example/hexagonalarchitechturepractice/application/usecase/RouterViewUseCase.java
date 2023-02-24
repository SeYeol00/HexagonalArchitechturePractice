package com.example.hexagonalarchitechturepractice.application.router.usecase;

import com.example.hexagonalarchitechturepractice.domain.router.Router;

import java.util.List;
import java.util.function.Predicate;

// 자ㅏ바에서 유스케이스는 소프트웨어가 할 수 있는 것을 표현하는 인터페이스로 정의된 추상화로 나타낸다.
public interface RouterViewUseCase {
    // 프레디케이트는 해당 유스케이스를 구현할 떄 라우터 리스트를 필터링하는데 사용한다.
    List<Router> getRouters(Predicate<Router> filter);
}
