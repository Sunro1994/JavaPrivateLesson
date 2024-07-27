package org.example.notePad.work0722;

import javax.management.ObjectInstance;

// 테스트 클래스
public class DeviceTest {
    public static void main(String[] args) {
        // MobileDevice 타입의 객체 생성
        MobileDevice smartphone = new SmartPhone("Apple", "iPhone 13");
        MobileDevice tablet = new Tablet("Samsung", "Galaxy Tab S7");

        // DeviceManager에 추가 (업캐스팅 활용)
        DeviceManager<MobileDevice> deviceManager = new DeviceManager<>();
        deviceManager.addDevice(smartphone);
        deviceManager.addDevice(tablet);

        // 장치 출력
        System.out.println("Devices:");
        deviceManager.displayDevices();

        // Connectable 타입의 객체 생성 및 연결 메소드 호출
        Connectable connectableSmartphone = new SmartPhone("Google", "Pixel 5");
        Connectable connectableTablet = new Tablet("Microsoft", "Surface Pro 7");

        System.out.println("\nConnecting devices:");
        connectableSmartphone.connect();
        connectableTablet.connect();

        System.out.println("\nDisconnecting devices:");
        connectableSmartphone.disconnect();
        connectableTablet.disconnect();
    }
}

// SOLID
// OOP 4개 특성