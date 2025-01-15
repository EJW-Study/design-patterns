package com.ejw.designpatterns.jwhan.bridge;

public class Metro {

    /** MetroAction의 구현을 나타내는 인스턴스
        해당 필드는 두 구현클래스와 기능클랙스간의 계층의 '다리' 가 됨
     **/
    MetroAction metroAction;


    public Metro(MetroAction metroAction) {
        this.metroAction = metroAction;
    }

    public String metroMove() {
        return metroAction.move();
    }
    public String metroDoorOpen() {
        return metroAction.doorOpen();
    }

    public String metroDoorClose() {
        return metroAction.doorClose();
    }

    public String metroAction() {
        return metroAction.action();
    }
}
