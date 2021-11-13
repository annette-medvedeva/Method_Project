package com.company;

import java.time.LocalDate;
import java.time.Period;

public class Car_ {
    public static final double MIN_ENGIN_VOLUME = 0.5;
    private String brand;
    private LocalDate data;
    private String color;
    private double engineSize;
    private String condition;
    private String fuelType;
    private int mileage;

    public Car_(String brand, String color, double engineSize, String condition, String fuelType, int mileage, LocalDate data) {
        this.setBrand(brand);
        this.setColor(color);
        this.setEngineSize(engineSize);
        this.setCondition(condition);
        this.setFuelType(fuelType);
        this.setMileage(mileage);
        this.setData(data);
    }

    public Car_() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand.strip();
    }

    public void setData(LocalDate data) {
        this.data = Period.between(data, LocalDate.now()).isNegative() ? LocalDate.now() : data;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color.strip();
    }

    public double getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize > MIN_ENGIN_VOLUME ? engineSize : MIN_ENGIN_VOLUME;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition.strip();
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage > 0 ? mileage : 0;
    }

    @Override
    public String toString() {
        return "Car_{" +
                "brand='" + brand + '\'' +
                ", yearOfManufacture='" + data + '\'' +
                ", color='" + color + '\'' +
                ", engineSize='" + engineSize + '\'' +
                ", condition='" + condition + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", mileage='" + mileage + '\'' +
                '}';
    }
}
