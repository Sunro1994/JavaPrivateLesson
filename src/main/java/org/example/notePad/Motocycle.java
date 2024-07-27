package org.example.notePad;

public class Motocycle extends Vehicle implements A1, A2 {
    private boolean hasSidecar;

    public Motocycle(String brand, int year, boolean hasSidecar) {
        super(brand, year);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayInfo() {
        System.out.println("Motorcycle hasSidecar:" + hasSidecar + ", brand: " + getBrand() + ", year: " + getYear());
    }
}
