package org.example.confirmHomework;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int year, int numberOfDoors) {
        super(brand, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car numberOfDoors:" + numberOfDoors + ", brand: " + getBrand() + ", year: " + getYear() );
    }
}

