package org.example.notePad.work0722;


import java.util.ArrayList;
import java.util.List;

class DeviceManager<T> {
    List<T> devices = new ArrayList<>();

    public void addDevice(T device) {
        devices.add(device);
    }

    public void removeDevice(T device) {
        devices.remove(device);
    }

    public void displayDevices() {
        for (int i = 0; i < devices.size(); i++) {
            System.out.println("device" + i + ": " + devices.get(i));
        }
    }
}
