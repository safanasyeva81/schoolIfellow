package ru.ifellow.voskresenskaya;

public abstract class Car {
    //it's Main origin
    private String model;
    private int year;
    private boolean automatic;
    private String color;
    private int mileage;
    private int owners;

    public Car(String model, int year, boolean automatic, String color, int mileage, int owners) {
        this.model = model;
        this.year = year;
        this.automatic = automatic;
        this.color = color;
        this.mileage = mileage;
        this.owners = owners;
    }

    public String getInfo() {
        return String.format(
                "Model: %s| Year: %d | Automatic %s | Color: %s | Mileage: %d | Owners: %d",
                model,
                year,
                automatic ? "automatic" : "manual",
                color,
                mileage,
                owners
        );
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOwners(int owners) {
        this.owners = owners;
    }

    public boolean isAfterYear(int y) {
        return this.year > y;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }git

    public void printModel() {
        System.out.println("Model: " + this.model);
    }
}

