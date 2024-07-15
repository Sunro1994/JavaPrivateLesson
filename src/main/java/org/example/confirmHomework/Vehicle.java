package org.example.confirmHomework;

public class Vehicle {
    private String brand;
    private int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void displayInfo(){
        System.out.println("Vehicle brand :" + brand + "year:" + year);
    }

    public String getBrand() {
        return brand;
    }
    public int getYear() {
        return year;
    }

}
