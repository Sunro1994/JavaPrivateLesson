package org.example.notePad.work0722;

abstract class MobileDevice {
    private String brand;
    private String model;

    public MobileDevice(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public abstract void powerOn();
    public abstract void powerOff();

    public String getBrand () {
        return brand;
    }

    public String getModel () {
        return model;
    }
}