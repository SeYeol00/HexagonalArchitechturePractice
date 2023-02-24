package com.example.hexagonalarchitechturepractice.framework.inputadapter;

import com.example.hexagonalarchitechturepractice.application.port.input.RouterViewInputPort;
import com.example.hexagonalarchitechturepractice.application.usecase.RouterViewUseCase;
import com.example.hexagonalarchitechturepractice.domain.entity.Router;
import com.example.hexagonalarchitechturepractice.domain.valueobject.RouterType;
import com.example.hexagonalarchitechturepractice.framework.outputadapter.RouterViewFileAdapter;

import java.util.List;


// 입력 어댑터
public class RouterViewCLIAdapter {


    RouterViewUseCase routerViewUseCase;

    public RouterViewCLIAdapter(){
        setAdapters();
    }
    // 엣지인지 뭐시기인지
    public List<Router> obtainRelatedRouters(String type){
        return routerViewUseCase.getRouters(
                outer.filterRouterByType(RouterType.valueOf(type))
        )
    }

    // 출력 어댑터 세팅
    private void setAdapters() {
        this.routerViewUseCase = new RouterViewInputPort(RouterViewFileAdapter.getInstance());
    }
}
