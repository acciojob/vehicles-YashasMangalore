package com.driver;

public class Boat implements WaterVehicle
{
    private String name="Jackdaw";
    private Integer capacity=55;

    @Override
    public String getVehicleName() {
        return name;
    }

    @Override
    public int getVehicleCapacity() {
        return capacity;
    }
}
