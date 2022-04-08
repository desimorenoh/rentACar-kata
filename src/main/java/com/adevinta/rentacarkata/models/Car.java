package com.adevinta.rentacarkata.models;

public class Car {

    private Long id;
    private String plateNumber;
    private String brand;



    public Car(Long id, String plateNumber, String brand) {
        this.id = id;
        this.plateNumber = plateNumber;
        this.brand = brand;
    }

    public Car(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
