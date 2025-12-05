package ru.ifellow.voskresenskaya;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

@Getter
@Setter
@AllArgsConstructor

public abstract class Car {
    private String model;
    private int year;
    private boolean automatic;
    private String color;
    private int mileage;
    private int owners;

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

    public boolean isAfterYear(int y) {
        return this.year > y;
    }

}