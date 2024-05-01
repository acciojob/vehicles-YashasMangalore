package com.driver;

public class Boat implements WaterVehicle
{
    private String name;
    private Integer capacity;

    // Constructor with String and int arguments
    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }


    @Override
    public String getVehicleName() {
        return name;
    }

    @Override
    public int getVehicleCapacity() {
        return capacity;
    }
}
