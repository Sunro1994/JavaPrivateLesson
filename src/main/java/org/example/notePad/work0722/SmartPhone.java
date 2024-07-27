package org.example.notePad.work0722;


public class SmartPhone extends MobileDevice implements Connectable {
    public SmartPhone (String brand, String model) {
        super(brand, model);
    }

    public void powerOn() {
        System.out.println(getBrand()+ '의' + getModel() + "제품의 전원을 켭니다");
    }

    public void powerOff() {
        System.out.println(getBrand()+'의' + getModel() + "제품의 전원을 끕니다");
    }

    public void connect() {
        System.out.println(getBrand()+'의' + getModel() + "제품을 연결합니다");
    }

    public void disconnect() {
        System.out.println(getBrand()+'의' + getModel() + "제품의 해제합니다");
    }
}